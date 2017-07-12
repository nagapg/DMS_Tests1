package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/cucumber/MAGIC_Qualfications.feature",
                 glue={"com.alticor.magic.test"},
                plugin={"json:target/MAGIC_Qualifications.json"})

public class MAGIC_QualificationsTest {

}
