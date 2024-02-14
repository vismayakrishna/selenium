package testscripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.LoginPage;
import retry.Retry;
import utilities.ExcelUtility;

public class LoginTest extends Base {

	@Test(retryAnalyzer = Retry.class, description = "Verify whether the user is able to login with valid credendtials", groups = {"regression"}, priority = 1)
	public void verifyThatTheUserCanLoginWithValidCredentials() {
		String username = ExcelUtility.getString(1, 0, "LoginPage");
		String password = ExcelUtility.getString(1, 1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameOnUsernameField(username);
		loginPage.enterPasswordOnPasswordField(password);
		loginPage.clickOnSignInButon();
		boolean isHomePageDisplayed = loginPage.isDashboardLinkDisplayed();
		assertTrue(isHomePageDisplayed, "User is unable to login with valid credentials");
	}

	@Test(retryAnalyzer = Retry.class, description = "Verify that the user will get an Alert message when sign in button is clicked with invalid username and valid password", groups = {"regression"}, priority = 2)
	public void verifyThatTheUserWillGetAnErrorMessageWhenTheSignInButtonIsClickedWithAnInvalidUsernameAndValidPassword() {
		String username = ExcelUtility.getString(2, 0, "LoginPage");
		String password = ExcelUtility.getString(2, 1, "LoginPage");
		String expectedErrorMessage = "×\n" + "Alert!\n" + "Invalid Username/Password";
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameOnUsernameField(username);
		loginPage.enterPasswordOnPasswordField(password);
		loginPage.clickOnSignInButon();
		String actualErrorMessage = loginPage.getActualErrorMessage();
		assertEquals(expectedErrorMessage, actualErrorMessage,
				"Alert message is not shown when the sign in button is clicked with invalid Username and valid Password");
	}

	@Test(retryAnalyzer = Retry.class, description = "Verify that the user will get an Alert message when sign in button is clicked with valid username and invalid password", groups = {"smoke"}, priority = 3)
	public void verifyThatTheUserWillGetAnErrorMessageWhenTheSignInButtonIsClickedWithValidUsernameAndInvalidPassword() {
		String username = ExcelUtility.getString(3, 0, "LoginPage");
		String password = ExcelUtility.getString(3, 1, "LoginPage");
		String expectedErrorMessage = "×\n" + "Alert!\n" + "Invalid Username/Password";
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameOnUsernameField(username);
		loginPage.enterPasswordOnPasswordField(password);
		loginPage.clickOnSignInButon();
		String actualErrorMessage = loginPage.getActualErrorMessage();
		assertEquals(expectedErrorMessage, actualErrorMessage,
				"Alert message is not shown when the sign in button is clicked with valid Username and invalid Password");
	}

	@Test(retryAnalyzer = Retry.class, dataProvider = "LoginProvider", description = "Verify that the user will get an Alert message when sign in button is clicked with invalid username and invalid password", priority = 4)
	public void verifyThatTheUserWillGetAnErrorMessageWhenTheSignInButtonIsClickedWithAnInvalidUsernameAndInvalidPassword(String username, String password) {
		String expectedErrorMessage = "×\n" + "Alert!\n" + "Invalid Username/Password";
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameOnUsernameField(username);
		loginPage.enterPasswordOnPasswordField(password);
		loginPage.clickOnSignInButon();
		String actualErrorMessage = loginPage.getActualErrorMessage();
		assertEquals(expectedErrorMessage, actualErrorMessage,
				"Alert message is not shown when the sign in button is clicked with invalid Username and invalid Password");
	}

	@DataProvider(name = "LoginProvider")
	public Object[][] getDataFromTestData() {
		return new Object[][] {
				{ ExcelUtility.getString(4, 0, "LoginPage"), ExcelUtility.getString(4, 1, "LoginPage") },

		};
	}
}
