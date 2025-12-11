package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class flipKartnthTest {
  @Test
  public void f() {
	  WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      driver.get("https://www.flipkart.com");
      
      driver.findElement(By.xpath("//input[contains(@placeholder,'Search for Products, Brands and More')]")).click();
      driver.findElement(By.xpath("//input[contains(@placeholder,'Search for Products, Brands and More')]")).sendKeys("Laptop");
      driver.findElement(By.xpath("//input[contains(@placeholder,'Search for Products, Brands and More')]")).sendKeys(Keys.ENTER);
      System.out.println(driver.findElement(By.xpath("(//div[@class='lvJbLV col-12-12']/div[1]/div[1]/div[1]/a[1])[7]")).getText());
      System.out.println("------------------------------");
      
      WebElement search = driver.findElement(By.className("Vy9RSP"));
      search.click();
      search.sendKeys(Keys.CONTROL + "a");
      search.sendKeys(Keys.DELETE);
      driver.findElement(By.className("Vy9RSP")).sendKeys("TV");
      driver.findElement(By.className("Vy9RSP")).sendKeys(Keys.ENTER);
      System.out.println(driver.findElement(By.xpath("(//div[@class='lvJbLV col-12-12']/div[1]/div[1]/div[1]/a[1])[13]")).getText());
      System.out.println("------------------------------");
      
      search.click();
      search.sendKeys(Keys.CONTROL + "a");
      search.sendKeys(Keys.DELETE);
      driver.findElement(By.className("Vy9RSP")).sendKeys("Smart Phone");
      driver.findElement(By.className("Vy9RSP")).sendKeys(Keys.ENTER);
      System.out.println(driver.findElement(By.xpath("(//div[@class='lvJbLV col-12-12']/div[1]/div[1]/div[1]/a[1])[2]")).getText());
      System.out.println("------------------------------");
  }
}
