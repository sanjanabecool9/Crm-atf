package com.crm.validators;

import java.util.List;

import org.testng.Assert;

import com.crm.data.CrmEmailData;
import com.crm.data.CrmEmailTestData;
import com.crm.data.EmailData;
import com.crm.services.CrmEmailServices;

public class CrmEmailValidator {
	
	CrmEmailData crmEmailData = CrmEmailTestData.getTestData();
    List<EmailData> appData = crmEmailData.getCrmemaildata();
    
    public void validateAttachmentOfEmail(CrmEmailServices crmemailservices){
    	String attachmentName=appData.get(0).getAttachment();
    	String attachmentName_Webpage=crmemailservices.getTextOfCreatedAttachment();
    	//String attachmentName="Flowchart for an hospital appointment.jpg";
    	Assert.assertEquals(attachmentName_Webpage, attachmentName);
    	
    	
    	
    }
    
    
   

}
