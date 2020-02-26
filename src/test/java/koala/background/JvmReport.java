package koala.background;

import java.io.File;
import java.util.ArrayList;
import java.util.List;import org.apache.velocity.tools.view.tools.AbstractSearchTool.StoredResults;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	
	public static void generateReport(String j) {
		
		File f= new File("I:\\Aravinsami\\sami codes\\Cucumberkola\\Reports\\jvm");
		
		Configuration c= new Configuration(f, "ikoala Application");
		c.addClassifications("Platform","Windows");
		c.addClassifications("Browser", "Chrome");
		c.addClassifications("Version", "79.0");
		c.addClassifications("sprint","3");
		
		List<String> json=new ArrayList<String>();
		
		json.add(j);
		
		
		ReportBuilder r=new ReportBuilder(json,c);
		r.generateReports();
		
	}

}
