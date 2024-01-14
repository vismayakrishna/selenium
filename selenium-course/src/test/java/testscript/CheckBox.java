package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBox extends Base {
	
	public void singleCheckBox() {
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement checkBoxElement = driver.findElement(By.xpath("//input[@id='gridCheck']"));
		checkBoxElement.click();
		boolean isCheckBoxClicked = checkBoxElement.isSelected();
		if(isCheckBoxClicked) {
			WebElement messageText = driver.findElement(By.xpath("//div[@id='message-one']"));
			String actualText = messageText.getText();
			String expectedText = "Success - Check box is checked";
			if(actualText.equals(expectedText)) {
				System.out.println("Checkbox is selected");
			}
		} else {
			System.out.println("Checkbox is not selected");
		}	
	}

	public static void main(String[] args) {
		CheckBox checkBox = new CheckBox();
		checkBox.initializeBrowser();
		checkBox.singleCheckBox();
		checkBox.driverQuit();

	}

}
