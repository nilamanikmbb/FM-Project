package com.fanniemae.automation.CreateRequisitionElements.model;

import com.fanniemae.automation.CreateRequisitionElements.model.CreateRequisition;
import com.fanniemae.automation.CreateRequisitionElements.model.AddItemDetails;
import com.fanniemae.automation.CreateRequisitionElements.model.CostAllocationAndCommentUpdate;
import com.fanniemae.automation.CreateRequisitionElements.model.CreateSpecialRequestsRequisitions;
import com.fanniemae.automation.CreateRequisitionElements.model.CommodityApprovalforSubmittedRequest;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class CreateRequisitionElements {

	public CreateRequisition createRequisition;
	public AddItemDetails addItemDetails;
	public CostAllocationAndCommentUpdate costAllocationAndCommentUpdate;
	public CreateSpecialRequestsRequisitions createSpecialRequestsRequisitions;
	public CommodityApprovalforSubmittedRequest commodityApprovalforSubmittedRequest;

	public CreateRequisition getCreateRequisition() {
		return createRequisition;
	}

	public void setCreateRequisition(CreateRequisition createRequisition) {
		this.createRequisition = createRequisition;
	}

	public AddItemDetails getAddItemDetails() {
		return addItemDetails;
	}

	public void setAddItemDetails(AddItemDetails addItemDetails) {
		this.addItemDetails = addItemDetails;
	}

	public CostAllocationAndCommentUpdate getCostAllocationAndCommentUpdate() {
		return costAllocationAndCommentUpdate;
	}

	public void setCostAllocationAndCommentUpdate(CostAllocationAndCommentUpdate costAllocationAndCommentUpdate) {
		this.costAllocationAndCommentUpdate = costAllocationAndCommentUpdate;
	}

	public CreateSpecialRequestsRequisitions getCreateSpecialRequestsRequisitions() {
		return createSpecialRequestsRequisitions;
	}

	public void setCreateSpecialRequestsRequisitions(
			CreateSpecialRequestsRequisitions createSpecialRequestsRequisitions) {
		this.createSpecialRequestsRequisitions = createSpecialRequestsRequisitions;
	}

	public CommodityApprovalforSubmittedRequest getCommodityApprovalforSubmittedRequest() {
		return commodityApprovalforSubmittedRequest;
	}

	public void setCommodityApprovalforSubmittedRequest(
			CommodityApprovalforSubmittedRequest commodityApprovalforSubmittedRequest) {
		this.commodityApprovalforSubmittedRequest = commodityApprovalforSubmittedRequest;
	}

	public void init(WebDriver driver) {
		createRequisition = PageFactory.initElements(driver, CreateRequisition.class);
		addItemDetails = PageFactory.initElements(driver, AddItemDetails.class);
		costAllocationAndCommentUpdate = PageFactory.initElements(driver, CostAllocationAndCommentUpdate.class);
		createSpecialRequestsRequisitions = PageFactory.initElements(driver, CreateSpecialRequestsRequisitions.class);
		commodityApprovalforSubmittedRequest = PageFactory.initElements(driver,
				CommodityApprovalforSubmittedRequest.class);
	}
}