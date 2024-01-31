package testscripts;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageOfferCodePage;
import pages.MenuPage;
import utilities.ExcelUtility;

public class ManageOfferCodeTest extends Base {
	
	@Test(description = "Verify whether the user is able to add a new offer code in the manage offer code page")
	public void verifyWhetherTheUserIsAbleToAddANewOfferCodeInTheManageOfferCodePage() throws AWTException {
		String username = ExcelUtility.getString(1, 0, "LoginPage");
		String password = ExcelUtility.getString(1, 1, "LoginPage");
		String menuToBeSelected = "Manage Offer Code";
		String offerCode = "FIRST25";
		String percentage = "25";
		String amount = "1000";
		String expectedAlertMessage = "×\nAlert!\nOffer Created Successfully";
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
		manageoffercodepage.enterPercentageOnPercentageField(percentage);
		manageoffercodepage.enterAmountOnAmountField(amount);
		manageoffercodepage.uploadImage();
		manageoffercodepage.clickOnSaveButton();
		String actualAlertMessage = manageoffercodepage.getTextFromAlertMessage();
		assertEquals(expectedAlertMessage, actualAlertMessage, "User is not able to add a new promo code in the manage offer code page");
	}
}
