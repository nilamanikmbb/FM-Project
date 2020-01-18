package com.techouts.fanniemae.testcases;

import static com.techouts.fanniemae.webelement.ops.WebElementOperations.acceptAlertIfPresent;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.captureScreenShotOnPass;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.click;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.dropDownByTextVisibility;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.executeJS;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.park;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.sendKeys;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.switchToDefaultContentFrame;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.switchToFrame;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.verifyPageTitle;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.waitForPageLoad;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.webElementHighlighter;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.fanniemae.automation.ElementsFactory.model.ElementsFactory;
import com.fanniemae.automation.RealEstateBrokerElements.model.contactInfoForCreateSupplier2;
import com.fanniemae.automation.RealEstateBrokerElements.model.SupplierContactManagement;
import com.fanniemae.automation.CorporateSupplierElementsFactory.model.AdditionalInfoOfCorporateSupplier;
import com.fanniemae.automation.CorporateSupplierElementsFactory.model.BankInfoForCreateSupplier;
import com.fanniemae.automation.CorporateSupplierElementsFactory.model.CorporateSupplierElementsFactory;
import com.fanniemae.automation.CorporateSupplierElementsFactory.model.approvalWorkflowForCorporateSupplier;
import com.fanniemae.automation.CorporateSupplierElementsFactory.model.MainInfoDeatilsOfCorporateSupplier;
import com.fanniemae.automation.CorporateSupplierElementsFactory.model.contactInfoForCreateSupplier;
import com.fanniemae.automation.CorporateSupplierElementsFactory.model.searchAndVerifyCreateSupplier;
import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.test.AbstractTest;
import com.fanniemae.automation.test.page.actions.CreateRealEstateBrokerAction;
import com.fanniemae.automation.test.page.actions.HomePageActions;
import com.fanniemae.automation.util.Assert;
import com.techouts.fanniemae.exceptions.FannieMaeBusinessException;

public class CorporateSupplierCreationTest extends AbstractTest {
	private static final Logger LOG = Logger.getLogger(RealEstateBrokerSupplierCreationTest.class.getName());
	
	private int userName = FanniemaeConstants.G;
	private int password = FanniemaeConstants.H;
	private int landingPageTitle = FanniemaeConstants.K;
	private int homePageTitle = FanniemaeConstants.L;
	private int legalName= FanniemaeConstants.AF;
	private static int supplierType = FanniemaeConstants.AD;
	private static int supplierClassification = FanniemaeConstants.AE;
	private static int addressLine1 = FanniemaeConstants.AG;
	private static int city = FanniemaeConstants.AH;
	private static int zip = FanniemaeConstants.AI;
	private static int state = FanniemaeConstants.AJ;
	private static int country = FanniemaeConstants.AK;
	private static int tinType = FanniemaeConstants.AL;
	private static int federalTaxID = FanniemaeConstants.AM;
	private static int searchText = FanniemaeConstants.AP;
	private static int bankName = FanniemaeConstants.AQ;
	private static int bankCity = FanniemaeConstants.AR;
	private static int abaRoutingNumber = FanniemaeConstants.AS;
	private static int accNumber = FanniemaeConstants.AT;
	private static int lastName = FanniemaeConstants.AU;
	private static int firstName = FanniemaeConstants.AV;
	private static int email = FanniemaeConstants.AW;
	private static int phone = FanniemaeConstants.AX;
	
	
	//private Procurement PROCUREMENT = PageFactory.initElements(getDriver(), Procurement.class);
	protected static CreateRealEstateBrokerAction CREATE_REALESTATE_BROKER ;
	
	
	static {
		CorporateSupplierElementsFactory CSEF=new CorporateSupplierElementsFactory();
		CSEF.init(DRIVER);
		ElementsFactory elementFactory = new ElementsFactory();
		elementFactory.init(DRIVER);
		CREATE_REALESTATE_BROKER  = new CreateRealEstateBrokerAction(CSEF, DRIVER);
		HOMEPAGE_ACTIONS = new HomePageActions(elementFactory, DRIVER);
	} 
	


