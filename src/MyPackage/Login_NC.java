package MyPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Login_NC {
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		System.setProperty("webdriver.gecko.driver", "D://geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("http://app.loan2pal.com/app/login");
		WebElement element=driver.findElement(By.id("emailid"));
		element.sendKeys("priyanka.bansal@namastecredit.com");
		
	
		WebElement element1=driver.findElement(By.id("password"));
		element1.sendKeys("p@12121212");
		
		driver.findElement(By.id("signup_in")).click();
	
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		TestLoanApplication.testNewLoan(driver);
		
		driver.close();
		
	}
	
	

}
