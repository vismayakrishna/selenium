package testscripts;

import java.awt.AWTException;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageOfferCodePage;
import pages.MenuPage;

public class ManageOfferCodeTest extends Base {
	
	@Test(description = "Verify whether the user is able to add a new offer code in the manage offer code page")
	public void verifyWhetherTheUserIsAbleToAddANewOfferCodeInTheManageOfferCodePage() throws AWTException {
		String username = "admin";
		String password = "admin";
		String menuToBeSelected = "Manage Offer Code";
		String offerCode = "FIRST25";
		LoginPage loginpage = new LoginPage(driver);
		MenuPage menupage = new MenuPage(driver);
		ManageOfferCodePage manageoffercodepage = new ManageOfferCodePage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSignInButon();
		menupage.clickOnTheMenuInDashboard(menuToBeSelected);
		manageoffercodepage.clickOnNewButton();
		manageoffercodepage.enterOfferCodeOnOfferCodeField(offerCode);
		manageoffercodepage.clickOnYesRadioButton();
		manageoffercodepage.uploadImage();
		manageoffercodepage.clickOnSaveButton();
	}
}