	@Test
	public void createCorporateSupplier() {
		String testCaseNumber = "3";
		String testCaseName = "CreateCorporateSupplier";
		try {
			getFannieMaePage();
			String legalNameUpdate = REPOSITORY.getCellDataOnTestCase(testCaseNumber, legalName, DEFAULT_SHEET_NAME);
			Assert.assertTrue(verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(testCaseNumber, landingPageTitle, DEFAULT_SHEET_NAME)));
			captureScreenShotOnPass(getDriver(), testCaseName);
			Assert.assertTrue(HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(testCaseNumber, userName, DEFAULT_SHEET_NAME),
					REPOSITORY.getCellDataOnTestCase(testCaseNumber, password, DEFAULT_SHEET_NAME),
					REPOSITORY.getCellDataOnTestCase(testCaseNumber, homePageTitle, DEFAULT_SHEET_NAME)),"Login to the application failed");
			captureScreenShotOnPass(getDriver(), testCaseName);
			Assert.assertTrue(mainInfoDeatilsOfCorporateSupplier(testCaseName,testCaseNumber, legalNameUpdate),"Fail during add supplier main/basic information");
			Assert.assertTrue(additionalInfoOfCorporateSupplier(testCaseName,testCaseNumber),"Fails during add additional information");
			bankInfoForCreateSupplier(testCaseName,testCaseNumber);
			webElementHighlighter(getDriver(),BankInfoForCreateSupplier.bankInfoSaveBtn);
			Assert.assertTrue(BankInfoForCreateSupplier.bankInfoSaveBtn.isEnabled());
			executeJS(getDriver(),FanniemaeConstants.JS_CLICK_SCRIPT,BankInfoForCreateSupplier.bankInfoSaveBtn);
			try {
				acceptAlertIfPresent(getDriver(), 5);
				LOG.info("First alert is visible");
			} catch (Exception e) {
				LOG.info("First alert is not visible");
			}
			park(4);
			try {
				acceptAlertIfPresent(getDriver(), 5);
				LOG.info("second alert is visible");
			} catch (Exception e) {
				LOG.info("second alert is not visible");
			}
			park(2);
			waitForPageLoad(getDriver(),15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			Assert.assertTrue(BankInfoForCreateSupplier.bankInfoAddBankingCloseBtn.isEnabled());
			click(getDriver(),BankInfoForCreateSupplier.bankInfoAddBankingCloseBtn);
			park(2);
			waitForPageLoad(getDriver(),15);
			switchToDefaultContentFrame(getDriver());
			waitForPageLoad(getDriver(),15);
			Assert.assertTrue(BankInfoForCreateSupplier.AddressForACHPaymentD.isDisplayed());
			sendKeys(getDriver(),BankInfoForCreateSupplier.bankInfoEmailAddressForACHPayment, "automation@test.com");
			captureScreenShotOnPass(getDriver(), testCaseName);
			webElementHighlighter(getDriver(), BankInfoForCreateSupplier.bankInfoSaveBtn);
			executeJS(getDriver(),FanniemaeConstants.JS_CLICK_SCRIPT, BankInfoForCreateSupplier.bankInfoSaveBtn);
			waitForPageLoad(getDriver(),15);
			contactInfoForCreateSupplier(testCaseName,testCaseNumber);
			Assert.assertTrue(contactInfoForCreateSupplier.AddAContactSaveAndCloseBtn.isEnabled());
			Assert.assertTrue(contactInfoForCreateSupplier.AddAContactSaveBtn.isEnabled());
			Assert.assertTrue(contactInfoForCreateSupplier.AddAContactCloseBtn.isEnabled());
			click(getDriver(),contactInfoForCreateSupplier.AddAContactSaveAndCloseBtn);
			switchToDefaultContentFrame(getDriver());
			park(2);
			Assert.assertTrue(approvalWorkflowForCorporateSupplier.exitD.isEnabled());
			Assert.assertTrue(approvalWorkflowForCorporateSupplier.submitForDueDiligenceD.isEnabled());
			approvalWorkflowForCorporateSupplier(testCaseName);
			park(2);
			click(getDriver(), MainInfoDeatilsOfCorporateSupplier.mainInfoTab);
			park(2);
			waitForPageLoad(getDriver(), 15);
			webElementHighlighter(getDriver(), MainInfoDeatilsOfCorporateSupplier.supplierId);
			String supplierId=MainInfoDeatilsOfCorporateSupplier.supplierId.getText();
			LOG.info("Supplier ID is "+supplierId);
			park(3);
			waitForPageLoad(getDriver(), 15);
			//park(3);
//			waitForPageLoad(getDriver(), 15);
//			click(getDriver(), searchAndVerifyCreateSupplier.supplierLink);
//			park(0.5);
//			click(getDriver(), searchAndVerifyCreateSupplier.supplierBrowser);
//			captureScreenShotOnPass(getDriver(), testCaseName);
//			park(3);
//			getDriver().switchTo().alert().accept();
//			//acceptAlertIfPresent(getDriver(), 5);
//			park(10);
//			click(getDriver(), searchAndVerifyCreateSupplier.supplierStatusCrossMark);
//			dropDownByTextVisibility(getDriver(), searchAndVerifyCreateSupplier.supplierType,AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, supplierType, DEFAULT_SHEET_NAME));
//			sendKeys(getDriver(),searchAndVerifyCreateSupplier.supplierSearchKeyword, legalNameUpdate);
//			click(getDriver(), searchAndVerifyCreateSupplier.supplierSearchButton);
//			waitForPageLoad(getDriver(), 15);
//			captureScreenShotOnPass(getDriver(), testCaseName);
//			//Assert.assertTrue(corporaterSearch(driver, elementFactory.getSearchSupplierResultGridSupplierId(), legalNameUpdate),"Search operation fails");
//			park(3);
//			waitForPageLoad(getDriver(), 15);
			//Assert.assertTrue(searchAndVerifyCreatedOne(testCaseName, testCaseNumber, supplierId, DEFAULT_SHEET_NAME));
					//(testCaseName,testCaseNumber, supplierId, DEFAULT_SHEET_NAME),"After create supplier search and find supplier fails");
			park(2);
			HOMEPAGE_ACTIONS.logout(testCaseName);
			addPassedTestCaseResult(testCaseName);
		} catch (Exception e) {
			performPostExceptionProcess(testCaseName, testCaseNumber, "createCorporateSupplier has failed", e, getDefaultConfiguredWorkbookSheetName());
		}
	}
	
	public boolean searchAndVerifyCreatedOne(String testCaseName,String testCaseNumber,String legalNameUpdate, String sheetName){
		try {
			park(3);
			waitForPageLoad(getDriver(), 15);
			click(getDriver(), searchAndVerifyCreateSupplier.supplierLink);
			park(0.5);
			click(getDriver(), searchAndVerifyCreateSupplier.supplierBrowser);
			captureScreenShotOnPass(getDriver(), testCaseName);
			park(3);
			getDriver().switchTo().alert().accept();
			//acceptAlertIfPresent(getDriver(), 5);
			park(10);
			click(getDriver(), searchAndVerifyCreateSupplier.supplierStatusCrossMark);
			dropDownByTextVisibility(getDriver(), searchAndVerifyCreateSupplier.supplierType,AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, supplierType, sheetName));
			sendKeys(getDriver(),searchAndVerifyCreateSupplier.supplierSearchKeyword, legalNameUpdate);
			click(getDriver(), searchAndVerifyCreateSupplier.supplierSearchButton);
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			//Assert.assertTrue(corporaterSearch(driver, elementFactory.getSearchSupplierResultGridSupplierId(), legalNameUpdate),"Search operation fails");
			park(3);
			waitForPageLoad(getDriver(), 15);
			//click(driver, elementFactory.getCreateSupplierExitButton());
			return true;
		} catch (Exception e) {
			LOG.debug("search and verify failed");
			return false;
		}
	}

	
	private boolean approvalWorkflowForCorporateSupplier(String testCaseName){
		try {
			click(getDriver(), approvalWorkflowForCorporateSupplier.approvalWorkflowTab);
			captureScreenShotOnPass(getDriver(), testCaseName);
			park(3);
			waitForPageLoad(getDriver(), 15);
			//waitForElementPresence(getDriver(), getWebElementFactory().approvalWorkflowForCorporateSupplier.approvalWorkflowSubmitForDiligence, 15);
			click(getDriver(), approvalWorkflowForCorporateSupplier.approvalWorkflowSubmitForDiligence);
			park(2);
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			click(getDriver(),approvalWorkflowForCorporateSupplier.approvalWorkflowSubmitToWorkflow);
			park(2);
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			click(getDriver(), approvalWorkflowForCorporateSupplier.approvalWorkflowApprovalFinal);
			park(2);
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			click(getDriver(), approvalWorkflowForCorporateSupplier.approvalWorkflowApproveChanges);
			park(2);
			waitForPageLoad(getDriver(), 15);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean contactInfoForCreateSupplier(String testCaseName,String testCaseNumber){
		try {
			Assert.assertTrue(contactInfoForCreateSupplier.contactInfoTab.isEnabled());
			click(getDriver(), contactInfoForCreateSupplier.contactInfoTab);
			park(2);
			captureScreenShotOnPass(getDriver(), testCaseName);
			waitForPageLoad(getDriver(), 15);
			Assert.assertTrue(contactInfoForCreateSupplier.AddAContact.isEnabled());
			click(getDriver(), contactInfoForCreateSupplier.AddAContact);
			waitForPageLoad(getDriver(), 15);
			switchToFrame(getDriver(), 0);
			park(2);
			Assert.assertTrue(contactInfoForCreateSupplier.AddAContactStatus.isDisplayed());
			dropDownByTextVisibility(getDriver(), contactInfoForCreateSupplier.AddAContactStatus, "Validated");
			park(2);
			Assert.assertTrue(contactInfoForCreateSupplier.lastNameD.isDisplayed());
			sendKeys(getDriver(), contactInfoForCreateSupplier.AddAContactLastName,REPOSITORY.getCellDataOnTestCase(testCaseNumber, lastName, DEFAULT_SHEET_NAME));
			Assert.assertTrue(contactInfoForCreateSupplier.firstNameD.isDisplayed());
			sendKeys(getDriver(), contactInfoForCreateSupplier.AddAContactFirstName,REPOSITORY.getCellDataOnTestCase(testCaseNumber, firstName, DEFAULT_SHEET_NAME));
			Assert.assertTrue(contactInfoForCreateSupplier.emailD.isDisplayed());
			sendKeys(getDriver(), contactInfoForCreateSupplier.AddAContactEmail,REPOSITORY.getCellDataOnTestCase(testCaseNumber, email, DEFAULT_SHEET_NAME));
			Assert.assertTrue(contactInfoForCreateSupplier.phoneNoD.isDisplayed());
			sendKeys(getDriver(), contactInfoForCreateSupplier.AddAContactPhoneNumber,	REPOSITORY.getCellDataOnTestCase(testCaseNumber, phone, DEFAULT_SHEET_NAME));
			captureScreenShotOnPass(getDriver(), testCaseName);
			park(1);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	private boolean mainInfoDeatilsOfCorporateSupplier(String testCaseName,String serialNo,String legalNameUpdate){
		try {
			click(getDriver(),MainInfoDeatilsOfCorporateSupplier.suppliersLink);
			
			Assert.assertTrue(MainInfoDeatilsOfCorporateSupplier.createSupplierLink.isEnabled());
			click(getDriver(), MainInfoDeatilsOfCorporateSupplier.createSupplierLink);
			
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			
			Assert.assertTrue(MainInfoDeatilsOfCorporateSupplier.supplierTypeD.isDisplayed());
			dropDownByTextVisibility(getDriver(), MainInfoDeatilsOfCorporateSupplier.supplierType, REPOSITORY.getCellDataOnTestCase(serialNo, supplierType, DEFAULT_SHEET_NAME));
			park(2);
			waitForPageLoad(getDriver(), 15);
			
			Assert.assertTrue(MainInfoDeatilsOfCorporateSupplier.legalNameD.isDisplayed());
			sendKeys(getDriver(),MainInfoDeatilsOfCorporateSupplier.legalName,legalNameUpdate);
			park(2);
			sendKeys(getDriver(),MainInfoDeatilsOfCorporateSupplier.doingBusinessAs,"Yes");	
			park(2);
			sendKeys(getDriver(),MainInfoDeatilsOfCorporateSupplier.phoneNumber,"1234567890");
			park(2);
			Assert.assertTrue(MainInfoDeatilsOfCorporateSupplier.optInD.isDisplayed());
			//create Corporate
			sendKeys(getDriver(),MainInfoDeatilsOfCorporateSupplier.addressNameAdditional,"Test Address");
			park(2);
			
			Assert.assertTrue(MainInfoDeatilsOfCorporateSupplier.addressLineD.isDisplayed());
			sendKeys(getDriver(),MainInfoDeatilsOfCorporateSupplier.addressLine1,REPOSITORY.getCellDataOnTestCase(serialNo, addressLine1, DEFAULT_SHEET_NAME));
			park(2);
			
			Assert.assertTrue(MainInfoDeatilsOfCorporateSupplier.cityD.isDisplayed());
			sendKeys(getDriver(),MainInfoDeatilsOfCorporateSupplier.addressCity,REPOSITORY.getCellDataOnTestCase(serialNo, city, DEFAULT_SHEET_NAME));
			park(2);
			
			Assert.assertTrue(MainInfoDeatilsOfCorporateSupplier.stateD.isDisplayed());
			CREATE_REALESTATE_BROKER.autoSuggestionHandle(MainInfoDeatilsOfCorporateSupplier.addressState, REPOSITORY.getCellDataOnTestCase(serialNo, state, DEFAULT_SHEET_NAME));
			park(2);
			
			Assert.assertTrue(MainInfoDeatilsOfCorporateSupplier.zipCodeD.isDisplayed());
			sendKeys(getDriver(),MainInfoDeatilsOfCorporateSupplier.addressZipCode,REPOSITORY.getCellDataOnTestCase(serialNo, zip, DEFAULT_SHEET_NAME));
			park(2);
			
			Assert.assertTrue(MainInfoDeatilsOfCorporateSupplier.countryD.isDisplayed());
			dropDownByTextVisibility(getDriver(), MainInfoDeatilsOfCorporateSupplier.addressCountry, REPOSITORY.getCellDataOnTestCase(serialNo, country, DEFAULT_SHEET_NAME));
			waitForPageLoad(getDriver(), 15);
			park(2);
			
			Assert.assertTrue(MainInfoDeatilsOfCorporateSupplier.supplierClassificationD.isDisplayed());
			dropDownByTextVisibility(getDriver(), MainInfoDeatilsOfCorporateSupplier.supplierClassification,REPOSITORY.getCellDataOnTestCase(serialNo, supplierClassification, DEFAULT_SHEET_NAME));
			park(2);
			Assert.assertTrue(MainInfoDeatilsOfCorporateSupplier.supplierClassificationD.isEnabled());
			webElementHighlighter(getDriver(), MainInfoDeatilsOfCorporateSupplier.saveButton);
			executeJS(getDriver(),FanniemaeConstants.JS_CLICK_SCRIPT, MainInfoDeatilsOfCorporateSupplier.saveButton);
			waitForPageLoad(getDriver(), 15);
			return true;
		} catch (Exception e) {
			throw new FannieMaeBusinessException(e.getMessage(),e);
		}
	}
	
	public boolean additionalInfoOfCorporateSupplier(String testCaseName,String testCaseNumber){
		try {
			//Additional info
			Assert.assertTrue(AdditionalInfoOfCorporateSupplier.additionalInfoTab.isDisplayed());
			click(getDriver(), AdditionalInfoOfCorporateSupplier.additionalInfoTab);
			captureScreenShotOnPass(getDriver(), testCaseName);
			
			Assert.assertTrue(AdditionalInfoOfCorporateSupplier.TinTypeD.isDisplayed());
			dropDownByTextVisibility(getDriver(), AdditionalInfoOfCorporateSupplier.TINType, REPOSITORY.getCellDataOnTestCase(testCaseNumber, tinType, DEFAULT_SHEET_NAME));
			
			Assert.assertTrue(AdditionalInfoOfCorporateSupplier.federalTaxIdD.isDisplayed());
			sendKeys(getDriver(),AdditionalInfoOfCorporateSupplier.FederalTaxID,REPOSITORY.getCellDataOnTestCase(testCaseNumber, federalTaxID, DEFAULT_SHEET_NAME));
			captureScreenShotOnPass(getDriver(), testCaseName);
			webElementHighlighter(getDriver(), AdditionalInfoOfCorporateSupplier.additionalInfoSaveButton);
			executeJS(getDriver(),FanniemaeConstants.JS_CLICK_SCRIPT, AdditionalInfoOfCorporateSupplier.additionalInfoSaveButton);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean bankInfoForCreateSupplier(String testCaseName,String testCaseNumber){
		try {
			//Banking Information
			Assert.assertTrue(BankInfoForCreateSupplier.bankInfoTab.isDisplayed());
			click(getDriver(), BankInfoForCreateSupplier.bankInfoTab);
			captureScreenShotOnPass(getDriver(), testCaseName);
			waitForPageLoad(getDriver(), 15);
			
			Assert.assertTrue(BankInfoForCreateSupplier.bankD.isDisplayed());
			clickOnThreeDotsAndSelectData(testCaseName,BankInfoForCreateSupplier.bankThreeDots, REPOSITORY.getCellDataOnTestCase(testCaseNumber,searchText, DEFAULT_SHEET_NAME));
			Assert.assertTrue(BankInfoForCreateSupplier.bankAccountD.isDisplayed());
			clickAndGetbankInfoDataFromFrame(BankInfoForCreateSupplier.BankInfoBankAccountDetails);
			Assert.assertTrue(BankInfoForCreateSupplier.bankPaymentD.isDisplayed());
			clickAndGetbankInfoDataFromFrame(BankInfoForCreateSupplier.BankInfoPaymentMethod);
			Assert.assertTrue(BankInfoForCreateSupplier.bankInfoAddBankingInfoClk.isEnabled());
			click(getDriver(),BankInfoForCreateSupplier.bankInfoAddBankingInfoClk);
			park(2);
			switchToFrame(getDriver(), 0);
			park(2); 
			Assert.assertTrue(BankInfoForCreateSupplier.bankNameD.isDisplayed());
			sendKeys(getDriver(),BankInfoForCreateSupplier.bankInfoBankName,	REPOSITORY.getCellDataOnTestCase(testCaseNumber, bankName, DEFAULT_SHEET_NAME));
			sendKeys(getDriver(),BankInfoForCreateSupplier.bankInfoBankCity,REPOSITORY.getCellDataOnTestCase(testCaseNumber, bankCity, DEFAULT_SHEET_NAME));
			sendKeys(getDriver(),BankInfoForCreateSupplier.bankInfoABANumber,REPOSITORY.getCellDataOnTestCase(testCaseNumber,abaRoutingNumber, DEFAULT_SHEET_NAME));
			sendKeys(getDriver(),BankInfoForCreateSupplier.bankInfoAccountNumber,REPOSITORY.getCellDataOnTestCase(testCaseNumber,accNumber, DEFAULT_SHEET_NAME));
			Assert.assertTrue(BankInfoForCreateSupplier.routingNoD.isDisplayed());
			Assert.assertTrue(BankInfoForCreateSupplier.accountNoD.isDisplayed());
			captureScreenShotOnPass(getDriver(), testCaseName);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
//	
//	public boolean paymentConfirmation(String testCaseName,String testCaseNumber){
//		try {
//			
//			park(4);
//			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationSupplierEmailAddressForACHPaymentConf(), "automation@test.com");
//			dropDownByTextVisibility(getDriver(), getWebElementFactory().getCreateSupplierBankingInformationPurchaseOrder(), "Purchase order cXML");
//			dropDownByTextVisibility(getDriver(), getWebElementFactory().getCreateSupplierBankingInformationPOFunctionalAcknowledgement(), "PO Ack. EDI 855");
//			dropDownByTextVisibility(getDriver(), getWebElementFactory().getCreateSupplierBankingInformationAdvanceShippingNotice(), "ASN EDI 856");
//			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationTestPartnerQualifier(), "22");
//			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationTestPartnerId(), "Test123");
//			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationTestAS2ReceiverId(), "Test123");
//			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationTestURL(), "https://www.fanniemae.com/portal/index.html");
//			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationTestCXMLPartnerDomain(), "www.fanniemae.com");
//			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationTestCDXMLPartnerIdentity(), "Test215");
//			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationTestCDXMLPartnerSharedSecret(), "No");
//			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationTestCDXMLReceiverUrl(), "https://www.fanniemae.com/portal/index.html ");
//			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationTestDomainFromCDXML(), "www.fanniemae.com");
//			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationTestIdentityFromCDXML(), "www.fanniemae.com");
//			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationTestCDXMLToDomain(), "www.fanniemae.com");
//			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationTestCDXMLToIdentity(), "www.fanniemae.com");
//			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationTestCDXMLSenderDomain(), "www.fanniemae.com");
//			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationTestCDXMLSenderIdentity(), "www.fanniemae.com");
//			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationTestCDXMLSenderSharedSecret(), "No");
//			
//			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationProdPartnerQualifier(), "22");
//			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationProdPartnerId(), "Test123");
//			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationProdAS2ReceiverId(), "Test123");
//			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationProdURL(), "https://www.fanniemae.com/portal/index.html");
//			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationProdCXMLPartnerDomain(), "www.fanniemae.com");
//			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationProdCDXMLPartnerIdentity(), "Test215");
//			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationProdCDXMLPartnerSharedSecret(), "No");
//			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationProdCDXMLReceiverUrl(), "https://www.fanniemae.com/portal/index.html");
//			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationProdDomainFromCDXML(), "www.fanniemae.com");
//			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationProdIdentityFromCDXML(), "www.fanniemae.com");
//			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationProdCDXMLToDomain(), "www.fanniemae.com");
//			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationProdCDXMLToIdentity(), "www.fanniemae.com");
//			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationProdCDXMLSenderDomain(), "www.fanniemae.com");
//			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationProdCDXMLSenderIdentity(), "www.fanniemae.com");
//			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankingInformationProdCDXMLSenderSharedSecret(), "No");
//			captureScreenShotOnPass(getDriver(), testCaseName);
//			webElementHighlighter(getDriver(), getWebElementFactory().getCreateSupplierSaveButton());
//			executeJS(getDriver(),FanniemaeConstants.JS_CLICK_SCRIPT, getWebElementFactory().getCreateSupplierSaveButton());
//			
//			return true;
//		} catch (Exception e) {
//			return false;
//		}
//	}
	public boolean clickAndGetbankInfoDataFromFrame(WebElement button){
		try {
			click(getDriver(), button);
			park(2);
			switchToFrame(getDriver(), 0);
			park(2);
			webElementHighlighter(getDriver(), BankInfoForCreateSupplier.bankInfoClickOnResult);
			park(2);
			executeJS(getDriver(),FanniemaeConstants.JS_CLICK_SCRIPT, BankInfoForCreateSupplier.bankInfoClickOnResult);
			switchToDefaultContentFrame(getDriver());
			return true;
		} catch (Exception e) {
			return false;
		}
	}
//	
//	public boolean afterClickOnSaveHandleAlerts(WebElement saveButton){
//		try {
//			webElementHighlighter(getDriver(), saveButton);
//			executeJS(getDriver(), FanniemaeConstants.JS_CLICK_SCRIPT, saveButton);
//			acceptAlertIfPresent(getDriver(), 5);
//			park(4);
//			acceptAlertIfPresent(getDriver(), 5);
//			return true;
//		} catch (Exception e) {
//			LOG.info("Two alerts not presents");
//			return false;
//		}
//	}
//	
	public boolean clickOnThreeDotsAndSelectData(String testCaseName,WebElement button,String searchText){
		try {
			click(getDriver(),button);
			park(2);
			switchToFrame(getDriver(), 0);
			park(2);
			captureScreenShotOnPass(getDriver(), testCaseName);
			sendKeys(getDriver(),BankInfoForCreateSupplier.bankInfoSearchBox,searchText);
			click(getDriver(),BankInfoForCreateSupplier.bankInfoSearchBtn);
			park(2);
			click(getDriver(),BankInfoForCreateSupplier.bankInfoClickOnResult);
			switchToDefaultContentFrame(getDriver());
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public boolean contactInfoForCreateSupplier2(String testCaseName,String testCaseNumber,String name,String lastname,String email){
		try {
			Assert.assertTrue(contactInfoForCreateSupplier2.contactInfoTab.isEnabled());
			click(getDriver(), contactInfoForCreateSupplier2.contactInfoTab);
			park(2);
			captureScreenShotOnPass(getDriver(), testCaseName);
			waitForPageLoad(getDriver(), 15);
			Assert.assertTrue(contactInfoForCreateSupplier2.addAContact.isEnabled());
			click(getDriver(), contactInfoForCreateSupplier2.addAContact);
			park(2);
			waitForPageLoad(getDriver(), 15);
			switchToFrame(getDriver(), 0);
			park(2);
//			Assert.assertEquals(com.fanniemae.automation.RealEstateBrokerElements.model.contactInfoForCreateSupplier2.contactManagementStatus.getText(), "Validated");
			dropDownByTextVisibility(getDriver(), com.fanniemae.automation.RealEstateBrokerElements.model.contactInfoForCreateSupplier2.contactManagementStatus, "Validated");
			Assert.assertTrue(contactInfoForCreateSupplier.lastNameD.isDisplayed());
			sendKeys(getDriver(), contactInfoForCreateSupplier2.contactInfoLastName,name);
			Assert.assertTrue(contactInfoForCreateSupplier.firstNameD.isDisplayed());
			sendKeys(getDriver(), contactInfoForCreateSupplier2.contactInfoFirstName,lastname);
			Assert.assertTrue(contactInfoForCreateSupplier.emailD.isDisplayed());
			sendKeys(getDriver(), contactInfoForCreateSupplier2.contactInfoEmail,email);
			Assert.assertTrue(contactInfoForCreateSupplier.phoneNoD.isDisplayed());
			sendKeys(getDriver(), contactInfoForCreateSupplier2.contactInfoPhone,	REPOSITORY.getCellDataOnTestCase(testCaseNumber, phone, DEFAULT_SHEET_NAME));
			captureScreenShotOnPass(getDriver(), testCaseName);
			park(1);
			webElementHighlighter(getDriver(), SupplierContactManagement.saveButton);
			Assert.assertTrue(SupplierContactManagement.saveButton.isEnabled());
			executeJS(getDriver(),FanniemaeConstants.JS_CLICK_SCRIPT, SupplierContactManagement.saveButton);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}