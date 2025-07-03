
package com.SeleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chapter_XPath {
	public static void highlight(WebDriver driver, WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		
		//highlight(driver , driver.findElement(By.xpath("//label[contains(text(),'First')]")));
		//highlight(driver , driver.findElement(By.xpath("//label[starts-with(.,'Repeat')]")));
		//highlight(driver , driver.findElement(By.xpath("(//table[@id='contactList']/tbody/tr/td[2])[last()]")));
		//highlight(driver , driver.findElement(By.xpath("(//table[@id='contactList']/tbody/tr/td[4])[position()>1]")));
		//List<WebElement> wes=driver.findElements(By.xpath("(//table[@id='contactList']/tbody/tr/td[4])[position()<6]"));
		highlight(driver, driver.findElement(By.xpath("(//label[text()='First Name ']/following-sibling::input[@type='text'])[1]")));
		/*for(WebElement we:wes) {
			highlight(driver,we);
			Thread.sleep(1000);
		}*/
		Thread.sleep(1500);
		//driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		driver.quit();
	}
}
