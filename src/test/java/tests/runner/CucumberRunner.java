package tests.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"tests/stepDefinitions","tests/hooks"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class CucumberRunner extends AbstractTestNGCucumberTests {

}
