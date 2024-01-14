package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioButton extends Base {
	
	public void radioButton() {
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement maleRadioButton = driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		maleRadioButton.click();
		//boolean isMaleButtonSelected = maleRadioButton.isSelected();
		WebElement showSelectedValueButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		showSelectedValueButton.click();
		WebElement messageText = driver.findElement(By.xpath("//div[@id='message-one']"));
		String actualText = messageText.getText();
		String expectedText = "Radio button 'Male' is checked";
		if(actualText.equals(expectedText)) {
			System.out.println("Male button is selected");
		} else {
			System.out.println("Male button is not selected");
		}
	}
	
	public void groupRadioButton() {
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement femaleRadioButton = driver.findElement(By.xpath("//input[@id='inlineRadio21']"));
		femaleRadioButton.click();
		WebElement ageGroupButton =  driver.findElement(By.xpath("//input[@id='inlineRadio23']"));
		ageGroupButton.click();
		WebElement getResultButton = driver.findElement(By.xpath("//button[@id='button-two']"));
		getResultButton.click();
		WebElement messageText = driver.findElement(By.xpath("//div[@id='message-two']"));
		String actualText = messageText.getText();
		String expectedText = "Gender : Female\n"
				+ "Age group: 19 to 44";
		if(actualText.equals(expectedText)) {
			System.out.println("Female button and 19 to 44 age group is selected");
		} else {
			System.out.println("Female button and 19 to 44 age group is not selected");
		}
		
		
	}

	public static void main(String[] args) {
		RadioButton radioButton = new RadioButton();
		radioButton.initializeBrowser();
		radioButton.radioButton();
		radioButton.groupRadioButton();
		radioButton.driverQuit();

	}

}