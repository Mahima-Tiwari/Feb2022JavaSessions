package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;


public class LocatorConceptsForAmazon {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		driver.findElement(By.id("ap_email")).sendKeys("tiwarimahima.b@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Temp@123");
		driver.findElement(By.id("signInSubmit")).click();
		
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		//driver.findElement(By.className("nav-text")).click();
		driver.findElement(By.linkText("Your Account")).click();
		
		//driver.findElement(By.className("a-color-secondary")).click();
		
		driver.get("https://www.amazon.com/a/addresses/add?ref=ya_address_book_add_button");
		
		driver.findElement(By.id("address-ui-widgets-enterAddressFullName")).sendKeys("Mahi Tiwari");
		driver.findElement(By.id("address-ui-widgets-enterAddressPhoneNumber")).sendKeys("7777777777");
		driver.findElement(By.id("address-ui-widgets-enterAddressPostalCode")).sendKeys("123456");
		driver.findElement(By.id("address-ui-widgets-enterAddressLine1")).sendKeys("sadffdgfshfg32435");
		driver.findElement(By.id("address-ui-widgets-enterAddressLine2")).sendKeys("fhhjkjhjhfjfu");
		
		
		try{
			driver.findElement(By.cssSelector("#address-ui-widgets-countryCode > span:nth-child(1) > span:nth-child(1)")).click();
			
		//	Select select=new Select(driver.findElement(By.id("address-ui-widgets-countryCode")));
			//Select select=new Select(driver.findElement(By.cssSelector("#address-ui-widgets-countryCode > span:nth-child(1) > span:nth-child(1)")));
			System.out.println("successfully found");
			//select.selectByVisibleText("Greece");
		}
		catch(Exception e){
			System.out.println("Span object not found");
			
		}
		finally {
	
		//
		
		//driver.findElement(By.cssSelector("#address-ui-widgets-countryCode > span:nth-child(1) > span:nth-child(1)")).click();
		
		
		//driver.quit();
		System.out.println("Browser successfully closed");
		}

	}

}
