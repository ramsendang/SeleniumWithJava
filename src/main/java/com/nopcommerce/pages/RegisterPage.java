package com.nopcommerce.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.nopcommerce.baseclass.BaseClass;

public class RegisterPage extends BaseClass {
	public void verifyUrl(){
		String currentUrl = driver.getCurrentUrl();
		assertEquals(currentUrl, "https://demo.nopcommerce.com/register/");
	}
	
	public static void selectGender() {
		WebElement maleRadio = driver.findElement(By.id("gender-male"));
		maleRadio.click();
	}
	
	public static void enterFisrtName() {
		WebElement firstName = driver.findElement(By.id("FirstName"));
		firstName.sendKeys("Ram");
	}
	
	public static void enterLastName() {
		WebElement lastName = driver.findElement(By.id("LastName"));
		lastName.sendKeys("Sendang");
	}
	
	public static void selectDay() {
		WebElement day = driver.findElement(By.name("DateOfBirthDay"));
		Select select = new Select(day);
		select.selectByValue("1");
	}
	public static void selectMonth() {
		WebElement month = driver.findElement(By.name("DateOfBirthMonth"));
		Select select = new Select(month);
		select.selectByValue("4");
	}
	public static void selectYear() {
		WebElement year = driver.findElement(By.name("DateOfBirthYear"));
		Select select = new Select(year);
		select.selectByValue("1916");
	}
	
	public static void enterEmail() {
		WebElement email = driver.findElement(By.id("Email"));
		email.sendKeys("ram00001@gmail.com");
	}
	
	public static void enterPassword() {
		WebElement password = driver.findElement(By.id("Password"));
		password.sendKeys("password");
	}
	
	public static void enterConfirmPassword() {
		WebElement confirmPassword = driver.findElement(By.id("ConfirmPassword"));
		confirmPassword.sendKeys("password");
	}
	
	public static void enterRegisterButton() {
		WebElement registerButton = driver.findElement(By.id("register-button"));
		registerButton.click();
	}
	
	public static void getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("current URl is " + currentUrl);
	}
}
