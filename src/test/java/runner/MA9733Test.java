package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/cucumber/MA9733.feature"},
glue={"com.alticor.magic.test"},
plugin={"json:target/cucumber_MA9733.json"})

public class MA9733Test {
}
