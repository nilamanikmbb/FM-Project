package com.fanniemae.automation.test.page.actions;

import org.openqa.selenium.WebDriver;

import com.fanniemae.automation.UnduplicateSupplierElements.model.UnduplicateSupplierElements;
import com.fanniemae.automation.UnduplicateSupplierElements.model.UnduplicateSupplierPage;
import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.test.AbstractTest;
import com.fanniemae.automation.util.PathProvider;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;

public class UnduplicateSupplierAction extends AbstractTest{
	public static final String ADD_FILES_EXE = PathProvider.getForTestData()+"/AddFiles.exe";
	private UnduplicateSupplierElements USE;
	private WebDriver driver;
	
	public UnduplicateSupplierAction(UnduplicateSupplierElements USE, WebDriver driver) {
		super();
		this.USE = USE;
		this.driver = driver;
	}
	
	private int algorithm=FanniemaeConstants.AT;
	private int keywords=FanniemaeConstants.J;
	private int level=FanniemaeConstants.AU;
	
	public void unduplicateSupplierPage(String serialNo,String sheetName) {
		WebElementOperations.click(driver, UnduplicateSupplierPage.unduplicateSupplier);
		WebElementOperations.sendKeys(driver, UnduplicateSupplierPage.unduplicateSupplierAlgorithm, REPOSITORY.getCellDataOnTestCase(serialNo, algorithm, sheetName));
		WebElementOperations.park(2);
		WebElementOperations.enterByRobot();
		WebElementOperations.dropDownByTextVisibility(driver, UnduplicateSupplierPage.unduplicateSupplierLevel, REPOSITORY.getCellDataOnTestCase(serialNo, level, sheetName));
		WebElementOperations.sendKeys(driver, UnduplicateSupplierPage.unduplicateSupplierKeywords, REPOSITORY.getCellDataOnTestCase(serialNo, keywords, sheetName));
		WebElementOperations.click(driver, UnduplicateSupplierPage.unduplicateSupplierNotaDupliRadioBtn);
		WebElementOperations.park(2);
		WebElementOperations.click(driver, UnduplicateSupplierPage.unduplicateSupplierSearch);
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(driver, 15);
		WebElementOperations.click(driver, UnduplicateSupplierPage.unduplicateSupplierReset);
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(driver, 15);
	}

}
