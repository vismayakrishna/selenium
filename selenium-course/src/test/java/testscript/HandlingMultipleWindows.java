package testscript;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HandlingMultipleWindows extends Base {
	
	@Test
	public void multipleWindowSample() {
		driver.navigate().to("https://selenium.obsqurazone.com/window-popup.php");
		WebElement likeUsButton = driver.findElement(By.xpath("//a[@href='https://www.facebook.com/obsqurazone/']"));
		likeUsButton.click();
		String mainWindow = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();
		
		Iterator<String> i1=s1.iterator();		
		
        while(i1.hasNext())			
        {		
            String ChildWindow=i1.next();		
            		
            if(!mainWindow.equalsIgnoreCase(ChildWindow))			
            {    		
                 
                    // Switching to Child window
                    driver.switchTo().window(ChildWindow); 
                    WebElement loginButton = driver.findElement(By.xpath("//div[@aria-label='Accessible login button']//parent::div[@class='x1c436fg']"));
                    loginButton.click();
            }
        }
        driver.switchTo().window(mainWindow);
	}

}
