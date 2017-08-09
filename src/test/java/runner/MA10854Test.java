package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/cucumber/MA10854.feature"},
glue={"com.alticor.magic.test"},
plugin={"json:target/cucumber_MA10854.json"})

public class MA10854Test {

}
