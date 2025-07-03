package Test_Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"Flipkart_example"},
		glue = {"Flipkart_Step_Definitions"},
		dryRun = true ,
		monochrome = true 
		
		)

public class Test_Books {

}
