package com.crm.data;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class CrmLeadTestData {
	
public static CrmLeadData crmleaddata=null;
	
	public static CrmLeadData getTestData(){
		
		try{
			//these are Api's for reading xml data
			File file = new File("src//test//data/crm_Leadsdata.xml"); //all the data is stored into file and sent to CrmLoginData which will place the data in the form of lists
			JAXBContext jaxbcontext =JAXBContext.newInstance(CrmLeadData.class);
		    Unmarshaller unmarshaller = jaxbcontext.createUnmarshaller();
		    crmleaddata = (CrmLeadData)unmarshaller.unmarshal(file); //sending data to crmleaddata object (so crmleaddata..will have entire list of data)
		}
		catch(Exception e){
			e.printStackTrace();
	        System.out.println("check the xml file");
		}
	
	return crmleaddata;
}

	

}
