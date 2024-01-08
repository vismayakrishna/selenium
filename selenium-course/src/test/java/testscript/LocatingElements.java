package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LocatingElements extends Base {

	public void locators() {
		WebElement showMessageButton = driver.findElement(By.id("button-one"));
		WebElement headerElement = driver.findElement(By.className("header-top"));
		WebElement linkElement = driver.findElement(By.linkText("Checkbox Demo"));
		WebElement partialLinkElement = driver.findElement(By.partialLinkText("Checkbox"));
		WebElement nameElement = driver.findElement(By.name("description"));
		WebElement cssElement = driver.findElement(By.cssSelector("button#button-one"));
		WebElement cssElement2 = driver.findElement(By.cssSelector("div.header-top"));
		WebElement cssElement3 = driver.findElement(By.cssSelector("button[id=button-one]"));
		WebElement xpathElement = driver.findElement(By.xpath("//a[@href='radio-button-demo.php']"));
		WebElement tagElement = driver.findElement(By.tagName("div"));
	}

	public void idLocator() {
		WebElement idElement = driver.findElement(By.id("single-input-field"));
		WebElement idElement2 = driver.findElement(By.id("value-a"));
		WebElement idElement3 = driver.findElement(By.id("value-b"));
		WebElement idElement4 = driver.findElement(By.id("button-two"));
		WebElement idElement5 = driver.findElement(By.id("message-two"));
	}

	public void classNameLocator() {
		driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
		WebElement classNameElement = driver.findElement(By.className("home"));
		WebElement classNameElement2 = driver.findElement(By.className("aboutus"));
		WebElement classNameElement3 = driver.findElement(By.className("contact"));
		WebElement classNameElement4 = driver.findElement(By.className("captionone"));
		WebElement classNameElement5 = driver.findElement(By.className("captiontwo"));
	}

	public void linkTextLocator() {
		driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
		WebElement linkTextElement = driver.findElement(By.linkText("Withdraw Funds"));
		WebElement linkTextElement2 = driver.findElement(By.linkText("Check Balances"));
		WebElement linkTextElement3 = driver.findElement(By.linkText("Make Deposits"));
		WebElement linkTextElement4 = driver.findElement(By.linkText("Account History"));
		WebElement linkTextElement5 = driver.findElement(By.linkText("Register"));
	}

	public void partialLinkTextLocator() {
		driver.navigate().to("https://testpages.eviltester.com/styled/index.html");
		WebElement partialLinkTextElement = driver.findElement(By.partialLinkText("Locators"));
		WebElement partialLinkTextElement2 = driver.findElement(By.partialLinkText("Hover"));
		WebElement partialLinkTextElement3 = driver.findElement(By.partialLinkText("Cookies"));
		WebElement partialLinkTextElement4 = driver.findElement(By.partialLinkText("iFrames"));
		WebElement partialLinkTextElement5 = driver.findElement(By.partialLinkText("Fake"));
	}

	public void nameLocator() {
		driver.navigate().to("https://selenium.obsqurazone.com/form-submit.php");
		WebElement nameElement = driver.findElement(By.name("viewport"));
		WebElement nameElement2 = driver.findElement(By.name("author"));
		WebElement nameElement3 = driver.findElement(By.name("keywords"));
		WebElement nameElement4 = driver.findElement(By.name("description"));
	}

	public void cssSelectorLocator() {
		driver.navigate().to("https://selenium.obsqurazone.com/form-submit.php");
		WebElement cssElement = driver.findElement(By.cssSelector("input#validationCustom01"));
		WebElement cssElement2 = driver.findElement(By.cssSelector("button.btn-primary"));
		WebElement cssElement3 = driver.findElement(By.cssSelector("ul.list-group"));
		WebElement cssElement4 = driver.findElement(By.cssSelector("div#collapsibleNavbar"));
		WebElement cssElement5 = driver.findElement(By.cssSelector("ul.navbar-nav"));
	}

	public void xpathLocator() {
		driver.navigate().to("https://selenium.obsqurazone.com/form-submit.php");
		WebElement xpathElement = driver.findElement(By.xpath("//input[@id='validationCustom01']"));
		WebElement xpathElement2 = driver.findElement(By.xpath("//input[@placeholder='Last name']"));
		WebElement xpathElement3 = driver.findElement(By.xpath("//button[@type='submit']"));
		WebElement xpathElement4 = driver.findElement(By.xpath("//input[@class='form-check-input']"));
		WebElement xpathElement5 = driver.findElement(By.xpath("//input[@id='validationCustomUsername']"));
	}

	public void tagNameLocator() {
		driver.navigate().to("https://testpages.eviltester.com/styled/index.html");
		WebElement tagElement = driver.findElement(By.tagName("div"));
		WebElement tagElement2 = driver.findElement(By.tagName("li"));
		WebElement tagElement3 = driver.findElement(By.tagName("ul"));
		WebElement tagElement4 = driver.findElement(By.tagName("h1"));
		WebElement tagElement5 = driver.findElement(By.tagName("h2"));
	}

	public static void main(String[] args) {
		LocatingElements locatingElements = new LocatingElements();
		locatingElements.initializeBrowser();
		locatingElements.locators();
		locatingElements.idLocator();
		locatingElements.classNameLocator();
		locatingElements.linkTextLocator();
		locatingElements.partialLinkTextLocator();
		locatingElements.nameLocator();
		locatingElements.cssSelectorLocator();
		locatingElements.xpathLocator();
		locatingElements.tagNameLocator();
		locatingElements.driverQuit();

	}

}
