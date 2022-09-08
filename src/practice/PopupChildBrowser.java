package practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PopupChildBrowser {
	public static void main(String args[]) {
		WebDriver driver =ChromeBrowser.openBrowser("https://vctcpune.com/");
		
		WebElement prctice =driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));
		prctice.click();
		
		String hand =driver.getWindowHandle();
		System.out.println(hand);
		
		Set<String> hands =driver.getWindowHandles();
		System.out.println(hands);
		
		Iterator<String> i =hands.iterator();
		String h1 =i.next();
		System.out.println(h1);
		String h2 =i.next();
		System.out.println(h2);
		
		driver.switchTo().window(h2);
		WebElement option1 =driver.findElement(By.xpath("//input[@value='option1']"));
		option1.click();
	}

}
