package ExtentReport;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class sampleReport {
	
@Test
public void BasicReport() {
	
	//Create spark reporter
	ExtentSparkReporter spark = new ExtentSparkReporter("./Reports/sampleReport.html");
	
	//configure the spark reporter
	spark.config().setDocumentTitle("SampleReport");
	spark.config().setReportName("Ashish Gaikwad");
	spark.config().setTheme(Theme.DARK);
	
	//create the Extent Report
	ExtentReports report = new ExtentReports();
	//configure extent report
	report.setSystemInfo("OS", "Windows-10");
	report.setSystemInfo("Browser", "Edge");
	//attach the spark reporter to the extent report
	report.attachReporter(spark);
	ExtentTest test = report.createTest("BasicReport");
	test.log(Status.INFO, "Report is Successfully Created");
	report.flush();
}
}
