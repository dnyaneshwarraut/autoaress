package com.face.pageFactory;
import java.io.FileOutputStream;

import org.openqa.selenium.By;

import core.generic.StepBase;
import core.generic.Utilities;
import core.generic.WrapperFunctions;

public class SalesForcePage {
	
	private StepBase objStepBase = new StepBase();
	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
	private Utilities objUtilities = new Utilities();

	
	//login
	By inpUserName = By.xpath("//input[@class='input r4 wide mb16 mt8 username']");
	By inpUserPassword = By.xpath("//input[@class='input r4 wide mb16 mt8 password']");
	By btnLogin = By.xpath("//input[@class='button r4 wide primary']");

	//button
	By btnSearch = By.xpath("//*[contains(@id,'phSearchButton')]");
	By btnReport = By.xpath("//*[contains(text(),'Opportunities In Month')]");
	
	//checkbox
	By checkBox = By.xpath("(//*[contains(@class,'drilldown')])[1]");
	
	//search
	By searchtab = By.xpath("//*[contains(@title,'Search...')]");
	
	//table
	By tablecontent = By.xpath("//*[contains(@class,'reportOutput')]");
	
	By columnHead = By.xpath("//*[contains(@id,'headerRow_0')]//*[contains(@title,'Account Name - Click to sort ascending')]");
	By columnC = By.xpath("//*[@id='fchArea']/table/tbody/tr[6]/td[15]/a");
	
	public boolean setSalesforceUserName(String userName){
		return objWrapperFunctions.setText(inpUserName, userName);
		
	}
	
	public boolean setSalesforceUserPassword(String password){
		return objWrapperFunctions.setText(inpUserPassword, password);
	}
	
	public boolean clickSalesforceLoginButton(){
		return objWrapperFunctions.click(btnLogin);
	}
	
	/** Enter search content*/ 
	public boolean enterSearchContent(String search){ 
		return objWrapperFunctions.setText(searchtab, search);
	}
	
	/** click on search button*/
	public boolean clickSearchButton(){
		objUtilities.waitForPageLoad();
		return objWrapperFunctions.click(btnSearch);
	}
	
	/** click on report button*/
	public boolean clickReportButton(){
		objUtilities.waitForPageLoad();
		return objWrapperFunctions.click(btnReport);
	}
	

	public boolean viewTableContent(By locator) 
	{
		objWrapperFunctions.viewTableContent(tablecontent);
	/**	try{FileOutputStream file = new FileOutputStream("‪C:\\Users\\user\\Documents\\consoleoutput.ods");
		file.write("Column Number---->1Column Text--------> ");
		}catch(Exception e){
			System.out.println(e);}*/
		return true;
		}
	
	
	public boolean clickCheckboxButton(){
		objUtilities.waitForPageLoad();
		return objWrapperFunctions.click(checkBox);
	}
	
/**	public boolean verifyTableContent(By locator, String columnHeader, String columnContent) 
	{
		objWrapperFunctions.verifyTableContent(tablecontent, "Account Name", "Edge Communications");
		return true;
	}*/
	
}
