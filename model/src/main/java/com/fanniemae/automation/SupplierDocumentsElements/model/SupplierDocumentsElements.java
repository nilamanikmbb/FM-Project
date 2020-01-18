package com.fanniemae.automation.SupplierDocumentsElements.model;

import com.fanniemae.automation.SupplierDocumentsElements.model.supplierDocumentsPage;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class SupplierDocumentsElements {

	public supplierDocumentsPage supplierDocumentsPage;

	public supplierDocumentsPage getSupplierDocumentsPage() {
		return supplierDocumentsPage;
	}

	public void setSupplierDocumentsPage(supplierDocumentsPage supplierDocumentsPage) {
		this.supplierDocumentsPage = supplierDocumentsPage;
	}

	public void init(WebDriver driver) {
		supplierDocumentsPage = PageFactory.initElements(driver, supplierDocumentsPage.class);
	}
}