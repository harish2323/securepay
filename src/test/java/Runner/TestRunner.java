package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/features", glue="",plugin = {"pretty", "html:reports/cucumber"})
public class TestRunner {

}