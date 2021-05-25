package com.crm.data;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

//this class is for calling the xml file
public class CrmTestData {

	
	public static CrmLoginData crmlogindata=null;
	
	public static CrmLoginData getTestData(){
		
		try{
			//these are Api's for reading xml data
			File file = new File("src//test//data//crm_data.xml"); //all the data is stored into file and sent to CrmLoginData which will place the data in the form of lists
			JAXBContext jaxbcontext =JAXBContext.newInstance(CrmLoginData.class);
		    Unmarshaller unmarshaller = jaxbcontext.createUnmarshaller();
		    crmlogindata = (CrmLoginData)unmarshaller.unmarshal(file); //sending data to crmlogindata object (so crmlogindata..will have entire list of data)
		}
		catch(Exception e){
			e.printStackTrace();
	        System.out.println("check the xml file");
		}
	
	return crmlogindata;
}
}
	

