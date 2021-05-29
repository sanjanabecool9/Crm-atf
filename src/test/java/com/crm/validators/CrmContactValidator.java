package com.crm.validators;

import java.util.List;

import org.testng.Assert;

import com.crm.data.ContactData;
import com.crm.data.CrmContactData;
import com.crm.data.CrmContactTestData;
import com.crm.services.CrmContactServices;


public class CrmContactValidator {
	
	
	CrmContactData crmContactData = CrmContactTestData.getTestData();
	List<ContactData> appsData = crmContactData.getCrmcontactdata();

	public void validateContactName(CrmContactServices createcontactservice)
	{
		String contactSalutation=appsData.get(0).getSalutation();
		String contactFirstName=appsData.get(0).getFirstname();
		String contactLastName=appsData.get(0).getLastname();
		String contactName=contactSalutation+contactFirstName+contactLastName;
		String contactName_webpage = createcontactservice.getContactName();
		Assert.assertEquals(contactName_webpage, contactName);
}
	
	public void validateCreatedEmail(CrmContactServices createcontactservice){
		String createdEmail=appsData.get(0).getEmail();
		String createdEmail_webpage = createcontactservice.getCreatedEmail();
		Assert.assertEquals(createdEmail_webpage, createdEmail);

	}
	
	public void validateEditedEmail(CrmContactServices createcontactservice){
		String editedEmail=appsData.get(0).getEditemail();
		String editedEmail_webpage = createcontactservice.getEditedEmail();
		Assert.assertEquals(editedEmail_webpage, editedEmail);
}
	
	public void validateCreatedAssignedUser(CrmContactServices createcontactservice){
		String createdAssignedUser="Admin";
		String createdAssignedUser_webpage=createcontactservice.createdAssignedUser();
		Assert.assertEquals(createdAssignedUser_webpage, createdAssignedUser);
	}
}

