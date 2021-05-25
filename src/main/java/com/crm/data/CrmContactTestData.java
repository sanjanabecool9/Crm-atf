package com.crm.data;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

//this class is for calling the xml file
public class CrmContactTestData {

	
	public static CrmContactData crmcontactdata=null;
	
	public static CrmContactData getTestData(){
		
		try{
			//these are Api's for reading xml data
			File file = new File("src//test//data/crm_Contactdata.xml"); //all the data is stored into file and sent to CrmLoginData which will place the data in the form of lists
			JAXBContext jaxbcontext =JAXBContext.newInstance(CrmContactData.class);
		    Unmarshaller unmarshaller = jaxbcontext.createUnmarshaller();
		    crmcontactdata = (CrmContactData)unmarshaller.unmarshal(file); //sending data to crmlogindata object (so crmlogindata..will have entire list of data)
		}
		catch(Exception e){
			e.printStackTrace();
	        System.out.println("check the xml file");
		}
	
	return crmcontactdata;
}

	
}
	

