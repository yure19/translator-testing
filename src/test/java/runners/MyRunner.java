package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        plugin = {"html:reports/cucumber-html-report",
                "json:reports/cucumber.json",
                "pretty"},
        //tags = {"@runit,@run","~@ignore"},
        tags = {"@regression"},
        features = {"src/test/features"},
        glue = {"tests"}
)

public class MyRunner {

}