package tom.runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="@target/rerun.txt",glue="tom.stepdefinition")




public class Rerunner {

}