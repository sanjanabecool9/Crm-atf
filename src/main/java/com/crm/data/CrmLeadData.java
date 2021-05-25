package com.crm.data;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



    //Api for xml file
	@XmlRootElement(name = "CrmLeadData")  //root(parent) in xml file (name of the root element is CrmLoginData)
	@XmlAccessorType(XmlAccessType.FIELD)


public class CrmLeadData {
		@XmlElement(name = "Leaddata")   //child (logindata) is the child in xml file
		private List<LeadData> crmleaddata = null; //this list is only for storing the data of xml

		public List<LeadData> getCrmleaddata() {
			return crmleaddata;
		}

		public void setCrmleaddata(List<LeadData> crmleaddata) {
			this.crmleaddata = crmleaddata;

}
	}
