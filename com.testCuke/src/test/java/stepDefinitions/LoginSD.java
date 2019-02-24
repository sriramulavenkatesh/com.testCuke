package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import resources.AmazonHome;
import resources.base;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
public class LoginSD extends base {
	
	WebDriver driver;

	@Given("^Browser intialized$")
	public void browser_intialized() throws Throwable {
		driver = intializeDriver();
		driver.manage().window().maximize();
	    
	}

	@Then("^Navigate to Amazon Site$")
	public void navigate_to_Amazon_Site() throws Throwable {
	    driver.get("https://www.amazon.in");
	}

	@Then("^Search for product (.+)$")
	public void search_for_product(String arg1) throws Throwable {
		AmazonHome am = new AmazonHome(driver);
		am.AmazonSearch().sendKeys(arg1);
		am.AmazonSearchB().click();
	    
	}
}