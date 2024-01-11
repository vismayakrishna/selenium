package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

public class WebElementCommands extends Base {
	
	public void singleInputField() {
		String input = "Hello";
		WebElement singleInputTextField = driver.findElement(By.id("single-input-field"));
		singleInputTextField.sendKeys(input);
		
		WebElement showMessageButton = driver.findElement(By.id("button-one"));
		showMessageButton.click();
		
		WebElement yourMessageText = driver.findElement(By.id("message-one"));
		String messageText = yourMessageText.getText();
		messageText = messageText.substring(15);
		if(messageText.equals(input)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
	}
	
	public void twoInputField() {
		String firstValue = "5";
		WebElement valueA = driver.findElement(By.id("value-a"));
		valueA.sendKeys(firstValue);
		
		String secondValue = "10";
		WebElement valueB = driver.findElement(By.id("value-b"));
		valueB.sendKeys(secondValue);
		
		int result = Integer.parseInt(firstValue)+Integer.parseInt(secondValue);
		
		WebElement getTotalButton = driver.findElement(By.id("button-two"));
		getTotalButton.click();
		
		WebElement totalValueText = driver.findElement(By.id("message-two"));
		String totalValueString = totalValueText.getText();
		totalValueString = totalValueString.substring(14);
		int totalValue = Integer.parseInt(totalValueString);
		
		if(result==totalValue) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
		
	}
	
	public void verifyBackgroundColorOfShowMessageButton() {
		WebElement showMessageButton = driver.findElement(By.id("button-one"));
		String backgroundColorOfShowMessageButton = showMessageButton.getCssValue("background-color");
		String hex = Color.fromString(backgroundColorOfShowMessageButton).asHex();
		String actualBackgroundColor = "#007bff";
		if(hex.equals(actualBackgroundColor)) {
			System.out.println("Background color is same");
		} else {
			System.out.println("Background color is not same");
		}
	}
	
	public void verifyFontWeightOfShowMessageButton() {
		WebElement showMessageButton = driver.findElement(By.id("button-one"));
		String fontWeightOfShowMessageButton = showMessageButton.getCssValue("font-weight");
		String actualFontWeight = "400";
		if(fontWeightOfShowMessageButton.equals(actualFontWeight)) {
			System.out.println("Font weights are equal");
		} else {
			System.out.println("Font weights are not equal");
		}
	}

	public void verifyFontColorOfShowMessageButton() {
		WebElement showMessageButton = driver.findElement(By.id("button-one"));
		String fontColorOfShowMessageButton = showMessageButton.getCssValue("color");
		String hex = Color.fromString(fontColorOfShowMessageButton).asHex();
		String actualFontColor = "#ffffff";
		if(hex.equals(actualFontColor)) {
			System.out.println("Font Colors are equal");
		} else {
			System.out.println("Font Colors are not equal");
		}
	}

	public void verifyBorderRadiusOfGetTotalButton() {
		WebElement getTotalButton = driver.findElement(By.id("button-two"));
		String borderRadiusOfGetTotalButton = getTotalButton.getCssValue("border-radius");
		String actualBorderRadius = "4px";
		if(borderRadiusOfGetTotalButton.equals(actualBorderRadius)) {
			System.out.println("Border Radius are equal");
		} else {
			System.out.println("Border Radius are not equal");
		}
	}

	public static void main(String[] args) {
		WebElementCommands webElementCommands = new WebElementCommands();
		webElementCommands.initializeBrowser();
		webElementCommands.singleInputField();
		webElementCommands.twoInputField();
		webElementCommands.verifyBackgroundColorOfShowMessageButton();
		webElementCommands.verifyFontWeightOfShowMessageButton();
		webElementCommands.verifyFontColorOfShowMessageButton();
		webElementCommands.verifyBorderRadiusOfGetTotalButton();
		webElementCommands.driverQuit();
	}

}
