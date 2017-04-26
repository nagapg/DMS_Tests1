package runner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/cucumber/MAGICAppl.feature",
                 glue={"com.alticor.magic.test"},
                plugin={"html:target/MAGIC_Q1_Screens"})


public class RunnerTest {

}
