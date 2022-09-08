package practice;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionMouse {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =ChromeBrowser.openBrowser("https://demo.guru99.com/test/simple_context_menu.html");
		
		Actions act =new Actions(driver);
		
		WebElement right =driver.findElement(By.xpath("//span[text()='right click me']"));
		act.contextClick(right);
		act.perform();
		Thread.sleep(2000);
		
		WebElement edit =driver.findElement(By.xpath("//span[text()='Edit']"));
		edit.click();
		Alert a =driver.switchTo().alert();
		a.accept();
		Thread.sleep(2000);
		
		WebElement doubleClick =driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		act.doubleClick(doubleClick);
		act.perform();
		a.accept();
	}

}
