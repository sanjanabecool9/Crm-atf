
package com.crm.config;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.objects.CrmLeadsContainer;

public class BrowserDriver {
	public static final Integer defaultTimeoutSeconds=40;
	public static WebDriver mDriver;
	public static  CrmLeadsContainer crmLeadContainer;

	
	 public synchronized static WebDriver getCurrentDriver(String browserType){
		 if(mDriver==null){  
			 try{
				 mDriver=BrowserFactory.getBrowser(browserType);
			 }catch(UnreachableBrowserException e){
				 e.printStackTrace(); 
				 
			 }
		 }
		 
		 return mDriver;
	 }
	
	public static WebDriver getCurrentDriver(){
		
	return getCurrentDriver(PropertyLoader.getBrowser());
	}
	
	public static WebElement waitForElement(WebElement elementToWaitFor,Integer waitTimeSeconds){
		
	if(waitTimeSeconds==null)  
	{
		waitTimeSeconds=defaultTimeoutSeconds;
		
	}
	
	WebDriverWait wait=new WebDriverWait(getCurrentDriver(),Duration.ofSeconds(waitTimeSeconds));
	return wait.until(ExpectedConditions.visibilityOf(elementToWaitFor));
	}
	
	public static void selectItemFromDropDown(WebElement webElement,String option){
		Select select=new Select(webElement);
		//select.selectByIndex(1);
		select.selectByVisibleText(option);
		
	}
	
	public static void hoverOnElement(WebElement element){
		Actions actions=new Actions(BrowserDriver.getCurrentDriver());
		actions.moveToElement(element).build().perform();
		
	}
	
	public static void copyTextandPaste(WebElement elementCopy, WebElement elementPaste){
		/*Actions action=new Actions(BrowserDriver.getCurrentDriver());
		action.moveToElement(target).doubleClick().build().perform();
		target.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		System.out.println(target.getAttribute("value"));
		action.moveToElement(result).sendKeys(Keys.chord(Keys.CONTROL,"v"));
		System.out.println(result.getAttribute("value"));*/
		elementCopy.sendKeys(Keys.CONTROL+"A");
		elementCopy.sendKeys(Keys.CONTROL+"C");
		elementPaste.sendKeys(Keys.CONTROL+"V");
	}
		
	
	
	public static void doublelickAction(WebElement ElementToClick){
		Actions actionss=new Actions(BrowserDriver.getCurrentDriver());
		actionss.moveToElement(ElementToClick).doubleClick().build().perform();
		
	}
	
	public static void dataBaseTest() throws SQLException{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		Connection con=DriverManager.getConnection("http://localhost/phpmyadmin/");
		Statement stmt=con.createStatement();
		String query="select name from account";
		ResultSet rs=stmt.executeQuery(query);
		
		while(rs.next())
		{
			String name=rs.getString("name");
			System.out.println(name);
		}
		
		
	}
	
	
	
	//take screenshot and store it in a file format
	public static void takeScreenShot(){
		try{
			String newFileNamePath;
			File directory = new File(".");
			//create time stamp format
			DateFormat dateformat = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ssaa");
			Date date = new Date();
			
			//format
			newFileNamePath = directory.getCanonicalPath() + "\\screenshots\\" + dateformat.format(date) + "_" + ".jpg";
			
			File file = new File(newFileNamePath);
			//this will take the screenshot
			File srcFile = ((TakesScreenshot)getCurrentDriver()).getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(srcFile,new File(newFileNamePath));
		}
		catch (Exception e){
			e.printStackTrace();
						
		}
	}
	
	//public static void selectDataFromDropdown() {

}//
