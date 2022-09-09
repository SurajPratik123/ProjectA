package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Amazo {
	public static void main(String[] args) {
		WebDriver driver =ChromeBrowser.openBrowser("https://vctcpune.com/");
		
		WebElement jobs =driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));
		jobs.click();
		
	}
	
}
