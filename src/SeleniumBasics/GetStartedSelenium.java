package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GetStartedSelenium {

	public static void main(String[] args) {
	//To launch ff -geckodriver
		
		//System.setProperty("webdriver.gecko.driver", "pathtogecko driver");
		//WebDriver driver1= new FirefoxDriver();
		
		//chrome driver
		
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\Softwares\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	
		driver.get("http://www.google.com");
		String title=driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Google")) {
			System.out.println("correct title");
		}
		else {
			System.out.println("in-correct title");
		}

		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}

}
