package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class cssSelectorTest {
  @Test
  public void cssSelector() {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.wikipedia.org/");
	  
	  WebElement searchBox = driver.findElement(By.cssSelector("#searchInput"));
	  searchBox.sendKeys("Selenium");
	  
	  WebElement searchButton = driver.findElement(By.cssSelector(".pure-button"));
	  searchButton.click();
  }
}
