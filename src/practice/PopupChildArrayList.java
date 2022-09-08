package practice;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PopupChildArrayList {
	public static void main(String[] args) {
		WebDriver driver =ChromeBrowser.openBrowser("https://vctcpune.com/");
		WebElement practic =driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));
		practic.click();
		practic.click();
		
		ArrayList<String> handles =new ArrayList<String>(driver.getWindowHandles());
		
		for(int i=0;i<handles.size();i++) {
			driver.switchTo().window(handles.get(i));
			String title =driver.getTitle();
			if(title.equals("Practice Page")) {
				WebElement radio2 =driver.findElement(By.xpath("//input[@value='Radio2']"));
				radio2.click();
			}
		}
//		driver.quit();
	}

}
