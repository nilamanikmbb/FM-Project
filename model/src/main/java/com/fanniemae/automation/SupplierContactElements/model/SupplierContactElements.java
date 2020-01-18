package com.fanniemae.automation.SupplierContactElements.model;

import com.fanniemae.automation.SupplierContactElements.model.SupplierContactPage;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class SupplierContactElements {

	public SupplierContactPage supplierContactPage;

	public SupplierContactPage getSupplierContactPage() {
		return supplierContactPage;
	}

	public void setSupplierContactPage(SupplierContactPage supplierContactPage) {
		this.supplierContactPage = supplierContactPage;
	}

	public void init(WebDriver driver) {
		supplierContactPage = PageFactory.initElements(driver, SupplierContactPage.class);
	}
}