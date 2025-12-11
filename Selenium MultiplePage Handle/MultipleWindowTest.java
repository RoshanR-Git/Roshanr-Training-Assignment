package demo;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleWindowTest {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	  
	  WebElement openW = driver.findElement(By.id("openwindow"));
	  openW.click();
	  
	  String parent1 = driver.getWindowHandle();
	  System.out.println("Parent1: " + parent1);
	  
	  Set<String> child1 = driver.getWindowHandles();
	  
	  for(String eachWindow : child1)
	  {
		  if(!eachWindow.equals(parent1))
		  {
			  driver.switchTo().window(eachWindow);
			  break;
		  }
	  }
	  System.out.println("Open Window Title: "+ driver.getTitle());
	  Thread.sleep(2000);
	  driver.switchTo().window(parent1);
	  
	  WebElement openT = driver.findElement(By.id("opentab"));
	  openT.click();
	  
	  Set<String> child2 = driver.getWindowHandles();
	  
	  for(String eachWindow : child2)
	  {
		  if(!eachWindow.equals(parent1))
		  {
			  driver.switchTo().window(eachWindow);
			  break;
		  }
	  }
	  
	  System.out.println("Open Window Tab: "+driver.getTitle());
	  driver.switchTo().window(parent1);
	  driver.quit();
  }
}
