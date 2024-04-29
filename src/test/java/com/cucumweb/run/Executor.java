package com.cucumweb.run;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "@bulls", features = {"src/test/resources/features/"}, glue = {"com.cucumweb.test"},
plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
		"junit:target/cucumber-reports/Cucumber.xml",
		"html:target/cucumber-reports//cucumber-reports.html"},monochrome = true)
public class Executor extends AbstractTestNGCucumberTests {

}