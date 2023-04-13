package com.runner.cuc;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\admin\\BobCatPrjWithCucumber\\src\\test\\java\\com\\featurefile",glue="com.stepdefinition",
dryRun = false)



public class Runner {

}
