package org.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features\\SearchProduct.feature",glue= {"src\\test\\java\\org\\stepdefinition\\SearchProductStep.java"},monochrome=true,dryRun=true)

public class TestRunner {
	
}