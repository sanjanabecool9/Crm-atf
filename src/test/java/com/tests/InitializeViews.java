package com.tests;

import org.openqa.selenium.WebDriver;

import com.crm.config.BrowserDriver;
import com.crm.services.CrmAccountServices;
import com.crm.services.CrmContactServices;
import com.crm.services.CrmEmailServices;
import com.crm.services.CrmLeadServices;
import com.crm.services.CrmUserServices;
import com.crm.services.HomeServices;
import com.crm.services.LoginService;

public class InitializeViews {
	protected static WebDriver driver=null;
	
	static void init(){
		driver=BrowserDriver.getCurrentDriver();
		LoginService.init();
		HomeServices.init();
		CrmAccountServices.init();
		CrmContactServices.init();
		CrmLeadServices.init();
		CrmUserServices.init();
		CrmEmailServices.init();
		
	}
	

}
