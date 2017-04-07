package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/cucumber/MA9732.feature"},
glue={"stepDefinition"},
plugin={"html:target/cucumber-html-report"})
		
public class MA9732 {

}
