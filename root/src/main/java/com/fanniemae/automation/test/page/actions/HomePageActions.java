package com.fanniemae.automation.test.page.actions;


import static com.techouts.fanniemae.webelement.ops.WebElementOperations.captureScreenShotOnPass;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.click;

//import static com.techouts.fanniemae.webelement.ops.WebElementOperations.dropDownByTextVisibility;
//import static com.techouts.fanniemae.webelement.ops.WebElementOperations.enterByRobot;
//import static com.techouts.fanniemae.webelement.ops.WebElementOperations.getAttributeValue;
//import static com.techouts.fanniemae.webelement.ops.WebElementOperations.getText;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.park;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.sendKeys;
//import static com.techouts.fanniemae.webelement.ops.WebElementOperations.switchToDefaultContentFrame;
//import static com.techouts.fanniemae.webelement.ops.WebElementOperations.switchToFrame;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.verifyPageTitle;
//import static com.techouts.fanniemae.webelement.ops.WebElementOperations.waitForElementClickable;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.waitForPageLoad;


//import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;


import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;

//import com.fanniemae.automation.CreateRequisitionElements.model.AddItemDetails;
//import com.fanniemae.automation.CreateRequisitionElements.model.CostAllocationAndCommentUpdate;
//import com.fanniemae.automation.CreateRequisitionElements.model.CreateRequisition;
//import com.fanniemae.automation.CreateRequisitionElements.model.CreateRequisitionElements;
//import com.fanniemae.automation.ElementsFactory.model.BankInfoForCreateSupplier;
import com.fanniemae.automation.ElementsFactory.model.ElementsFactory;
import com.fanniemae.automation.ElementsFactory.model.Login;
import com.fanniemae.automation.ElementsFactory.model.Logout;
//import com.fanniemae.automation.ElementsFactory.model.searchAndVerifyCreateSupplier;
//import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.SupplierRegistrationElements.model.SupplierRegistrationElements;
//import com.fanniemae.automation.test.AbstractTest;
import com.fanniemae.automation.util.Assert;
import com.fanniemae.automation.util.PathProvider;
import com.techouts.fanniemae.exceptions.FannieMaeBusinessException;




/**
 * 
 * @author TO-WVLD-12
 *
 */
public class HomePageActions {
	
	private static final Logger LOG = Logger.getLogger(HomePageActions.class.getName());
	public static final String ADD_FILES_EXE = PathProvider.getForTestData()+"/AddFiles.exe";
	private ElementsFactory elementFactory;
//	private SupplierRegistrationElements SRE;
	private WebDriver driver = null;
	
//	public HomePageActions(SupplierRegistrationElements SRE, ElementsFactory elementFactory, WebDriver driver) {
//		super();
//		this.elementFactory = elementFactory;
//		this.SRE = SRE;
//		this.driver = driver;
//	}
	
