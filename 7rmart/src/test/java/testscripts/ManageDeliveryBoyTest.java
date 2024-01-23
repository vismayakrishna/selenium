package testscripts;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageDeliveryBoyPage;

public class ManageDeliveryBoyTest extends Base {
	
	@Test
	public void verifyThatWhenTheUserSearchDeliveryBoyUsingNameEmailAndPhoneNumberItShouldDisplayTheDetailsOfDeliveryBoy() {
		String username = "admin";
		String password = "admin";
		String name = "Fleta Shields";
		String email = "Everardo@gmail.com";
		String phoneNumber = "4825119298";
		LoginPage loginPage = new LoginPage(driver);
		ManageDeliveryBoyPage managedeliveryboypage = new ManageDeliveryBoyPage(driver);
		loginPage.enterUsernameOnUsernameField(username);
		loginPage.enterPasswordOnPasswordField(password);
		loginPage.clickOnSignInButon();
		managedeliveryboypage.clickOnManageDeliveryBoyLink();
		managedeliveryboypage.clickOnSearchLink();
		managedeliveryboypage.enterNameonNameField(name);
		managedeliveryboypage.enterEmailonEmailField(email);
		managedeliveryboypage.enterPhoneNumberonPhoneNumberField(phoneNumber);
		managedeliveryboypage.clickOnSearchButton();
		boolean isTableDisplayed = managedeliveryboypage.isTableDisplayedWithSearchResult();
		assertTrue(isTableDisplayed, "Entered delivery boy details is not displayed");
	}
	
}
