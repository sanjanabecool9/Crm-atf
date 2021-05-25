package com.crm.data;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



    //Api for xml file
	@XmlRootElement(name = "CrmEmailData")  //root(parent) in xml file (name of the root element is CrmLoginData)
	@XmlAccessorType(XmlAccessType.FIELD)


public class CrmEmailData {
		@XmlElement(name = "emaildata")   //child (logindata) is the child in xml file
		private List<EmailData> crmemaildata = null; //this list is only for storing the data of xml

		public List<EmailData> getCrmemaildata() {
			return crmemaildata;
		}

		public void setCrmemaildata(List<EmailData> crmemaildata) {
			this.crmemaildata = crmemaildata;

}

}
