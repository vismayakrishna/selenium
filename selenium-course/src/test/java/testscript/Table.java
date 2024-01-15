package testscript;

import java.util.ArrayList;
import java.util.Collections;
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
		Collections.sort(expectedHeaderOfTheTable);
		Collections.sort(actualHeaderOfTheTable);
		if(expectedHeaderOfTheTable.equals(actualHeaderOfTheTable)) {
			System.out.println("Headers of the tables are equal");
		}else {
			System.out.println("Headers of the tables are not equal");
		}
	}
	
	@Test
	public void searchNameInTheList() {
		String nameToBeSearched = "Ashton Cox";
		driver.navigate().to("https://selenium.obsqurazone.com/table-pagination.php");
		List<WebElement> elementsOfTheTable = driver.findElements(By.xpath("//tr[@class='odd']//td"));
		for (WebElement name : elementsOfTheTable) {
			if(nameToBeSearched.equals(name.getText())) {
				System.out.println("Element is found");
				break;
			} 
		}
	}

}
