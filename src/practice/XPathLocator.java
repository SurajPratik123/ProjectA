package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XPathLocator {
	public static void main(String[] args) {
		WebDriver driver =ChromeBrowser.openBrowser("https://www.facebook.com/");
		
		WebElement attributeXpath =driver.findElement(By.xpath("//input[@id='email']"));
		attributeXpath.sendKeys("ABC");
		
		WebElement containsXpath =driver.findElement(By.xpath("//input[contains(@id,'pa')]"));
		containsXpath.sendKeys("DEF");
		
//		WebElement textXpath =driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
//		textXpath.click();
		
//		WebElement indexXpath =driver.findElement(By.xpath("(//a[@role='button'])[2]"));
//		indexXpath.click();
		
//		WebElement absoluteXpath =driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button"));
//		absoluteXpath.click();
		
		WebElement relativepath =driver.findElement(By.xpath("//body//div//h2"));
		String s =relativepath.getText();
		
		boolean e =relativepath.isDisplayed();
		System.out.println(s+" "+e);
	}

}
