package com.tests;

import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.crm.config.BrowserDriver;
import com.crm.config.PropertyLoader;
import com.crm.data.CrmEmailData;
import com.crm.data.CrmEmailTestData;
import com.crm.data.EmailData;
import com.crm.services.CrmEmailServices;
import com.crm.services.HomeServices;
import com.crm.services.LoginService;
import com.crm.validators.CrmEmailValidator;

public class CrmEmailTestScripts {

	LoginService loginService=null;
	HomeServices homeService = null;
	CrmEmailServices crmEmailServices=null;
	
	CrmEmailValidator crmEmailValidator = null;

	CrmEmailData crmEmailData = null; // calling the object of "data" to use it
										// in the testcase
	List<EmailData> appData = null; // this is for this list;

    

    @BeforeClass
	public void init() {
    	loginService=new LoginService();
		homeService = new HomeServices();
		crmEmailServices = new CrmEmailServices();
		
		
		crmEmailValidator = new CrmEmailValidator();

		crmEmailData = CrmEmailTestData.getTestData();
		appData = crmEmailData.getCrmemaildata();
		InitializeViews.init();
		BrowserDriver.getCurrentDriver().get(PropertyLoader.getQaUrl());

	}
    
    @Test(description = "Send Email with To,Cc,Bcc,Subject along with Attachments", priority=0)
    public void emailTestWithAttachment() throws InterruptedException{
		loginService.loginToApplication(appData.get(0).getUsername(),appData.get(0).getPassword());
    	homeService.navigateToEmail();
    	
    	crmEmailServices.clickOnCompose();
    	crmEmailServices.insertToAddress(appData.get(0).getTo());
    	crmEmailServices.insertSubject(appData.get(0).getSubject());
    	crmEmailServices.insertTextInEmailBody(appData.get(0).getBody());
    	crmEmailServices.clickOnAttachmentAndSelectFileFromOurSystem();
    	crmEmailServices.getTextOfCreatedAttachment();
    	crmEmailValidator.validateAttachmentOfEmail(crmEmailServices);
    }
}
