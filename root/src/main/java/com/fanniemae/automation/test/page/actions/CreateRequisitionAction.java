package com.fanniemae.automation.test.page.actions;

import static com.techouts.fanniemae.webelement.ops.WebElementOperations.captureScreenShotOnPass;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.click;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.dropDownByTextVisibility;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.getAttributeValue;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.getText;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.park;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.sendKeys;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.switchToDefaultContentFrame;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.switchToFrame;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.waitForElementClickable;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.waitForPageLoad;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.fanniemae.automation.CreateRequisitionElements.model.AddItemDetails;
import com.fanniemae.automation.CreateRequisitionElements.model.CostAllocationAndCommentUpdate;
import com.fanniemae.automation.CreateRequisitionElements.model.CreateRequisition;
import com.fanniemae.automation.CreateRequisitionElements.model.CreateRequisitionElements;
import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.test.AbstractTest;
import com.fanniemae.automation.util.Assert;
import com.fanniemae.automation.util.PathProvider;

public class CreateRequisitionAction {
	private static final Logger LOG = Logger.getLogger(CreateRequisitionAction.class.getName());
	public static final String ADD_FILES_EXE = PathProvider.getForTestData()+"/AddFiles.exe";
	private CreateRequisitionElements cR;
	private WebDriver driver = null;
	
	public CreateRequisitionAction(CreateRequisitionElements cR, WebDriver driver) {
		super();
		this.cR = cR;
		this.driver = driver;
	}
	
