package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pages.RegisterPage;

public class registerTest extends RegisterPage {

	@Test
	public void register() {
		driver.findElement(By.className("ico-register")).click();
		selectGender();
		enterFisrtName();
		enterLastName();
		enterEmail();
		enterPassword();
		enterConfirmPassword();
		enterRegisterButton();
		getCurrentUrl();
	}
}
