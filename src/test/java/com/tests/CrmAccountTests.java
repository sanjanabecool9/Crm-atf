package com.tests;

import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.crm.config.BrowserDriver;
import com.crm.config.PropertyLoader;
import com.crm.data.CrmLoginData;
import com.crm.data.CrmTestData;
import com.crm.data.LoginData;
import com.crm.services.CrmAccountServices;
import com.crm.services.HomeServices;
import com.crm.services.LoginService;
import com.crm.validators.CrmAccountValidator;

public class CrmAccountTests {

	LoginService loginService = null;
	HomeServices homeService = null;
	CrmAccountServices crmAccountServices = null;
	CrmAccountValidator crmAccountValidator = null;

	CrmLoginData crmLoginData = null; // calling the object of "data" to use it
										// in the testcase
	List<LoginData> appData = null; // this is for this list;

	@BeforeClass
	public void init() {

		loginService = new LoginService();
		homeService = new HomeServices();
		crmAccountServices = new CrmAccountServices();
		crmAccountValidator = new CrmAccountValidator();

		crmLoginData = CrmTestData.getTestData();
		appData = crmLoginData.getCrmlogindata();
		InitializeViews.init();
		BrowserDriver.getCurrentDriver().get(PropertyLoader.getQaUrl());

	}

	@Test
	public void createAccountWithBillingAddress() {
		loginService.loginToApplication(appData.get(0).getUsername(), appData.get(0).getPassword());
		homeService.navigateToAccounts();
		// createAccountServices.navigateToCreateAccount();
		// createAccountServices.insertNameAndEmail();
		// createAccountServices.insertBillingAddress();
		
		//create account testcase
		crmAccountServices.navigateToCreateAccount().insertNameAndEmail(appData.get(0).getName(), appData.get(0).getEmail()).insertBillingAddress(appData.get(0).getStreet(), appData.get(0).getCity(), appData.get(0).getState());
		crmAccountServices.insertShippingAddressSameAsBillingAddress();
		crmAccountServices.selectPhoneOption(appData.get(0).getOption()).insertPhoneNumber(appData.get(0).getPhone());
		//crmAccountServices.insertPhoneNumber(appData.get(0).getPhone());
		crmAccountServices.selectAssignedUser();

		crmAccountServices.clickOnSaveButton().getBillingAddress();
		
		crmAccountValidator.validateAccountEmail(crmAccountServices);
		crmAccountValidator.validateBillingAndShippingAddressIsSameOrNot(crmAccountServices);
		crmAccountValidator.validateAssignedUser(crmAccountServices);

		homeService.navigateToAccounts();
		crmAccountServices.getAccountName();

		crmAccountValidator.validateAccountUserName(crmAccountServices);
//removing created account testcase
		crmAccountServices.clickOnCreatedAccountCheckBox();
		
		crmAccountServices.clickOnActionsButton().selectRemoveOption().clickOnRemoveButton();
		homeService.logoutOfCrm();

	}
}
