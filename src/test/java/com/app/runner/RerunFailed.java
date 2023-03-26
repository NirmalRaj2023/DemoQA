package com.app.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="@target/rerun.txt",glue="com.app.stepdefinition",plugin={"pretty","html:target/cucumberReport.html"})

public class RerunFailed {

}
