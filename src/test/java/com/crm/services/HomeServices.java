package com.crm.services;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.crm.config.BrowserDriver;
import com.crm.objects.HomePageContainer;

public class HomeServices {

public static HomePageContainer homePageContainer;

private static Logger log= Logger.getLogger(HomeServices.class.getName());


public HomeServices navigateToAccounts(){
	homePageContainer.getButtonAccounts().click();
	log.info("User is navaigated to accounts page");
	return this;
	
}
public HomeServices navigateToContacts(){
	homePageContainer.getButtonContacts().click();
	return this;
	
}
public HomeServices navigateToLeads(){
	homePageContainer.getButtonLeads().click();
	return this;
}

public HomeServices navigateToUsers(){
	homePageContainer.getNavigateToMoreOptionOnHomepage().click();
	homePageContainer.getNavigateToUsers().click();
	return this;
}

public HomeServices navigateToEmail(){
	homePageContainer.getOptionnavigateToEmail().click();
	log.info("User navigated to emails");
	return this;
}

public HomeServices logoutOfCrm(){
	homePageContainer.getButtonLogoutMenu().click();
	homePageContainer.getButtonLogout().click();
	log.info("User is logged out after creating and removing the account");
	return this;
}

public static void init(){
	
	homePageContainer=PageFactory.initElements(BrowserDriver.getCurrentDriver(), HomePageContainer.class);
}

}
