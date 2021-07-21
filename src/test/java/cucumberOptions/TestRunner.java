 package cucumberOptions;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features/SignInTestcases.feature",   //path of the feature file
		glue="stepDefinations") //path of the java implimentation package name 
public class TestRunner {
}
