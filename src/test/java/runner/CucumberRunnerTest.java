package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/features"},
    glue = {"stepDefinitions"},
    tags = "@milestone_6 and not @milestone_6_6")
public class CucumberRunnerTest extends AbstractTestNGCucumberTests {
    //not @milestone_6_6 CALISIYOR CUNKU 6_6 DIYE BIR TAG YOK 6_5 VAR AMA...
}
