package testscript;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Table extends Base {
	
	@Test
	public void verifyHeaderOfTheTable() {
		List<String> expectedHeaderOfTheTable = new ArrayList<String>();
		expectedHeaderOfTheTable.add("Name");
		expectedHeaderOfTheTable.add("Position");
		expectedHeaderOfTheTable.add("Office");
		expectedHeaderOfTheTable.add("Age");
		expectedHeaderOfTheTable.add("Start date");
		expectedHeaderOfTheTable.add("Salary");
		driver.navigate().to("https://selenium.obsqurazone.com/table-pagination.php");
		List<WebElement> headerOfTheTable = driver.findElements(By.xpath("//tr[@role='row']//th"));
		List<String> actualHeaderOfTheTable = new ArrayList<String>();
		for (WebElement headerItem : headerOfTheTable) {
			actualHeaderOfTheTable.add(headerItem.getText());
		}
		assertEquals(expectedHeaderOfTheTable, actualHeaderOfTheTable, "Header is not expected");
	}
	
	@Test
	public void searchNameInTheList() {
		String nameToBeSearched = "Ashton Cox";
		boolean flag = false;
		driver.navigate().to("https://selenium.obsqurazone.com/table-pagination.php");
		List<WebElement> elementsOfTheTable = driver.findElements(By.xpath("//tr[@class='odd']//td"));
		for (WebElement name : elementsOfTheTable) {
			if(nameToBeSearched.equals(name.getText())) {
				flag = true;
				break;
			} 
		}
		assertTrue(flag, "Searched item " + nameToBeSearched + " not found");
	}
	
	@Test
	public void assertSample() {
		boolean flag = false;
		int a=5, b=6;
		String s = null;
		String str = "Hello";
		assertFalse(flag, "Flag is true.");
		assertNotEquals(a, b, "a & b are equal");
		assertNull(s, "s is not null");
		assertNotNull(str, "str is null");
	}

}
