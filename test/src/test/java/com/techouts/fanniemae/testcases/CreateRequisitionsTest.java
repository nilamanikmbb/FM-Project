package com.techouts.fanniemae.testcases;

import static com.techouts.fanniemae.webelement.ops.WebElementOperations.dropDownByTextVisibility;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.park;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.waitForPageLoad;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.fanniemae.automation.CreateRequisitionElements.model.CommodityApprovalforSubmittedRequest;
import com.fanniemae.automation.CreateRequisitionElements.model.CreateRequisitionElements;
import com.fanniemae.automation.CreateRequisitionElements.model.CreateSpecialRequestsRequisitions;
import com.fanniemae.automation.ElementsFactory.model.ElementsFactory;
import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.test.AbstractTest;
import com.fanniemae.automation.test.page.actions.CreateRequisitionAction;
import com.fanniemae.automation.test.page.actions.HomePageActions;
import com.fanniemae.automation.util.Assert;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;

public class CreateRequisitionsTest extends AbstractTest {

	private static final Logger LOG = Logger.getLogger(CreateRequisitionsTest.class.getName());

	private String sheetname = FanniemaeConstants.SHEET_NAME;
	private String requester = null;
	private String basketNo = null;

	private int userName = FanniemaeConstants.G;
	private int password = FanniemaeConstants.H;
	private int landingPageTitle = FanniemaeConstants.K;
	private int userNameCommodity = FanniemaeConstants.T;
	private int passwordCommodity = FanniemaeConstants.U;
	private int corporateHomePageTitle = FanniemaeConstants.V;
	private int status = FanniemaeConstants.I;
	protected static CreateRequisitionAction CREATE_REQUISITION ;
	
	
	static {
		CreateRequisitionElements cR=new CreateRequisitionElements();
		cR.init(DRIVER);
		ElementsFactory elementFactory = new ElementsFactory();
		elementFactory.init(DRIVER);
		CREATE_REQUISITION  = new CreateRequisitionAction(cR, DRIVER);
		HOMEPAGE_ACTIONS = new HomePageActions(elementFactory, DRIVER);
	} 
	
	@Test(priority = 1) 
	public void createSpecialRequestsRequisitions(){
		String testCaseName = "CreateSpecialRequestsRequisitions";
		String serialNo = "1";
	  try {
		  getFannieMaePage();
		  Assert.assertTrue(WebElementOperations.verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(serialNo,landingPageTitle, DEFAULT_SHEET_NAME))); 
		  WebElementOperations.captureScreenShotOnPass(getDriver(), testCaseName);
		 // WebElementOperations.sendKeys(getDriver(), Login.usernameProcureOne, REPOSITORY.getCellDataOnTestCase(serialNo, userName, DEFAULT_SHEET_NAME));
		  HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(serialNo, userName, DEFAULT_SHEET_NAME),REPOSITORY.getCellDataOnTestCase(serialNo, password, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, FanniemaeConstants.L, DEFAULT_SHEET_NAME)); 
		  WebElementOperations.captureScreenShotOnPass(getDriver(), testCaseName);
		  String[] data = CREATE_REQUISITION.createRequisition(testCaseName, serialNo,DEFAULT_SHEET_NAME); 
		  if(data.length > 1){
			  basketNo = data[0]; 
			  requester=data[1]; 
		  } else{
			  LOG.error("BasketNo or requester name miss"); 
		  }
		  Assert.assertTrue(CREATE_REQUISITION.addItemDetails(testCaseName, serialNo, requester,DEFAULT_SHEET_NAME),"Fails to add item details");
		  Assert.assertTrue(CREATE_REQUISITION.costAllocationAndCommentUpdate(testCaseName,serialNo,DEFAULT_SHEET_NAME),"Fails to colst Allocation");
		  
		  Assert.assertTrue(CreateSpecialRequestsRequisitions.term.isDisplayed());
		  
		  WebElementOperations.click(getDriver(),CreateSpecialRequestsRequisitions.workflow);
		  
		  Assert.assertTrue(CreateSpecialRequestsRequisitions.otherActions.isDisplayed());
		  Assert.assertTrue(CreateSpecialRequestsRequisitions.resetAllocation.isDisplayed());
		  Assert.assertTrue(CreateSpecialRequestsRequisitions.backToCatalog.isDisplayed());
		  Assert.assertTrue(CreateSpecialRequestsRequisitions.submitForApproval.isEnabled());
		  
