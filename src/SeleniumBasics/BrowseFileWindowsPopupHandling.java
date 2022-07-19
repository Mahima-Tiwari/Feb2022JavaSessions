package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowseFileWindowsPopupHandling {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		driver.findElement(By.name("fileupload")).sendKeys("D:\\SELENIUM\\Softwares\\iGuru-Syllabus-CoreJava-Selenium.pdf");
		System.out.println("Found");
	
		
		

	}

}
