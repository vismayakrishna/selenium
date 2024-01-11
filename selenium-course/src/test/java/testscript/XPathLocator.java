package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class XPathLocator extends Base {

	public void containsMethod() {
		WebElement xpathElement = driver.findElement(By.xpath("//button[contains(@id,'button-o')]"));
		WebElement xpathElement2 = driver.findElement(By.xpath("//input[contains(@id,'single')]"));
		WebElement xpathElement3 = driver.findElement(By.xpath("//div[contains(@id,'message-o')]"));
		WebElement xpathElement4 = driver.findElement(By.xpath("//label[contains(@for,'input')]"));
		WebElement xpathElement5 = driver.findElement(By.xpath("//button[contains(@id,'button-t')]"));
	}

	public void startsWithMethod() {
		WebElement xpathElement = driver.findElement(By.xpath("//button[starts-with(@id,'button-o')]"));
		WebElement xpathElement2 = driver.findElement(By.xpath("//button[starts-with(@id,'button-t')]"));
		WebElement xpathElement3 = driver.findElement(By.xpath("//div[starts-with(@id,'message-o')]"));
		WebElement xpathElement4 = driver.findElement(By.xpath("//div[starts-with(@id,'message-t')]"));
		WebElement xpathElement5 = driver.findElement(By.xpath("//label[starts-with(@for,'in')]"));
	}

	public void textMethod() {
		WebElement xpathElement = driver.findElement(By.xpath("//button[text()='Show Message']"));
		WebElement xpathElement2 = driver.findElement(By.xpath("//button[text()='Get Total']"));
		WebElement xpathElement3 = driver.findElement(By.xpath("//label[text()='Enter value A']"));
		WebElement xpathElement4 = driver.findElement(By.xpath("//label[text()='Enter value B']"));
		WebElement xpathElement5 = driver.findElement(By.xpath("//label[text()='Enter Message']"));
	}

	public void andOrMethod() {
		WebElement xpathElement = driver.findElement(By.xpath("//button[text()='Show Message' and @id='button-one']"));
		WebElement xpathElement2 = driver.findElement(By.xpath("//button[text()='Show Message' or @id='button-one']"));
		WebElement xpathElement3 = driver.findElement(By.xpath("//button[text()='Get Total' and @id='button-two']"));
		WebElement xpathElement4 = driver.findElement(By.xpath("//button[text()='Get Total' or @id='button-two']"));
		WebElement xpathElement5 = driver.findElement(By.xpath("//div[starts-with(@id,'message-o') and @class='my-2']"));
	}

	public void parentMethod() {
		WebElement xpathElement = driver.findElement(By.xpath("//button[@id='button-one']//parent::form"));
		WebElement xpathElement2 = driver.findElement(By.xpath("//button[@id='button-two']//parent::form"));
		WebElement xpathElement3 = driver.findElement(By.xpath("//input[@id='single-input-field']//parent::div"));
		WebElement xpathElement4 = driver.findElement(By.xpath("//input[@id='value-a']//parent::div"));
		WebElement xpathElement5 = driver.findElement(By.xpath("//div[@id='message-one']/parent::form"));
	}

	public void childMethod() {
		WebElement xpathElement = driver.findElement(By.xpath("//div[@class='form-group']//child::input[@id='value-a']"));
		WebElement xpathElement2 = driver.findElement(By.xpath("//div[@class='form-group']//child::input[@id='single-input-field']"));
		WebElement xpathElement3 = driver.findElement(By.xpath("//form[@method='POST']//child::div[@id=\"message-one\"]"));
		WebElement xpathElement4 = driver.findElement(By.xpath("//form[@method='POST']//child::div[@id=\"message-two\"]"));
		WebElement xpathElement5 = driver.findElement(By.xpath("//div[@class='form-group']//child::input[@id='value-b']"));
	}

	public void ancestorMethod() {
		WebElement xpathElement = driver.findElement(By.xpath("//button[@id='button-one']//ancestor::form"));
		WebElement xpathElement2 = driver.findElement(By.xpath("//input[@id='value-a']//ancestor::div[@class='form-group']"));
		WebElement xpathElement3 = driver.findElement(By.xpath("//div[@id='message-one']//ancestor::form"));
		WebElement xpathElement4 = driver.findElement(By.xpath("//div[@id='message-two']//ancestor::form"));
		WebElement xpathElement5 = driver.findElement(By.xpath("//input[@id='value-b']//ancestor::div[@class='form-group']"));
	}
	
	public void followingMethod() {
		WebElement xpathElement = driver.findElement(By.xpath("//button[@id='button-one']//following::div"));
		WebElement xpathElement2 = driver.findElement(By.xpath("//input[@id='value-a']//following::input"));
		WebElement xpathElement3 = driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='form-group']"));
		WebElement xpathElement4 = driver.findElement(By.xpath("//input[@id='value-a']//following::button"));
		WebElement xpathElement5 = driver.findElement(By.xpath("//form[@method='POST']//following::input[@id='single-input-field']"));
		
	}
	
	public void precedingMethod() {
		WebElement xpathElement = driver.findElement(By.xpath("//button[@id='button-one']//preceding::div[@class='container']"));
		WebElement xpathElement2 = driver.findElement(By.xpath("//button[@id='button-two']//preceding::div[@class='row']"));
		WebElement xpathElement3 = driver.findElement(By.xpath("//input[@id='single-input-field']//preceding::nav"));
		WebElement xpathElement4 = driver.findElement(By.xpath("//input[@id='value-a']//preceding::input"));
		WebElement xpathElement5 = driver.findElement(By.xpath("//button[@id='button-one']//preceding::input"));
	}
	
	public void descendantMethod() {
		WebElement xpathElement = driver.findElement(By.xpath("//form[@method='POST']//descendant::input[@id='value-b']"));
		WebElement xpathElement2 = driver.findElement(By.xpath("//form[@method='POST']//descendant::input[@id='value-a']"));
		WebElement xpathElement3 = driver.findElement(By.xpath("//form[@method='POST']//descendant::input[@id='single-input-field']"));
		WebElement xpathElement4 = driver.findElement(By.xpath("//div[@class='card']//descendant::ul"));
		WebElement xpathElement5 = driver.findElement(By.xpath("//div[@class='example my-3']//descendant::ul"));
	}
	
	public void followingSiblingMethod() {
		WebElement xpathElement = driver.findElement(By.xpath("//button[@id='button-two']//following-sibling::div"));
		WebElement xpathElement2 = driver.findElement(By.xpath("//div[@class='example my-3']//following-sibling::div[@id='message-two']"));
		WebElement xpathElement3 = driver.findElement(By.xpath("//form[@method='POST']//following-sibling::div[@class='form-group']"));
		WebElement xpathElement4 = driver.findElement(By.xpath("//button[@id='button-one']//following-sibling::div"));
		WebElement xpathElement5 = driver.findElement(By.xpath("//div[@class='example my-3']//following-sibling::div[@id='message-one']"));
	}
	
	
	public static void main(String[] args) {
		XPathLocator xPathLocator = new XPathLocator();
		xPathLocator.initializeBrowser();
		xPathLocator.containsMethod();
		xPathLocator.startsWithMethod();
		xPathLocator.textMethod();
		xPathLocator.andOrMethod();
		xPathLocator.parentMethod();
		xPathLocator.childMethod();
		xPathLocator.ancestorMethod();
		xPathLocator.followingMethod();
		xPathLocator.precedingMethod();
		xPathLocator.descendantMethod();
		xPathLocator.followingSiblingMethod();
		xPathLocator.driverQuit();
	}

}
