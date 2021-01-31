package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		features="C://Users//Lenovo//workspace//CucumberAssignment//src//test//java//Features//test.feature",
		glue={"step_def"},
		format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, 
		dryRun = false,
		tags = {"~@SmokeTest","@RegressionTest"}
		
		)
public class TestRunner {

}
