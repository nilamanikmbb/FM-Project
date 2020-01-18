package com.techouts.fanniemae.testcases;

import org.testng.annotations.Test;

import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.test.AbstractTest;
import com.fanniemae.automation.util.Assert;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;

public class AddContacts extends AbstractTest{
	private int userName = FanniemaeConstants.G;
	private int password = FanniemaeConstants.H;
	private int homePageTitle = FanniemaeConstants.L;
	@Test
	public void addListOfContacts(){
		String testCaseNumber = "3";
		String testCaseName = "AddContacts";
		try {
			getFannieMaePage();
			Assert.assertTrue(HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(testCaseNumber, userName, DEFAULT_SHEET_NAME),
					REPOSITORY.getCellDataOnTestCase(testCaseNumber, password, DEFAULT_SHEET_NAME),
					REPOSITORY.getCellDataOnTestCase(testCaseNumber, homePageTitle, DEFAULT_SHEET_NAME)),"Login to the application failed");
			//captureScreenShotOnPass(getDriver(), testCaseName);
			//SUP346221, SUP346306  	
			String supplierId="SUP346318";	
			Assert.assertTrue(HOMEPAGE_ACTIONS.searchAndVerifyCreatedOne(testCaseName,testCaseNumber, supplierId, DEFAULT_SHEET_NAME),"After create supplier search and find supplier fails");
			click(getDriver(), getWebElementFactory().getCreateSupplierContactInfoTab());
			WebElementOperations.park(2);
			//captureScreenShotOnPass(getDriver(), testCaseName);
			WebElementOperations.waitForPageLoad(getDriver(), 15);
			click(getDriver(), getWebElementFactory().getAddAnExistingContact());
			try {
				WebElementOperations.acceptAlertIfPresent(getDriver(), 10);
				LOG.info("Time out alert occurs");
			} catch (Exception e) {
				LOG.info("Time out alert does not occurs");
			}
			WebElementOperations.switchToFrame(getDriver(), 0);
			click(getDriver(), getWebElementFactory().getCreateSupplierBankInfoCloseButton());
			WebElementOperations.switchToDefaultContentFrame(getDriver());
			for(int j=1;j<10;j++){
			LOG.info("Trying for "+j+" th time");	
			int i=1;
			for(;i<=5;i++){
				contactInfoForCreateSupplier(testCaseName, i);
				WebElementOperations.park(2);
			}
			click(getDriver(), getWebElementFactory().getAddAnExistingContact());
			try {
				WebElementOperations.acceptAlertIfPresent(getDriver(), 10);
				LOG.info("Time out alert occurs");
			} catch (Exception e) {
				LOG.info("Time out alert does not occurs");
			}
			WebElementOperations.switchToFrame(getDriver(), 0);
			click(getDriver(), getWebElementFactory().getCreateSupplierBankInfoCloseButton());
			WebElementOperations.switchToDefaultContentFrame(getDriver());
			}
			HOMEPAGE_ACTIONS.logout(testCaseName);
			addPassedTestCaseResult(testCaseName);
		} catch (Exception e) {
			performPostExceptionProcess(testCaseName, testCaseNumber, "createCorporateSupplier has failed", e, getDefaultConfiguredWorkbookSheetName());
		}
	}
	public boolean contactInfoForCreateSupplier(String testCaseName,int number){
		try {
			click(getDriver(), getWebElementFactory().getCreateSupplierContactInfoAddAContact());
			WebElementOperations.waitForPageLoad(getDriver(), 15);
			WebElementOperations.switchToFrame(getDriver(), 0);
			dropDownByTextVisibility(getDriver(), getWebElementFactory().getCreateSupplierSupplierContactManagementStatus(), "Validated");
			sendKeys(getDriver(), getWebElementFactory().getCreateSupplierContactInfoLastName(),"Sam"+number);
			sendKeys(getDriver(), getWebElementFactory().getCreateSupplierContactInfoFirstName(),"Jhon"+number);
			sendKeys(getDriver(), getWebElementFactory().getCreateSupplierContactInfoEmail(),"Sam"+number+"@testing.com");
			sendKeys(getDriver(), getWebElementFactory().getCreateSupplierContactInfoPhono(),"9876543210");
			WebElementOperations.captureScreenShotOnPass(getDriver(), testCaseName);
			WebElementOperations.park(1);
			click(getDriver(),getWebElementFactory().getCreateSupplierContactInfoSaveAndClose());
			WebElementOperations.switchToDefaultContentFrame(getDriver());
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
