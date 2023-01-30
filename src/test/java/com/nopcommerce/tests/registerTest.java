package com.nopcommerce.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.nopcommerce.pages.RegisterPage;

public class registerTest extends RegisterPage {

	@Test
	public void register() {
		ExtentTest registertest = extent.createTest("Register Test");
		registertest.info("clicking on register button");
		driver.findElement(By.className("ico-register")).click();
		registertest.info("selecting gender");
		selectGender();
		registertest.info("Entering First Name");
		enterFisrtName();
		registertest.info("Entering Last Name");
		enterLastName();
		registertest.info("Selecting Birth day");
		selectDay();
		registertest.info("Selecting Birth Month");
		selectMonth();
		registertest.info("Selecting Birth Year");
		selectYear();
		registertest.info("Entering Email");
		enterEmail();
		registertest.info("Entering Password");
		enterPassword();
		registertest.info("Entering Confirm Password");
		enterConfirmPassword();
		registertest.info("Clicking on Register Button");
		enterRegisterButton();
		registertest.pass("Pass");
		getCurrentUrl();
	}
	@Test
	public void register2() {
		ExtentTest registertest2 = extent.createTest("Register Test");
		registertest2.info("This is the second test");
	}
}
