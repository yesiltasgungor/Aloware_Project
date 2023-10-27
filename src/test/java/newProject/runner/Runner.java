package newProject.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(

        features = "src/test/resources/homepage.feature",
        glue = "newProject/step_definitions",
        dryRun = false,
        tags = "@homepage"
)
public class Runner {

}
