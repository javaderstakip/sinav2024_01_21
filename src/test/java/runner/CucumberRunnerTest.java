package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/features"},
    glue = {"stepDefinitions"},
    tags = "")
public class CucumberRunnerTest extends AbstractTestNGCucumberTests {
    //"@milestone_6 and not @milestone_6_6" taginde not @milestone_6_6 CALISIYOR CUNKU 6_6 DIYE BIR TAG YOK 6_5 VAR AMA...
}
