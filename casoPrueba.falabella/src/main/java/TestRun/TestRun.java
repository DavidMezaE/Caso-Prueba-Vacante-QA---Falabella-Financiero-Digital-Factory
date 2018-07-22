package TestRun;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
			features = "/Users/Equipo/eclipse-workspace/casoPrueba.falabella/src/main/java/Features/busqueda.feature"
			//features = "Features"
			,glue = {"pasosDefinidos"}
			,plugin = "html:target/selenium-reports"
			,format= {"junit:junit_xml/cucumber.xml"}
			,monochrome = true
			,dryRun = false
			)


public class TestRun {

}
