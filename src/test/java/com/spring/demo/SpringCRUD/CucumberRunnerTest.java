package com.spring.demo.SpringCRUD;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.aspectj.apache.bcel.util.ClassPath;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","json:target/cucumber.json"},
        features="classpath : features"
)
public class CucumberRunnerTest {
}
