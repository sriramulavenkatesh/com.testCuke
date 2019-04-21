package com.lessons.one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ResizeTest {
	WebDriver driver;
	
	
	public void sample() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation Stuff\\Chrome driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://jqueryui.com/resizable/");
		driver.switchTo().frame(0);
		WebElement eleResizable = driver.findElement(By.xpath("//div[@id='resizable']"));
		WebElement resizableRight = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-e']"));
		Actions action = new Actions(driver);
		action.moveToElement(resizableRight).clickAndHold(resizableRight).moveByOffset(100, 50).build().perform();
		Thread.sleep(10000);
	}
	
	public void sampleTwo() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation Stuff\\Chrome driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://codepen.io/jasongardner/pen/QNOXym");
		WebElement resizerOne = driver.findElement(By.xpath("//div[@id='resizer']"));
		Actions action = new Actions(driver);
		action.moveToElement(resizerOne).clickAndHold(resizerOne).moveByOffset(0, -150).release(resizerOne).build().perform();
		driver.switchTo().frame(0);
		WebElement tableEleOne = driver.findElement(By.xpath("//table[1]//th[3]"));
		int y = tableEleOne.getLocation().getY();
		Thread.sleep(5000);
		action.moveToElement(tableEleOne).clickAndHold(tableEleOne).moveByOffset(80, y).release().build().perform();
		Thread.sleep(5000);	
		
	}
	
	@Test
	public void sampleFour() {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation Stuff\\Chrome driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		driver.manage().window().maximize();
		/*WebElement home = driver.findElement(By.xpath("//a[text()='Home']"));
		new Actions(driver).moveByOffset(home.getLocation().getX()+594, home.getLocation().getY()).click().perform();*/
		WebElement striker = driver.findElement(By.xpath("//a[text()='Super Striker']"));
		new Actions(driver).moveByOffset(striker.getLocation().getX()-550, striker.getLocation().getY()).click().perform();
		
		
		
		
		
	}

}
