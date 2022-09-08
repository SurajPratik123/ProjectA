package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.ChromeVCTC;
import practice.ChromeBrowser;
import practice.EdgeBrowser;

public class ChromeVCTCTest {
	WebDriver driver;
	@BeforeMethod
	public void openBrowser() {
		driver =ChromeBrowser.openBrowser("https://vctcpune.com/");
		ChromeVCTC amazon =new ChromeVCTC(driver);	
		amazon.clickOnPractice(driver, "Practice Page");	
	}
	
	@Test(enabled = false)
	public void enterDate() {
		ChromeVCTC amazon =new ChromeVCTC(driver);	
		amazon.enterDate("19102022");
	}
	@Test(enabled =false)
	public void enterCity() {
		ChromeVCTC amazon = new ChromeVCTC(driver);
		amazon.enterCity("Latur", driver);
	}
	@Test(enabled =false)
	public void dropDown() {
		ChromeVCTC amazon = new ChromeVCTC(driver);
		amazon.selectDropD("Option1");
	}
	@Test
	public void radioButton() {
		ChromeVCTC amazon =new ChromeVCTC(driver);
		amazon.selectRadio(3);
//		amazon.selectRad(driver, 4);
	}

}
