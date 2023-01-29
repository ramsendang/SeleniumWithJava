package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver = new ChromeDriver();

	@BeforeTest
	public void SetUp() {
		WebDriverManager.chromedriver().setup();	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.nopcommerce.com/");
	}
	
	@AfterTest
	public void TearDown() {
//		driver.quit();
	}
}
