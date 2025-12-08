package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediff {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		WebElement moneyredirect = driver.findElement(By.linkText("Money"));
		moneyredirect.click();
		
		WebElement rediffGurus = driver.findElement(By.partialLinkText("GURUS"));
		rediffGurus.click();
		
		driver.close();

	}

}
