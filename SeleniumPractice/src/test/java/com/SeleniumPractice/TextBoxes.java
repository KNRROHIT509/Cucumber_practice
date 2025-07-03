package com.SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextBoxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		
		WebElement we=driver.findElement(By.id("firstName"));
		if(we.isDisplayed()) {
			if(we.isEnabled()) {
				we.sendKeys("KNR");
				Thread.sleep(3000);
				we.sendKeys(" ROHIT");
				Thread.sleep(3000);
				we.clear();
			}
			else {
				System.out.println("text box is not enabled");
			}
		}
		else {
			System.out.println("text box is not displayed");
		}
		driver.manage().window().minimize();
	}
}
