package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PopupHiddenDivision {
	public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver =ChromeBrowser.openBrowser("https://www.facebook.com/");
	
	WebElement create =driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	create.click();
	Thread.sleep(2000);
	WebElement month =driver.findElement(By.xpath("//select[@id='month']"));
	Select sell =new Select(month);
	sell.selectByValue("1");	
	System.out.println(month.getText());
	
	WebElement day =driver.findElement(By.xpath("//select[@id='day']"));
	Select sel =new Select(day);
	sel.selectByIndex(2);//index number starts with 0
	System.out.println(day.getText());
	
	WebElement year =driver.findElement(By.xpath("//select[@id='year']"));
	Select se =new Select(year);
	se.selectByVisibleText("2021");
	System.out.println(year.getText());
	}
}
