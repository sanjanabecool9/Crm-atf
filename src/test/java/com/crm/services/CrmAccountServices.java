package com.crm.services;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.crm.config.BrowserDriver;
import com.crm.objects.CrmAccountContainer;
import com.crm.objects.HomePageContainer;

public class CrmAccountServices {
	public static CrmAccountContainer crmAccountContainer;
	public static HomePageContainer homePageContainer;
	private static Logger log= Logger.getLogger(CrmAccountServices.class.getName());
	
	public CrmAccountServices navigateToCreateAccount(){
		crmAccountContainer.getButtonCreateAccount().click();
		log.info("User navigated to create account page");
		return this;
		
	}
	
	public CrmAccountServices insertNameAndEmail(String name,String email){
		crmAccountContainer.getTxtFieldName().sendKeys(name);
		crmAccountContainer.getTxtFieldEmail().sendKeys(email);
		log.info("Name and email id is inserted");
		return this;
	}
	
	public CrmAccountServices selectPhoneOption(String option){
		BrowserDriver.selectItemFromDropDown(crmAccountContainer.getDropdownPhonenumber(),option);
		return this;
	}
	
	
	
	public CrmAccountServices insertPhoneNumber(String phone){
		crmAccountContainer.getTxtFieldPhoneNumber().sendKeys(phone);
		log.info("phone number is inserted");
		return this;
	}
	
	
	public CrmAccountServices insertBillingAddress(String street,String city,String state){
		
		crmAccountContainer.getTxtFielStreet().sendKeys(street);
		crmAccountContainer.getTxtFieldCity().sendKeys(city);
		crmAccountContainer.getTxtFieldState().sendKeys(state);
		log.info("Billing address is inserted");
		return this;
	}
	
	public CrmAccountServices insertShippingAddressSameAsBillingAddress(){
		crmAccountContainer.getButtonCopyBillingAddress().click();
		log.info("inserted billing address to shipping address");
		return this;
	}
	
	public CrmAccountServices selectAssignedUser(){
		crmAccountContainer.getContextMenuAssignedUser().click();
		crmAccountContainer.getUserAdmin().click();
		return this;
	}
	
	
	public CrmAccountServices clickOnSaveButton(){
		crmAccountContainer.getButtonSave().click();
		log.info("Save button is clicked");

		return this;
	}
	
	public String getAccountName(){
		//homePageContainer.getButtonAccounts()
		String accName = crmAccountContainer.getCreatedAccountName().getText();
		//String accName = BrowserDriver.getCurrentDriver().findElement(By.xpath("(//div[@data-name='name'][1]/div")).getText();
		System.out.println(accName);
				return accName;
	}
	
	public String getAccountEmail(){
		String accEmail = crmAccountContainer.getCreatedAccountEmail().getText();
		//String accEmail = BrowserDriver.getCurrentDriver().findElement(By.xpath("//a[@data-action='mailTo']")).getAttribute("value");
		System.out.println(accEmail);
		return accEmail;
	}
	
	public String getBillingAddress(){
		String billingAdd = crmAccountContainer.getCreatedBillingAddress().getText();
		System.out.println(billingAdd);
		return billingAdd;
	}
	
	public String getShippingAddress(){
		String shippingAdd = crmAccountContainer.getCreatedShippingAddress().getText();
		System.out.println(shippingAdd);
		return shippingAdd;
	}
	
	public String getCretedAssignedUser(){
		String createdAssignedUser=crmAccountContainer.getCreatedAssignedUser().getText();
		return createdAssignedUser;
	}
	
	
	public int getCreatedNumberLength(){
		int phoneNumLength=crmAccountContainer.getCreatedPhoneNumer().getText().length();
		return phoneNumLength;
	}
	public String createdPhoneNumber(){
		String phoneNumber=crmAccountContainer.getCreatedPhoneNumer().getText();
		return phoneNumber;
	}
	
	

	public CrmAccountServices clickOnCreatedAccountCheckBox(){
		crmAccountContainer.getCreatedAccountCheckBox().click();
		log.info("Account is selected to remove");

		return this;
	}
	
	public CrmAccountServices clickOnActionsButton(){
		crmAccountContainer.getButtonActionsOfAccounts().click();
		return this;
	}
	
	public CrmAccountServices selectRemoveOption(){
		crmAccountContainer.getOptionRemove().click();
		log.info("Remove option is clicked");

		return this;
	}
	
	public CrmAccountServices clickOnRemoveButton(){
		crmAccountContainer.getButtonConfirmRemove().click();
		log.info("Created account is removed");
		//System.out.println("Account " + crmAccountContainer.getCreatedAccountName().getText() + " is removed");
		return this;
	}
	
	public CrmAccountServices hoverOnContextMenu(){
		BrowserDriver.hoverOnElement(crmAccountContainer.getContextMenu());
		log.info("Control hovered on context menu");
		return this;
	}
	
	
	public static void init(){
		crmAccountContainer=PageFactory.initElements(BrowserDriver.getCurrentDriver(),CrmAccountContainer.class);
		
	}


}
