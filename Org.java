package vtigerAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Org {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://demo.vtiger.com/vtigercrm/index.php");
	    driver.findElement(By.xpath("//button[text()='Sign in']")).click();
	    driver.findElement(By.id("appnavigator")).click();
	    WebElement ele = driver.findElement(By.xpath("//span[text()=' MARKETING']"));
	    Thread.sleep(2000);
	    Actions action =new Actions(driver);
	    action.moveToElement(ele).perform();
	    driver.findElement(By.xpath("(//span[text()=' Organizations'])[1]")).click();
	    driver.findElement(By.id("Accounts_listView_basicAction_LBL_ADD_RECORD")).click();
	    driver.findElement(By.id("Accounts_editView_fieldName_accountname")).sendKeys("raghu");
	    driver.findElement(By.id("Accounts_editView_fieldName_website")).sendKeys("https://www.raghuIndustries.in");
	    driver.findElement(By.id("Accounts_editView_fieldName_phone")).sendKeys("7057205684");
	    driver.findElement(By.id("Accounts_editView_fieldName_tickersymbol")).sendKeys("raghu");
	    driver.findElement(By.id("Accounts_editView_fieldName_fax")).sendKeys("ABCD");
	    driver.findElement(By.id("account_id_display")).sendKeys("ABCD");
	    driver.findElement(By.id("Accounts_editView_fieldName_otherphone")).sendKeys("8007535491");
	    driver.findElement(By.id("Accounts_editView_fieldName_employees")).sendKeys("10");
	    driver.findElement(By.id("Accounts_editView_fieldName_account_id_create")).click();
	     driver.findElement(By.xpath("(//input[@name='accountname'])[2]")).sendKeys("raghu");
	     driver.findElement(By.xpath("(//input[@name='website'])[2]")).sendKeys("https://wwww.raghu.com");
	     driver.findElement(By.xpath("(//input[@name='phone'])[2]")).sendKeys("69327832789");
	     WebElement framedp1 = driver.findElement(By.xpath("(//a[@class='select2-choice'])[5]"));
	     framedp1.sendKeys("Atlas Jeniffer");
	     framedp1.sendKeys(Keys.ENTER);
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
	     
	    driver.findElement(By.id("Accounts_editView_fieldName_email1")).sendKeys("raghu@gmail.com");
	    driver.findElement(By.id("Accounts_editView_fieldName_email2")).sendKeys("raghu@gmail.com");
	    driver.findElement(By.id("Accounts_editView_fieldName_ownership")).sendKeys("Qspider");
	    Thread.sleep(2000);
	    driver.findElement(By.id("s2id_autogen1")).click();
	    WebElement industry = driver.findElement(By.id("s2id_autogen2_search"));
	    industry.sendKeys("Biotechnology");
	    industry.sendKeys(Keys.ENTER);
	    Thread.sleep(2000);
	    driver.findElement(By.id("select2-chosen-4")).click();
	    WebElement rating = driver.findElement(By.id("s2id_autogen4_search"));
	    rating.sendKeys("Active");
	    rating.sendKeys(Keys.ENTER);
	    Thread.sleep(2000);
	    driver.findElement(By.id("select2-chosen-6")).click();
	    WebElement type = driver.findElement(By.id("s2id_autogen6_search"));
	    type.sendKeys("Investor");
	    type.sendKeys(Keys.ENTER);
	     Thread.sleep(2000);
	    driver.findElement(By.id("Accounts_editView_fieldName_siccode")).sendKeys("1999");
	    driver.findElement(By.id("Accounts_editView_fieldName_emailoptout")).click();
	    driver.findElement(By.id("Accounts_editView_fieldName_annual_revenue")).sendKeys("500000");
	    Thread.sleep(2000);  
	    JavascriptExecutor jse =(JavascriptExecutor)driver;
	    jse.executeScript("window.scrollBy(0,500)");
	    Thread.sleep(2000);
	    driver.findElement(By.id("Accounts_editView_fieldName_notify_owner")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.name("bill_street")).sendKeys("jm rd chinchwad");
	    
	    
	    driver.findElement(By.name("ship_street")).sendKeys("jm rd chinchwad");
	    driver.findElement(By.id("Accounts_editView_fieldName_bill_pobox")).sendKeys("416109");
	    driver.findElement(By.id("Accounts_editView_fieldName_ship_pobox")).sendKeys("5461222");
	    driver.findElement(By.id("Accounts_editView_fieldName_bill_city")).sendKeys("pune");
	    driver.findElement(By.id("Accounts_editView_fieldName_ship_city")).sendKeys("latur");
	    driver.findElement(By.id("Accounts_editView_fieldName_bill_state")).sendKeys("maharashtra");
	    driver.findElement(By.id("Accounts_editView_fieldName_ship_state")).sendKeys("kerala");
	    driver.findElement(By.id("Accounts_editView_fieldName_bill_code")).sendKeys("456789");
	    driver.findElement(By.id("Accounts_editView_fieldName_ship_code")).sendKeys("123456");
	    driver.findElement(By.id("Accounts_editView_fieldName_bill_country")).sendKeys("India");
	    driver.findElement(By.id("Accounts_editView_fieldName_ship_country")).sendKeys("India");
	    driver.findElement(By.name("description")).sendKeys("good company");
	    driver.findElement(By.xpath("//button[text()='Save']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[@class='fa fa-user']")).click();
	    driver.findElement(By.xpath("//a[text()='Sign Out']")).click();	
	}
	}


