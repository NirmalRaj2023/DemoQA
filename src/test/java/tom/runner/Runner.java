package tom.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\admin\\TomoTest\\src\\test\\java\\tom\\cuc",
						glue="tom.stepdefinition",
						dryRun =false,
						tags="@Assert"
						,plugin = {"pretty","html:target/cucumberReport.html",
								"json:target/cucumberReport.json","rerun:target/rerun.txt"}
							
						)
public class Runner {

	
}
