package week4.day1Assignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1_Alerts {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		alert.dismiss();
		
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		alert.sendKeys("Shruthi");
		alert.accept();
		
		driver.findElement(By.xpath("//button[text()='Line Breaks?']")).click();
		alert.accept();
		
		driver.findElement(By.xpath("//button[text()='Sweet Alert']")).click();
		driver.findElement(By.xpath("//button[text()='OK']")).click();

	}

}
