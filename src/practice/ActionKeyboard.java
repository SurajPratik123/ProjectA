package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionKeyboard {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		
		WebElement fName =driver.findElement(By.xpath("//input[@id='userName']"));
		fName.sendKeys("Software Engineer");
		
		Actions act =new Actions(driver);
		act.sendKeys(Keys.TAB);
		act.sendKeys("QA@tester.com");
		act.sendKeys(Keys.TAB);
		act.sendKeys("IT Park");
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.sendKeys(Keys.TAB);
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.sendKeys(Keys.TAB);
		act.sendKeys(Keys.ENTER);
		act.build().perform();
	}

}
