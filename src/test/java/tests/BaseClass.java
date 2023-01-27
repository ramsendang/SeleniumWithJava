package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
	protected WebDriver driver = new ChromeDriver();
@BeforeTest
public void SetUp() {
	WebDriverManager.chromedriver().setup();
}

@Test
public void LogoTest() {
	driver.get("https://demo.nopcommerce.com/register");
}

@AfterTest
public void TearDown() {
	driver.quit();
}
}
