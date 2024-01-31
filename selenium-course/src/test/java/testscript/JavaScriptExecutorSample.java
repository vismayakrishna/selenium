package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavaScriptExecutorSample extends Base {
	
	@Test
	public void javascriptExecutorSample() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,350)", "");  //scroll down
		js.executeScript("window.scrollBy(0,-350)", ""); //scroll up
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");  //scroll down to the end of the page
		WebElement searchElement = driver.findElement(By.xpath("//input[@id='search_box']"));
		js.executeScript("arguments[0].click();", searchElement);
	}
}
