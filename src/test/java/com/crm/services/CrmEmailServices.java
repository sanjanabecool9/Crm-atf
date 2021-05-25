package com.crm.services;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.Screen;

import com.crm.config.BrowserDriver;
import com.crm.objects.CrmEmailContainer;
import com.crm.objects.HomePageContainer;

public class CrmEmailServices {
	
	public static CrmEmailContainer crmEmailContainer;
	public static HomePageContainer homePageContainer;
	private static Logger log= Logger.getLogger(CrmEmailServices.class.getName());

	Screen screen=new Screen();
	
	public CrmEmailServices clickOnCompose(){
		crmEmailContainer.getButtonEmailCompose().click();
		return this;
	}
	
	public CrmEmailServices insertToAddress(String to){
		//BrowserDriver.getCurrentDriver().navigate().refresh();
		crmEmailContainer.getTxtFieldTo().sendKeys(to);
		log.info("To address is inserted");
		return this;
	}
	
	public CrmEmailServices insertSubject(String subject){
		crmEmailContainer.getTxtFieldSubject().sendKeys(subject);
		return this;
	}
	
	public CrmEmailServices insertTextInEmailBody(String body) throws InterruptedException{
		crmEmailContainer.getTxtFieldEmailBody().sendKeys(body);
		Thread.sleep(1000);
		return this;
	}
	
	public CrmEmailServices clickOnAttachmentAndSelectFileFromOurSystem(){
		try{
			Thread.sleep(6000);
			screen.click("C:\\Rootshell\\Crm-atf\\sikuli_objects\\attach2.PNG");
		    screen.hover("C:\\Rootshell\\Crm-atf\\sikuli_objects\\attach2.PNG");	   
			Thread.sleep(4000);
			screen.click("C:\\Rootshell\\Crm-atf\\sikuli_objects\\Desktop.PNG");
			Thread.sleep(4000);
			screen.doubleClick("C:\\Rootshell\\Crm-atf\\sikuli_objects\\CRM.PNG");
			Thread.sleep(4000);
			screen.doubleClick("C:\\Rootshell\\Crm-atf\\sikuli_objects\\Flowchart.PNG");
			log.info("Attachment is clicked");
			
			
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Check the sikuli object");
		}
		return this;
		
	}
	
	
	
public String getTextOfCreatedAttachment(){
		
		String attachmentName=crmEmailContainer.getAttchedFile().getText();
		
		return attachmentName;
	}
	
	
	
	public static void init(){
		crmEmailContainer=PageFactory.initElements(BrowserDriver.getCurrentDriver(),CrmEmailContainer.class);

	}

}
