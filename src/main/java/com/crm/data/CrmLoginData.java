package com.crm.data;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



    //Api for xml file
	@XmlRootElement(name = "CrmLoginData")  //root(parent) in xml file (name of the root element is CrmLoginData)
	@XmlAccessorType(XmlAccessType.FIELD)

	public class CrmLoginData {
		
		@XmlElement(name = "logindata")   //child (logindata) is the child in xml file
		private List<LoginData> crmlogindata = null; //this list is only for storing the data of xml

		
		//created getter and setter methods for the above
		public List<LoginData> getCrmlogindata() {
			return crmlogindata; //the data is coming into this list
		}

		public void setCrmlogindata(List<LoginData> crmlogindata) {
			this.crmlogindata = crmlogindata;
		}
		
		
		

	
}
