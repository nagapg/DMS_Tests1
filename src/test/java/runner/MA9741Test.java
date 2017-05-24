package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/cucumber/MA9741.feature"},
glue={"com.alticor.magic.test"},
plugin={"json:target/MA9741_Results"})

public class MA9741Test {

}
