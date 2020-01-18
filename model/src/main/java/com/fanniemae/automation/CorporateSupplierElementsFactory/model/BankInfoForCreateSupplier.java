package com.fanniemae.automation.CorporateSupplierElementsFactory.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BankInfoForCreateSupplier {

	@FindBy(css = "#body_x_tabc_containerTab_parteproc .iv-tab-label")
	public static WebElement bankInfoTab;
	@FindBy(id = "body_x_tabc_x_eproc_x_prxeproc_x_selBdetaCodeBankDetail_x_btnselBdetaCodeBankDetail_btn2")
	public static WebElement bankThreeDots;
	@FindBy(id = "body_x_txtQuery_x_x")
	public static WebElement bankInfoSearchBox;
	@FindBy(id = "body_x_prxFilterBar_x_cmdSearchBtn_btn2")
	public static WebElement bankInfoSearchBtn;
	@FindBy(id = "body_x_grid_x__ctl2__ctl0")
	public static WebElement bankInfoClickOnResult;
	@FindBy(id = "body_x_tabc_x_eproc_x_prxeproc_x_selBaccoCodeBankAccountDetails_x_btnselBaccoCodeBankAccountDetails_btn2")
	public static WebElement BankInfoBankAccountDetails;
	@FindBy(id = "body_x_tabc_x_eproc_x_prxeproc_x_selBpmethCodePaymentMethod_x_btnselBpmethCodePaymentMethod_btn2")
	public static WebElement BankInfoPaymentMethod;
	@FindBy(id = "body_x_tabc_x_eproc_x_prxeproc_x_btnAddNewBI_btn2")
	public static WebElement bankInfoAddBankingInfoClk;
	@FindBy(id = "body_x_txtOrder_x_x")
	public static WebElement bankInfoBankName;
	@FindBy(id = "body_x_txtAgency_x_x")
	public static WebElement bankInfoBankCity;
	@FindBy(id = "body_x_txtBiBankId_x_x")
	public static WebElement bankInfoABANumber;
	@FindBy(id = "body_x_txtBiAccountNumber_x_x")
	public static WebElement bankInfoAccountNumber;
	@FindBy(id = "proxyActionBar_x__cmdSave_btn2")
	public static WebElement bankInfoSaveBtn;
	@FindBy(id = "proxyActionBar_x_BackAction_btn2")
	public static WebElement bankInfoAddBankingCloseBtn;
	@FindBy(id = "body_x_tabc_x_eproc_x_prxeproc_x_txtSupPaymentConfirmEmail_x_x")
	public static WebElement bankInfoEmailAddressForACHPayment;
	@FindBy(id = "body_x_tabc_x_eproc_x_prxeproc_x_selBdetaCodeBankDetail_x_btnselBdetaCodeBankDetail_btn2__label")
	public static WebElement bankD;
	@FindBy(id = "body_x_tabc_x_eproc_x_prxeproc_x_selBaccoCodeBankAccountDetails_x_btnselBaccoCodeBankAccountDetails_btn2__label")
	public static WebElement bankAccountD;
	@FindBy(id = "body_x_tabc_x_eproc_x_prxeproc_x_selBpmethCodePaymentMethod_x_btnselBpmethCodePaymentMethod_btn2__label")
	public static WebElement bankPaymentD;
	@FindBy(id = "body_x_tabc_x_eproc_x_prxeproc_x_txtSupPaymentConfirmEmail_x_x__label")
	public static WebElement AddressForACHPaymentD;
	@FindBy(id = "body_x_txtOrder_x_x__label")
	public static WebElement bankNameD;
	@FindBy(id = "body_x_txtBiBankId_x_x__label")
	public static WebElement routingNoD;
	@FindBy(id = "body_x_tabc_x_eproc_x_prxeproc_x_txtSupPaymentConfirmEmail_x_x__label")
	public static WebElement accountNoD;
	@FindBy(id = "proxyActionBar_x_BackAction_btn2")
	public static WebElement closeD;
}