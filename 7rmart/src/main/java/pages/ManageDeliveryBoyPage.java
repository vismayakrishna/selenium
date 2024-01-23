package pages;

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
	
	@FindBy(xpath = "//div[contains(@class,'col-lg-3')]//child::a[@href='https://groceryapp.uniqassosiates.com/admin/list-deliveryboy']") WebElement manageDeliveryBoyLink;
	@FindBy(xpath="//a[@href='javascript:void(0)']") WebElement searchLink;
	@FindBy(xpath = "//input[@id='un']") WebElement nameField;
	@FindBy(xpath = "//input[@id='ut']") WebElement emailField;
	@FindBy(xpath = "//input[@id='ph']") WebElement phoneNumberField;
	@FindBy(xpath = "//button[@value='sr']") WebElement searchButton;
	@FindBy(xpath = "//table") WebElement table;
	
	public void clickOnManageDeliveryBoyLink() {
		manageDeliveryBoyLink.click();
	}
	
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
	
	public boolean isTableDisplayedWithSearchResult() {
		return table.isDisplayed();
	}
}
