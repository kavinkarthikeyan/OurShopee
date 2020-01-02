package org.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Kavin\\My Workspace\\Cummumber\\src\\test\\resources",glue="org.stepdefinition",plugin= {"html:target","json:target//i.json"})

public class TestRunner {

}