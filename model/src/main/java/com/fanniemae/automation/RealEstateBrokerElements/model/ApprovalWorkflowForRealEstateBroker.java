package com.fanniemae.automation.RealEstateBrokerElements.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApprovalWorkflowForRealEstateBroker {

	@FindBy(css = "#body_x_tabc_containerTab_partworkflow .tab_label_class > div")
	public static WebElement approvalWorkflowTab;
	@FindBy(id = "proxyActionBar_x_valFM_SUPREF_SuppliersINI_btn2")
	public static WebElement approvalWorkflowSubmitForDiligence;
	@FindBy(id = "proxyActionBar_x_valFM_SUPREF_Suppliersots_btn2")
	public static WebElement approvalWorkflowSubmitToWorkflow;
	@FindBy(id = "proxyActionBar_x_valFM_SUPREF_Suppliersm_trax_chk_btn2")
	public static WebElement approvalWorkflowContinueOnBoarding;
	@FindBy(id = "proxyActionBar_x_valFM_SUPREF_Suppliersfm_sup_update_btn2")
	public static WebElement approvalWorkflowProfileDocumentUpdate;
	@FindBy(id = "proxyActionBar_x_valFM_SUPREF_Suppliersfm_sup_ops_review_btn2")
	public static WebElement approvalWorkflowBrokerApprove;
	@FindBy(id = "proxyActionBar_x_valFM_SUPREF_Suppliersfm_due_diligence_btn2")
	public static WebElement approvalWorkflowBrokerNoFindings;
	@FindBy(id = "proxyActionBar_x_valFM_SUPREF_Suppliersfm_sup_op_trax_upd_btn2")
	public static WebElement approvalWorkflowBrokerTraxUpdated;
	@FindBy(id = "proxyActionBar_x_valFM_SUPREF_Suppliersfm_upd_proc_one_btn2")
	public static WebElement approvalWorkflowProcureOneUpdated;
	@FindBy(id = "proxyActionBar_x_valFM_SUPREF_Suppliersfm_upd_ach_btn2")
	public static WebElement approvalWorkflowACHInformationUpdated;
	@FindBy(id = "proxyActionBar_x_valFM_SUPREF_SuppliersVAL1_btn2")
	public static WebElement approvalWorkflowApproveFinal;
	@FindBy(id = "proxyActionBar_x_txtWflRefuseMessage_x_x")
	public static WebElement approvalWorkflowBrokerReason;
	@FindBy(id = "proxyActionBar_x_btnWflRefuseMessage_btn2")
	public static WebElement approvalWorkflowBrokerReasonConfirm;
}