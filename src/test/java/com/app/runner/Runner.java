package com.app.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\admin\\CucumberPrj\\src\\test\\java\\com\\cuc",glue="com.app.stepdefinition",dryRun = false,
tags="@Assert",
plugin={"pretty","html:target/cucumberReport.html","json:target/cucumberreport.json","rerun:target/rerun.txt"})



public class Runner {

}
