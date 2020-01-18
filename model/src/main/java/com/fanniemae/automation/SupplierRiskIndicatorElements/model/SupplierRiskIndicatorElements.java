package com.fanniemae.automation.SupplierRiskIndicatorElements.model;

import com.fanniemae.automation.SupplierRiskIndicatorElements.model.SupplierRiskIndicatorPage;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class SupplierRiskIndicatorElements {

	public SupplierRiskIndicatorPage supplierRiskIndicatorPage;

	public SupplierRiskIndicatorPage getSupplierRiskIndicatorPage() {
		return supplierRiskIndicatorPage;
	}

	public void setSupplierRiskIndicatorPage(SupplierRiskIndicatorPage supplierRiskIndicatorPage) {
		this.supplierRiskIndicatorPage = supplierRiskIndicatorPage;
	}

	public void init(WebDriver driver) {
		supplierRiskIndicatorPage = PageFactory.initElements(driver, SupplierRiskIndicatorPage.class);
	}
}