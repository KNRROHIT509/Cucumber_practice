package com.SeleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Make_My_Trip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]")).click();
		List<WebElement> elements=driver.findElements(By.xpath("//span[text()='Travellers & Class']/following::span[text()='Return']"));
		for(WebElement element:elements) {
			element.click();
			Thread.sleep(3000);
		}
		//driver.switchTo().
		driver.quit();

	}

}
