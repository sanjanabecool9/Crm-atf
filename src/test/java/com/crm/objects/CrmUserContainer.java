package com.crm.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CrmUserContainer {
	
	@FindBy (xpath="//a[@data-name='create']")
	public WebElement buttonCreateUser;
	
	@FindBy (xpath="//input[@data-name='userName']")
	public WebElement txtFieldUserName;
	
	@FindBy (xpath="//select[@data-name='salutationName']")
	public WebElement dropDownSalutation;
	
	@FindBy (xpath="//input[@data-name='firstName']")
	public WebElement txtFieldFirstName;
	
	@FindBy (xpath="//input[@data-name='lastName']")
	public WebElement txtFieldLastName;
	
	@FindBy (xpath="//input[@type='email' and @class='form-control email-address']")
	public WebElement txtFieldEmail;
	
	@FindBy (xpath="//select[@class='form-control' and @data-property-type='type']")
	public WebElement dropDownPhoneOption;
	
	@FindBy (xpath="//input[@class='form-control phone-number no-margin-shifting']")
	public WebElement txtFieldPhone;
	
	@FindBy (xpath="//select[@data-name='gender']")
	public WebElement dropDownGender;
	
	@FindBy (xpath="//select[@data-name='type']")
	public WebElement dropDownType;
	
	@FindBy (xpath="//input[@type='checkbox' and @data-name='isActive']")
	public WebElement checkBoxActiveorNot;
	
	@FindBy (xpath="//input[@type='password' and @data-name='password']")
	public WebElement txtFieldPassword;
	
	@FindBy (xpath="//input[@type='password' and @data-name='passwordConfirm']")
	public WebElement txtFieldConfirmPassword;
	
	@FindBy (xpath="//button[@data-action='generatePassword']")
	public WebElement buttonGeneratePassword;
	
	@FindBy (xpath="//div[@data-name='passwordPreview' and @class='field']")
	public WebElement txtFieldGeneratedPassword;
	
	@FindBy (xpath="//button[@data-action='save']")
	public WebElement buttonSaveUser;

	public WebElement getButtonCreateUser() {
		return buttonCreateUser;
	}

	public void setButtonCreateUser(WebElement buttonCreateUser) {
		this.buttonCreateUser = buttonCreateUser;
	}

	public WebElement getTxtFieldUserName() {
		return txtFieldUserName;
	}

	public void setTxtFieldUserName(WebElement txtFieldUserName) {
		this.txtFieldUserName = txtFieldUserName;
	}

	public WebElement getDropDownSalutation() {
		return dropDownSalutation;
	}

	public void setDropDownSalutation(WebElement dropDownSalutation) {
		this.dropDownSalutation = dropDownSalutation;
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

	public WebElement getTxtFieldEmail() {
		return txtFieldEmail;
	}

	public void setTxtFieldEmail(WebElement txtFieldEmail) {
		this.txtFieldEmail = txtFieldEmail;
	}

	public WebElement getDropDownPhoneOption() {
		return dropDownPhoneOption;
	}

	public void setDropDownPhoneOption(WebElement dropDownPhoneOption) {
		this.dropDownPhoneOption = dropDownPhoneOption;
	}

	public WebElement getTxtFieldPhone() {
		return txtFieldPhone;
	}

	public void setTxtFieldPhone(WebElement txtFieldPhone) {
		this.txtFieldPhone = txtFieldPhone;
	}

	public WebElement getDropDownGender() {
		return dropDownGender;
	}

	public void setDropDownGender(WebElement dropDownGender) {
		this.dropDownGender = dropDownGender;
	}

	public WebElement getDropDownType() {
		return dropDownType;
	}

	public void setDropDownType(WebElement dropDownType) {
		this.dropDownType = dropDownType;
	}

	public WebElement getCheckBoxActiveorNot() {
		return checkBoxActiveorNot;
	}

	public void setCheckBoxActiveorNot(WebElement checkBoxActiveorNot) {
		this.checkBoxActiveorNot = checkBoxActiveorNot;
	}

	public WebElement getTxtFieldPassword() {
		return txtFieldPassword;
	}

	public void setTxtFieldPassword(WebElement txtFieldPassword) {
		this.txtFieldPassword = txtFieldPassword;
	}

	public WebElement getTxtFieldConfirmPassword() {
		return txtFieldConfirmPassword;
	}

	public void setTxtFieldConfirmPassword(WebElement txtFieldConfirmPassword) {
		this.txtFieldConfirmPassword = txtFieldConfirmPassword;
	}

	public WebElement getButtonGeneratePassword() {
		return buttonGeneratePassword;
	}

	public void setButtonGeneratePassword(WebElement buttonGeneratePassword) {
		this.buttonGeneratePassword = buttonGeneratePassword;
	}

	public WebElement getTxtFieldGeneratedPassword() {
		return txtFieldGeneratedPassword;
	}

	public void setTxtFieldGeneratedPassword(WebElement txtFieldGeneratedPassword) {
		this.txtFieldGeneratedPassword = txtFieldGeneratedPassword;
	}

	public WebElement getButtonSaveUser() {
		return buttonSaveUser;
	}

	public void setButtonSaveUser(WebElement buttonSaveUser) {
		this.buttonSaveUser = buttonSaveUser;
	}
	
	
	
	
	
	
	
	
	
}
