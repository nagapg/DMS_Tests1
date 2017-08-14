package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/cucumber/MA10851.feature"},
glue={"com.alticor.magic.test"},
plugin={"json:target/cucumber_MA10851.json"})

public class MA10851Test {

}
