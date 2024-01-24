package testscripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends Base {
	
	@Test(description = "Verify whether the user is able to login with valid credendtials")
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
	
	@Test
	public void verifyThatTheUserWillGetAnErrorMessageWhenTheSignInButtonIsClickedWithAnInvalidUsernameAndValidPassword() {
		String username = "adminn";
		String password = "admin";
		String expectedErrorMessage = "×\n"
				+ "Alert!\n"
				+ "Invalid Username/Password";
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameOnUsernameField(username);
		loginPage.enterPasswordOnPasswordField(password);
		loginPage.clickOnSignInButon();
		String actualErrorMessage = loginPage.getActualErrorMessage();
		assertEquals(expectedErrorMessage, actualErrorMessage, "Alert message is not shown when the sign in button is clicked with invalid Username and valid Password");
	}
	
	@Test
	public void verifyThatTheUserWillGetAnErrorMessageWhenTheSignInButtonIsClickedWithValidUsernameAndInvalidPassword() {
		String username = "admin";
		String password = "admins";
		String expectedErrorMessage = "×\n"
				+ "Alert!\n"
				+ "Invalid Username/Password";
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameOnUsernameField(username);
		loginPage.enterPasswordOnPasswordField(password);
		loginPage.clickOnSignInButon();
		String actualErrorMessage = loginPage.getActualErrorMessage();
		assertEquals(expectedErrorMessage, actualErrorMessage, "Alert message is not shown when the sign in button is clicked with valid Username and invalid Password");
	}
	
	@Test
	public void verifyThatTheUserWillGetAnErrorMessageWhenTheSignInButtonIsClickedWithAnInvalidUsernameAndInvalidPassword() {
		String username = "adminn";
		String password = "admins";
		String expectedErrorMessage = "×\n"
				+ "Alert!\n"
				+ "Invalid Username/Password";
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameOnUsernameField(username);
		loginPage.enterPasswordOnPasswordField(password);
		loginPage.clickOnSignInButon();
		String actualErrorMessage = loginPage.getActualErrorMessage();
		assertEquals(expectedErrorMessage, actualErrorMessage, "Alert message is not shown when the sign in button is clicked with invalid Username and invalid Password");
	}
}
