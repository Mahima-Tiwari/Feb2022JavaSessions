package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Yahoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		driver.findElement(By.id("createacc")).click();
		driver.findElement(By.id("usernamereg-firstName")).sendKeys("Test");
		driver.findElement(By.id("usernamereg-lastName")).sendKeys("Last");
		driver.findElement(By.id("usernamereg-yid")).sendKeys("shivya24");
		Select select=new Select(driver.findElement(By.name("shortCountryCode")));
		select.selectByValue("GR");
		select.selectByValue("IN");
		driver.findElement(By.id("usernamereg-phone")).sendKeys("7774050129");
			
		System.out.println("selected");
		
		Select select1=new Select(driver.findElement(By.id("usernamereg-month")));
		System.out.println("found");
		select1.selectByValue("6");
		
		driver.findElement(By.id("usernamereg-day")).sendKeys("11");
		driver.findElement(By.id("usernamereg-year")).sendKeys("1992");
		driver.findElement(By.id("usernamereg-password")).sendKeys("Temp@123");
		driver.findElement(By.id("reg-submit-button")).click();
		
		System.out.println("entered");
		
		
	}

}
