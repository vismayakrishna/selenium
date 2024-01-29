package pages;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.FileUploadUtility;
import utilities.WaitUtility;

public class ManageOfferCodePage {
	
	public WebDriver driver;
	public FileUploadUtility fileuploadutility;
	public WaitUtility waitutility;

	public ManageOfferCodePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@onclick='click_button(1)']") WebElement newButton;
	@FindBy(xpath = "//input[@id='offer_code']") WebElement offerCodeField;
	@FindBy(xpath = "//input[@value='yes']") WebElement yesRadioButton;
	@FindBy(xpath = "//input[@id='main_img']") WebElement chooseFileButton;
	@FindBy(xpath = "//button[@name='create']") WebElement saveButton;
	
	public void clickOnNewButton() {
		newButton.click();
	}
	
	public void enterOfferCodeOnOfferCodeField(String offerCode) {
		offerCodeField.sendKeys(offerCode);
	}
	
	public void clickOnYesRadioButton() {
		yesRadioButton.click();
	}
	
	public void uploadImage() throws AWTException {
		String filePath = "D:\\Vismaya-Obsqura-Training\\Selenium\\promo-code.png";
		fileuploadutility = new FileUploadUtility();
		waitutility = new WaitUtility();
		waitutility.waitForElementToBeClickable(driver, chooseFileButton);
		fileuploadutility.fileUploadUsingRobotClass(chooseFileButton,filePath);
	}
	
	public void clickOnSaveButton() {
		waitutility = new WaitUtility();
		waitutility.waitForElementToBeClickable(driver, saveButton);
		saveButton.click();
	}
	
	
}
