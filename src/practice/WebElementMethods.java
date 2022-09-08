package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElementMethods {
	public static void main(String srgd[]) throws InterruptedException {
		WebDriver driver =ChromeBrowser.openBrowser("https://vctcpune.com/selenium/practice.html");
		
		WebElement selected =driver.findElement(By.xpath("//input[@value='Radio1']"));
		boolean a = selected.isSelected();
		System.out.println(a);		
		selected.click();
		boolean b =selected.isSelected();
		System.out.println(b);
				
		WebElement displayed =driver.findElement(By.xpath("//input[@id='displayed-text']"));
		boolean e =displayed.isDisplayed();
		System.out.println(e);		
		WebElement hide =driver.findElement(By.xpath("//input[@id='hide-textbox']"));
		hide.click();		
		boolean ea =displayed.isDisplayed();
		System.out.println(ea);
		
		WebElement text =driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']"));
		String actual =text.getText();
		System.out.println(actual);
		String required ="Welcome To Practice Page";
		if(actual.equals(required)) {
			System.out.println("Text is correct");
		}
//		driver.manage().deleteAllCookies();//to delete cookies
	}

}
