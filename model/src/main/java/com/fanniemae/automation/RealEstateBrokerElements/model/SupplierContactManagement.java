package com.fanniemae.automation.RealEstateBrokerElements.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SupplierContactManagement {

	@FindBy(id = "proxyActionBar_x__cmdSave_btn2")
	public static WebElement saveButton;
	@FindBy(xpath = "//*[@class='icon_base icon_profil']")
	public static WebElement superLoginIcon;
	@FindBy(name = "body:x:pxCtc:x:txtLoginName:x:x")
	public static WebElement superLoginlogin;
	@FindBy(name = "body:x:pxCtc:x:txtLoginPass:x:x")
	public static WebElement superLoginpassword;
	@FindBy(id = "proxyActionBar_x__cmdEnd_btn2")
	public static WebElement ContactInfoSaveAndClose;
	@FindBy(xpath = "//img[@class='icon_base icon_invite']")
	public static WebElement regenaratePasswordButton;
	@FindBy(name = "proxyActionBar:x:resend_btn2")
	public static WebElement regenaratepassword;
	@FindBy(xpath = "//span[@class='fa fa-times']")
	public static WebElement saveButtonMarkC;
	@FindBy(id = "proxyActionBar_x_BackAction_btn2")
	public static WebElement regenaratePasswordClose;
	@FindBy(xpath = "//table[@id='body_x_pxCtc_x_LoginFrame']/tbody/tr[2]/td/div/table/tbody/tr[1]/td[1]")
	public static WebElement loginD;
	@FindBy(xpath = "//table[@id='body_x_pxCtc_x_LoginFrame']/tbody/tr[2]/td/div/table/tbody/tr[2]/td[1]")
	public static WebElement passwordD;
	@FindBy(id = "body_x_pxCtc_x_ContactControl_x_ContactControl_x_txtContactLastname_x_x__label")
	public static WebElement lastNameD;
	@FindBy(id = "body_x_pxCtc_x_ContactControl_x_ContactControl_x_txtContactFirstname_x_x__label")
	public static WebElement firstNameD;
	@FindBy(id = "body_x_pxCtc_x_ContactControl_x_ContactControl_x_txtContactEmail_x_x__label")
	public static WebElement emailD;
	@FindBy(id = "body_x_pxCtc_x_ContactControl_x_ContactControl_x_selSuppliers_x_txtselSuppliers_x_x__label")
	public static WebElement supplierD;
	@FindBy(id = "proxyActionBar_x__cmdSave_btn2")
	public static WebElement saveD;
	@FindBy(id = "proxyActionBar_x_BackAction_btn2")
	public static WebElement closeD;
}