package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionDragDrop {
	public static void main(String args[]) throws InterruptedException {
		WebDriver driver =ChromeBrowser.openBrowser("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement frame =driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frame);
		Actions act =new Actions(driver);
		/*WebElement img =driver.findElement(By.xpath("(//li[contains(@class,'ui-widget-content ui-corner-tr')])[2]"));
		WebElement trash =driver.findElement(By.xpath("//div[@id='trash']"));
		
		act.dragAndDrop(img, trash);
		act.perform();*/
		
		List<WebElement> gallery =driver.findElements(By.xpath("//li[contains(@class,'ui-widget-content ui-corner-tr ui-draggabl')]"));
		int size =gallery.size();
		
		WebElement trash =driver.findElement(By.xpath("//div[@id='trash']"));
		WebElement pics =driver.findElement(By.xpath("//ul[@id='gallery']"));
		
		for(int i=0;i<size;i++) {
			WebElement image =gallery.get(i);
			act.dragAndDrop(image, trash);
			Thread.sleep(3000);
			act.perform();
			
//			act.dragAndDrop(image, pics);
//			act.perform();
		}
		
		for(int j=0;j<size;j++) {
			WebElement photo =gallery.get(j);
			act.dragAndDrop(photo, pics);
			Thread.sleep(3000);
			act.perform();
		}
	}

}
