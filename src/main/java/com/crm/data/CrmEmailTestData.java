package com.crm.data;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class CrmEmailTestData {

	
public static CrmEmailData crmemaildata=null;
	
	public static CrmEmailData getTestData(){
		
		try{
			//these are Api's for reading xml data
			File file = new File("src//test//data/crm_Emaildata.xml"); //all the data is stored into file and sent to CrmLoginData which will place the data in the form of lists
			JAXBContext jaxbcontext =JAXBContext.newInstance(CrmEmailData.class);
		    Unmarshaller unmarshaller = jaxbcontext.createUnmarshaller();
		    crmemaildata = (CrmEmailData)unmarshaller.unmarshal(file); //sending data to crmleaddata object (so crmleaddata..will have entire list of data)
		}
		catch(Exception e){
			e.printStackTrace();
	        System.out.println("check the xml file");
		}
	
	return crmemaildata;
}
}
