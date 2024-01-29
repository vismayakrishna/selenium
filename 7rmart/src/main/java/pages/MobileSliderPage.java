package pages;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.FileUploadUtility;
import utilities.PageUtility;

public class MobileSliderPage {

	public WebDriver driver;
	public PageUtility pageutility;
	public FileUploadUtility fileuploadutility;

	public MobileSliderPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@onclick='click_button(1)']") WebElement newButton;
	@FindBy(xpath = "//select[@id='cat_id']") WebElement categoryDropdown;
	@FindBy(xpath = "//input[@id='main_img']") WebElement chooseFileButton;
	@FindBy(xpath = "//button[@name='create']") WebElement saveButton;
	@FindBy(xpath = "//div[contains(@class,'alert')]") WebElement alertElement;
	
	public void clickOnNewButton() {
		newButton.click();
	}
	
	public void selectCategoryFromDropdown(String category) {
		pageutility = new PageUtility();
		pageutility.selectValueUsingSelectByVisibleText(categoryDropdown, category);
	}
	
	public void uploadImage() throws AWTException {
		String filePath = "D:\\Vismaya-Obsqura-Training\\Selenium\\iphone.png";
		fileuploadutility = new FileUploadUtility();
		fileuploadutility.fileUploadUsingRobotClass(chooseFileButton, filePath);
	}
	
	public void clickOnSaveButton() {
		saveButton.click();
	}
	
	public String getTextFromAlertMessage() {
		return alertElement.getText();
	}
	
	
}
