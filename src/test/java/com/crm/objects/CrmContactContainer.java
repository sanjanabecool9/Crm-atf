package com.crm.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CrmContactContainer {
	
	@FindBy  (xpath="/html/body/div[1]/div/div[1]/div/div[2]/div/a")
	//@FindBy  (xpath = "//a[@href='#Contact/create' and @data-name='create']")
	public WebElement buttonCreateContact;
	
	@FindBy  (xpath = "//select[@data-name='salutationName']")
	public WebElement dropDownSalutation;
	
	@FindBy (xpath = "//input[@data-name='firstName']")
	public WebElement txtFieldFirstName;
	
	@FindBy (xpath = "//input[@data-name='lastName']")
	public WebElement txtFieldLastName;
	
	@FindBy (xpath = "//input[@type='email']")
	public WebElement txtFieldEmail;
	
	@FindBy (xpath = "//button[@class='btn btn-primary action']")
	public WebElement buttonSaveContact;
    
	@FindBy (xpath= "//button[@data-action='edit']")
	public WebElement buttonEditContact;
	
	@FindBy (xpath = "/html/body/div[1]/div/div[2]/div/div[5]/div[1]/div[1]/div/div/div[1]/div[1]/div")
	public  WebElement createdContacttName;
	
	@FindBy (xpath="/html/body/div[1]/div/div[2]/div/div[5]/div[1]/div[1]/div/div/div[2]/div[1]/div/div/a")
	public  WebElement createdEmail;
	
	@FindBy (xpath="/html/body/div[1]/div/div[2]/div/div[5]/div[1]/div[1]/div/div/div[2]/div[1]/div/div/a")
	public WebElement editedEmail;
	
	@FindBy (xpath ="//button[@class='btn btn-default dropdown-toggle dropdown-item-list-button']")
	public WebElement optionsContact;
	
	@FindBy (xpath = "//a[@data-action='delete']")
	public WebElement optionRemoveContact;
	
	@FindBy (xpath = "//button[@class='btn btn-danger']")
	public WebElement optionConfirmRemove;

	@FindBy (xpath="//textarea[@data-name='description']")
	public WebElement txtFieldDescription;
	
	@FindBy (xpath="//i[@class='fas fa-angle-up']")
	public WebElement contextMenuAssignedUser;
	
	@FindBy (xpath="//a[@data-id='1']")
	public WebElement assignedUser1;
	
	@FindBy (xpath="//div[@data-name='assignedUser' and @class='field']")
	public WebElement createdAssignedUser;
	
	@FindBy (xpath="//input[@data-name='assignedUserName']")
	public WebElement txtFieldAssignedUser;
	
	
	
	public WebElement getTxtFieldAssignedUser() {
		return txtFieldAssignedUser;
	}

	public void setTxtFieldAssignedUser(WebElement txtFieldAssignedUser) {
		this.txtFieldAssignedUser = txtFieldAssignedUser;
	}

	public WebElement getContextMenuAssignedUser() {
		return contextMenuAssignedUser;
	}

	public void setContextMenuAssignedUser(WebElement contextMenuAssignedUser) {
		this.contextMenuAssignedUser = contextMenuAssignedUser;
	}

	public WebElement getAssignedUser1() {
		return assignedUser1;
	}

	public void setAssignedUser1(WebElement assignedUser1) {
		this.assignedUser1 = assignedUser1;
	}

	public WebElement getCreatedAssignedUser() {
		return createdAssignedUser;
	}

	public void setCreatedAssignedUser(WebElement createdAssignedUser) {
		this.createdAssignedUser = createdAssignedUser;
	}

	public WebElement getTxtFieldDescription() {
		return txtFieldDescription;
	}

	public void setTxtFieldDescription(WebElement txtFieldDescription) {
		this.txtFieldDescription = txtFieldDescription;
	}

	public WebElement getOptionsContact() {
		return optionsContact;
	}

	public void setOptionsContact(WebElement optionsContact) {
		this.optionsContact = optionsContact;
	}

	public WebElement getOptionRemoveContact() {
		return optionRemoveContact;
	}

	public void setOptionRemoveContact(WebElement optionRemoveContact) {
		this.optionRemoveContact = optionRemoveContact;
	}

	public WebElement getOptionConfirmRemove() {
		return optionConfirmRemove;
	}

	public void setOptionConfirmRemove(WebElement optionConfirmRemove) {
		this.optionConfirmRemove = optionConfirmRemove;
	}

	public WebElement getCreatedEmail() {
		return createdEmail;
	}

	public void setCreatedEmail(WebElement createdEmail) {
		this.createdEmail = createdEmail;
	}

	public WebElement getEditedEmail() {
		return editedEmail;
	}

	public void setEditedEmail(WebElement editedEmail) {
		this.editedEmail = editedEmail;
	}

	public WebElement getCreatedContacttName() {
		return createdContacttName;
	}

	public void setCreatedContacttName(WebElement createdContacttName) {
		this.createdContacttName = createdContacttName;
	}

	
	public WebElement getButtonEditContact() {
		return buttonEditContact;
	}

	public void setButtonEditContact(WebElement buttonEditContact) {
		this.buttonEditContact = buttonEditContact;
	}

	public WebElement getDropDownSalutation() {
		return dropDownSalutation;
	}

	public void setDropDownSalutation(WebElement dropDownSalutation) {
		this.dropDownSalutation = dropDownSalutation;
	}

	public WebElement getTxtFieldEmail() {
		return txtFieldEmail;
	}

	public void setTxtFieldEmail(WebElement txtFieldEmail) {
		this.txtFieldEmail = txtFieldEmail;
	}

	
	public WebElement getButtonSaveContact() {
		return buttonSaveContact;
	}

	public void setButtonSaveContact(WebElement buttonSaveContact) {
		this.buttonSaveContact = buttonSaveContact;
	}

	public WebElement getButtonCreateContact() {
		return buttonCreateContact;
	}

	public void setButtonCreateContact(WebElement buttonCreateContact) {
		this.buttonCreateContact = buttonCreateContact;
	}

	public WebElement getTxtFieldFirstName() {
		return txtFieldFirstName;
	}

	public void setTxtFieldFirstName(WebElement txtFieldFirstName) {
		this.txtFieldFirstName = txtFieldFirstName;
	}

	public WebElement getTxtFieldLastName() {
		return txtFieldLastName;
	}

	public void setTxtFieldLastName(WebElement txtFieldLastName) {
		this.txtFieldLastName = txtFieldLastName;
	}

	public WebElement getTxtFieldLastEmail() {
		return txtFieldEmail;
	}

	public void setTxtFieldLastEmail(WebElement txtFieldLastEmail) {
		this.txtFieldEmail = txtFieldLastEmail;
	}
	
	
	

}
