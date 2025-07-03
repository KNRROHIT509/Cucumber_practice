package com.SeleniumPractice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window_Handles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver drive=new ChromeDriver();
		drive.manage().window().maximize();
		drive.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		WebDriverWait wdw=new WebDriverWait(drive, Duration.ofSeconds(4));
		String parent_window=drive.getWindowHandle();
		System.out.println(parent_window+" "+drive.getTitle());
		WebElement button=wdw.until(ExpectedConditions.presenceOfElementLocated(By.id("newTabBtn")));
		button.click();
		Thread.sleep(3000);
		Set<String> child_addrs=drive.getWindowHandles();
		for(String child_addr : child_addrs) {
			System.out.println(child_addr );
			drive.close();
		}
		//drive.quit();
		
		/*
		// single window child
		WebDriverWait wdw=new WebDriverWait(drive, Duration.ofSeconds(3));
		String addr=drive.getWindowHandle();
		System.out.println("Parent Window Handle"+addr);
		WebElement button = wdw.until(ExpectedConditions.presenceOfElementLocated(By.id("newWindowBtn")));
        //((JavascriptExecutor)drive).executeScript("arguments[0].scrollIntoView(true);", button);
        //((JavascriptExecutor)drive).executeScript("arguments[0].click();", button);
		button.click();
        Thread.sleep(3000);
		Set<String> all_addrs=drive.getWindowHandles();
		for(String all_addr : all_addrs) {
			if(!all_addr.equals(addr)) {
				//System.out.println(all_addr);
				drive.switchTo().window(all_addr);
				drive.manage().window().maximize();
				//Thread.sleep(3000);
				drive.findElement(By.id("firstName")).sendKeys("RAMESH");
				Thread.sleep(3000);
				drive.close();
			}
			//System.out.println(all_addr);
		}
		drive.switchTo().window(addr);
		drive.findElement(By.id("name")).sendKeys("MAHESH");
		Thread.sleep(3000);
		drive.quit();*/
		
	}

}
