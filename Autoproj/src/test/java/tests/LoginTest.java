package tests;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.AccountPage;
import pageobjects.LandingPage;
import pageobjects.LoginPage;
import resources.Base;

public class LoginTest extends Base {
	
	WebDriver driver;
	
	@Test
	public void login() throws IOException, InterruptedException {
		
		driver = initializeBrowser();
		driver.get(prop.getProperty("url"));

		LandingPage landingPage = new LandingPage(driver);
		landingPage.myAccountDropdown().click();
		landingPage.loginOption().click();
		
		Thread.sleep(3000);
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.emailAddressTextField().sendKeys("arun.selenium@gmail.com");
		loginPage.passwordField().sendKeys("Second@123");
		loginPage.loginButton().click();
		
		AccountPage accountPage = new AccountPage(driver);
		
		Assert.assertTrue(accountPage.editYourAccountInformation().isDisplayed());
		
	}

}