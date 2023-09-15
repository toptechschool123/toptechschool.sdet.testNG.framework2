package tests_1;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {

	
	@Test
	public void extentReport() throws IOException {
		
	
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("./SparkReport/extent.html");
	spark.config().setReportName("extent report");
	spark.config().setDocumentTitle("auto test");
	spark.config().setTheme(Theme.DARK);
	extent.attachReporter(spark);
	
    ExtentTest test =	extent.createTest("login test")
    .assignAuthor("TopTechSchool")
    .assignCategory("smoke test");
    
    test.info("login test started");
    test.log(Status.PASS, "test passed");
  //  test.log(Status.FAIL, "test failed");

	extent.flush();
	Desktop.getDesktop().browse(new File("target/Spark.html").toURI());
	}
}
