package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportNG {
	
	static ExtentReports ext;
	public static ExtentReports getExtentReport() {
		
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Automation Test Results");
		reporter.config().setDocumentTitle("Test Results");
		
		ext = new ExtentReports();
		ext.attachReporter(reporter);
		ext.setSystemInfo("Tester", "Ajit Sahoo");
		return ext;
	}
	
}
