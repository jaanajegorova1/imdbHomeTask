package runner;

import org.testng.annotations.Test;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        tags= "@HomeTask",
        features = "src/test/resources/features",
        glue = "testSteps",
        plugin = {
                "html:target/cucumber-report.html",
                "pretty",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        }
)

public class TestRunner extends AbstractTestNGCucumberTests {
    @Test
    public void dummy() {
    }
}
