package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		WebElement two =driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		two.click();
		Thread.sleep(2000);
		WebElement outer =driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outer);
		Thread.sleep(2000);
		WebElement inner =driver.findElement(By.xpath("(//iframe[@src='SingleFrame.html'])[1]"));
		driver.switchTo().frame(inner);
		Thread.sleep(2000);
		WebElement box =driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		box.sendKeys("ABC");
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		WebElement home =driver.findElement(By.xpath("//a[text()='Home']"));
		home.click();
	}

}