	public HomePageActions(ElementsFactory elementFactory, WebDriver driver) {
		super();
		this.elementFactory = elementFactory;
		this.driver = driver;
	}
//	private static int pRWatchers = FanniemaeConstants.C;
//	private static int itemDescription = FanniemaeConstants.M;
//	private static int itemPrice = FanniemaeConstants.N;
//	private static int itemQuantity = FanniemaeConstants.O;
//	private static int gLAccount = FanniemaeConstants.P;
//	private static int costCentre = FanniemaeConstants.Q;
//	private static int requisitionName = FanniemaeConstants.R;
//	private static int justification = FanniemaeConstants.S;
//	private static int unitOfMeasure = FanniemaeConstants.W;
//	private static int peopleSoftProjectID = FanniemaeConstants.AC;
//	private static int supplierType = FanniemaeConstants.AD;
//	private static int contractTitle =FanniemaeConstants.AZ;
//	private static int contractType =FanniemaeConstants.BA;
//	private static int supplier=FanniemaeConstants.BC;
//	private static int costcenter=FanniemaeConstants.BD;
//	private static int pepolesoftproject=FanniemaeConstants.BE;
//	private static int primaryCategory=FanniemaeConstants.BF;
//	private static int productsServicesDescription=FanniemaeConstants.BG;
//	private static int contractStatusIndicator=FanniemaeConstants.BI;
//	private static int statusUpdateNextSteps=FanniemaeConstants.BJ;
//	private static int thirdPartyData=FanniemaeConstants.BO;
//	private static int transactionLegalSME=FanniemaeConstants.BP;
//	private static int chargedtheloan=FanniemaeConstants.BQ;
//	private static int legal=FanniemaeConstants.BR;
//	private static int createdfromPR=FanniemaeConstants.BS;
//	private static int getBudgetBUApprovalProvidedinFieldglass=FanniemaeConstants.BU;
	
	
	public boolean login(String username,String password,String pageTitle){
		try {
			
			sendKeys(driver,Login.usernameProcureOne, username);
			park(0.5);
			
			sendKeys(driver, Login.passwordProcureOne, password);
			park(0.5);
			click(driver, Login.loginProcureOne);
			waitForPageLoad(driver,15);
			Assert.assertTrue(verifyPageTitle(driver, pageTitle),"Page title is not matched with expected title.");
			return true;
		} catch (Exception e) {
			LOG.error("Login failed");
			return false;
		}
	}
	
	public boolean logout(String testCaseName){
		try {
			click(driver, Logout.loginMenu);
			park(2);
			captureScreenShotOnPass(driver, testCaseName);
			click(driver, Logout.logOutButton);
			park(2);
			waitForPageLoad(driver, 15);
			captureScreenShotOnPass(driver, testCaseName);
			return true;
		} catch (Exception e) {
			throw new FannieMaeBusinessException("unable to perform logout operation in TestCase["+testCaseName+"].");
		}
	}
	
//	public void autoSuggestionHandle(WebElement inputBox, String inputText ){
//		try {
//			sendKeys(driver, inputBox,inputText);
//			park(2);
//			enterByRobot();
//			//click(driver, elementFactory.getCostCentreList());
//		} catch (Exception e) {
//			LOG.error("Failed to select a value from AutoFill suggestion");
//		}
//	}
//	
//	public String[] createRequisition(String method,String serialNo, String sheetName){
//		try {
//			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
//			park(2);
//			click(driver, CreateRequisition.procurement);
//			click(driver, CreateRequisition.createRequisition);
//			captureScreenShotOnPass(driver, method);
//			park(2);
//			waitForPageLoad(driver, 15);
//			sendKeys(driver, CreateRequisition.requisitionName, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo,requisitionName, sheetName));
//			String requester = getAttributeValue(driver, CreateRequisition.headerInformationRequester);
//			park(2);
//			sendKeys(driver, CreateRequisition.headerInformationPRWatchers,  AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo,pRWatchers, sheetName));
//			park(2);
//			sendKeys(driver,CreateRequisition.justification, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo,justification, sheetName));
//			//park(5);
//			waitForElementClickable(driver, 10, CreateRequisition.costCentreList);
//			click(driver,CreateRequisition.costCentreList);
//			click(driver, CreateRequisition.clickDragToAddFiles);
//			captureScreenShotOnPass(driver, method);
//			park(2);
//			Runtime.getRuntime().exec(ADD_FILES_EXE);
//			park(4);
//			click(driver, CreateRequisition.saveButton);
//			park(2);
//			return new String[]{getText(driver, CreateRequisition.basketNo) , requester};	
//		} catch (Exception e) {
//			LOG.error("Failed to create Requisition ",e);
//			return new String[] {null};
//		}
//	}
	
	
	
