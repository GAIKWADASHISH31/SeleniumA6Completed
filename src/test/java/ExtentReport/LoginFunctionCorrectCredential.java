package ExtentReport;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class LoginFunctionCorrectCredential {

	@Test
	public void CorrectCridential() throws InterruptedException {
		
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
		test.log(Status.INFO, "CorrectCridential");
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.className("ico-login")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("admin01@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("admin01");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Log-in']")).click();
		WebElement Community_poll = driver.findElement(By.xpath("//strong[text()='Community poll']"));
		if (Community_poll.isDisplayed()) {
			test.log(Status.INFO, "Community_poll is Displayed");
		}
		else {
			test.log(Status.INFO, "Community_poll is not Displayed");
		}
		report.flush();		
	}
}
