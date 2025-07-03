/*package com.SeleniumPractice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class TestLibraries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:/path/to/chromedriver.exe");
		WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        //driver.quit();
	}

}*/
package com.SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLibraries {
    public static void main(String[] args) {
        // Setup WebDriverManager for Firefox
        WebDriverManager.firefoxdriver().setup();
        
        // Configure Firefox options
        FirefoxOptions options = new FirefoxOptions();
        options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe"); // Set your Firefox path
        
        // Initialize driver with options
        WebDriver driver = new FirefoxDriver(options);
        
        try {
            driver.get("https://www.google.com");
            System.out.println("Page Title: " + driver.getTitle());
        } finally {
            driver.quit(); // Always quit the driver
        }
    }
}
