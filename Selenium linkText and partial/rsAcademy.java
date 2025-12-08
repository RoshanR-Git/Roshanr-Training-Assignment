package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rsAcademy {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement radio = driver.findElement(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[1]/input"));
		radio.click();
		
		WebElement check1 = driver.findElement(By.name("checkBoxOption1"));
		check1.click();
		
		WebElement check2 = driver.findElement(By.name("checkBoxOption2"));
		check2.click();
		
		driver.close();

	}

}
