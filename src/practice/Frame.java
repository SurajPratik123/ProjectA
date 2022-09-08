package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Frame {
	public static void main(String args[]) throws InterruptedException {
		WebDriver driver =ChromeBrowser.openBrowser("https://vctcpune.com/selenium/practice.html");
		WebElement iframe =driver.findElement(By.tagName("iframe"));
		
		driver.switchTo().frame(iframe);
		
		WebElement about =driver.findElement(By.xpath("(//a[text()='About us'])[1]"));
		System.out.println(about.getText());
		about.click();
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		WebElement popup =driver.findElement(By.xpath("//div[@class='popup']"));
		popup.click();
		System.out.println(popup.getText());
		WebElement pop =driver.findElement(By.xpath("//span[@id='myPopup']"));
		System.out.println(pop.getText());
	}

}
