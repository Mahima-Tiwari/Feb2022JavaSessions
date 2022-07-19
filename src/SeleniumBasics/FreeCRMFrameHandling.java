package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FreeCRMFrameHandling {

	public static void main(String[] args) throws InterruptedException {

		FreeCRMFrameHandling freecrm=new FreeCRMFrameHandling();
		//freecrm.signUp();
		freecrm.logIn();


	}
	public static void logIn() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://ui.freecrm.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("shivya24@yahoo.com");
		driver.findElement(By.name("password")).sendKeys("Temp@123");
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
		
		
	}
	
	public static void signUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://api.freecrm.com/register/");
		driver.findElement(By.name("email")).sendKeys("shivya24@yahoo.com");
		driver.findElement(By.id("countryValue"));
		System.out.println("found");
		try {
		driver.findElement(By.name("phone"));//.sendKeys("7774050129");
		System.out.println("found");
		}catch(Exception e) {
			System.out.println("phone field not found");
		}
		
	}

}