	//extrakkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk
//	public String[] approveRequisition(String method,String serialNo, String sheetName,List<WebElement> elements,String exptected) {
//		String testCaseName="CommodityApprovalforSubmittedRequest";
//		try {
//			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
//			park(2);
//			click(driver, elementFactory.getLoginMenu());
//			click(driver, elementFactory.getMyOpenWorkflowTasks());
//			captureScreenShotOnPass(driver, method);
//			park(2);
//			waitForPageLoad(driver, 15);
//			String requester = getAttributeValue(driver, elementFactory.getLeaderName());
//			try {
//			String data;
//			int i=2;
//				for (WebElement el : elements) {
//					data=el.getText();
//					data=data.substring(3, 7);
//					if(exptected.contains(data)){
//						Thread.sleep(2000);
//						//kkkkkkkkkkkkkkkkkkkkkkkk
//						//WebElementOperations.webElementHighlighter(driver, driver.findElement(By.xpath("//table[@class='PowerGridClass']/tbody/tr["+i+"]/td[1]/a")));
//						//kkkkkkkkkkkkkkkkkkkkkkkkkkk
//						WebElement link=driver.findElement(By.xpath("//table[@class='PowerGridClass']/tbody/tr["+i+"]/td[1]/a"));
//						link.click();
//					}
//					Thread.sleep(500);
//					i++;
//				}
//			}catch(Exception e){
//				LOG.error("error occur at table data validataion");
//			}
//			park(3);
//			waitForPageLoad(driver,15);
//			captureScreenShotOnPass(driver, testCaseName);
//			click(driver, elementFactory.getWorkflow());
//			park(2);
//			captureScreenShotOnPass(driver, testCaseName);
//			click(driver, elementFactory.getApproveButton());
//			park(2);
//			captureScreenShotOnPass(driver, testCaseName);
//			click(driver, elementFactory.getSaveButton());
//			park(2);
//			captureScreenShotOnPass(driver, testCaseName);
//			return new String[]{getText(driver, elementFactory.getLeaderName()) , requester};	
//		} catch (Exception e) {
//			LOG.error("Failed to create Requisition ",e);
//			return new String[] {null};
//		
//	}	
//	}
	//extra kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk
	
	
	
	
//	public boolean addItemDetails(String method,String serialNo,String requester, String sheetName){
//		try {
//			park(2);
//			click(driver, AddItemDetails.addItem);
//			park(2);
//			captureScreenShotOnPass(driver, method);
//			switchToFrame(driver, 0);
//			sendKeys(driver,AddItemDetails.itemDescription, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, itemDescription, sheetName));
//			park(2);
//			sendKeys(driver, AddItemDetails.itemPrice, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, itemPrice, sheetName));
//			park(2);
//			sendKeys(driver, AddItemDetails.itemQuantity, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, itemQuantity, sheetName));
//			park(2);
//			dropDownByTextVisibility(driver, AddItemDetails.unitOfMeasure, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, unitOfMeasure, sheetName));
//			park(2);
//			click(driver, AddItemDetails.categoryButton);
//			park(2);
//			captureScreenShotOnPass(driver, method);
//			switchToDefaultContentFrame(driver);
//			switchToFrame(driver, 1);
//			click(driver, AddItemDetails.labelIcon);
//			park(2);
//			switchToDefaultContentFrame(driver);
//			switchToFrame(driver, 0);
//			park(2);
//			captureScreenShotOnPass(driver, method);
//			return true;
//		} catch (Exception e) {
//			LOG.info("Fails to add item details");
//			return false;
//		}
//	}
//	
//	public boolean costAllocationAndCommentUpdate(String method,String serialNo, String sheetName){
//		try {
//			click(driver, CostAllocationAndCommentUpdate.labelSaveButton);
//			park(3);
//			waitForPageLoad(driver,10);
//			switchToDefaultContentFrame(driver);
//			switchToFrame(driver, 0);
//			captureScreenShotOnPass(driver, method);
//			click(driver, CostAllocationAndCommentUpdate.glAccountButton);
//			switchToDefaultContentFrame(driver);
//			switchToFrame(driver, 1);
//			captureScreenShotOnPass(driver, method);
//			sendKeys(driver, CostAllocationAndCommentUpdate.accountSelectionKeyWords, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, gLAccount, sheetName));
//			click(driver, CostAllocationAndCommentUpdate.accountSelectionSearch);
//			park(2);
//			captureScreenShotOnPass(driver, method);
//			click(driver, CostAllocationAndCommentUpdate.accountSelectionLabelIcon);
//			switchToDefaultContentFrame(driver);
//			switchToFrame(driver, 0);
//			park(2);
//			sendKeys(driver, CostAllocationAndCommentUpdate.costCenter, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, costCentre, sheetName));
//			//park(4);
//			waitForElementClickable(driver, 15, CostAllocationAndCommentUpdate.costCentreList);
//			click(driver, CostAllocationAndCommentUpdate.costCentreList);
//			waitForPageLoad(driver,10);
//			park(4);
//			sendKeys(driver, CostAllocationAndCommentUpdate.peopleSoftProjectID, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, peopleSoftProjectID, sheetName));
//			//park(4);
//			waitForElementClickable(driver, 15, CostAllocationAndCommentUpdate.costCentreList);
//			click(driver, CostAllocationAndCommentUpdate.costCentreList);
//			waitForPageLoad(driver,10);
//			captureScreenShotOnPass(driver, method);
//			park(4);
//			click(driver, CostAllocationAndCommentUpdate.saveandCloseButton);
//			park(4);
//			waitForPageLoad(driver,10);
//			captureScreenShotOnPass(driver, method);
//			switchToDefaultContentFrame(driver);
//			return true;
//		} catch (Exception e) {
//			LOG.error("Fails to add comment or Cost Allocation");
//			return false;
//		}
//	}
	
//	public boolean datePickerWithAllOptions() {
//		click(driver, elementFactory.getDatePickerOneDayBtn());
//		park(0.5);
//		click(driver, elementFactory.getDatePickerTodayBtn());
//		park(1);
//		click(driver, elementFactory.getDatePickerCrossMark());
//		return true;
//	}
	

	
//	public boolean searchAndVerifyCreatedOne(String testCaseName,String testCaseNumber,String legalNameUpdate, String sheetName){
//		try {
//			park(3);
//			waitForPageLoad(driver, 15);
//			click(driver, searchAndVerifyCreateSupplier.supplierLink);
//			park(0.5);
//			click(driver, searchAndVerifyCreateSupplier.supplierBrowser);
//			captureScreenShotOnPass(driver, testCaseName);
//			park(3);
//			waitForPageLoad(driver, 15);
//			driver.switchTo().alert().accept();
//			park(10);
//			click(driver, searchAndVerifyCreateSupplier.supplierStatusCrossMark);
//			dropDownByTextVisibility(driver, searchAndVerifyCreateSupplier.supplierType,AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, supplierType, sheetName));
//			sendKeys(driver,searchAndVerifyCreateSupplier.supplierSearchKeyword, legalNameUpdate);
//			click(driver, searchAndVerifyCreateSupplier.supplierSearchButton);
//			waitForPageLoad(driver, 15);
//			captureScreenShotOnPass(driver, testCaseName);
//			//Assert.assertTrue(corporaterSearch(driver, elementFactory.getSearchSupplierResultGridSupplierId(), legalNameUpdate),"Search operation fails");
//			park(3);
//			waitForPageLoad(driver, 15);
//			//click(driver, elementFactory.getCreateSupplierExitButton());
//			return true;
//		} catch (Exception e) {
//			LOG.debug("search and verify failed");
//			return false;
//		}
//	}
//	
//	public boolean createMasterServicesAgreement(String testCaseName,String testCaseNumber, String DEFAULT_SHEET_NAME){
//		try {
//			park(2);
//			click(driver, elementFactory.createMasterServicesAgreement.contracts);
//			click(driver, elementFactory.createMasterServicesAgreement.createcontract);
//			waitForPageLoad(driver,15);
//			captureScreenShotOnPass(driver, testCaseName);
//			click(driver, elementFactory.createMasterServicesAgreement.cspviolation);
//			captureScreenShotOnPass(driver, testCaseName);
//			/////
//			park(3);
//			////
//			sendKeys(driver, elementFactory.createMasterServicesAgreement.contractTitle, AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, contractTitle, DEFAULT_SHEET_NAME));
//			dropDownByTextVisibility(driver, elementFactory.createMasterServicesAgreement.contractType,AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, contractType, DEFAULT_SHEET_NAME));
//			park(5);
//			sendKeys(driver, elementFactory.createMasterServicesAgreement.supplier, AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, supplier, DEFAULT_SHEET_NAME));
//			park(2);
//			enterByRobot();
//			park(3);
//			waitForPageLoad(driver,15);
//			sendKeys(driver, elementFactory.createMasterServicesAgreement.costcenter, AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, costcenter, DEFAULT_SHEET_NAME));
//			park(2);
//			enterByRobot();
//			park(3);
//			waitForPageLoad(driver,15);
//			sendKeys(driver, elementFactory.createMasterServicesAgreement.pepolesoftproject, AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, pepolesoftproject, DEFAULT_SHEET_NAME));
//			park(2);
//			enterByRobot();
//			park(3);
//			waitForPageLoad(driver,15);
//			click(driver, elementFactory.createMasterServicesAgreement.fileattach);
//			captureScreenShotOnPass(driver, testCaseName);
//			Runtime.getRuntime().exec(ADD_FILES_EXE);
//			park(2);
//			sendKeys(driver, elementFactory.createMasterServicesAgreement.primaryCategory, AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, primaryCategory, DEFAULT_SHEET_NAME));
//			park(2);
//			enterByRobot();
//			park(3);
//			waitForPageLoad(driver,15);
//			sendKeys(driver, elementFactory.createMasterServicesAgreement.productsServicesDescription, AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, productsServicesDescription, DEFAULT_SHEET_NAME));			
//			dropDownByTextVisibility(driver, elementFactory.createMasterServicesAgreement.contractStatusIndicator,AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, contractStatusIndicator, DEFAULT_SHEET_NAME));
//			sendKeys(driver, elementFactory.createMasterServicesAgreement.statusUpdateNextSteps, AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, statusUpdateNextSteps, DEFAULT_SHEET_NAME));		
//			//Approvals
//			park(1);
//			dropDownByTextVisibility(driver, elementFactory.createMasterServicesAgreement.thirdPartyData,AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, thirdPartyData, DEFAULT_SHEET_NAME));
//			park(1);
//			dropDownByTextVisibility(driver, elementFactory.createMasterServicesAgreement.transactionLegalSME,AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, transactionLegalSME, DEFAULT_SHEET_NAME));
//			park(1);
//			dropDownByTextVisibility(driver, elementFactory.createMasterServicesAgreement.chargedtheloan,AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, chargedtheloan, DEFAULT_SHEET_NAME));
//			park(4);
//			dropDownByTextVisibility(driver, elementFactory.createMasterServicesAgreement.legal,AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, legal, DEFAULT_SHEET_NAME));
//			park(2);
//			dropDownByTextVisibility(driver, elementFactory.createMasterServicesAgreement.createdfromPR,AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, createdfromPR, DEFAULT_SHEET_NAME));		
//			park(3);
//			dropDownByTextVisibility(driver, elementFactory.createMasterServicesAgreement.budgetBUApprovalProvidedinFieldglass,AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, getBudgetBUApprovalProvidedinFieldglass, DEFAULT_SHEET_NAME));			
//			park(5);
//			return true;
//		} catch (Exception e) {
//			LOG.error("Failed to createMasterServicesAgreement ",e);
//			return false;
//		}
//		
//	}
//	
//	public boolean clickOnThreeDotsAndSelectData(String testCaseName,WebElement button,String searchText){
//		try {
//			click(driver,button);
//			switchToFrame(driver, 0);
//			captureScreenShotOnPass(driver, testCaseName);
//			park(2);
//			sendKeys(driver,BankInfoForCreateSupplier.bankInfoSearchBox,searchText);
//			park(2);
//			click(driver,BankInfoForCreateSupplier.bankInfoSearchBtn);
//			park(3);
//			click(driver,BankInfoForCreateSupplier.bankInfoClickOnResult);
//			switchToDefaultContentFrame(driver);
//			return true;
//		} catch (Exception e) {
//			return false;
//		}
//	}
	}