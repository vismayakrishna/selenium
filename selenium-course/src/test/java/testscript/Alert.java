package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Alert extends Base {
	
	@Test
	public void handleAlert() {
		driver.navigate().to("https://selenium.obsqurazone.com/javascript-alert.php");
		WebElement alertBox = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		alertBox.click();
		WebElement confirmBox = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		confirmBox.click();
		WebElement promptBox = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		promptBox.click();
	}

}
