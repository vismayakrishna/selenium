package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageDeliveryBoyPage {

	public WebDriver driver;

	public ManageDeliveryBoyPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='javascript:void(0)']") private WebElement searchLink;
	@FindBy(xpath = "//input[@id='un']") private WebElement nameField;
	@FindBy(xpath = "//input[@id='ut']") private WebElement emailField;
	@FindBy(xpath = "//input[@id='ph']") private WebElement phoneNumberField;
	@FindBy(xpath = "//button[@value='sr']") private WebElement searchButton;
	@FindBy(xpath = "//tr") private List<WebElement> rowList;
	
	public void clickOnSearchLink() {
		searchLink.click();
	}
	
	public void enterNameonNameField(String name) {
		nameField.sendKeys(name);
	}
	
	public void enterEmailonEmailField(String email) {
		emailField.sendKeys(email);
	}
	
	public void enterPhoneNumberonPhoneNumberField(String phoneNumber) {
		phoneNumberField.sendKeys(phoneNumber);
	}
	
	public void clickOnSearchButton() {
		searchButton.click();
	}
	
	public boolean verifyDetailsOfSearchedDeliveryBoy(String name, String email, String phoneNumber) {
		boolean isSearchSuccessful = false;
		rowList.remove(rowList.size()-1);
		for (WebElement row : rowList) {
			List<WebElement> columnList = row.findElements(By.xpath("//td"));
			if(columnList.get(0).getText().contains(name) && columnList.get(1).getText().contains(email) && columnList.get(2).getText().contains(phoneNumber)) {
				isSearchSuccessful = true;
			}
		}
		return isSearchSuccessful;
	}
}
