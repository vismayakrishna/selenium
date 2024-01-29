package testscripts;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.MenuPage;

public class MenuTest extends Base {
	
	@Test(description = "Verify whether the user can click different menu present in the dashboard")
	public void verifyThatWhenTheUserClickOnMenuInTheDashboardItShouldNavigateToTheCorrespondingPage() {
		String menu = "Manage Sliders";
		String username = "admin";
		String password = "admin";
		LoginPage loginPage = new LoginPage(driver);
		MenuPage menupage = new MenuPage(driver);
		loginPage.enterUsernameOnUsernameField(username);
		loginPage.enterPasswordOnPasswordField(password);
		loginPage.clickOnSignInButon();
		menupage.clickOnTheMenuInDashboard(menu);
	}
}
