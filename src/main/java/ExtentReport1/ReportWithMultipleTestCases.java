package ExtentReport1;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Report;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ReportWithMultipleTestCases implements ITestListener {
	
	ExtentSparkReporter spark;
	ExtentReports report;
	ExtentTest test; 
	
	@Override
	public void onFinish(ITestContext context) {
		report.flush();
	}

	@Override
	public void onStart(ITestContext context) {
		
		//Create spark reporter
		spark = new ExtentSparkReporter("./Reports/sampleReport.html");
		
		//configure the spark reporter
		spark.config().setDocumentTitle("SampleReport");
		spark.config().setReportName("Ashish Gaikwad");
		spark.config().setTheme(Theme.DARK);
		
		//create the Extent Report
		report = new ExtentReports();
		
		//configure extent report
		report.setSystemInfo("OS", "Windows-10");
		report.setSystemInfo("Browser", "Edge");
		
		//attach the spark reporter to the extent report
		report.attachReporter(spark);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String t_name = result.getMethod().getMethodName();
		test.log(Status.FAIL, t_name+"is failure");
		Reporter.log(t_name+"is failure");
	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String t_name = result.getMethod().getMethodName();
		test.log(Status.SKIP, t_name+"is skipeed");
		Reporter.log(t_name+"is skipped");
		
	}

	@Override
	public void onTestStart(ITestResult result) {
	String t_name = result.getMethod().getMethodName();
	Reporter.log(t_name+"is execuated");
	report.createTest(t_name);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String t_name = result.getMethod().getMethodName();
		test.log(Status.PASS, t_name+"is success");
		Reporter.log(t_name+"is success");
	}
}
