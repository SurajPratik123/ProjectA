package POM;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ChromeVCTC {
	@FindBy (xpath = "(//a[text()='Start Selenium Practice'])[1]") private WebElement seleniumPractice;
	@FindBy (xpath = "//input[@placeholder='select date...']") private WebElement date;
	@FindBy (xpath = "//input[@list='mah-district']") private WebElement city;
	@FindBy (xpath = "//section//div//div[1]//datalist//option") private List<WebElement> cityList;
	@FindBy (xpath = "//select[@id='dropdown-class-example']") private WebElement selectDrop;
	@FindBy (xpath = "//input[@name='radio']") private List<WebElement> radio;
	
	public ChromeVCTC(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		public void clickOnPractice(WebDriver driver, String title) {
			seleniumPractice.click();
			ArrayList<String> handles =new ArrayList<String>(driver.getWindowHandles());		
			driver.switchTo().window(handles.get(1));
			WebDriverWait wait =new WebDriverWait(driver, Duration.ofMillis(2000));
			wait.until(ExpectedConditions.titleContains(title));
			String currentTitle =driver.getTitle();
			Assert.assertEquals(currentTitle, title);
	}
		public void enterDate(String d) {
			date.sendKeys(d);
	}
		public void enterCity(String c, WebDriver driver) {
			WebDriverWait wait =new WebDriverWait(driver, Duration.ofMillis(2000));
			wait.until(ExpectedConditions.visibilityOfAllElements(city));
			city.sendKeys(c);
//			for(int i=0;i<cityList.size();i++) {
//				WebElement w =cityList.get(i);
//				String s =w.getText();
//				if(s.equalsIgnoreCase(c)) {
//					w.click();
//					break;
//				}
//			}
	}
		public void selectDropD(String se) {
			Select sel =new Select(selectDrop);
			sel.selectByVisibleText(se);
	}
		public void selectRadio(int a) {
			System.out.println(radio.size());
			
				WebElement rad =radio.get(a);
				rad.click();
				
	}
		public void selectRad(WebDriver driver, int x) {
			driver.findElement(By.xpath("(//input[@name='radio'])["+x+"]")).click();
		}
			

}
