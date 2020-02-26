package koala.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import koala.background.JvmReport;
@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources\\feature files\\background.feature"},
glue= {"koala.background"},monochrome=true,plugin= {"html:I:\\Aravinsami\\sami codes\\Cucumberkola\\Reports",
		"json:I:\\Aravinsami\\sami codes\\Cucumberkola\\Reports\\out.json"})
public class TestRunner {
	
	@AfterClass
	public static void reports() {
		JvmReport.generateReport("I:\\Aravinsami\\sami codes\\Cucumberkola\\Reports\\out.json");
	}
	

}
