package baidu.testcases;

import org.testng.annotations.Test;

import baidu.pages.BasePage;


import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class HomePageTest {
 
  WebDriver driver = new ChromeDriver();
  
  @BeforeClass
  public void beforeClass() { 
	  driver.get("www.baidu.com");
  }
  
  @Test
  public void f() {
	  BasePage basepage = new BasePage();
	  basepage.search("keyword");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
