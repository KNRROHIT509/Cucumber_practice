package com.SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		
		WebElement ide=driver.findElement(By.id("ide"));
		Select ides=new Select(ide);
		List<WebElement> idelists= ides.getOptions();
		for(WebElement idelist : idelists) {																																																																																
			System.out.println(idelist.getText());                                               
		}
		ides.selectByIndex(0);
		Thread.sleep(3000);
		ides.selectByValue("ij");
		Thread.sleep(3000);
		ides.selectByVisibleText("Visual Studio");
		Thread.sleep(3000);
		ides.deselectByVisibleText("Eclipse");
		Thread.sleep(3000);
		
		List<WebElement> selectedides=ides.getAllSelectedOptions();
		for(WebElement selectedide: selectedides) {
			System.out.println(selectedide.getText());
		}
		/*WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		
		WebElement we=driver.findElement(By.id("course"));
		Select wes=new Select(we);
		List<WebElement> lwe=wes.getOptions();
		for(WebElement l:lwe){
			System.out.println(l);
		}
		wes.selectByIndex(1);
		Thread.sleep(3000);
		wes.selectByValue("net");
		Thread.sleep(3000);
		wes.selectByVisibleText("Javascript");
		Thread.sleep(3000);*/
		
	}

}
