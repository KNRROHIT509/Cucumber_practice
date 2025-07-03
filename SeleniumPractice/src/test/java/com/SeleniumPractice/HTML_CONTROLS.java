package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HTML_CONTROLS {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		
		driver.findElement(By.id("femalerb")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("englishchbx")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("hindichbx")).click();
		Thread.sleep(3000);
		WebElement hindcbx=driver.findElement(By.id("hindichbx"));
		if(hindcbx.isSelected()) {
			hindcbx.click();
			Thread.sleep(3000);
		}
		driver.findElement(By.id("registerbtn")).click();
		System.out.println(driver.findElement(By.id("msg")).getText());
		Thread.sleep(3000);
		driver.findElement(By.id("navigateHome")).click();
		Thread.sleep(3000);
		
	}

}
