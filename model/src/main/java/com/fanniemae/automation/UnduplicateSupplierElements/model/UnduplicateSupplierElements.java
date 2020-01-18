package com.fanniemae.automation.UnduplicateSupplierElements.model;

import com.fanniemae.automation.UnduplicateSupplierElements.model.UnduplicateSupplierPage;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class UnduplicateSupplierElements {

	public UnduplicateSupplierPage unduplicateSupplierPage;

	public UnduplicateSupplierPage getUnduplicateSupplierPage() {
		return unduplicateSupplierPage;
	}

	public void setUnduplicateSupplierPage(UnduplicateSupplierPage unduplicateSupplierPage) {
		this.unduplicateSupplierPage = unduplicateSupplierPage;
	}

	public void init(WebDriver driver) {
		unduplicateSupplierPage = PageFactory.initElements(driver, UnduplicateSupplierPage.class);
	}
}