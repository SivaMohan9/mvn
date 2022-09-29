package demodse;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/frte"},
		glue= {"demodse"},
		tags = "@sanity and @regression"
		)
public class TagRunner {

}
