package com.fanniemae.automation.CorporateSupplierElementsFactory.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class approvalWorkflowForCorporateSupplier {

	@FindBy(css = "#body_x_tabc_containerTab_partworkflow .tab_label_class > div")
	public static WebElement approvalWorkflowTab;
	@FindBy(xpath = "//input[contains(@id,'_valFM_SUPREF_SuppliersINI_btn2')]")
	public static WebElement approvalWorkflowSubmitForDiligence;
	@FindBy(id = "proxyActionBar_x_valFM_SUPREF_Suppliersots_btn2")
	public static WebElement approvalWorkflowSubmitToWorkflow;
	@FindBy(id = "proxyActionBar_x_valFM_SUPREF_SuppliersVAL2_btn2")
	public static WebElement approvalWorkflowApprovalFinal;
	@FindBy(id = "proxyActionBar_x_valFM_SUPREF_SuppliersAPP2_btn2")
	public static WebElement approvalWorkflowApproveChanges;
	@FindBy(id = "proxyActionBar_x__cmdEnd_btn2")
	public static WebElement exitD;
	@FindBy(id = "proxyActionBar_x_valFM_SUPREF_SuppliersINI_btn2")
	public static WebElement submitForDueDiligenceD;
}