package com.nopcommerce.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver = new ChromeDriver();
	public static ExtentReports extent = new ExtentReports();
	public static ExtentSparkReporter spark = new ExtentSparkReporter("target/report.html");
	@BeforeTest
	public void SetUp() {
		WebDriverManager.chromedriver().setup();	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.nopcommerce.com/");	
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("TestReport");
		extent.attachReporter(spark);
	}
	
	@AfterTest
	public void TearDown() {
		driver.quit();
		extent.flush();
	}
}
