package com.colorStreet.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/com/colorStreet/features"
		,glue={"com.colorStreet.steps"},
		plugin = {"html:target/cucumberReport.html"}
		)
public class TestRunner {

}
