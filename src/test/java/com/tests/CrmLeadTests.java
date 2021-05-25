package com.tests;


import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.crm.config.BrowserDriver;
import com.crm.config.PropertyLoader;
import com.crm.data.CrmLeadData;
import com.crm.data.CrmLeadTestData;
import com.crm.data.LeadData;
import com.crm.services.CrmLeadServices;
import com.crm.services.HomeServices;
import com.crm.services.LoginService;
import com.crm.validators.CrmLeadValidator;

	

public class CrmLeadTests {
	
	LoginService loginService = null;
	HomeServices homeService = null;
	CrmLeadServices crmLeadServices = null;
	
	CrmLeadData crmLeadData = null;
    List<LeadData> appsData = null;
    
    CrmLeadValidator crmLeadValidator=null;
	
	
	@BeforeClass
	public void init(){
		 
		loginService=new LoginService(); 
		homeService=new HomeServices();
		crmLeadServices = new CrmLeadServices();
		
		crmLeadData = CrmLeadTestData.getTestData();
		appsData = crmLeadData.getCrmleaddata();
		crmLeadValidator=new CrmLeadValidator();
		
		InitializeViews.init();	
		
		BrowserDriver.getCurrentDriver().get(PropertyLoader.getQaUrl());
		
	}
		@Test
		public void createLead(){
			loginService.loginToApplication(appsData.get(0).getUsername(),appsData.get(0).getPassword());
			homeService.navigateToLeads();
			
			//create lead testcase
			crmLeadServices.navigateToCreateLead();
			crmLeadServices.insertName(appsData.get(0).getSalutation(),appsData.get(0).getFirstname(),appsData.get(0).getLastname());
			crmLeadServices.insertEmail(appsData.get(0).getEmail());
			crmLeadServices.insertAccount(appsData.get(0).getAccountname());
			crmLeadServices.insertPhoneNumber(appsData.get(0).getOption(),appsData.get(0).getPhone());
			crmLeadServices.insertTitle(appsData.get(0).getTitle());
			//crmLeadServices.doubleClickElement();
			
			
			//copying data from one field to another field testcase
			crmLeadServices.insertDescription();
			
			crmLeadServices.insertWebsite(appsData.get(0).getWebsite());
			crmLeadServices.insertAddress(appsData.get(0).getStreet(),appsData.get(0).getCity(),appsData.get(0).getState(),appsData.get(0).getPostalcode(),appsData.get(0).getCountry());
			crmLeadServices.clickOnSaveLead();
			//crmLeadValidator.vaildateLeadName(crmLeadServices);
		    //crmLeadValidator.validateLeadEmail(crmLeadServices);
			
			crmLeadValidator.validateLeadDescription(crmLeadServices);
			crmLeadServices.createDuplicateLead();
			
			//removing lead testcase
			crmLeadServices.removeCreatedLead();
			crmLeadValidator.validateLeadRemoval(crmLeadServices);
			homeService.logoutOfCrm();

		}
		
		}

