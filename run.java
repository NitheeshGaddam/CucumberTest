package Runners;

import cucumber.api.CucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		 features = "src/test/java/Features/logintest.feature"
		 ,glue={"stepDefinations"},
		  plugin = {"pretty", "html:target/cucumber"}
		 )
public class run {
}
