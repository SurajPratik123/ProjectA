package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PopupAlert {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =ChromeBrowser.openBrowser("https://the-internet.herokuapp.com/javascript_alerts");
		
		WebElement alrt =driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		alrt.click();
		Thread.sleep(2000);
		Alert a =driver.switchTo().alert();
		Thread.sleep(3000);
		a.sendKeys("abc");
		Thread.sleep(5000);
		a.accept();
	}

}
