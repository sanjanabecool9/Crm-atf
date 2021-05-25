package com.crm.services;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.crm.config.BrowserDriver;
import com.crm.objects.CrmUserContainer;
import com.crm.objects.HomePageContainer;

public class CrmUserServices {
	
	public static CrmUserContainer crmUserContainer;
	public static HomePageContainer homePageContainer;
	private static Logger log= Logger.getLogger(CrmUserServices.class.getName());
	
	public CrmUserServices navigateToCreateUser(){
		crmUserContainer.getButtonCreateUser().click();
		return this;
	}
	public CrmUserServices insertUserName(){
		crmUserContainer.getTxtFieldUserName().sendKeys("Root");
		return this;
	}
	
	public CrmUserServices insertName(){
		BrowserDriver.selectItemFromDropDown(crmUserContainer.getDropDownSalutation(), "Mr.");
		crmUserContainer.getTxtFieldFirstName().sendKeys("Anndrew");
		crmUserContainer.getTxtFieldLastName().sendKeys("Pal");
		
		return this;
	}
	
	public CrmUserServices insertEmail(){
		crmUserContainer.getTxtFieldEmail().sendKeys("andrew@test.com");
		return this;
	}
	
	public CrmUserServices insertPhone(){
		BrowserDriver.selectItemFromDropDown(crmUserContainer.getDropDownPhoneOption(), "Mobile");
		crmUserContainer.getTxtFieldPhone().sendKeys("90909090");
		return this;
	}
	
	public CrmUserServices selectGender(){
		BrowserDriver.selectItemFromDropDown(crmUserContainer.getDropDownGender(), "Male");
		return this;
	}
	
	public CrmUserServices selectType(){
		BrowserDriver.selectItemFromDropDown(crmUserContainer.getDropDownType(),"Regular");
		return this;
	}
	
	public CrmUserServices checkStatusActiveOrNot(){
		//if you want to select not active..uncheck the box
		crmUserContainer.getCheckBoxActiveorNot().click();
		//by default it will be active..
		
		return this;
	}
	
	public CrmUserServices insertPassword(){
		crmUserContainer.getButtonGeneratePassword().click();		
		return this;
	}
	
	public String generatedPassword(){
		String password=crmUserContainer.getTxtFieldGeneratedPassword().getText();
		return password;
	}
	
	public CrmUserServices clickOnSave(){
		crmUserContainer.getButtonSaveUser();
		return this;
	}
	
	
	
	
	
	
	
	public static void init(){
		crmUserContainer=PageFactory.initElements(BrowserDriver.getCurrentDriver(),CrmUserContainer.class);
		
	}
	

}
