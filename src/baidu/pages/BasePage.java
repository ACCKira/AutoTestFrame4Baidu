package baidu.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/******
Define common elements which existed in multiple pages

*******/

public class BasePage {
	
	private WebDriver driver;
	WebElement searchBox = driver.findElement(By.id("kw"));
	WebElement submitBtn = driver.findElement(By.id("su"));
	
	//Search one keyword
	public void search(String keyword){
		
		searchBox.sendKeys(keyword);
		submitBtn.click();
	}

}
