package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/cucumber/MAGIC_Dashboard.feature",
                 glue={"com.alticor.magic.test"},
                plugin={"json:target/MAGIC_Dashboard.json"})

public class MAGIC_DashboardTest {

}
