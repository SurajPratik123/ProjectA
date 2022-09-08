package practice;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class Facebook {
	public static void main(String[] args) throws IOException {
//		WebDriver driver = Browser.openBrowser("https://www.facebook.com/");
//		String title =driver.getTitle();
//		String currentUrl =driver.getCurrentUrl();
//		System.out.println(title);
//		System.out.println(currentUrl);
//		
//		ScreenShot.takeScreenShot(driver, "fbk ");
		
		String s =Parametrization.excelSheet("Sheet1", 2, 1);
		System.out.println(s);
		
	}

}
