package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Current Account");
		driver.findElement(By.name("parentPartyId")).sendKeys("democlass1");
		driver.findElement(By.id("groupNameLocal")).sendKeys("Current");
		driver.findElement(By.id("officeSiteName")).sendKeys("Amazon");
		driver.findElement(By.id("annualRevenue")).sendKeys("1000000000");
		WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select dd1 = new Select(industry);
		dd1.selectByVisibleText("Computer Software");
		driver.findElement(By.id("numberEmployees")).sendKeys("1500");
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		Select dd2 = new Select(ownership);
		dd2.selectByValue("OWN_LLC_LLP");
		driver.findElement(By.id("sicCode")).sendKeys("12345678");
		driver.findElement(By.id("tickerSymbol")).sendKeys("1234");
		WebElement source = driver.findElement(By.name("dataSourceId"));
		Select dd3 = new Select(source);
		dd3.selectByVisibleText("Existing Customer");
		WebElement market = driver.findElement(By.name("marketingCampaignId"));
		Select dd4 = new Select(market);
		dd4.selectByVisibleText("Automobile");
		WebElement initialTeam = driver.findElement(By.name("initialTeamPartyId"));
		Select dd5 = new Select(initialTeam);
		dd5.selectByValue("DemoSalesTeam1");
		driver.findElement(By.name("description")).sendKeys("Account creation");
		driver.findElement(By.name("importantNote")).sendKeys("NA");
		driver.findElement(By.id("primaryPhoneAreaCode")).sendKeys("527");
		driver.findElement(By.id("primaryPhoneNumber")).sendKeys("9566229840");
		driver.findElement(By.id("primaryPhoneExtension")).sendKeys("236");
		driver.findElement(By.id("primaryPhoneAskForName")).sendKeys("Naveen");
		driver.findElement(By.id("primaryEmail")).sendKeys("naveenraj050795@gmail.com");
		driver.findElement(By.id("primaryWebUrl")).sendKeys("NA");
		driver.findElement(By.id("generalToName")).sendKeys("Naveen");
		driver.findElement(By.id("generalAttnName")).sendKeys("Naveen");
		driver.findElement(By.id("generalAddress1")).sendKeys("6A Muthu Street,");
		driver.findElement(By.id("generalAddress2")).sendKeys("Kolathur, Chennai -99");
		driver.findElement(By.id("generalCity")).sendKeys("Chennai");
		WebElement country = driver.findElement(By.name("generalCountryGeoId"));
		Select dd6 = new Select(country);
		dd6.selectByValue("IND");
		driver.findElement(By.id("generalPostalCode")).sendKeys("600099");
		WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select dd7 = new Select(state);
		dd7.selectByIndex(25);
		driver.findElement(By.id("generalPostalCodeExt")).sendKeys("238");
		driver.findElement(By.className("smallSubmit")).click();
		String title1 = driver.getTitle();
		System.out.println(title1);
		
	} 

}