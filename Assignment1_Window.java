package week4.day1Assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1_Window {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("home")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> handles = new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(handles.get(1));		
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		
		driver.switchTo().window(handles.get(0));
		
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> windows = new ArrayList<String>(windowHandles1); 
		
		driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();		
		driver.switchTo().window(windows.get(1));	
		System.out.println("No.of.Windows: "+ windows.size());		
		driver.close();
		
//		driver.findElement(By.xpath("//button[text()='Do not close me ']")).click();
//		driver.switchTo().window(handles.get(1));		
//		String title2 = driver.getTitle();		
//		System.out.println(title2);
		
		
		
		

	}

}
