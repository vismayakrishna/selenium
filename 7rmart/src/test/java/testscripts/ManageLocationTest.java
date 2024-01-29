package testscripts;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageLocationPage;
import pages.MenuPage;

public class ManageLocationTest extends Base {
	
	@Test(description = "Verify that the user can add a new location in the manage location page")
	public void verifyThatTheUserCanAddANewLocationInTheManageLocationPage() {
		String username = "admin";
		String password = "admin";
		String menuToBeSelected = "Manage Location";
		String country = "United Kingdom";
		String state = "Belfast";
		String location = "Kochi";
		String deliveryCharge = "100";
		String expectedAlertMessage = "×\nAlert!\nLocation Created Successfully";
		LoginPage loginpage = new LoginPage(driver);
		MenuPage menupage = new MenuPage(driver);
		ManageLocationPage managelocationpage = new ManageLocationPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSignInButon();
		menupage.clickOnTheMenuInDashboard(menuToBeSelected);
		managelocationpage.clickOnNewButton();
		managelocationpage.selectCountryFromDropdown(country);
		managelocationpage.selectStateFromDropdown(state);
		managelocationpage.enterLocationOnLocationField(location);
		managelocationpage.enterDeliveryChargeOnDeliveryChargeField(deliveryCharge);
		managelocationpage.clickOnSaveButton();
		String actualAlertMessage = managelocationpage.getTextFromAlertMessage();
		assertEquals(expectedAlertMessage, actualAlertMessage, "User is not able to add a new location in the manage location page");
	}
}
