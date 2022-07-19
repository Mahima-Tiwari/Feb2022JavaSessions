package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooSignup {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		driver.findElement(By.id("createacc")).click();

		

	}

}
