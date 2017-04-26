package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/cucumber/MA9750.feature"},
glue={"com.alticor.magic.test"},
plugin={"html:target/MA9750_Results"})
		
public class MA9750Test {
}