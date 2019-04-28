package com.lessons.one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleFrames {
	WebDriver driver;
	
	public void testFrame() {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation Stuff\\Chrome driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://jqueryui.com/resizable/");
		int frameSize = driver.findElements(By.tagName("iframe")).size();
		for(int i=0;i<frameSize;i++) {
			if(driver.findElements(By.className("brandLogo")).size()!=0) {
				
				driver.findElement(By.xpath("targetElement")).click();
				driver.switchTo().defaultContent();
			}
			
			
		}
		
	}

}
