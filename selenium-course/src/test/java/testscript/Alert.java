package testscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Alert extends Base {
	
	@Test
	public void handleAlert() {
		driver.navigate().to("https://selenium.obsqurazone.com/javascript-alert.php");
		WebElement alertBox = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		alertBox.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); //explicit wait
		wait.until(ExpectedConditions.alertIsPresent()); //explicit wait
		String alertText =  driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();  //click ok button
		WebElement confirmBox = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		confirmBox.click();
		driver.switchTo().alert().dismiss(); //click cancel button
		WebElement promptBox = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		promptBox.click();
		driver.switchTo().alert().sendKeys("Vismaya");
		driver.switchTo().alert().accept();
	}

}
