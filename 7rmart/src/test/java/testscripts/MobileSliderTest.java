package testscripts;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.MobileSliderPage;
import pages.MenuPage;

public class MobileSliderTest extends Base {
	
	@Test(description = "Verify that the user can add a new slider in the mobile slider page")
	public void verifyThatTheUserCanAddANewSliderInTheMobileSliderPage() throws AWTException {
		String username = "admin";
		String password = "admin";
		String menuToBeSelected = "Mobile Slider";
		String category = "Apple";
		String expectedAlertMessage = "×\nAlert!\nMobile Slider Created Successfully";
		LoginPage loginpage = new LoginPage(driver);
		MenuPage menupage = new MenuPage(driver);
		MobileSliderPage mobilesliderpage = new MobileSliderPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSignInButon();
		menupage.clickOnTheMenuInDashboard(menuToBeSelected);
		mobilesliderpage.clickOnNewButton();
		mobilesliderpage.selectCategoryFromDropdown(category);
		mobilesliderpage.uploadImage();
		mobilesliderpage.clickOnSaveButton();
		String actualAlertMessage = mobilesliderpage.getTextFromAlertMessage();
		assertEquals(expectedAlertMessage, actualAlertMessage, "User is not able to add a new slider in the mobile slider page");
	}
}
