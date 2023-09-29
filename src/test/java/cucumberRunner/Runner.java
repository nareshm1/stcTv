package cucumberRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/featureFiles",
    glue = "stepDefinations",
    tags = "@Test",
    plugin = {"pretty", "html:target/cucumber-reports"}
)

public class Runner {
			
}
	  
