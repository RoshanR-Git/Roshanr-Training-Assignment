package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class anchorTest {
  @Test
  public void anchortagTest() {
	  WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.example.com/");

		List<WebElement> links = driver.findElements(By.tagName("a"));

		for (WebElement link : links) {
			System.out.println(link.getAttribute("href"));
		}

		System.out.println("Total anchor tags: " + links.size());
  }
}
