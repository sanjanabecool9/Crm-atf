package com.crm.validators;

import java.util.List;

import org.testng.Assert;

import com.crm.data.CrmLeadData;
import com.crm.data.CrmLeadTestData;
import com.crm.data.LeadData;
import com.crm.services.CrmLeadServices;

public class CrmLeadValidator {
	CrmLeadData crmLeadData = CrmLeadTestData.getTestData();
    List<LeadData> appsData = crmLeadData.getCrmleaddata();
	
    
    public void vaildateLeadName(CrmLeadServices crmleadservices){

		String leadSalutation=appsData.get(0).getSalutation();
		String leadFirstName=appsData.get(0).getFirstname();
		String leadLastName=appsData.get(0).getLastname();
		String createdLeadName=leadSalutation+leadFirstName+leadLastName;
		String leadName_webpage =crmleadservices.getCreatedLeadName();
		Assert.assertEquals(leadName_webpage,createdLeadName);
    }
    public void validateLeadEmail(CrmLeadServices crmleadservices){
		String createdLeadEmail=appsData.get(0).getEmail();
		String createdEmail_webpage = crmleadservices.getCreatedLeadEmail();
		Assert.assertEquals(createdEmail_webpage,createdLeadEmail);

	}
    
    public void validateLeadDescription(CrmLeadServices crmleadservices){
    	String createdLeadDescription=crmleadservices.getCreatedLeadEmail();
    	String createdLeadDescription_webpage=crmleadservices.getCreatedLeadDEscription();
    	Assert.assertEquals(createdLeadDescription_webpage, createdLeadDescription);
    }
    
    public void validateLeadRemoval(CrmLeadServices crmleadservices){
    	String ExpectedCount="Total: 1";
    	String ActualCount_webpage=crmleadservices.getTotalCountOfLeads();
    	Assert.assertEquals(ActualCount_webpage, ExpectedCount);
    }
    
    
	

}
