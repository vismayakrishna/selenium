package testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FindElements extends Base {
	
	public void findElementsSample() {
		String inputMenu = "Checkbox Demo";
		List<WebElement> menu = driver.findElements(By.xpath("//ul[@class='list-group list-group-flush']//li"));
		for (WebElement menuItem : menu) {
			String menuText = menuItem.getText();
			if(inputMenu.equals(menuText)) {
				menuItem.click();
				break;
			}
		}
	}
	
	public void selectLanguageDropDown() {
		String languageToBeSelected = "Português (Brasileiro)";
		driver.navigate().to("https://www.selenium.dev/");
		driver.findElement(By.linkText("English")).click();
		List<WebElement> languageMenu = driver.findElements(By.xpath("//a[@class='dropdown-item']//parent::li"));
		for (WebElement languageItem : languageMenu) {
			String language = languageItem.getText();
			if(languageToBeSelected.equals(language)) {
				languageItem.click();
				break;
			}
		}
	}
	
	public void selectClassSample() {
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("Red");
		select.selectByValue("Yellow");
		select.selectByIndex(3);
	}

	public static void main(String[] args) {
		FindElements findElements = new FindElements();
		findElements.initializeBrowser();
		//findElements.findElementsSample();
		findElements.selectLanguageDropDown();
		//findElements.selectClassSample();
		findElements.driverQuit();

	}

}
