package testRunner;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/Features/first.feature",
        glue = {"test.stepDefinitions"},
        tags = "@test"
)


public class Runner {

}
