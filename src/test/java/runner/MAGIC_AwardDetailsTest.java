package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/cucumber/MAGIC_AwardDetails.feature",
                 glue={"com.alticor.magic.test"},
                plugin={"json:target/MAGIC_AwardDetails.json"})

public class MAGIC_AwardDetailsTest {

}
