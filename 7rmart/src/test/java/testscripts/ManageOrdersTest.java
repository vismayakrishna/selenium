package testscripts;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageOrdersPage;
import pages.MenuPage;
import utilities.ExcelUtility;

public class ManageOrdersTest extends Base {
	
	@Test(description = "Verify that the user can see the order details in the manage order page")
	public void verifyThatTheUserCanSeeTheOrderDetailsInTheManageOrdersPage() {
		String username = ExcelUtility.getString(1, 0, "LoginPage");
		String password = ExcelUtility.getString(1, 1, "LoginPage");
		String menuToBeSelected = "Manage Orders";
		String orderId = "146";
		LoginPage loginpage = new LoginPage(driver);
		MenuPage menupage = new MenuPage(driver);
		ManageOrdersPage manageorderspage = new ManageOrdersPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSignInButon();
		menupage.clickOnTheMenuInDashboard(menuToBeSelected);
		manageorderspage.clickOnViewButton(orderId);
		assertTrue(manageorderspage.isOrderIdMatching(orderId), "User is not able to see the order details in the manage order page");	
	}
}
