package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions
        (
                features = {"src/main/resources/Features/Login.feature","src/main/resources/Features/Login.feature"},
                glue = "Step_Def",
                tags = "@RegressionTest",
                plugin = { "pretty","html:target/cucumber-reports/Report.html"}
        )


public class TestRunner extends AbstractTestNGCucumberTests
{
}
