package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertSample extends Base{
	
	@Test
	public void softAssertSample() {
		String input = "Hello";
		SoftAssert softassert = new SoftAssert();
		WebElement singleInputTextField = driver.findElement(By.id("single-input-field"));
		singleInputTextField.sendKeys(input);
		
		WebElement showMessageButton = driver.findElement(By.id("button-one"));
		showMessageButton.click();
		
		WebElement yourMessageText = driver.findElement(By.id("message-one"));
		String messageText = yourMessageText.getText();
		messageText = messageText.substring(16);
		softassert.assertEquals(input, messageText, "Your message is not " + input);
		
		boolean isShowMessageButtonDisplyed = showMessageButton.isDisplayed();
		softassert.assertTrue(isShowMessageButtonDisplyed, "Show message button is not displayed.");
		softassert.assertAll();
	}
}
