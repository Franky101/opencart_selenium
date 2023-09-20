package tests.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"tests/stepDefinitions", "tests/hooks"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@practico09 or @practico10 or @practico11 or TPfinal"

)
public class CucumberRunnerTest extends AbstractTestNGCucumberTests {
}
