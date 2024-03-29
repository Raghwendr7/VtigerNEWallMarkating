package vtigerAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Campaigns {
	

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub

			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://demo.vtiger.com/vtigercrm/index.php");
			driver.findElement(By.xpath("//button[text()='Sign in']")).click();
			driver.findElement(By.id("appnavigator")).click();
		     WebElement ele = driver. findElement(By.xpath("//span[text()=' MARKETING']"));
		     Actions action=new Actions(driver);
		     action.moveToElement(ele).perform();
		    driver.findElement(By.partialLinkText("Campaigns")).click();
		    driver.findElement(By.id("Campaigns_listView_basicAction_LBL_ADD_RECORD")).click();
		    driver.findElement(By.id("Campaigns_editView_fieldName_campaignname")).sendKeys("raghu");
		    driver.findElement(By.id("s2id_autogen1")).click();
		    WebElement ele1 = driver.findElement(By.id("s2id_autogen2_search"));
		    ele1.sendKeys("Atlas Jeniffer");
		    ele1.sendKeys(Keys.ENTER);
		    driver.findElement(By.id("select2-chosen-4")).click();
		    WebElement ele2 = driver.findElement(By.id("s2id_autogen4_search"));
		    ele2.sendKeys("Active");
		    ele2.sendKeys(Keys.ENTER);
		    driver.findElement(By.id("s2id_autogen5")).click();
		    WebElement type = driver.findElement(By.id("s2id_autogen6_search"));
		    type.sendKeys("Advertisement");
		    type.sendKeys(Keys.ENTER);
		    driver.findElement(By.xpath("//span[@class='input-group-addon createReferenceRecord cursorPointer clearfix']")).click();
		    driver.findElement(By.id("Products_editView_fieldName_productname")).sendKeys("rahul");
		    driver.findElement(By.id("Products-editview-fieldname-unit_price")).sendKeys("786543456");
		    driver.findElement(By.id("tax1_check")).click();
		    driver.findElement(By.id("tax2_check")).click();
		    driver.findElement(By.id("tax3_check")).click();
		    driver.findElement(By.id("Products_editView_fieldName_qtyinstock")).sendKeys("10");
		    driver.findElement(By.id("s2id_autogen124")).click();
		    WebElement dd = driver.findElement(By.id("s2id_autogen125_search"));
		    Thread.sleep(2000);
		    dd.sendKeys("Atlas Jeniffer");
		    dd.sendKeys(Keys.ENTER);
		    WebElement el = driver.findElement(By.xpath("//button[@name='saveButton']"));
		    el.sendKeys(Keys.ENTER);

		    
		    
		    driver.findElement(By.id("product_id_display")).sendKeys("ABCD");
		    driver.findElement(By.id("Campaigns_editView_fieldName_targetaudience")).sendKeys("ABCD");
		    Thread.sleep(2000);
		    WebElement date = driver.findElement(By.id("Campaigns_editView_fieldName_closingdate"));
		    date.sendKeys("25-04-2023");
		    date.sendKeys(Keys.ENTER);
		    
			driver.findElement(By.id("Campaigns_editView_fieldName_sponsor")).sendKeys("raghu mirajgaonk");
			driver.findElement(By.id("Campaigns_editView_fieldName_targetsize")).sendKeys("2000");
			driver.findElement(By.id("Campaigns_editView_fieldName_numsent")).sendKeys("80");
			driver.findElement(By.id("Campaigns_editView_fieldName_budgetcost")).sendKeys("100000");
			driver.findElement(By.id("Campaigns_editView_fieldName_actualcost")).sendKeys("50000");
			
			driver.findElement(By.id("s2id_autogen7")).click();
			WebElement response = driver.findElement(By.id("s2id_autogen8_search"));
			response.sendKeys("Excellent");
			response.sendKeys(Keys.ENTER);
			
			driver.findElement(By.id("Campaigns_editView_fieldName_expectedrevenue")).sendKeys("80000");
			driver.findElement(By.id("Campaigns_editView_fieldName_expectedsalescount")).sendKeys("200000");
			driver.findElement(By.id("Campaigns_editView_fieldName_actualsalescount")).sendKeys("150000");
			driver.findElement(By.id("Campaigns_editView_fieldName_expectedresponsecount")).sendKeys("10000");
			driver.findElement(By.id("Campaigns_editView_fieldName_actualresponsecount")).sendKeys("15000");
			driver.findElement(By.id("Campaigns_editView_fieldName_expectedroi")).sendKeys("2500000");
			driver.findElement(By.id("Campaigns_editView_fieldName_actualroi")).sendKeys("255000");
			driver.findElement(By.id("Campaigns_editView_fieldName_description")).sendKeys("ABCDEFG");
			driver.findElement(By.cssSelector("button[class='btn btn-success saveButton']")).click();
			driver.findElement(By.cssSelector("span[class='fa fa-user']")).click();
			driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
		}

	}


