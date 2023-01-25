package StepDefinition;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\hp\\eclipse-workspace\\Cucumberjavaproject\\src\\test\\resources\\FeatureWithTags",
glue= {"StepDefinition"},
tags="@mustRun"
)
public class TestRunner_RunWithSingleTag {

}
 