package com.crm.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageContainer {
	
	@FindBy(xpath = "//span[@title='Accounts']")
	public WebElement buttonAccounts;
	
	@FindBy(xpath ="//span[@class='fas fa-id-badge']")
	public WebElement buttonContacts;
	
	@FindBy(xpath="//span[@class='fas fa-address-card']")
	public WebElement buttonLeads;
	
	
	@FindBy(xpath= "//span[normalize-space()='Opportunities']")
	public WebElement buttonOpportunities;
	
	@FindBy (xpath ="//span[@class='fas fa-ellipsis-v']")
	public WebElement buttonLogoutMenu;
	
	@FindBy (xpath ="//a[@class='nav-link action' and @data-action='logout']")
	public WebElement buttonLogout;
	
	@FindBy (xpath="//a[@href='#Admin']")
	public WebElement optionToNavigateToAdministration;
	
	@FindBy (xpath="//span[@class='fas fa-ellipsis-h more-icon']")
	public WebElement navigateToMoreOptionOnHomepage;
	
	@FindBy (xpath="//li[@data-name='User']")
	public WebElement navigateToUsers;
	
	
	@FindBy (xpath="//span[@class='fas fa-envelope']")
	public WebElement OptionnavigateToEmail;
	
	

	public WebElement getOptionnavigateToEmail() {
		return OptionnavigateToEmail;
	}

	public void setOptionnavigateToEmail(WebElement optionnavigateToEmail) {
		OptionnavigateToEmail = optionnavigateToEmail;
	}

	public WebElement getOptionToNavigateToAdministration() {
		return optionToNavigateToAdministration;
	}

	public void setOptionToNavigateToAdministration(WebElement optionToNavigateToAdministration) {
		this.optionToNavigateToAdministration = optionToNavigateToAdministration;
	}

	public WebElement getNavigateToMoreOptionOnHomepage() {
		return navigateToMoreOptionOnHomepage;
	}

	public void setNavigateToMoreOptionOnHomepage(WebElement navigateToMoreOptionOnHomepage) {
		this.navigateToMoreOptionOnHomepage = navigateToMoreOptionOnHomepage;
	}

	public WebElement getNavigateToUsers() {
		return navigateToUsers;
	}

	public void setNavigateToUsers(WebElement navigateToUsers) {
		this.navigateToUsers = navigateToUsers;
	}

	

	public WebElement getButtonLogoutMenu() {
		return buttonLogoutMenu;
	}

	public void setButtonLogoutMenu(WebElement buttonLogoutMenu) {
		this.buttonLogoutMenu = buttonLogoutMenu;
	}

	public WebElement getButtonLogout() {
		return buttonLogout;
	}

	public void setButtonLogout(WebElement buttonLogout) {
		this.buttonLogout = buttonLogout;
	}

	public WebElement getButtonAccounts() {
		return buttonAccounts;
	}

	public void setButtonAccounts(WebElement buttonAccounts) {
		this.buttonAccounts = buttonAccounts;
	}

	public WebElement getButtonContacts() {
		return buttonContacts;
	}

	public void setButtonContacts(WebElement buttonContacts) {
		this.buttonContacts = buttonContacts;
	}

	public WebElement getButtonLeads() {
		return buttonLeads;
	}

	public void setButtonLeads(WebElement buttonLeads) {
		this.buttonLeads = buttonLeads;
	}

	public WebElement getButtonOpportunities() {
		return buttonOpportunities;
	}

	public void setButtonOpportunities(WebElement buttonOpportunities) {
		this.buttonOpportunities = buttonOpportunities;
	}

}
