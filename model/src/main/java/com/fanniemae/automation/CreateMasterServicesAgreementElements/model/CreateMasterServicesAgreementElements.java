package com.fanniemae.automation.CreateMasterServicesAgreementElements.model;

import com.fanniemae.automation.CreateMasterServicesAgreementElements.model.CreateMasterServicesAgreement;
import com.fanniemae.automation.CreateMasterServicesAgreementElements.model.Approval;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class CreateMasterServicesAgreementElements {

	public CreateMasterServicesAgreement createMasterServicesAgreement;
	public Approval approval;

	public CreateMasterServicesAgreement getCreateMasterServicesAgreement() {
		return createMasterServicesAgreement;
	}

	public void setCreateMasterServicesAgreement(CreateMasterServicesAgreement createMasterServicesAgreement) {
		this.createMasterServicesAgreement = createMasterServicesAgreement;
	}

	public Approval getApproval() {
		return approval;
	}

	public void setApproval(Approval approval) {
		this.approval = approval;
	}

	public void init(WebDriver driver) {
		createMasterServicesAgreement = PageFactory.initElements(driver, CreateMasterServicesAgreement.class);
		approval = PageFactory.initElements(driver, Approval.class);
	}
}