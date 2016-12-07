package TestNg;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://www.baidu.com/");
      
	  driver.manage().window().maximize();
		         
	  WebElement txtbox = driver.findElement(By.name("wd"));
      txtbox.sendKeys("selenium");  
	  WebElement btn = driver.findElement(By.id("su"));		
	  btn.click();

	  driver.close();
  }
}
