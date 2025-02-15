package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features= {"src/test/java/FeatureFiles/Demo99.feature"},
		glue= {"StepDefinations"},
		dryRun = false,
		monochrome = true,
		plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		
		
		)
public class Guru99TestRunner extends AbstractTestNGCucumberTests {

}

