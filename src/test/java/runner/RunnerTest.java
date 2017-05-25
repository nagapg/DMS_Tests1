package runner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/cucumber/MAGICAppl.feature",
                 glue={"com.alticor.magic.test"},
                plugin={"json:target/cucumber7.json"})


public class RunnerTest {

}
