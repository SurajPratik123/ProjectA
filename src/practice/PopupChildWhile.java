package practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PopupChildWhile {
	public static void main(String[] args) {
		WebDriver driver =ChromeBrowser.openBrowser("https://vctcpune.com/");
		
		WebElement seleniumPractice =driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));
		seleniumPractice.click();
		seleniumPractice.click();
		
		Set<String> handles =driver.getWindowHandles();
		Iterator<String> it =handles.iterator();
		
		while(it.hasNext()) {
			String s =it.next();
			driver.switchTo().window(s);
			String title =driver.getTitle();
			if(title.equals("Practice Page")) {
				WebElement radio1 =driver.findElement(By.xpath("//input[@value='Radio1']"));
				radio1.click();
			}
		}
	}

}
