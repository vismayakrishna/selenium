package testscript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FileUploadSample extends Base {
	
	@Test
	public void fileUpload() {
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement chooseFileButton = driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		chooseFileButton.sendKeys("D:\\Vismaya-Obsqura-Training\\Selenium\\github-url.pdf");
	}
	
	@Test
	public void fileUploadUsingRobotClass() throws AWTException {
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement selectPdfFileButton = driver.findElement(By.xpath("//span[text()='Select PDF file']"));
		selectPdfFileButton.click();
		StringSelection ss = new StringSelection("D:\\Vismaya-Obsqura-Training\\Selenium\\github-url.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Robot robot = new Robot();
		robot.delay(250);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(90);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
}
