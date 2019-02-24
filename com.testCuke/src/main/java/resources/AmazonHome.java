package resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonHome {

	public WebDriver driver;

	public AmazonHome(WebDriver driver) {
		this.driver = driver;

	}

	By hellobutton = By.xpath("//*[@id=\"nav-link-yourAccount\"]/span[2]");
	By youraccount = By.xpath("//*[@id=\"nav-flyout-yourAccount\"]/div[3]/a[1]/span");
	By amazonprime = By.xpath("//*[@id=\"a-page\"]/div[2]/div/div[2]/div[3]/a/div/div/div/div[2]/h2");
	By amzonsearch = By.xpath("//*[@id='twotabsearchtextbox']");

	public WebElement HelloButton() {
		return driver.findElement(hellobutton);

	}

	public WebElement YourAccount() {
		return driver.findElement(youraccount);

	}
	public WebElement PrimeButton() {
		return driver.findElement(amazonprime);

	}
	public WebElement AmazonSearch() {
		return driver.findElement(amzonsearch);

	}
	public WebElement AmazonSearchB() {
		
		return driver.findElement(By.xpath("(//*[@type='submit'])[1]"));
	}

}
