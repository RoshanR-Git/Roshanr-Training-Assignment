package demo;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class crossBrowserTest {
  @Test
  public void browserTest() {
	  Scanner sc = new Scanner(System.in);
		System.out.println("Enter Browser Name (chrome / firefox / edge): ");
		String browser = sc.next();

		WebDriver driver = null;

		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		else {
			System.out.println("Invalid browser name!");
			System.exit(0);
		}

		driver.manage().window().maximize();
		driver.get("https://www.bing.com/");
  }
}
