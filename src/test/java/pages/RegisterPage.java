package pages;

import org.testng.annotations.Test;

import tests.BaseClass;

public class RegisterPage extends BaseClass{
@Test
public void ValidRegister() {
	driver.get("https://demo.nopcommerce.com/register/");
	System.out.println("visiting the register page");
}
}
