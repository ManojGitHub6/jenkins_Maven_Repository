package cucumber_project;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\CG-DTE\\Desktop\\maven_Workspace\\orangeHrm\\Orange\\Orange.feature", 
		glue= {"runner"},
		format= {"pretty","html:test-outout","json:Cucumber_JsonOutput"},
		monochrome=true, 
		dryRun=false)

public class TestRunner {

	
	
}
