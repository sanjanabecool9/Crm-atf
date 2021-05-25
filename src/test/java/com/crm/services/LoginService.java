package com.crm.services;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.crm.config.BrowserDriver;
import com.crm.objects.LoginPageContainer;

public class LoginService {
	public static LoginPageContainer loginPageContainer;
	
	private static Logger log= Logger.getLogger(CrmAccountServices.class.getName());

	
	public LoginService loginToApplication(String uname,String pword){
		
	
		loginPageContainer.getTxtFieldUserName().sendKeys(uname);
		loginPageContainer.getTxtFieldPassword().sendKeys(pword);
		loginPageContainer.getButFieldLogin().click();
		log.info("User is logged into Crm website");
		return this;
	}
	
   public static void init(){
	   loginPageContainer = PageFactory.initElements(BrowserDriver.getCurrentDriver(),LoginPageContainer.class);
   }
}