	private static int pRWatchers = FanniemaeConstants.C;
	private static int itemDescription = FanniemaeConstants.M;
	private static int itemPrice = FanniemaeConstants.N;
	private static int itemQuantity = FanniemaeConstants.O;
	private static int gLAccount = FanniemaeConstants.P;
	private static int costCentre = FanniemaeConstants.Q;
	private static int requisitionName = FanniemaeConstants.R;
	private static int justification = FanniemaeConstants.S;
	private static int unitOfMeasure = FanniemaeConstants.W;
	private static int peopleSoftProjectID = FanniemaeConstants.AC;
	
	
	public String[] createRequisition(String method,String serialNo, String sheetName){
		try {
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
			park(2);
			click(driver, CreateRequisition.procurement);
			
			Assert.assertTrue(CreateRequisition.createRequisition.isEnabled());
			
			click(driver, CreateRequisition.createRequisition);
			captureScreenShotOnPass(driver, method);
			park(2);
			waitForPageLoad(driver, 15);
			sendKeys(driver, CreateRequisition.requisitionName, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo,requisitionName, sheetName));
			
			Assert.assertTrue(CreateRequisition.headerInformationRequester.isDisplayed());
			
			String requester = getAttributeValue(driver, CreateRequisition.headerInformationRequester);
			park(2);
			sendKeys(driver, CreateRequisition.headerInformationPRWatchers,  AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo,pRWatchers, sheetName));
			park(2);
			sendKeys(driver,CreateRequisition.justification, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo,justification, sheetName));
			waitForElementClickable(driver, 10, CreateRequisition.costCentreList);
			
			Assert.assertTrue(CreateRequisition.costCentreList.isEnabled());
			
			click(driver,CreateRequisition.costCentreList);
			
			Assert.assertTrue(CreateRequisition.costCentreList.isEnabled());
			
			try {
				click(driver, CreateRequisition.clickDragToAddFiles);
			}
			catch(Exception e){
				LOG.info("Click and Drag to add files button is not enabled",e);
			}
			click(driver, CreateRequisition.clickDragToAddFiles);
			captureScreenShotOnPass(driver, method);
			park(2);
			Runtime.getRuntime().exec(ADD_FILES_EXE);
			park(2);
			waitForPageLoad(driver, 15);
			
			Assert.assertTrue(CreateRequisition.saveButton.isEnabled());
			
			click(driver, CreateRequisition.saveButton);
			park(2);
			
			Assert.assertTrue(CreateRequisition.basketNo.isDisplayed());
			
			return new String[]{getText(driver, CreateRequisition.basketNo) , requester};	
		} catch (Exception e) {
			LOG.error("Failed to create Requisition ",e);
			return new String[] {null};
		}
	}
	
	public boolean addItemDetails(String method,String serialNo,String requester, String sheetName){
		try {
			park(2);
			Assert.assertTrue(AddItemDetails.addItem.isEnabled());
			click(driver, AddItemDetails.addItem);
			park(2);
			captureScreenShotOnPass(driver, method);
			switchToFrame(driver, 0);
			
			Assert.assertTrue(AddItemDetails.closeBtn.isDisplayed());
			Assert.assertTrue(AddItemDetails.saveAndCloseBtn.isDisplayed());
			Assert.assertTrue(AddItemDetails.saveAndNewBtn.isDisplayed());
			Assert.assertTrue(AddItemDetails.resetBtn.isDisplayed());
			
			sendKeys(driver,AddItemDetails.itemDescription, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, itemDescription, sheetName));
			park(2);
			sendKeys(driver, AddItemDetails.itemPrice, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, itemPrice, sheetName));
			park(2);
			sendKeys(driver, AddItemDetails.itemQuantity, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, itemQuantity, sheetName));
			park(2);
			
			Assert.assertTrue(AddItemDetails.unitOfMeasure.isDisplayed());
			
			dropDownByTextVisibility(driver, AddItemDetails.unitOfMeasure, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, unitOfMeasure, sheetName));
			park(2);
			click(driver, AddItemDetails.categoryButton);
			park(2);
			captureScreenShotOnPass(driver, method);
			switchToDefaultContentFrame(driver);
			switchToFrame(driver, 1);
			click(driver, AddItemDetails.labelIcon);
			park(2);
			switchToDefaultContentFrame(driver);
			switchToFrame(driver, 0);
			park(2);
			captureScreenShotOnPass(driver, method);
			return true;
		} catch (Exception e) {
			LOG.info("Fails to add item details");
			return false;
		}
	}
	
	public boolean costAllocationAndCommentUpdate(String method,String serialNo, String sheetName){
		try {
			Assert.assertTrue(CostAllocationAndCommentUpdate.labelSaveButton.isEnabled());
			
			click(driver, CostAllocationAndCommentUpdate.labelSaveButton);
			park(3);
			waitForPageLoad(driver,10);
			switchToDefaultContentFrame(driver);
			switchToFrame(driver, 0);
			
			Assert.assertTrue(AddItemDetails.closeBtn.isDisplayed());
			Assert.assertTrue(AddItemDetails.saveAndCloseBtn.isDisplayed());
			Assert.assertTrue(AddItemDetails.saveAndNewBtn.isDisplayed());
			Assert.assertTrue(AddItemDetails.resetBtn.isDisplayed());
			Assert.assertTrue(CostAllocationAndCommentUpdate.resetAllocation.isDisplayed());
			
			captureScreenShotOnPass(driver, method);
			click(driver, CostAllocationAndCommentUpdate.glAccountButton);
			switchToDefaultContentFrame(driver);
			switchToFrame(driver, 1);
			captureScreenShotOnPass(driver, method);
			sendKeys(driver, CostAllocationAndCommentUpdate.accountSelectionKeyWords, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, gLAccount, sheetName));
			click(driver, CostAllocationAndCommentUpdate.accountSelectionSearch);
			park(2);
			captureScreenShotOnPass(driver, method);
			click(driver, CostAllocationAndCommentUpdate.accountSelectionLabelIcon);
			switchToDefaultContentFrame(driver);
			switchToFrame(driver, 0);
			park(2);
			sendKeys(driver, CostAllocationAndCommentUpdate.costCenter, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, costCentre, sheetName));
			waitForElementClickable(driver, 15, CostAllocationAndCommentUpdate.costCentreList);
			click(driver, CostAllocationAndCommentUpdate.costCentreList);
			waitForPageLoad(driver,10);
			park(4);
			sendKeys(driver, CostAllocationAndCommentUpdate.peopleSoftProjectID, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, peopleSoftProjectID, sheetName));
			waitForElementClickable(driver, 15, CostAllocationAndCommentUpdate.costCentreList);
			click(driver, CostAllocationAndCommentUpdate.costCentreList);
			waitForPageLoad(driver,10);
			captureScreenShotOnPass(driver, method);
			park(4);
			click(driver, CostAllocationAndCommentUpdate.saveandCloseButton);
			park(4);
			waitForPageLoad(driver,10);
			captureScreenShotOnPass(driver, method);
			switchToDefaultContentFrame(driver);
			return true;
		} catch (Exception e) {
			LOG.error("Fails to add comment or Cost Allocation");
			return false;
		}
	}

}
