package com.crm.validators;

import java.util.List;

import org.testng.Assert;

import com.crm.data.CrmLoginData;
import com.crm.data.CrmTestData;
import com.crm.data.LoginData;
import com.crm.objects.CrmAccountContainer;
import com.crm.services.CrmAccountServices;

public class CrmAccountValidator {
	CrmLoginData crmLoginData = CrmTestData.getTestData();
	List<LoginData> appData = crmLoginData.getCrmlogindata();
	public static CrmAccountContainer crmAccountContainer;

	public void validateAccountEmail(CrmAccountServices createaccountservice) {
		String email = appData.get(0).getEmail();
		String email_webpage = createaccountservice.getAccountEmail();
		Assert.assertEquals(email_webpage, email);
	}

	public void ValidateAccountPhoneNumberFormat(CrmAccountServices createaccountservice) {
		String actualPhoneNumber = createaccountservice.createdPhoneNumber();

		if (actualPhoneNumber.matches("[0-9]+") && actualPhoneNumber.length() == 10) {

			Assert.assertTrue(true, "Phone number is valid");
			} 
		else {
			Assert.assertTrue(false, "entered an invalid phone number");
		}

	}

	public void validateAccountUserName(CrmAccountServices createaccountservice) {
		String userName = appData.get(0).getName();
		String userName_webpage = createaccountservice.getAccountName();
		Assert.assertEquals(userName_webpage, userName);
	}

	public void validateBillingAndShippingAddressIsSameOrNot(CrmAccountServices createaccountservice) {
		String billingaddress_webpage = createaccountservice.getBillingAddress();
		String shippingaddress_webpage = createaccountservice.getShippingAddress();

		Assert.assertEquals(shippingaddress_webpage, billingaddress_webpage);

	}

	public void validateAssignedUser(CrmAccountServices createaccountservice) {
		String assignedUser = "Admin";
		String assignedUser_webpage = createaccountservice.getCretedAssignedUser();
		Assert.assertEquals(assignedUser_webpage, assignedUser);

	}
}
