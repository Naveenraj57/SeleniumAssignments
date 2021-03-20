package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verification {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		//Edit
		driver.get("http://testleaf.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a")).click();
		
		driver.findElement(By.id("email")).sendKeys("naveenraj050795@gmailcom");
		
		//Append
		driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input")).sendKeys("value");
		
		// clear
		driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input")).clear();
		
		// default value entered
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/input")).getAttribute("value"));
		
		// Confirm the field
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input")).isEnabled());
		
		
		//Button
		driver.get("http://testleaf.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[2]/a")).click();
		
		//Click
		//driver.findElement(By.id("home")).click();
		
		//position
		
		System.out.println(driver.findElement(By.id("position")).getLocation().getX());
		System.out.println(driver.findElement(By.id("position")).getLocation().getY());
		
		//color
		System.out.println(driver.findElement(By.id("color")).getCssValue("background-color"));
		
		//size
		System.out.println(driver.findElement(By.id("size")).getSize().getHeight());
		System.out.println(driver.findElement(By.id("size")).getSize().getWidth());
		
		//Hyper link
		driver.get("http://testleaf.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[3]/a")).click();
		driver.findElement(By.linkText("Go to Home Page")).click();
	}

}
