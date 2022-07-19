package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookSignupPage {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.id("u_0_2_4A")).click();
		driver.findElement(By.className("_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy")).click();
		System.out.println("Successfully found sign up button");
		

	}

}
