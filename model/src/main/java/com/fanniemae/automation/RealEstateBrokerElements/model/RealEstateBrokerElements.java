package com.fanniemae.automation.RealEstateBrokerElements.model;

import com.fanniemae.automation.RealEstateBrokerElements.model.mainInfoDetailsOfRealEstateBroker;
import com.fanniemae.automation.RealEstateBrokerElements.model.AdditionalInfoOfRealEstateBroker;
import com.fanniemae.automation.RealEstateBrokerElements.model.contactInfoForCreateSupplier2;
import com.fanniemae.automation.RealEstateBrokerElements.model.CreateRealEstateBrokerSupplier;
import com.fanniemae.automation.RealEstateBrokerElements.model.SupplierContactManagement;
import com.fanniemae.automation.RealEstateBrokerElements.model.ApprovalWorkflowForRealEstateBroker;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class RealEstateBrokerElements {

	public mainInfoDetailsOfRealEstateBroker mainInfoDetailsOfRealEstateBroker;
	public AdditionalInfoOfRealEstateBroker additionalInfoOfRealEstateBroker;
	public contactInfoForCreateSupplier2 contactInfoForCreateSupplier2;
	public CreateRealEstateBrokerSupplier createRealEstateBrokerSupplier;
	public SupplierContactManagement supplierContactManagement;
	public ApprovalWorkflowForRealEstateBroker approvalWorkflowForRealEstateBroker;

	public mainInfoDetailsOfRealEstateBroker getMainInfoDetailsOfRealEstateBroker() {
		return mainInfoDetailsOfRealEstateBroker;
	}

	public void setMainInfoDetailsOfRealEstateBroker(
			mainInfoDetailsOfRealEstateBroker mainInfoDetailsOfRealEstateBroker) {
		this.mainInfoDetailsOfRealEstateBroker = mainInfoDetailsOfRealEstateBroker;
	}

	public AdditionalInfoOfRealEstateBroker getAdditionalInfoOfRealEstateBroker() {
		return additionalInfoOfRealEstateBroker;
	}

	public void setAdditionalInfoOfRealEstateBroker(AdditionalInfoOfRealEstateBroker additionalInfoOfRealEstateBroker) {
		this.additionalInfoOfRealEstateBroker = additionalInfoOfRealEstateBroker;
	}

	public contactInfoForCreateSupplier2 getContactInfoForCreateSupplier2() {
		return contactInfoForCreateSupplier2;
	}

	public void setContactInfoForCreateSupplier2(contactInfoForCreateSupplier2 contactInfoForCreateSupplier2) {
		this.contactInfoForCreateSupplier2 = contactInfoForCreateSupplier2;
	}

	public CreateRealEstateBrokerSupplier getCreateRealEstateBrokerSupplier() {
		return createRealEstateBrokerSupplier;
	}

	public void setCreateRealEstateBrokerSupplier(CreateRealEstateBrokerSupplier createRealEstateBrokerSupplier) {
		this.createRealEstateBrokerSupplier = createRealEstateBrokerSupplier;
	}

	public SupplierContactManagement getSupplierContactManagement() {
		return supplierContactManagement;
	}

	public void setSupplierContactManagement(SupplierContactManagement supplierContactManagement) {
		this.supplierContactManagement = supplierContactManagement;
	}

	public ApprovalWorkflowForRealEstateBroker getApprovalWorkflowForRealEstateBroker() {
		return approvalWorkflowForRealEstateBroker;
	}

	public void setApprovalWorkflowForRealEstateBroker(
			ApprovalWorkflowForRealEstateBroker approvalWorkflowForRealEstateBroker) {
		this.approvalWorkflowForRealEstateBroker = approvalWorkflowForRealEstateBroker;
	}

	public void init(WebDriver driver) {
		mainInfoDetailsOfRealEstateBroker = PageFactory.initElements(driver, mainInfoDetailsOfRealEstateBroker.class);
		additionalInfoOfRealEstateBroker = PageFactory.initElements(driver, AdditionalInfoOfRealEstateBroker.class);
		contactInfoForCreateSupplier2 = PageFactory.initElements(driver, contactInfoForCreateSupplier2.class);
		createRealEstateBrokerSupplier = PageFactory.initElements(driver, CreateRealEstateBrokerSupplier.class);
		supplierContactManagement = PageFactory.initElements(driver, SupplierContactManagement.class);
		approvalWorkflowForRealEstateBroker = PageFactory.initElements(driver,
				ApprovalWorkflowForRealEstateBroker.class);
	}
}