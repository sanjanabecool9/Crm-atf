package com.crm.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class CrmAccountContainer {
	
	@FindBy(xpath ="//a[@data-name='create']")
	public  WebElement buttonCreateAccount;
	

	@FindBy(xpath = "//input[@data-name='name']")
	public  WebElement txtFieldName;
	
	@FindBy(xpath = "//input[@type='email']")
	public WebElement txtFieldEmail;
	
	@FindBy(xpath = "//textarea[@data-name='billingAddressStreet']")
	public  WebElement txtFielStreet;
	
	@FindBy(xpath = "//input[@data-name='billingAddressCity']")
	public WebElement txtFieldCity;
	
	@FindBy (xpath = "//input[@data-name='billingAddressState']")
	public  WebElement txtFieldState;
	
	@FindBy (xpath ="//button[@class='btn btn-default btn-sm']")
	public WebElement buttonCopyBillingAddress;
	
	@FindBy (xpath = "//div[@class='field' and @data-name='shippingAddress']")
	public WebElement createdShippingAddress;
	
	@FindBy (xpath = "//select[@data-property-type='type']")
	public WebElement dropdownPhonenumber;
	
	@FindBy (xpath = "//input[@class='form-control phone-number no-margin-shifting']")
	public WebElement txtFieldPhoneNumber;
	
	@FindBy (xpath = "//button[normalize-space()='Save']")
	public  WebElement buttonSave;
    
	//@FindBy (xpath="//div[@data-name='name' and @class='field']")
	//@FindBy (xpath = "td[data-name='name']/a")
	@FindBy (xpath = "//*[@id='main']/div[3]/div[2]/table/tbody/tr[1]/td[2]")
	public  WebElement createdAccountName;
	                         
	@FindBy (xpath= "//a[@data-action='mailTo']")
	public  WebElement createdAccountEmail;
	
	@FindBy (xpath = "//div[@class='field' and @data-name='billingAddress']")
	public  WebElement createdBillingAddress;
	
	
	@FindBy (xpath = "//*[@id='main']/div[3]/div[2]/table/tbody/tr[1]/td[1]")
	public WebElement createdAccountCheckBox;
	
	@FindBy (xpath="//*[@id='main']/div[3]/div[1]/div[1]/button")
	public WebElement buttonActionsOfAccounts;
	
	@FindBy (xpath="//*[@id='main']/div[3]/div[1]/div[1]/ul/li[1]/a")
	public WebElement optionRemove;
	
	@FindBy (xpath="//button[@class='btn btn-danger' and @data-name='confirm']")
	public WebElement buttonConfirmRemove;
	
	@FindBy (xpath="//a[@id='nav-menu-dropdown']")
	public WebElement contextMenu;
	
	@FindBy (xpath="//textarea[@data-name='shippingAddressStreet']")
	public WebElement txtFldShippingStreet;
	
	@FindBy (xpath="//i[@class='fas fa-angle-up']")
	public WebElement contextMenuAssignedUser;
	
	@FindBy (xpath="//a[@class='link' and @data-id='1']")
	public WebElement userAdmin;
	

	@FindBy (xpath="//div[@class='field' and @data-name='assignedUser']")
	public WebElement createdAssignedUser;
	
	@FindBy (xpath="//a[@data-action='dial']")
	public WebElement createdPhoneNumer;
	
	public WebElement getCreatedPhoneNumer() {
		return createdPhoneNumer;
	}

	public void setCreatedPhoneNumer(WebElement createdPhoneNumer) {
		this.createdPhoneNumer = createdPhoneNumer;
	}

	public WebElement getCreatedAssignedUser() {
		return createdAssignedUser;
	}

	public void setCreatedAssignedUser(WebElement createdAssignedUser) {
		this.createdAssignedUser = createdAssignedUser;
	}

	public WebElement getContextMenuAssignedUser() {
		return contextMenuAssignedUser;
	}

	public void setContextMenuAssignedUser(WebElement contextMenuAssignedUser) {
		this.contextMenuAssignedUser = contextMenuAssignedUser;
	}

	public WebElement getUserAdmin() {
		return userAdmin;
	}

	public void setUserAdmin(WebElement userAdmin) {
		this.userAdmin = userAdmin;
	}

	public WebElement getTxtFldShippingStreet() {
		return txtFldShippingStreet;
	}

	public void setTxtFldShippingStreet(WebElement txtFldShippingStreet) {
		this.txtFldShippingStreet = txtFldShippingStreet;
	}

	public WebElement getContextMenu() {
		return contextMenu;
	}

	public void setContextMenu(WebElement contextMenu) {
		this.contextMenu = contextMenu;
	}

	public WebElement getTxtFieldPhoneNumber() {
		return txtFieldPhoneNumber;
	}

	public void setTxtFieldPhoneNumber(WebElement txtFieldPhoneNumber) {
		this.txtFieldPhoneNumber = txtFieldPhoneNumber;
	}

	public WebElement getDropdownPhonenumber() {
		return dropdownPhonenumber;
	}

	public void setDropdownPhonenumber(WebElement dropdownPhonenumber) {
		this.dropdownPhonenumber = dropdownPhonenumber;
	}

	public WebElement getCreatedShippingAddress() {
		return createdShippingAddress;
	}

	public void setCreatedShippingAddress(WebElement createdShippingAddress) {
		this.createdShippingAddress = createdShippingAddress;
	}

	public WebElement getButtonCopyBillingAddress() {
		return buttonCopyBillingAddress;
	}

	public void setButtonCopyBillingAddress(WebElement buttonCopyBillingAddress) {
		this.buttonCopyBillingAddress = buttonCopyBillingAddress;
	}

	
	
	public WebElement getButtonConfirmRemove() {
		return buttonConfirmRemove;
	}

	public void setButtonConfirmRemove(WebElement buttonConfirmRemove) {
		this.buttonConfirmRemove = buttonConfirmRemove;
	}

	public WebElement getButtonActionsOfAccounts() {
		return buttonActionsOfAccounts;
	}

	public void setButtonActionsOfAccounts(WebElement buttonActionsOfAccounts) {
		this.buttonActionsOfAccounts = buttonActionsOfAccounts;
	}

	public WebElement getOptionRemove() {
		return optionRemove;
	}

	public void setOptionRemove(WebElement optionRemove) {
		this.optionRemove = optionRemove;
	}

	public WebElement getCreatedAccountCheckBox() {
		return createdAccountCheckBox;
	}

	public void setCreatedAccountCheckBox(WebElement createdAccountCheckBox) {
		this.createdAccountCheckBox = createdAccountCheckBox;
	}

	public WebElement getCreatedBillingAddress() {
		return createdBillingAddress;
	}

	public void setCreatedBillingAddress(WebElement createdBillingAddress) {
		this.createdBillingAddress = createdBillingAddress;
	}

	public WebElement getCreatedAccountEmail() {
		return createdAccountEmail;
	}

	public void setCreatedAccountEmail(WebElement createdAccountEmail) {
		this.createdAccountEmail = createdAccountEmail;
	}

	public void setCreatedAccountName(WebElement createdAccountName) {
		this.createdAccountName = createdAccountName;
	}

	public WebElement getTxtFieldState() {
		return txtFieldState;
	}

	public void setTxtFieldState(WebElement txtFieldState) {
		this.txtFieldState = txtFieldState;
	}

	public WebElement getButtonSave() {
		return buttonSave;
	}

	public void setButtonSave(WebElement buttonSave) {
		this.buttonSave = buttonSave;
	}

	
	
	public WebElement getCreatedAccountName() {
		return createdAccountName;
	}

	public void setCreatedAccountname(WebElement createdAccountname) {
		this.createdAccountName = createdAccountname;
	}

	public WebElement getButtonCreateAccount() {
		return buttonCreateAccount;
	}

	public void setButtonCreateAccount(WebElement buttonCreateAccount) {
		this.buttonCreateAccount = buttonCreateAccount;
	}

	public WebElement getTxtFieldName() {
		return txtFieldName;
	}

	public void setTxtFieldName(WebElement txtFieldName) {
		this.txtFieldName = txtFieldName;
	}

	public  WebElement getTxtFieldEmail() {
		return txtFieldEmail;
	}

	public void setTxtFieldEmail(WebElement txtFieldEmail) {
		this.txtFieldEmail = txtFieldEmail;
	}

	public  WebElement getTxtFielStreet() {
		return txtFielStreet;
	}

	public  void setTxtFielStreet(WebElement txtFielStreet) {
		this.txtFielStreet = txtFielStreet;
	}

	public  WebElement getTxtFieldCity() {
		return txtFieldCity;
	}

	public void setTxtFieldCity(WebElement txtFieldCity) {
		this.txtFieldCity = txtFieldCity;
	}

}
