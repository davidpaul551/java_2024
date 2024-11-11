package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = ("C:\\Users\\david.doggala\\eclipse-workspace\\Oct2024\\src\\test\\java\\Features\\snapdeal.feature"),
		glue = {"StepDefinition"},
		plugin = {"pretty"},
		monochrome = true 
		)

public class Snapdeal_TestRunner {

}
