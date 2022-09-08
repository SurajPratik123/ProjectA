package practice;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	public static void takeScreenShot(WebDriver driver, String name) throws IOException {
		String s =ScreenShot.dateTime();
		File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination =new File("C:\\ScreenShot\\"+name+s+".png");		
		FileHandler.copy(source, destination);
	}
	
	public static String dateTime() {
		DateTimeFormatter dtfm =DateTimeFormatter.ofPattern("dd-MM-YYYY-hh-mm-ss");
		LocalDateTime ldt =LocalDateTime.now();
		String s =dtfm.format(ldt);
		return s;
	}

}
