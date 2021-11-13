package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

public class Testrunner {
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features="src/test/java/features",
			glue="stepDefinition")
	public class TestRunner{
		
	}

}
