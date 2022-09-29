package mavennewdem;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"src/test/resources/Features"},
		glue= {"mavennewdem"}
		)
public class TestNGRunner  extends AbstractTestNGCucumberTests {

}
