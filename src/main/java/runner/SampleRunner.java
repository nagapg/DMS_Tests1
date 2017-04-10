package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/cucumber/Sample.feature"},
glue={"com.alticor.magic.test"},
plugin={"html:target/cucumber-html-report"})
		


public class SampleRunner {

}
