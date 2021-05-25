package com.crm.services;


import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.crm.config.BrowserDriver;
import com.crm.objects.CrmContactContainer;
import com.crm.objects.HomePageContainer;

public class CrmContactServices {

	  
	public static CrmContactContainer crmContactContainer;
	public static HomePageContainer homePageContainer;
	private static Logger log= Logger.getLogger(CrmContactServices.class.getName());
	
	public CrmContactServices navigateToCreateContact(){
		crmContactContainer.getButtonCreateContact().click();
		return this;
	}
	
	public CrmContactServices selectSalutation(String salutation){
		BrowserDriver.selectItemFromDropDown(crmContactContainer.getDropDownSalutation(),salutation);
		//crmContactContainer.getDropDownSalutation().click();
		//crmContactContainer.getDropDownSalutation().sendKeys("Ms. ");
		//crmContactContainer.getSalutation().selectByIndex(1);
		return this;
	}
	
	public CrmContactServices insertName(String firstname,String lastname){
		crmContactContainer.getTxtFieldFirstName().sendKeys(firstname);
		crmContactContainer.getTxtFieldLastName().sendKeys(lastname);
		log.info("Contact Name is inserted");
		return this;
	}
		
	public CrmContactServices insertEmail(String email){
		crmContactContainer.getTxtFieldEmail().sendKeys(email);
		log.info("contacts email is inserted");
		return this;
	}
	
	
	public CrmContactServices inserAssignedUser(){
		crmContactContainer.getContextMenuAssignedUser().click();
		crmContactContainer.getAssignedUser1().click();
		log.info("User is assigned");
		return this;
	}
	
	/*public CrmContactServices insertAssignedUserText(){
		crmContactContainer.getTxtFieldAssignedUser().sendKeys("Sanjana s");
		return this;
	}*/
	
	public String createdAssignedUser(){
		 String createdAssignedUser=crmContactContainer.getCreatedAssignedUser().getText();
		return createdAssignedUser;	
	}
	
	public CrmContactServices clickSaveContact(){
		crmContactContainer.getButtonSaveContact().click();
		log.info("Contact is saved");
		return this;
	}
	
	public String getContactName(){
		//homePageContainer.getButtonAccounts()
		String contactName = crmContactContainer.createdContacttName.getText();
		//String accName = BrowserDriver.getCurrentDriver().findElement(By.xpath("(//div[@data-name='name'][1]/div")).getText();
		System.out.println(contactName);
				return contactName;
	}
	
	public String getCreatedEmail(){
		String createdEmail = crmContactContainer.createdEmail.getText();
		System.out.println(createdEmail);
		return createdEmail;
	}
	
	
	public CrmContactServices editContact(){
		crmContactContainer.getButtonEditContact().click();
		log.info("Edit button is clicked");
		return this;
	}
	
	public CrmContactServices editContactEmail(String editemail){
		crmContactContainer.getTxtFieldEmail().clear();
		crmContactContainer.getTxtFieldEmail().sendKeys(editemail);
		log.info("Created contacts Email is edited");
		return this;
		
	}
	
	public String getEditedEmail(){
		String editedEmail = crmContactContainer.editedEmail.getText();
		log.info("the email is edited as " +editedEmail);
		return editedEmail;
	} 
	
	//here i am copying text from firstname field to description
	public CrmContactServices insertDescription(){
		BrowserDriver.copyTextandPaste(crmContactContainer.getTxtFieldFirstName(), crmContactContainer.getTxtFieldDescription());
		return this;
	}
	
	public CrmContactServices removeContact(){
		crmContactContainer.getOptionsContact().click();
		crmContactContainer.getOptionRemoveContact().click();
		crmContactContainer.getOptionConfirmRemove().click();
		log.info("Contact is removed");
		return this;
	}
	
	public static void init(){
		crmContactContainer=PageFactory.initElements(BrowserDriver.getCurrentDriver(),CrmContactContainer.class);
		
	}
	
}

