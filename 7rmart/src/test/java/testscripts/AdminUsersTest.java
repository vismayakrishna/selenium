package testscripts;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.AdminUsersPage;
import pages.LoginPage;
import pages.MenuPage;

public class AdminUsersTest extends Base {
	
	@Test(description = "Verify whether a new user can be added to the admin users page")
	public void verifyWhetherTheUserIsAbleToAddANewUserInTheAdminUsersPage() {
		String username = "admin";
		String password = "admin";
		String menuToBeSelected = "Admin Users";
		String newUsername = "Vismayar";
		String newPassword = "vismaya";
		String newUsertype = "staff";
		String expectedAlertMessage = "×\nAlert!\nUser Created Successfully";
		LoginPage loginpage = new LoginPage(driver);
		MenuPage menupage = new MenuPage(driver);
		AdminUsersPage adminuserspage = new AdminUsersPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSignInButon();
		menupage.clickOnTheMenuInDashboard(menuToBeSelected);
		adminuserspage.clickOnNewButton();
		adminuserspage.enterUsernameOnUsernameField(newUsername);
		adminuserspage.enterPasswordOnPasswordField(newPassword);
		adminuserspage.selectUsertype(newUsertype);
		adminuserspage.clickOnSaveButton();
		String actualAlertMessage = adminuserspage.getTheAlertMessage();
		assertEquals(expectedAlertMessage, actualAlertMessage, "Unable to add a new user in the admin users page");
	}
}
