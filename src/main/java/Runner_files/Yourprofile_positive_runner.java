package Runner_files;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
features = "src\\main\\java\\Yourprofile_positive_scenarios\\Yourprofile_positive_scenarios.feature",
glue= {"Yourprofile_positive_scenarios"},
monochrome = true,publish = true)
public class Yourprofile_positive_runner extends AbstractTestNGCucumberTests {

}
