package testscripts;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageDeliveryBoyPage;
import pages.MenuPage;

public class ManageDeliveryBoyTest extends Base {
	
	@Test
	public void verifyThatWhenTheUserSearchDeliveryBoyUsingNameEmailAndPhoneNumberItShouldDisplayTheDetailsOfDeliveryBoy() {
		String username = "admin";
		String password = "admin";
		String menuToBeSelected = "Manage Delivery Boy";
		String name = "Fleta Shields";
		String email = "Everardo@gmail.com";
		String phoneNumber = "4825119298";
		LoginPage loginpage = new LoginPage(driver);
		MenuPage menupage = new MenuPage(driver);
		ManageDeliveryBoyPage managedeliveryboypage = new ManageDeliveryBoyPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSignInButon();
		menupage.clickOnTheMenuInDashboard(menuToBeSelected);
		managedeliveryboypage.clickOnSearchLink();
		managedeliveryboypage.enterNameonNameField(name);
		managedeliveryboypage.enterEmailonEmailField(email);
		managedeliveryboypage.enterPhoneNumberonPhoneNumberField(phoneNumber);
		managedeliveryboypage.clickOnSearchButton();
		boolean isSearchSuccessful = managedeliveryboypage.verifyDetailsOfSearchedDeliveryBoy(name, email, phoneNumber);
		assertTrue(isSearchSuccessful, "Details of the delivery boy searched is not displayed");
	}
	
}
