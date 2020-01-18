package com.fanniemae.automation.SupplierPerfomanceElements.model;

import com.fanniemae.automation.SupplierPerfomanceElements.model.SupplierPerformancePage;
import com.fanniemae.automation.SupplierPerfomanceElements.model.CreateNewCampaign;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class SupplierPerfomanceElements {

	public SupplierPerformancePage supplierPerformancePage;
	public CreateNewCampaign createNewCampaign;

	public SupplierPerformancePage getSupplierPerformancePage() {
		return supplierPerformancePage;
	}

	public void setSupplierPerformancePage(SupplierPerformancePage supplierPerformancePage) {
		this.supplierPerformancePage = supplierPerformancePage;
	}

	public CreateNewCampaign getCreateNewCampaign() {
		return createNewCampaign;
	}

	public void setCreateNewCampaign(CreateNewCampaign createNewCampaign) {
		this.createNewCampaign = createNewCampaign;
	}

	public void init(WebDriver driver) {
		supplierPerformancePage = PageFactory.initElements(driver, SupplierPerformancePage.class);
		createNewCampaign = PageFactory.initElements(driver, CreateNewCampaign.class);
	}
}