		  WebElementOperations.executeJS(getDriver(), FanniemaeConstants.JS_CLICK_SCRIPT, CreateSpecialRequestsRequisitions.submitForApproval);
		  WebElementOperations.acceptAlert(getDriver());
		  WebElementOperations.captureScreenShotOnPass(getDriver(), testCaseName);
		  WebElementOperations.click(getDriver(), CreateSpecialRequestsRequisitions.saveButtonMark);
		  WebElementOperations.click(getDriver(), CreateSpecialRequestsRequisitions.workflow);
		  HOMEPAGE_ACTIONS.logout(testCaseName);
		  LOG.info("Basket Number:"+basketNo);
		  addPassedTestCaseResult(testCaseName);
	  } catch (Exception e) {
		  performPostExceptionProcess(testCaseName, serialNo, "Failed to Create Requisitions", e, sheetname);
	  } 
  }

	@Test(priority = 2) 
	public void commodityApprovalforSubmittedRequest(){
	  String testCaseName = "CommodityApprovalforSubmittedRequest";
	  String serialNo = "2"; 
	  try {
		  if(basketNo==null)
		  {
			  Assert.assertTrue(false,"Fails to Create Requistion successfully, Sorry! skipping the approval flow"); 
		  }
		  Assert.assertTrue(WebElementOperations.verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(serialNo,landingPageTitle, DEFAULT_SHEET_NAME))); 
		  WebElementOperations.captureScreenShotOnPass(getDriver(), testCaseName);
		  HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(serialNo, userNameCommodity, DEFAULT_SHEET_NAME),  REPOSITORY.getCellDataOnTestCase(serialNo, passwordCommodity, DEFAULT_SHEET_NAME),REPOSITORY.getCellDataOnTestCase(serialNo, corporateHomePageTitle, DEFAULT_SHEET_NAME));
		  WebElementOperations.captureScreenShotOnPass(getDriver(), testCaseName);
		  WebElementOperations.click(getDriver(), CommodityApprovalforSubmittedRequest.loginMenu);
		  Assert.assertTrue(CommodityApprovalforSubmittedRequest.myOpenWorkflowTasks.isEnabled());
		  WebElementOperations.click(getDriver(), CommodityApprovalforSubmittedRequest.myOpenWorkflowTasks);
		  waitForPageLoad(getDriver(),15);
		  WebElementOperations.captureScreenShotOnPass(getDriver(), testCaseName);
		  park(2);
		  waitForPageLoad(getDriver(),15);
		  Assert.assertTrue(CommodityApprovalforSubmittedRequest.status.isDisplayed());
		  dropDownByTextVisibility(getDriver(), CommodityApprovalforSubmittedRequest.status,REPOSITORY.getCellDataOnTestCase(serialNo,status, DEFAULT_SHEET_NAME));
		  park(2);
		  waitForPageLoad(getDriver(),15);
		  WebElementOperations.click(getDriver(), CommodityApprovalforSubmittedRequest.statusButton);
		  park(2);
		  waitForPageLoad(getDriver(),15);
		 // WebElementOperations.validateGivenDataFromTable(getDriver(), getWebElementFactory().commodityApprovalforSubmittedRequest.allLables, basketNo);
//		  park(2);
//		  waitForPageLoad(getDriver(),15);
//		  WebElementOperations.click(getDriver(), CommodityApprovalforSubmittedRequest.workflow);
//		  park(2);
//		  waitForPageLoad(getDriver(),15);
//		  WebElementOperations.click(getDriver(), CommodityApprovalforSubmittedRequest.approveButton);
//		  park(2);
//		  waitForPageLoad(getDriver(),15);
//		  WebElementOperations.click(getDriver(), CommodityApprovalforSubmittedRequest.saveButtonMarkC);
//		  park(2);
//		  waitForPageLoad(getDriver(),15);
//		  WebElementOperations.click(getDriver(), CommodityApprovalforSubmittedRequest.workflow);
//		  park(2);
//		  waitForPageLoad(getDriver(),15);
		  HOMEPAGE_ACTIONS.logout(testCaseName);
		  waitForPageLoad(getDriver(),15);
		  addPassedTestCaseResult(testCaseName);
	  } catch(Exception e) {
		  performPostExceptionProcess(testCaseName, serialNo, "Failed to commodityApprovalforSubmittedRequest", e, sheetname);
		}
	}
	
}