package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import graphql.parser.antlr.GraphqlParser.ArgumentsContext;

public class JavaScriptScroll {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = ChromeBrowser.openBrowser("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		WebElement calender =driver.findElement(By.xpath("//legend[text()='Calendar Example']"));
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", calender);
		Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("window.scrollBy(500,200)");
	}

}
