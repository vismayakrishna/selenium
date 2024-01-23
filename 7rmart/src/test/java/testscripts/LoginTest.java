package testscripts;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends Base {
	
	@Test
	public void verifyThatTheUserCanLoginWithValidCredentials() {
		String username = "admin";
		String password = "admin";
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameOnUsernameField(username);
		loginPage.enterPasswordOnPasswordField(password);
		loginPage.clickOnSignInButon();
		boolean isHomePageDisplayed = loginPage.isDashboardLinkDisplayed();
		assertTrue(isHomePageDisplayed, "User is unable to login with valid credentials");
	}
}
