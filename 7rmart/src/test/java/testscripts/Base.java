package testscripts;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import utilities.ScreenshotUtility;
import utilities.WaitUtility;

public class Base {
	
	public WebDriver driver;
	
	@BeforeMethod
	@Parameters("browser")
	public void initializeBrowser(String browser) throws Exception {
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else if(browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {
			throw new Exception("Invalid browser");
		}
		driver.get("https://groceryapp.uniqassosiates.com/admin ");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitUtility.IMPLICIT_WAIT));
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void driverQuit(ITestResult iTestResult) throws IOException {
		if(iTestResult.getStatus()== ITestResult.FAILURE) {
			ScreenshotUtility screenshotutility = new ScreenshotUtility();
			screenshotutility.getScreenShot(driver, iTestResult.getName());
		}
		driver.quit();
	}
}
