package com.SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Eight_Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://github.com/login");
        driver.getTitle();
        
        highlight(driver, driver.findElement(By.id("login_field")));
        Thread.sleep(3000);
        highlight(driver, driver.findElement(By.name("password")));
        Thread.sleep(3000);
        highlight(driver, driver.findElement(By.linkText("Forgot password?")));
        Thread.sleep(3000);
        highlight(driver, driver.findElement(By.partialLinkText("Create")));
        Thread.sleep(3000);
        highlight(driver, driver.findElement(By.tagName("h1")));
        Thread.sleep(3000);
        highlight(driver, driver.findElement(By.className("header-logo")));//class="xvs91rp xwhw2v2 x2ltsn7"
        Thread.sleep(3000);
        highlight(driver, driver.findElement(By.xpath("//label[contains(text(),'Username or email address')]")));
        Thread.sleep(3000);
        highlight(driver, driver.findElement(By.cssSelector("input[name='commit']")));
        Thread.sleep(3000);
        
        
        
        
        
	}
	public static void highlight(WebDriver driver, WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);
	}
}
