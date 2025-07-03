package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart_Step_Definitions {
	WebDriver driver;
	@Given("Flipkart Home Page")
	public void flipkart_home_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.flipkart.com/");
	    Thread.sleep(3000);
	    //driver.findElement(By.xpath("//span[@role=\"button\"]")).click();
	}

	@When("you search {string} on flipkart search textbox and click it")
	public void you_search_books_on_flipkart_search_textbox_and_click_it(String item) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    WebElement element=driver.findElement(By.xpath("//input[contains(@placeholder, \"Search for\")]"));
	    element.click();
	    element.sendKeys(item);
	    Thread.sleep(3000);
	    element.submit();
	    
	}

	@Then("you navigate {int}+ results of books")
	public void you_navigate_results_of_books(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    String st=driver.findElement(By.xpath("//span[@class=\"BUOuZu\"]")).getText();
	    System.out.println(st);
	    int first=st.indexOf("of");
	    int last=st.indexOf("results");
	    first+=2;
	    String res=st.substring(first, last).replaceAll("[^0-9]", "");
	    res.trim();
	    int sol=Integer.valueOf(res);
	    if(sol> int1) {
	    	System.out.println("Its successfully checked");
	    }
	    else {
	    	System.out.println("Less results");
	    }
	    driver.quit();
	}

}
