package cucumberOptions;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

// in TestNg we dont use the @RunWith annotation we instead extend the class --> AbstractTestNGCucumberTests
@CucumberOptions(
        features = "src/test/java/features",
        glue = "stepDefinitions",
        plugin = {"pretty","html:target/cucumberTestNg.html"},
        tags = "@RegressionTest"
)
public class TestNgTestRunner extends AbstractTestNGCucumberTests {
}
