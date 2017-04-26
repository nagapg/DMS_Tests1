package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/cucumber/MA9732.feature"},
glue={"com.alticor.magic.test"},
plugin={"html:target/MA9732_Results"})
		
public class MA9732Test {
}