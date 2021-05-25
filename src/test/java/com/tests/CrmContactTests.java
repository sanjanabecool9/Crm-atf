package com.tests;

import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.crm.config.BrowserDriver;
import com.crm.config.PropertyLoader;
import com.crm.data.ContactData;
import com.crm.data.CrmContactData;
import com.crm.data.CrmContactTestData;
import com.crm.services.CrmContactServices;
import com.crm.services.HomeServices;
import com.crm.services.LoginService;
import com.crm.validators.CrmContactValidator;

public class CrmContactTests {
	LoginService loginService = null;
	HomeServices homeService = null;
	CrmContactServices crmContactServices = null;

	CrmContactData crmContactData = null;
	List<ContactData> appsData = null;

	CrmContactValidator crmContactValidator = null;

	@BeforeClass
	public void init() {

		loginService = new LoginService();
		homeService = new HomeServices();
		crmContactServices = new CrmContactServices();
		crmContactData = CrmContactTestData.getTestData();
		appsData = crmContactData.getCrmcontactdata();
		crmContactValidator = new CrmContactValidator();

		InitializeViews.init();

		BrowserDriver.getCurrentDriver().get(PropertyLoader.getQaUrl());
	}

	@Test
	public void createContact() {
		loginService.loginToApplication(appsData.get(0).getUsername(), appsData.get(0).getPassword());
		homeService.navigateToContacts();

		// create contact testcase
		crmContactServices.navigateToCreateContact().selectSalutation(appsData.get(0).getSalutation());
		crmContactServices.insertName(appsData.get(0).getFirstname(), appsData.get(0).getLastname());
		crmContactServices.insertEmail(appsData.get(0).getEmail());
		crmContactServices.insertDescription();
		crmContactServices.inserAssignedUser();
		crmContactServices.clickSaveContact();
		crmContactServices.getCreatedEmail();
		crmContactValidator.validateContactName(crmContactServices);
		crmContactValidator.validateCreatedEmail(crmContactServices);
		crmContactValidator.validateCreatedAssignedUser(crmContactServices);

		// edit contact testcase
		crmContactServices.editContact();
		crmContactServices.editContactEmail(appsData.get(0).getEditemail());
		crmContactServices.clickSaveContact();
		crmContactServices.getEditedEmail();
		crmContactValidator.validateEditedEmail(crmContactServices);

		// remove contact testcase
		crmContactServices.removeContact();
		homeService.logoutOfCrm();

	}
	
	@Test(description = "This is gitHub Sample Test Case")
	public void gitHubSampleTestCase() {
		
	}
}