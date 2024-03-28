package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
	features ={"src\\main\\resources\\Application\\login.feature"},
	glue= {"loginstep"}
		
)
public class RunnerClass extends AbstractTestNGCucumberTests
{

}
