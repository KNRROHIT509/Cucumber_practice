package com.SeleniumPractice;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reload_Time {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.icicibank.com/");
		
		driver.findElement(By.cssSelector(".ic-btn.white.revamp-page-url")).click();

		//driver.findElement(By.className("button-cta current-site-link")).click();
		String parent=driver.getWindowHandle();
		System.out.println(parent+" "+ driver.getTitle());
		WebElement login=driver.findElement(By.id("login"));
		login.click();
		Select drpdown=new Select(login);
		List<WebElement> login_opts=drpdown.getOptions();
		for(WebElement login_opt : login_opts) {
			System.out.println(login_opt.getText());
		}
		//drpdown.selectByIndex(1);
		WebElement choose=driver.findElement(By.xpath("//a[@rel='noopener noreferrer']"));
		choose.submit();
		Thread.sleep(3000);
		driver.quit();
	}

}
