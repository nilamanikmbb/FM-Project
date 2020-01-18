package com.fanniemae.automation.CorporateSupplierElementsFactory.model;

import com.fanniemae.automation.CorporateSupplierElementsFactory.model.MainInfoDeatilsOfCorporateSupplier;
import com.fanniemae.automation.CorporateSupplierElementsFactory.model.AdditionalInfoOfCorporateSupplier;
import com.fanniemae.automation.CorporateSupplierElementsFactory.model.BankInfoForCreateSupplier;
import com.fanniemae.automation.CorporateSupplierElementsFactory.model.contactInfoForCreateSupplier;
import com.fanniemae.automation.CorporateSupplierElementsFactory.model.approvalWorkflowForCorporateSupplier;
import com.fanniemae.automation.CorporateSupplierElementsFactory.model.searchAndVerifyCreateSupplier;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class CorporateSupplierElementsFactory {

	public MainInfoDeatilsOfCorporateSupplier mainInfoDeatilsOfCorporateSupplier;
	public AdditionalInfoOfCorporateSupplier additionalInfoOfCorporateSupplier;
	public BankInfoForCreateSupplier bankInfoForCreateSupplier;
	public contactInfoForCreateSupplier contactInfoForCreateSupplier;
	public approvalWorkflowForCorporateSupplier approvalWorkflowForCorporateSupplier;
	public searchAndVerifyCreateSupplier searchAndVerifyCreateSupplier;

	public MainInfoDeatilsOfCorporateSupplier getMainInfoDeatilsOfCorporateSupplier() {
		return mainInfoDeatilsOfCorporateSupplier;
	}

	public void setMainInfoDeatilsOfCorporateSupplier(
			MainInfoDeatilsOfCorporateSupplier mainInfoDeatilsOfCorporateSupplier) {
		this.mainInfoDeatilsOfCorporateSupplier = mainInfoDeatilsOfCorporateSupplier;
	}

	public AdditionalInfoOfCorporateSupplier getAdditionalInfoOfCorporateSupplier() {
		return additionalInfoOfCorporateSupplier;
	}

	public void setAdditionalInfoOfCorporateSupplier(
			AdditionalInfoOfCorporateSupplier additionalInfoOfCorporateSupplier) {
		this.additionalInfoOfCorporateSupplier = additionalInfoOfCorporateSupplier;
	}

	public BankInfoForCreateSupplier getBankInfoForCreateSupplier() {
		return bankInfoForCreateSupplier;
	}

	public void setBankInfoForCreateSupplier(BankInfoForCreateSupplier bankInfoForCreateSupplier) {
		this.bankInfoForCreateSupplier = bankInfoForCreateSupplier;
	}

	public contactInfoForCreateSupplier getContactInfoForCreateSupplier() {
		return contactInfoForCreateSupplier;
	}

	public void setContactInfoForCreateSupplier(contactInfoForCreateSupplier contactInfoForCreateSupplier) {
		this.contactInfoForCreateSupplier = contactInfoForCreateSupplier;
	}

	public approvalWorkflowForCorporateSupplier getApprovalWorkflowForCorporateSupplier() {
		return approvalWorkflowForCorporateSupplier;
	}

	public void setApprovalWorkflowForCorporateSupplier(
			approvalWorkflowForCorporateSupplier approvalWorkflowForCorporateSupplier) {
		this.approvalWorkflowForCorporateSupplier = approvalWorkflowForCorporateSupplier;
	}

	public searchAndVerifyCreateSupplier getSearchAndVerifyCreateSupplier() {
		return searchAndVerifyCreateSupplier;
	}

	public void setSearchAndVerifyCreateSupplier(searchAndVerifyCreateSupplier searchAndVerifyCreateSupplier) {
		this.searchAndVerifyCreateSupplier = searchAndVerifyCreateSupplier;
	}

	public void init(WebDriver driver) {
		mainInfoDeatilsOfCorporateSupplier = PageFactory.initElements(driver, MainInfoDeatilsOfCorporateSupplier.class);
		additionalInfoOfCorporateSupplier = PageFactory.initElements(driver, AdditionalInfoOfCorporateSupplier.class);
		bankInfoForCreateSupplier = PageFactory.initElements(driver, BankInfoForCreateSupplier.class);
		contactInfoForCreateSupplier = PageFactory.initElements(driver, contactInfoForCreateSupplier.class);
		approvalWorkflowForCorporateSupplier = PageFactory.initElements(driver,
				approvalWorkflowForCorporateSupplier.class);
		searchAndVerifyCreateSupplier = PageFactory.initElements(driver, searchAndVerifyCreateSupplier.class);
	}
}