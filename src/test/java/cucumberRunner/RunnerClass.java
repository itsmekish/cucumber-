package cucumberRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\91900\\eclipse-workspace\\cucum\\Features\\Facebook.feature" 
 , glue = "org.step" , dryRun = true )
public class RunnerClass {

}
