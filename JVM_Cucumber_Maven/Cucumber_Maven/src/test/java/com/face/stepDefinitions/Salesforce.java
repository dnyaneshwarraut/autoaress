package com.face.stepDefinitions;

import org.junit.Assert;

import com.face.pageFactory.SalesForcePage;
import core.generic.Utilities;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Salesforce {
	// Local variables
	
			private Utilities objUtilities = new Utilities();
			//private RoodlaneLoginPage objRoodlaneLoginPage = new RoodlaneLoginPage();
			private SalesForcePage objSalesForcePage = new SalesForcePage();
			
			@Given("^Enter Salesforce User Name (.*)$")
			public void enterSalesforceUserName(String userName)  
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objSalesForcePage.setSalesforceUserName(userName));
				
			}

			@Then("^Enter Salesforce Password (.*)$")
			public void enterSalesforcePassword(String password)  
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objSalesForcePage.setSalesforceUserPassword(password));
			}
			
			@Then("^Click on Salesforce Login button$")
			public void clickOnLoginButton1()  
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objSalesForcePage.clickSalesforceLoginButton());
			}
			

			@Then("^Enter Search Content (.*)$")
			public void enterSearchContent(String search)  
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objSalesForcePage.enterSearchContent(search));
			}
			
			
			@Then("^Click on Search Button$")
			public void clickOnSearchButton()  
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objSalesForcePage.clickSearchButton());
			}

			@Then("^Click on Report$")
			public void clickOnReportButton()  
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objSalesForcePage.clickReportButton());
			}

			
			@Then("^Click on Checkbox Button$")
			public void clickOnCheckBox()  
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objSalesForcePage.clickCheckboxButton());
			}

			@Then("^Read Table Contents$")
			public void readTableContents()  
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objSalesForcePage.viewTableContent(null));
			}
			
	/**		@Then("^verify Table Content$")
			public void verifyTableContent()  
			{
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objSalesForcePage.verifyTableContent(tablecontent, "Account Name", "Edge Communications"));
			}*/
			
			
}
