package com.RunnerClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".",plugin = {"pretty","html:src/test/Reports/report1.html"},dryRun = false)
public class Runner {
}

