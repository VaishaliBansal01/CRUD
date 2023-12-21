package com.spring.demo.SpringCRUD;

;
import cucumber.api.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.aspectj.apache.bcel.util.ClassPath;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(/*features="classpath : features/",
        //plugin = {"pretty","json:target/cucumber.json"},
        glue = {"com.example.springbootcucumber.cucumberglue"}*/

        features = "src/main/resources/features/",
        glue = {"org.jkp.steps"},
        plugin = {"pretty", "html:target/cucumber-html-report", "json:target/result.json",
                "io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm"},
        monochrome = true,
        tags = {"@automated"}
)
public class CucumberRunnerTest {
}
