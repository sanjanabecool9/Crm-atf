package com.tests;

import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.crm.config.BrowserDriver;
import com.crm.config.PropertyLoader;
import com.crm.data.ContactData;
import com.crm.data.CrmContactData;
import com.crm.data.CrmContactTestData;
import com.crm.data.CrmLoginData;
import com.crm.data.CrmTestData;
import com.crm.data.LoginData;
import com.crm.services.CrmContactServices;
import com.crm.services.CrmUserServices;
import com.crm.services.HomeServices;
import com.crm.services.LoginService;
import com.crm.validators.CrmContactValidator;

public class CrmUserTests {

	LoginService loginService = null;
	HomeServices homeService = null;
	CrmUserServices crmUserServices = null;

	CrmLoginData crmLoginData = null; // calling the object of "data" to use it
	// in the testcase
	List<LoginData> appData = null; // this is for this list;

	@BeforeClass
	public void init() {

		loginService = new LoginService();
		homeService = new HomeServices();
		crmUserServices = new CrmUserServices();

		crmLoginData = CrmTestData.getTestData();
		appData = crmLoginData.getCrmlogindata();

		BrowserDriver.getCurrentDriver().get(PropertyLoader.getQaUrl());
		InitializeViews.init();

	}

	@Test
	public void createUser() {
		loginService.loginToApplication(appData.get(0).getUsername(), appData.get(0).getPassword());
		homeService.navigateToUsers();
		crmUserServices.navigateToCreateUser();
		crmUserServices.insertUserName();
		crmUserServices.insertName();
		crmUserServices.insertEmail();
		crmUserServices.insertPhone();
		crmUserServices.selectGender();
		crmUserServices.selectType();
		crmUserServices.insertPassword();
		// crmUserServices.generatedPassword();
		crmUserServices.clickOnSave();

		homeService.logoutOfCrm();

	}
}
