package com.crm.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CrmEmailContainer {
	
	@FindBy (xpath="//a[@data-name='composeEmail']")
	public WebElement buttonEmailCompose;
	
	
	//@FindBy (xpath="//div[@data-name='to' and @class='field'")
    @FindBy (xpath="//div[@data-name='to']//input[@type='text']")
	public WebElement txtFieldTo;
	
	@FindBy (xpath="//input[@data-name='subject']")
	public WebElement txtFieldSubject;
	
	@FindBy (xpath="//div[@class='note-editable']")
	public WebElement txtFieldEmailBody;
	
	@FindBy (xpath="//button[@data-name='send']")
	public WebElement buttonSend;
	
	@FindBy (xpath="//div[@class='gray-box']")
	public WebElement attchedFile;

	public WebElement getAttchedFile() {
		return attchedFile;
	}

	public void setAttchedFile(WebElement attchedFile) {
		this.attchedFile = attchedFile;
	}

	public WebElement getTxtFieldEmailBody() {
		return txtFieldEmailBody;
	}

	public void setTxtFieldEmailBody(WebElement txtFieldEmailBody) {
		this.txtFieldEmailBody = txtFieldEmailBody;
	}

	public WebElement getButtonSend() {
		return buttonSend;
	}

	public void setButtonSend(WebElement buttonSend) {
		this.buttonSend = buttonSend;
	}

	public WebElement getButtonEmailCompose() {
		return buttonEmailCompose;
	}

	public void setButtonEmailCompose(WebElement buttonEmailCompose) {
		this.buttonEmailCompose = buttonEmailCompose;
	}

	public WebElement getTxtFieldTo() {
		return txtFieldTo;
	}

	public void setTxtFieldTo(WebElement txtFieldTo) {
		this.txtFieldTo = txtFieldTo;
	}

	public WebElement getTxtFieldSubject() {
		return txtFieldSubject;
	}

	public void setTxtFieldSubject(WebElement txtFieldSubject) {
		this.txtFieldSubject = txtFieldSubject;
	}
	
	//@FindBy (xpath="")
	//public WebElement buttonCompose;

}
