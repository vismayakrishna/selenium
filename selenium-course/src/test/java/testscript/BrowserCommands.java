package testscript;

public class BrowserCommands extends Base {
	
	public void browserCommands() {
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		String pageSource = driver.getPageSource();
	}
	
	public void navigationCommands() {
		driver.navigate().to("https://google.com/");
		driver.navigate().back();
		driver.navigate().forward();
	}
	
	public static void main(String[] args) {
		BrowserCommands browserCommands = new BrowserCommands();
		browserCommands.initializeBrowser();
		browserCommands.navigationCommands();
		browserCommands.driverQuit();
	}
}
