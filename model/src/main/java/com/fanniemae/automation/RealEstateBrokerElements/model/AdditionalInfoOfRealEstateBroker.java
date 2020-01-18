package com.fanniemae.automation.RealEstateBrokerElements.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdditionalInfoOfRealEstateBroker {

	@FindBy(css = "#body_x_tabc_containerTab_partadmin .tab_label_class > div")
	public static WebElement additionalInfoTab;
	@FindBy(id = "body_x_tabc_x_admin_x_prxadmin_x_proxyAdrPay_x_txtCompNom_x_x")
	public static WebElement nameAdditional;
	@FindBy(id = "body_x_tabc_x_admin_x_prxadmin_x_proxyAdrPay_x_txtVoie_x_x")
	public static WebElement addInfoAddressLine1;
	@FindBy(id = "body_x_tabc_x_admin_x_prxadmin_x_proxyAdrPay_x_txtCity_x_x")
	public static WebElement addInfoCity;
	@FindBy(id = "body_x_tabc_x_admin_x_prxadmin_x_proxyAdrPay_x_txtZip_x_x")
	public static WebElement addInfoZip;
	@FindBy(id = "body_x_tabc_x_admin_x_prxadmin_x_proxyAdrPay_x_ddlState_x_txtddlState_x_x")
	public static WebElement addInfoState;
	@FindBy(id = "ddlbody_x_tabc_x_admin_x_prxadmin_x_proxyAdrPay_x_ddlPays_x")
	public static WebElement addInfoCountry;
	@FindBy(id = "proxyActionBar_x__cmdSave_btn2")
	public static WebElement saveButton;
	@FindBy(id = "body_x_tabc_x_admin_x_prxadmin_x_proxyAdrPay_x_txtVoie_x_x__label")
	public static WebElement addressLineD;
	@FindBy(id = "body_x_tabc_x_admin_x_prxadmin_x_proxyAdrPay_x_txtCity_x_x__label")
	public static WebElement cityD;
	@FindBy(id = "body_x_tabc_x_admin_x_prxadmin_x_proxyAdrPay_x_txtZip_x_x__label")
	public static WebElement zipCodeD;
	@FindBy(id = "body_x_tabc_x_admin_x_prxadmin_x_proxyAdrPay_x_ddlState_x_txtddlState_x_x__label")
	public static WebElement stateD;
	@FindBy(id = "ddlbody_x_tabc_x_admin_x_prxadmin_x_proxyAdrPay_x_ddlPays_x__label")
	public static WebElement countryD;
}