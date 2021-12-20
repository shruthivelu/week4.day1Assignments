package week4.day1Assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4 {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement frame = driver.findElement(By.xpath("(//div[@id='wrapframe']/iframe)[1]"));		
		driver.switchTo().frame(0);
		WebElement click = driver.findElement(By.xpath("//button[@id='Click']"));		  
		  
		List<WebElement> framelist = driver.findElements(By.tagName("iframe"));
		//int size = framelist.size();
		System.out.println(framelist.size());
		
		  File SS = click.getScreenshotAs(OutputType.FILE); 
		  File desti = new File("./Snapshot/frame.png"); 
		  FileUtils.copyFile(SS, desti);
		 
		
		
		
		

	}

}
