package com.crm.services;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.crm.config.BrowserDriver;
import com.crm.objects.CrmLeadsContainer;
import com.crm.objects.HomePageContainer;

public class CrmLeadServices {
	
	public static  CrmLeadsContainer crmLeadContainer;
	public static HomePageContainer homePageContainer;
	private static Logger log= Logger.getLogger(CrmContactServices.class.getName());
	
	
	public CrmLeadServices navigateToCreateLead(){
		crmLeadContainer.getButtonCreateLeads().click();
		log.info("create lead page is opened");
		BrowserDriver.takeScreenShot();
		return this;

	}
	public CrmLeadServices insertName(String salutation,String firstname,String lastname){
		BrowserDriver.selectItemFromDropDown(crmLeadContainer.getDropDownLeadSalutation(),salutation);
		//crmLeadContainer.getDropDownLeadSalutation().sendKeys(salutation);
		crmLeadContainer.getTxtFieldLeadFirstName().sendKeys(firstname);
		crmLeadContainer.getTxtFieldLeadLastName().sendKeys(lastname);
		log.info("Lead Name is inserted");
		return this;
	}
	
	public CrmLeadServices insertEmail(String email){
		crmLeadContainer.getTxtFieldLeadEmail().sendKeys(email);
		
		//System.out.println(crmLeadContainer.getTxtFieldLeadEmail().getAttribute("value"));
		log.info("Lead email is inserted");
		return this;
	}
	
	public CrmLeadServices insertAccount(String accountname){
		crmLeadContainer.getTxtFieldLeadAccount().sendKeys(accountname);
		log.info("Lead Accountname is inserted");
		return this;
	}
	
	public CrmLeadServices insertPhoneNumber(String option,String phone){
		BrowserDriver.selectItemFromDropDown(crmLeadContainer.getDropdownLeadPhonenumber(),option);
		crmLeadContainer.getTxtFieldLeadPhoneNumber().sendKeys(phone);
		log.info("Lead phone number is inserted");
		return this;
	}
	
	public CrmLeadServices insertTitle(String title){
		crmLeadContainer.getTxtFieldLeadTitle().sendKeys(title);
		log.info("Lead title is inserted");
		return this;
	} 
	
	public CrmLeadServices insertWebsite(String website){
		crmLeadContainer.getTxtFieldLeadWebsite().sendKeys(website);
		log.info("Lead Website is inserted");
		return this;
	}
	 
	/*public CrmLeadServices insertDescription(){
		BrowserDriver.copyTextandPaste(crmLeadContainer.getTxtFieldLeadEmail(),crmLeadContainer.txtFieldLeadDescription);
		return this;
	}*/
	
	public CrmLeadServices insertDescription(){
		String s1=crmLeadContainer.getTxtFieldLeadEmail().getAttribute("value");
		crmLeadContainer.getTxtFieldLeadDescription().sendKeys(s1);
		return this;
	}
	
	
	
	
	public CrmLeadServices insertAddress(String street,String city,String state,String postalcode,String country){
		crmLeadContainer.getTxtFieldLeadStreet().sendKeys(street);
		crmLeadContainer.getTxtFieldLeadCity().sendKeys(city);
		crmLeadContainer.getTxtFieldLeadState().sendKeys(state);
		crmLeadContainer.getTxtFieldLeadPostalcode().sendKeys(postalcode);
		crmLeadContainer.getTxtFieldLeadCountry().sendKeys(country);
		log.info("Lead Address is inserted");
		return this;
	}
	
	public CrmLeadServices clickOnSaveLead(){
		crmLeadContainer.getButtonSaveLead().click();
		log.info("lead is created");
		return this;
	}
	
	public String getCreatedLeadName(){
		String createdLeadName=crmLeadContainer.getCreatedLeadName().getText();
		log.info("Created Lead Name is captured");
		return createdLeadName;
	}
	
	public String getCreatedLeadEmail(){
		String createdLeadEmail=crmLeadContainer.getCreatedLeadEmail().getText();
		log.info("Created Lead email is captured");
//System.out.println(createdLeadEmail);
		return createdLeadEmail;
	}
	
	public String getCreatedLeadDEscription(){
		String createdLeadDescription=crmLeadContainer.getCreatedLeadDescription().getText();
		return createdLeadDescription;
	}
	
	//creating duplicate lead record
	public CrmLeadServices createDuplicateLead(){
		crmLeadContainer.getCreatedLeadContextMenu().click();
		crmLeadContainer.getOptionDuplicate().click();
		
		//crmLeadContainer.getButtonSaveLead().click();
		BrowserDriver.waitForElement(crmLeadContainer.getButtonSaveLead(), 20).click();
		
        crmLeadContainer.getButtonCreateDuplicateLeadConfirmation().click();
		log.info("Duplicate lead record is created");
		return this;	
	}
	
	public CrmLeadServices removeCreatedLead(){
		crmLeadContainer.getCreatedLeadContextMenu().click();
		crmLeadContainer.getOptionRemove().click();
		crmLeadContainer.getButtonConfirmRemove().click();
		log.info("Created lead is removed");
		return this;
	}
	
	public CrmLeadServices doubleClickElement(){
		BrowserDriver.doublelickAction(crmLeadContainer.txtFieldLeadFirstName);
		log.info("Lead First name is double clicked");
		return this;
	}
	
	public String getTotalCountOfLeads(){
		String count=crmLeadContainer.getTotalLeadCount().getText();
		log.info("Total Count of leads is captured");
		return count;
	}
	
	
	
	public static void init(){
		crmLeadContainer=PageFactory.initElements(BrowserDriver.getCurrentDriver(),CrmLeadsContainer.class);
		
	}
		
}
