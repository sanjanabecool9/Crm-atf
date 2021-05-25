package com.crm.data;


	import java.util.List;

	import javax.xml.bind.annotation.XmlAccessType;
	import javax.xml.bind.annotation.XmlAccessorType;
	import javax.xml.bind.annotation.XmlElement;
	import javax.xml.bind.annotation.XmlRootElement;

	

	    //Api for xml file
		@XmlRootElement(name = "CrmContactData")  //root(parent) in xml file (name of the root element is CrmLoginData)
		@XmlAccessorType(XmlAccessType.FIELD)

		public class CrmContactData {
			
			@XmlElement(name = "contactdata")   //child (logindata) is the child in xml file
			private List<ContactData> crmcontactdata = null; //this list is only for storing the data of xml

			public List<ContactData> getCrmcontactdata() {
				return crmcontactdata;
			}

			public void setCrmcontactdata(List<ContactData> crmcontactdata) {
				this.crmcontactdata = crmcontactdata;
			}

			
			

}