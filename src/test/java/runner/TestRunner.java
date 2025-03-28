package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features",
        glue = "StepDefinitions",
        dryRun = false,
        plugin = {"pretty", "html:target/cucumber-reports.html" },
        tags = "@india",
        monochrome = true
)
public class TestRunner {
}
