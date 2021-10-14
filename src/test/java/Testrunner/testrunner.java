package Testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions

(features="src/test/java/feature", glue= {"Evaluationdefinition","hook"},
plugin= {"pretty", "html:target/cucumber-pretty", "junit:target/report.xml", "json:target/cucumber.json"}  ) class testrunner {

}
