package com.SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_Boxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

		System.out.println(driver.findElement(By.id("output")).getText());
		wait.until(ExpectedConditions.elementToBeClickable(By.id("promptBox"))).click();

		//driver.findElement(By.id("promptBox")).click();
		//Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("WINDOW");
		//Thread.sleep(2000);
		driver.switchTo().alert().accept();
		//Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("output")).getText());
		//driver.findElement(By.id("promptBox")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("promptBox"))).click();
		//Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		//Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("output")).getText());
		driver.quit();
		/*
		//CONFIRM BOX
		System.out.println(driver.findElement(By.id("output")).getText());
		driver.findElement(By.id("confirmBox")).click();
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("output")).getText());
		driver.findElement(By.id("confirmBox")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("output")).getText());
		driver.quit();*/
		
		
		/*
		// ALERT BOX
		System.out.println(driver.findElement(By.id("output")).getText());
		driver.findElement(By.id("alertBox")).click();
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("output")).getText());
		driver.quit();*/
	}

}
