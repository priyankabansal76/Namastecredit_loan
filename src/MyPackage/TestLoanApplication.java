package MyPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestLoanApplication {
	
	public static void testNewLoan(WebDriver driver) {
		
	driver.findElement(By.id("t-s-sign")).click();
	String parentWindowHandler = driver.getWindowHandle();
	for(String childHandler : driver.getWindowHandles()){
	    driver.switchTo().window(childHandler);
	    driver.findElement(By.id("businessloans(anyloan)")).click();
	    driver.findElement(By.id("loanamount")).sendKeys("15");
	    driver.findElement(By.id("amttype1")).click();
	    driver.findElement(By.id("applied_tenure")).sendKeys("3");
	    driver.findElement(By.id("loan_asset_type1")).click();
	    Select dropdown = new Select(driver.findElement(By.id("loan_asset_type_id")));
	    dropdown.selectByValue("7");
	    driver.findElement(By.id("assets_value")).sendKeys("3");
	    driver.findElement(By.id("assets_value_um1")).click();
	    Select dropdown1 = new Select(driver.findElement(By.id("loan_usage_type_id")));
	    dropdown1.selectByValue("1");
	    driver.findElement(By.id("dropdownMenu1")).click();
	    if ( !driver.findElement(By.id("chkbx_1")).isSelected() )
	    {
	         driver.findElement(By.id("chkbx_1")).click();
	    }
	    driver.findElement(By.id("annual_revenue")).sendKeys("4");
	    driver.findElement(By.id("revenue_um1")).click();
	    driver.findElement(By.id("annual_op_expense")).sendKeys("6");
	    driver.findElement(By.id("op_expense_um1")).click();
	    driver.findElement(By.id("cur_monthly_emi")).sendKeys("4");
	    driver.findElement(By.id("t-s-sign20")).click();
	}driver.switchTo().window(parentWindowHandler);
	driver.close();   
	}
}
