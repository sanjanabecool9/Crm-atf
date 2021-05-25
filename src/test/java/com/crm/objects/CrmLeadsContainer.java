package com.crm.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CrmLeadsContainer {
	
	@FindBy (xpath= "//a[@href='#Lead/create' and @data-name='create']")
	public WebElement buttonCreateLeads;
	
	@FindBy  (xpath = "//select[@data-name='salutationName']")
	public WebElement dropDownLeadSalutation;
	
	@FindBy (xpath = "//input[@data-name='firstName']")
	public WebElement txtFieldLeadFirstName;
	
	@FindBy (xpath = "//input[@data-name='lastName']")
	public WebElement txtFieldLeadLastName;
	
	@FindBy (xpath = "//input[@type='email']")
	public WebElement txtFieldLeadEmail;
	
	@FindBy (xpath = "//input[@data-name='accountName']")
	public WebElement txtFieldLeadAccount;
	
	@FindBy (xpath = "//select[@data-property-type='type']")
	public WebElement dropdownLeadPhonenumber;
	
	@FindBy (xpath = "//input[@class='form-control phone-number no-margin-shifting']")
	public WebElement txtFieldLeadPhoneNumber;
	
	@FindBy (xpath = "//input[@data-name='title']")
	public WebElement txtFieldLeadTitle;
	
	@FindBy (xpath = "//input[@data-name='website']")
	public WebElement txtFieldLeadWebsite;
	
	
	@FindBy (xpath = "//textarea[@data-name='addressStreet']")
	public WebElement txtFieldLeadStreet;
	
	@FindBy (xpath = "//input[@data-name='addressCity']")
	public WebElement txtFieldLeadCity;
	
	@FindBy (xpath = "//input[@data-name='addressState']")
	public WebElement txtFieldLeadState;
	
	@FindBy (xpath = "//input[@data-name='addressPostalCode']")
	public WebElement txtFieldLeadPostalcode;
	
	@FindBy (xpath = "//input[@data-name='addressCountry']")
	public WebElement txtFieldLeadCountry;
	
	@FindBy (xpath = "//button[@class='btn btn-primary action']")
	public WebElement buttonSaveLead;
	
	@FindBy (xpath="//div[@data-name='name' and @class='field']")
	public WebElement createdLeadName;
	
	@FindBy (xpath="//div[@data-name='emailAddress' and @class='field']")
	//@FindBy (xpath="/html/body/div[1]/div/div[2]/div/div[5]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div/div/a")
     public WebElement createdLeadEmail;
	
	@FindBy (xpath="//textarea[@data-name='description']")
	public WebElement txtFieldLeadDescription;
	
	@FindBy (xpath="//div[@data-name='description' and @class='field']")
	public WebElement createdLeadDescription;
	

	@FindBy (xpath="//input[@class='record-checkbox']")
	public WebElement createdLeadCheckBox;
	
	@FindBy (xpath="/html/body/div[1]/div/div[3]/div[1]/div[2]/div/button")
	public WebElement buttonLeadActions;
	
	
	
	@FindBy (xpath="//button[@class='btn btn-default dropdown-toggle dropdown-item-list-button']")
	public WebElement createdLeadContextMenu;
	
	@FindBy (xpath="//a[@data-action='delete']")
	public WebElement optionRemove;
	
	
	@FindBy (xpath="//button[@class='btn btn-danger']")
	public WebElement buttonConfirmRemove;
	
	@FindBy (xpath="//a[@data-action='duplicate']")
	public WebElement optionDuplicate;
	
	@FindBy (xpath = "//button[@data-name='save']")
	public WebElement buttonCreateDuplicateLeadConfirmation;
	
	@FindBy (xpath = "//button[@class='btn btn-primary action' and @data-action='save']")
	public WebElement buttonSaveDupicateLead;
	
	@FindBy (xpath="//div[@class='text-muted total-count']")
	public WebElement totalLeadCount;
	
		
	

	public WebElement getTotalLeadCount() {
		return totalLeadCount;
	}

	public void setTotalLeadCount(WebElement totalLeadCount) {
		this.totalLeadCount = totalLeadCount;
	}

	public WebElement getButtonSaveDupicateLead() {
		return buttonSaveDupicateLead;
	}

	public void setButtonSaveDupicateLead(WebElement buttonSaveDupicateLead) {
		this.buttonSaveDupicateLead = buttonSaveDupicateLead;
	}

	public WebElement getOptionDuplicate() {
		return optionDuplicate;
	}

	public void setOptionDuplicate(WebElement optionDuplicate) {
		this.optionDuplicate = optionDuplicate;
	}

	public WebElement getButtonCreateDuplicateLeadConfirmation() {
		return buttonCreateDuplicateLeadConfirmation;
	}

	public void setButtonCreateDuplicateLeadConfirmation(WebElement buttonCreateDuplicateLeadConfirmation) {
		this.buttonCreateDuplicateLeadConfirmation = buttonCreateDuplicateLeadConfirmation;
	}

	public WebElement getCreatedLeadContextMenu() {
		return createdLeadContextMenu;
	}

	public void setCreatedLeadContextMenu(WebElement createdLeadContextMenu) {
		this.createdLeadContextMenu = createdLeadContextMenu;
	}

	public WebElement getCreatedLeadCheckBox() {
		return createdLeadCheckBox;
	}

	public void setCreatedLeadCheckBox(WebElement createdLeadCheckBox) {
		this.createdLeadCheckBox = createdLeadCheckBox;
	}

	public WebElement getButtonLeadActions() {
		return buttonLeadActions;
	}

	public void setButtonLeadActions(WebElement buttonLeadActions) {
		this.buttonLeadActions = buttonLeadActions;
	}

	public WebElement getOptionRemove() {
		return optionRemove;
	}

	public void setOptionRemove(WebElement optionRemove) {
		this.optionRemove = optionRemove;
	}

	public WebElement getButtonConfirmRemove() {
		return buttonConfirmRemove;
	}

	public void setButtonConfirmRemove(WebElement buttonConfirmRemove) {
		this.buttonConfirmRemove = buttonConfirmRemove;
	}

	public WebElement getCreatedLeadDescription() {
		return createdLeadDescription;
	}

	public void setCreatedLeadDescription(WebElement createdLeadDescription) {
		this.createdLeadDescription = createdLeadDescription;
	}

	public WebElement getTxtFieldLeadDescription() {
		return txtFieldLeadDescription;
	}

	public void setTxtFieldLeadDescription(WebElement txtFieldLeadDescription) {
		this.txtFieldLeadDescription = txtFieldLeadDescription;
	}

	public WebElement getCreatedLeadName() {
		return createdLeadName;
	}

	public void setCreatedLeadName(WebElement createdLeadName) {
		this.createdLeadName = createdLeadName;
	}

	public WebElement getCreatedLeadEmail() {
		return createdLeadEmail;
	}

	public void setCreatedLeadEmail(WebElement createdLeadEmail) {
		this.createdLeadEmail = createdLeadEmail;
	}

	public WebElement getButtonSaveLead() {
		return buttonSaveLead;
	}

	public void setButtonSaveLead(WebElement buttonSaveLead) {
		this.buttonSaveLead = buttonSaveLead;
	}

	public WebElement getButtonCreateLeads() {
		return buttonCreateLeads;
	}

	public void setButtonCreateLeads(WebElement buttonCreateLeads) {
		this.buttonCreateLeads = buttonCreateLeads;
	}

	public WebElement getDropDownLeadSalutation() {
		return dropDownLeadSalutation;
	}

	public void setDropDownLeadSalutation(WebElement dropDownLeadSalutation) {
		this.dropDownLeadSalutation = dropDownLeadSalutation;
	}

	public WebElement getTxtFieldLeadFirstName() {
		return txtFieldLeadFirstName;
	}

	public void setTxtFieldLeadFirstName(WebElement txtFieldLeadFirstName) {
		this.txtFieldLeadFirstName = txtFieldLeadFirstName;
	}

	public WebElement getTxtFieldLeadLastName() {
		return txtFieldLeadLastName;
	}

	public void setTxtFieldLeadLastName(WebElement txtFieldLeadLastName) {
		this.txtFieldLeadLastName = txtFieldLeadLastName;
	}

	public WebElement getTxtFieldLeadEmail() {
		return txtFieldLeadEmail;
	}

	public void setTxtFieldLeadEmail(WebElement txtFieldLeadEmail) {
		this.txtFieldLeadEmail = txtFieldLeadEmail;
	}

	public WebElement getTxtFieldLeadAccount() {
		return txtFieldLeadAccount;
	}

	public void setTxtFieldLeadAccount(WebElement txtFieldLeadAccount) {
		this.txtFieldLeadAccount = txtFieldLeadAccount;
	}

	public WebElement getDropdownLeadPhonenumber() {
		return dropdownLeadPhonenumber;
	}

	public void setDropdownLeadPhonenumber(WebElement dropdownLeadPhonenumber) {
		this.dropdownLeadPhonenumber = dropdownLeadPhonenumber;
	}

	public WebElement getTxtFieldLeadPhoneNumber() {
		return txtFieldLeadPhoneNumber;
	}

	public void setTxtFieldLeadPhoneNumber(WebElement txtFieldLeadPhoneNumber) {
		this.txtFieldLeadPhoneNumber = txtFieldLeadPhoneNumber;
	}

	public WebElement getTxtFieldLeadTitle() {
		return txtFieldLeadTitle;
	}

	public void setTxtFieldLeadTitle(WebElement txtFieldLeadTitle) {
		this.txtFieldLeadTitle = txtFieldLeadTitle;
	}

	public WebElement getTxtFieldLeadWebsite() {
		return txtFieldLeadWebsite;
	}

	public void setTxtFieldLeadWebsite(WebElement txtFieldLeadWebsite) {
		this.txtFieldLeadWebsite = txtFieldLeadWebsite;
	}

	public WebElement getTxtFieldLeadStreet() {
		return txtFieldLeadStreet;
	}

	public void setTxtFieldLeadStreet(WebElement txtFieldLeadStreet) {
		this.txtFieldLeadStreet = txtFieldLeadStreet;
	}

	public WebElement getTxtFieldLeadCity() {
		return txtFieldLeadCity;
	}

	public void setTxtFieldLeadCity(WebElement txtFieldLeadCity) {
		this.txtFieldLeadCity = txtFieldLeadCity;
	}

	public WebElement getTxtFieldLeadState() {
		return txtFieldLeadState;
	}

	public void setTxtFieldLeadState(WebElement txtFieldLeadState) {
		this.txtFieldLeadState = txtFieldLeadState;
	}

	public WebElement getTxtFieldLeadPostalcode() {
		return txtFieldLeadPostalcode;
	}

	public void setTxtFieldLeadPostalcode(WebElement txtFieldLeadPostalcode) {
		this.txtFieldLeadPostalcode = txtFieldLeadPostalcode;
	}

	public WebElement getTxtFieldLeadCountry() {
		return txtFieldLeadCountry;
	}

	public void setTxtFieldLeadCountry(WebElement txtFieldLeadCountry) {
		this.txtFieldLeadCountry = txtFieldLeadCountry;
	}
	
	
	
	
}
