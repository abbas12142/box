package testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"..\\box\\Features\\1LoginUI.feature","..\\box\\Features\\2LoginSuccess.feature","..\\box\\Features\\3CreateFolder.feature","..\\box\\Features\\3UploadFileInFolder.feature","..\\box\\Features\\Logout.feature"},
        //tags= "@LoginUI,@loginSuccess",

        plugin = {"pretty", "json:target/cucumber.json"},
        glue = "stepDefinitions"
)


public class TestRunner
{
}
