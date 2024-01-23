package testscripts;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginFunctionality extends Base {
	
	@Test
	public void verifyThatTheUserCanLoginWithValidCredentials() {
		String username = "admin";
		String password = "admin";
		String expectedTitle = "Dashboard | 7rmart supermarket";
		WebElement usernameField = driver.findElement(By.xpath("//input[@name='username']"));
		usernameField.sendKeys(username);
		WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']"));
		passwordField.sendKeys(password);
		WebElement signInButton = driver.findElement(By.xpath("//button[@type='submit']"));
		signInButton.click();
		String actualTitle = driver.getTitle();
		assertEquals(expectedTitle, actualTitle, "The title of the page is " + driver.getTitle());
	}
	
	@Test
	public void verifyThatTheUserWillGetAnErrorMessageWhenTheSignInButtonIsClickedWithAnInvalidUsernameAndValidPassword() {
		String username = "adminn";
		String password = "admin";
		String expectedErrorMessage = "×\n"
				+ "Alert!\n"
				+ "Invalid Username/Password";
		WebElement usernameField = driver.findElement(By.xpath("//input[@name='username']"));
		usernameField.sendKeys(username);
		WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']"));
		passwordField.sendKeys(password);
		WebElement signInButton = driver.findElement(By.xpath("//button[@type='submit']"));
		signInButton.click();
		WebElement alertElement = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
		String actualErrorMessage = alertElement.getText();
		assertEquals(expectedErrorMessage, actualErrorMessage, "Error message is " + alertElement.getText());
	}
	
	@Test
	public void verifyThatTheUserWillGetAnErrorMessageWhenTheSignInButtonIsClickedWithValidUsernameAndInvalidPassword() {
		String username = "admin";
		String password = "admins";
		String expectedErrorMessage = "×\n"
				+ "Alert!\n"
				+ "Invalid Username/Password";
		WebElement usernameField = driver.findElement(By.xpath("//input[@name='username']"));
		usernameField.sendKeys(username);
		WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']"));
		passwordField.sendKeys(password);
		WebElement signInButton = driver.findElement(By.xpath("//button[@type='submit']"));
		signInButton.click();
		WebElement alertElement = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
		String actualErrorMessage = alertElement.getText();
		assertEquals(expectedErrorMessage, actualErrorMessage, "Error message is " + alertElement.getText());
	}
	
	@Test
	public void verifyThatTheUserWillGetAnErrorMessageWhenTheSignInButtonIsClickedWithAnInvalidUsernameAndInvalidPassword() {
		String username = "admins";
		String password = "adminn";
		String expectedErrorMessage = "×\n"
				+ "Alert!\n"
				+ "Invalid Username/Password";
		WebElement usernameField = driver.findElement(By.xpath("//input[@name='username']"));
		usernameField.sendKeys(username);
		WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']"));
		passwordField.sendKeys(password);
		WebElement signInButton = driver.findElement(By.xpath("//button[@type='submit']"));
		signInButton.click();
		WebElement alertElement = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
		String actualErrorMessage = alertElement.getText();
		assertEquals(expectedErrorMessage, actualErrorMessage, "Error message is " + alertElement.getText());
	}
}
