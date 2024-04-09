package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
	features ={"src\\main\\resources\\Application\\login.feature"},
	glue= {"loginstep"},
	plugin= {"pretty","html:target/cucumber-reports/report1.html",""},
	publish=true
		
)
public class RunnerClass extends AbstractTestNGCucumberTests
{

}
