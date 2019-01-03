package com.face.pageFactory;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import core.generic.StepBase;
import core.generic.Utilities;
import core.generic.WrapperFunctions;

public class DomainZpage {

	// Local variables
	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
	private Utilities objUtilities = new Utilities();
	static String getgreenText;
	static String getreference;

	//Edit Box
	By inpDomainName = By.xpath("//*[contains(@id,'domainSearchBox')]/preceding::input[56]");

	//New Contact
	By inpOrganisationName = By.xpath("//*[text()='Organisation']/following::input[1]");
	By inpFirstName = By.xpath("//*[text()='First Name']/following::input[1]");
	By inpLastName = By.xpath("//*[text()='Last Name']/following::input[1]");
	By inpAddress = By.xpath("//*[text()='Address']/following::input[1]");
	By inpCity = By.xpath("//*[text()='City']/following::input[1]");
	By inpState = By.xpath("//*[text()='State']/following::input[1]");
	By inpPostCode = By.xpath("//*[text()='Postcode']/following::input[1]");
	By inpPhoneNumber = By.xpath("//*[text()='Phone Number']/following::input[1]");
	By impEmail = By.xpath("//*[@name='contact.email']");
	By impConfirmationEmail = By.xpath("//*[text()='Email Confirmation']/following::input[1]");

	//Card Details
	By impCardOwner = By.xpath("//*[@id='btbilling.owner']");  ////input[@id='btCreditCard.owner']
	By frameIdCardNumber = By.xpath("//*[@id='braintree-hosted-field-number']");
	By impCardNumber = By.xpath("//*[@id='credit-card-number']");
	By frameIdCardExpiryMonth = By.xpath("//*[@id='braintree-hosted-field-expirationMonth']");
	By impCardExpiryMonth = By.xpath("//*[@id='expiration-month']");
	By frameIdCardExpiryYear = By.xpath("//*[@id='braintree-hosted-field-expirationYear']");
	By impCardExpiryYear = By.xpath("//*[@id='expiration-year']");
	By frameIdCardCvv = By.xpath("//*[@id='braintree-hosted-field-cvv']");
	By impCardCVV = By.xpath("//*[@id='cvv']");

	//Checkbox
	By checkboxCom = By.xpath("//*[@id='search-tlds']/li[8]/input");
	By checkboxComAu = By.xpath("//*[@id='search-tlds']/li[9]/input");
	By checkboxAutoRenew = By.xpath("//*[@name='autoRenewDomain']");
	By checkboxTermsCondition = By.xpath("//*[@name='agreeTOS']");

	//Click Events
	By btnSearch = By.xpath("//*[@id='domainSearchBox']/div[1]/div[3]/input");
	By btnContinueToCheckout = By.xpath("//*[@id='continueCart']");
	By btnNoThanks = By.xpath("//*[@value='No thanks']");
	By btnContinueHostingAndExtras = By.xpath("//*[@id='save-order-form']/input");
	By btnContinueSaveContact = By.xpath("//*[@name='saveContact']");
	By btnSaveRegistrant = By.xpath("//*[@name='saveRegistrant']");
	By btnPlaceOrder = By.xpath("//*[@id='processOrderButton']");

	//Verify messages
	By verifyCardOwnerMsg = By.xpath("//*[text()='Card Owner is a required field']");
	By verifyCardNumberMsg = By.xpath("//*[text()='Card Number is a required field']");
	By verifyCardCvvMsg = By.xpath("//*[text()='Card Security Code is a required field']");
	By invalidCardNumber = By.xpath("//*[text()='Card Number is invalid']");
	By invalidCvvNumber = By.xpath("//*[text()='Card Security Code is invalid']");

	//Get Green Code
	By greentextvalue = By.xpath("//p[contains(text(),'Your account reference is:')]/strong");

    //Braintree Login
	By braintreeInputUsername = By.xpath("//*[@id='login']");
	By braintreeInputPassword = By.xpath("//*[@id='password']");
	By signupBraintree = By.xpath("//*[@value='Log In']");
//	By transitionbutton = By.xpath("//*[@class='active']");
	By transitionbutton = By.partialLinkText("Transactions");
	By searchTabbutton = By.xpath("//*[@value='Search']");
    By searchupperbutton = By.xpath("//input[@class='site-search__input']");
	By clickonsearchsymbol = By.xpath("//input[@class='site-search__btn site-search__btn--magnifier']");
    By clickontokennumber = By.xpath("//a[@href='/merchants/w825w3j9kfym47dx/payment_methods/any/fp2sy3']");
	
	
	//Admin Login
	By adminUserName = By.xpath("//*[contains(text(),'Username')]/following::input[1]");
	By adminPassword = By.xpath("//*[contains(text(),'Password')]/following::input[1]");    
	//By greenCode = By.xpath("//*[contains(text(),'Account Reference:')]/following::input[1]");
	By btnSubmit = By.name("submit");
	By searchgreentextbox = By.xpath("//input[@name='greencode'][@size='8']");
	By searchtextbox = By.xpath("//input[@name='greencode'][@size='8']");
	By submitTabbutton = By.xpath("(//input[@name='submit'])[2]");
	By viewLoginDetails = By.partialLinkText("Login Details");      
	By winloginpassword = By.xpath("(//td[@class='cp'])[2]"); 
	By PayoutStandingInvoices = By.partialLinkText("Pay outstanding");
	By createprepaidcreditaccount = By.partialLinkText("Create Prepaid");
    By viewbillingaccounts = By.partialLinkText("View Billing");
    By cardexpirydate = By.xpath("(//a[@class='card-expiry'])[2]");
    By selectexpirymonthsa = By.xpath("(//select[@name='expiryMonth'])[2]");
    By selectexpiryyears = By.xpath("(//select[@name='expiryYear'])[2]");
    By clickonsubmitbuttonss = By.xpath("(//input[@name='updateCardExpiry'])[2]");
    By clickworkflowtextbox = By.xpath("//input[@name='domain']");
    By getTabbutton = By.xpath("//input[@value='Get']");
    By workflowSearchbutton = By.xpath("(//input[@type='submit'])[4]");
    By clickOnWorkflowId = By.xpath("(//a[@class='cp'])[4]");
    By clickOnworkflowLink = By.partialLinkText("This Workflow");
    By clickoneditBillingDetails = By.partialLinkText("Edit Billing Details");
    By clickonviewinvoice = By.partialLinkText("View Invoice & Prepaid detail");
    By clickoncreateprepaidcreditaccount = By.partialLinkText("Create Prepaid Credit");
    By clickonradiobutton = By.xpath("(//input[@name='existingBilling'])[1]");
    By clickonemailreceiptcheckbox = By.xpath("(//input[@name='emailReceipt'])[3]");
    By clickonadminview = By.partialLinkText("View");
    
    //Login as client
    By loginasclient = By.partialLinkText("Login as client");
    By clickonaccountsbutton = By.xpath("//a[@title='Account']");
    By Creditcarddetails = By.partialLinkText("Credit card details");
    
    //Credit Card Details
    By impCreditCardOwner = By.xpath("//input[@id='btCreditCard.owner']");
    By impCreditCardNumber = By.xpath("//input[@id='credit-card-number']");
    By impCreditCardExpiryMonth = By.xpath("//select[@name='expiration-month']");  
    By impCreditCardExpiryYear = By.xpath("//select[@name='expiration-year']");
    By impCreditCardCVV = By.xpath("//input[@data-braintree-name='cvv']");
    
	//Card Details
	By impAdminCardOwner = By.xpath("//*[@name='cardOwner']");
	By frameAdminIdCardNumber = By.xpath("//*[@id='braintree-hosted-field-number']");
	By impAdminCardNumber = By.xpath("//input[@id='credit-card-number']");
	By frameAdminIdCardExpiryMonth = By.xpath("//*[@id='braintree-hosted-field-expirationMonth']");
	By impAdminCardExpiryMonth = By.xpath("//*[@class='expirationMonth']");
	By frameAdminIdCardExpiryYear = By.xpath("//*[@id='braintree-hosted-field-expirationYear']");
	By impAdminCardExpiryYear = By.xpath("//select[@class='expirationYear']");
	By frameAdminIdCardCvv = By.xpath("//*[@id='braintree-hosted-field-cvv']");
	By impAdminCardCVV = By.xpath("//input[@class='cvv']"); 
	By amountdone = By.xpath("(//*[@name='amount'])[3]");                                                          
    By purchaseCredit = By.xpath("//*[@value='Purchase Credit']");
	
    //NrCRM login
    By setNrCRMUserName = By.xpath("//input[@id='logon-username-field']");
    By NrCRMPassword = By.xpath("//input[@id='logon-password-field']");
    By btnNrCRMLogin = By.xpath("//button[@id='ext-gen14']");
    By greencodesearchbox = By.xpath("//input[@id='Greencode-searchbox']");
    By newdomainpricesystem = By.xpath("//button[@id='ext-gen1838']");
    By settextdomainname = By.xpath("//input[@id='create-domain-domainName-field-0.2']");
    By selectdropdowndomain = By.xpath("(//input[@autocomplete='off'])[9]");
    By selectregistrationperiod = By.xpath("//input[@class=' x-form-text x-form-field x-combo-noedit x-form-focus']");
    By selectReferenceID = By.xpath("//td[@class='referenceId']");	
    By searchWorkflowid = By.xpath("//input[@name='domain']");
    By setworkflowid = By.xpath("//input[@name='domain']");
    By clickongetbutton = By.xpath("//input[@value='Get']");
    By clickonworkflowidnumber = By.xpath("(//a[@class='cp'])[4]");
    By clickonthisworkflow = By.partialLinkText("This Workflow");
    By clickonworkflowdetails = By.partialLinkText("Workflow Details");
    By clickonexecutebutton = By.partialLinkText("Execute");
    By clickonexecuteaction = By.xpath("//input[@value='Execute Action']");
    
    By clickloginasclient = By.partialLinkText("Login as client");
//    By clickonaccountbutton = By.xpath("//span[text()='Account']");      
    By clickonaccountbutton = By.xpath("//a[@href='/execute2/account/newinterface/tabs/account-tab?currentTab=account']");
    By clickoneditbutton = By.xpath("//a[@class='btn pull-right']");
    By clickoncheckboxbutton = By.xpath("//input[@name='deleteCreditCardIds']");
    By clickonsavebutton = By.xpath("//input[@value='Save changes']");
    By setadmindomainname = By.xpath("//input[@id='domainInput']");
    By clickonadminsearchbutton = By.xpath("//input[@value='Search']");
    By setworkflowidd = By.xpath("//input[@name='domain']");
    
	public boolean setDomainName(String domainname){
		return objWrapperFunctions.setText(inpDomainName, domainname);
	}

	public boolean clickCheckBox(){
		return objWrapperFunctions.click(checkboxCom);
	}

	public boolean unCheckBox(){
		return objWrapperFunctions.click(checkboxComAu);
	}

	public boolean clickOnSearch(){
		return objWrapperFunctions.click(btnSearch);
	}

	public boolean clickOnContinueToCheckout(){
		return objWrapperFunctions.click(btnContinueToCheckout);
	}

	public boolean clickOnNoThanksPopup(){
		return objWrapperFunctions.click(btnNoThanks);
	}

	public boolean clickOnContinueHosting(){
		return objWrapperFunctions.click(btnContinueHostingAndExtras);
	}

	public boolean enterOrganisationName(String Organisationname){;
		return objWrapperFunctions.setText(inpOrganisationName, Organisationname);
	}

	public boolean enterFirstName(String FirstName){
		return objWrapperFunctions.setText(inpFirstName, FirstName);
	}

	public boolean enterLastName(String LastName){
		return objWrapperFunctions.setText(inpLastName, LastName);
	}

	public boolean enterAddress(String Address){
		return objWrapperFunctions.setText(inpAddress, Address);
	}

	public boolean enterCity(String CityName){
		return objWrapperFunctions.setText(inpCity, CityName);
	}

	public boolean enterState(String State){
		return objWrapperFunctions.setText(inpState, State);
	}

	public boolean enterPostCode(String PostCode){
		return objWrapperFunctions.setText(inpPostCode, PostCode);
	}

	public boolean enterPhoneNumber(String PhoneNumber){
		return objWrapperFunctions.setText(inpPhoneNumber, PhoneNumber);
	}

	public boolean enterEmail(String Email){
		return objWrapperFunctions.setText(impEmail, Email);
	}

	public boolean enterConfirmationEmail(String ConfirmationEmail){
		return objWrapperFunctions.setText(impConfirmationEmail, ConfirmationEmail);
	}

	public boolean clickOnContinueSaveContact(){
		return objWrapperFunctions.click(btnContinueSaveContact);
	}

	public boolean clickSaveRegisterConstrant(){
		return objWrapperFunctions.click(btnSaveRegistrant);
	}

	public boolean enterCardOwner(String CardOwner){
		objUtilities.waitForPageLoad();
		return objWrapperFunctions.setText(impCardOwner, CardOwner);
	}

	public boolean switchToFrame(){
		objUtilities.waitForPageLoad();
		return objWrapperFunctions.switchToFrameUsingIframeElement(frameIdCardNumber);
	}

	public boolean enterCardNumber(String CardNumber){
		objUtilities.waitForPageLoad();
		return objWrapperFunctions.setText(impCardNumber, CardNumber);
	}

	public boolean switchToFrameExpiryMonth(){
		objUtilities.waitForPageLoad();
		return objWrapperFunctions.switchToFrameUsingIframeElement(frameIdCardExpiryMonth);
	}

	public boolean enterCardExpiryMonth(String dropdownmonth){
		objUtilities.waitForPageLoad();
		return objWrapperFunctions.selectDropDownOption(impCardExpiryMonth, dropdownmonth, "Value");
	}

	public boolean switchToFrameExpiryYear(){
		objUtilities.waitForPageLoad();
		return objWrapperFunctions.switchToFrameUsingIframeElement(frameIdCardExpiryYear);
	}

	public boolean enterCardExpiryYear(String dropdownyear){
		objUtilities.waitForPageLoad();
		return objWrapperFunctions.selectDropDownOption(impCardExpiryYear, dropdownyear, "Value");
	}

	public boolean switchToFrameCVV(){
		objUtilities.waitForPageLoad();
		return objWrapperFunctions.switchToFrameUsingIframeElement(frameIdCardCvv);
	}

	public boolean enterCardCVV(String CVV){
		objUtilities.waitForPageLoad();
		return objWrapperFunctions.setText(impCardCVV, CVV);
	}

	public boolean selectTermsAndConditions(){
		StepBase.driver.switchTo().defaultContent();
		return objWrapperFunctions.click(checkboxTermsCondition);
	}

	public boolean clickOnContinueButton() throws InterruptedException{
		objUtilities.waitForPageLoad();	                                     
		 objWrapperFunctions.click(btnPlaceOrder);
		Thread.sleep(150000);                           //      wait for 2min
		return true;
	}

	public boolean clearCardOwnerName(){
		return objWrapperFunctions.clearText(impCardOwner);
	}

	public boolean clearCardNumber() throws InterruptedException{
		objWrapperFunctions.clearText(impCardNumber);
		objWrapperFunctions.sleep();
		return true;
	}

	public boolean clearCardCvv() throws InterruptedException{
		objWrapperFunctions.clearText(impCardCVV);
		objWrapperFunctions.sleep();
		return true;
	}

	public String verifyAlertMsgCardOwner(String msgcardowner){
		msgcardowner = objWrapperFunctions.getText(verifyCardOwnerMsg, "Text");
		return msgcardowner;
	}

	public String verifyAlertMsgCardNumber(String msgcardnumber) throws InterruptedException{
		objWrapperFunctions.sleep();
		msgcardnumber = objWrapperFunctions.getText(verifyCardNumberMsg, "Text");
		return msgcardnumber;
	}

	public String verifyAlertMsgCardCvv(String msgcvv) throws InterruptedException{
		objWrapperFunctions.sleep();
		msgcvv = objWrapperFunctions.getText(verifyCardCvvMsg, "Text");
		return msgcvv;
	}

	public String verifyAlertMsgInvalidCardNumber(String invalidCardNum){
		invalidCardNum = objWrapperFunctions.getText(invalidCardNumber, "Text");
		return invalidCardNum;
	}

	public String verifyAlertMsgInvalidCvvNumber(String invalidCvvNum) throws InterruptedException{
		invalidCvvNum = objWrapperFunctions.getText(invalidCvvNumber, "Text");
		Thread.sleep(5000);
		return invalidCvvNum;
	}

	public boolean orderInformationGreenText() throws InterruptedException{
		getgreenText = objWrapperFunctions.getText(greentextvalue, "Text");
		System.out.println(getgreenText);
		Thread.sleep(5000);
		return true;
		
	}

//Login BrainTree
	public boolean enterBraintreeUser(String BrainuserName){
		Actions action = new Actions(StepBase.driver);
		  action.sendKeys(Keys.CONTROL,"t");
		  action.perform();
	    StepBase.driver.get("https://sandbox.braintreegateway.com/login");
		return objWrapperFunctions.setText(braintreeInputUsername, BrainuserName);
	}
	
	public boolean enterBraintreePass(String Brainpassword){
		return objWrapperFunctions.setText(braintreeInputPassword, Brainpassword);
	}
	
	public boolean clickOnLoginButton(){
		return objWrapperFunctions.click(signupBraintree);
	}
	
	public boolean clickOnTransitionButton(){
		return objWrapperFunctions.click(transitionbutton);
	}
	
	public boolean clickOnSearchButton(){
		return objWrapperFunctions.click(searchTabbutton);
	}
	
	public boolean setAdminUserName(String username){
		StepBase.driver.get("https://theconsole-2.uat.a2development.net/admin/");
		return objWrapperFunctions.setText(adminUserName, username);
	}
	
	public boolean setAdminPassword(String password){
		return objWrapperFunctions.setText(adminPassword, password);
	}
	
	public boolean clickAdminSubmitButton(){
		return objWrapperFunctions.click(btnSubmit);
	}
	
	public boolean clickOnSearchTextbox(){
		return objWrapperFunctions.setText(searchtextbox, getgreenText);
	}
	
	public boolean clickOnSearchGreenTextbox(String GreenCode){
		return objWrapperFunctions.setText(searchgreentextbox, GreenCode);
	}
	
	
	public boolean clickOnSubmitButton(){
		return objWrapperFunctions.click(submitTabbutton);
	}
	
	public boolean clickOnViewLoginDetails() throws InterruptedException{
//		Thread.sleep(5000);
		return objWrapperFunctions.click(viewLoginDetails);
	}
	
	public boolean switchTochildWindow(){
		objUtilities.waitForPageLoad();
//		return objWrapperFunctions.switchToWindowUsingURL("https://theconsole-2.uat.a2development.net/admin/execute/authentication/getAuthenticationDetails?authentication_id=8418273");
		return objWrapperFunctions.switchToWindowUsingTitle("Admin - Authentication");

	}
	
	public boolean getLoginPasswordtext() throws InterruptedException{
		String getpasswordvalue = objWrapperFunctions.getText(winloginpassword, "Text");
		System.out.println(winloginpassword);
		//Thread.sleep(5000);
		return true;
		
	}
	
	public boolean clickOnPayoutStandingInvoices(){
//		Thread.sleep(5000);
		return objWrapperFunctions.click(PayoutStandingInvoices);
	}
	
	public boolean clickOnCreateprepaidAccount(){
//		Thread.sleep(5000);
		return objWrapperFunctions.click(createprepaidcreditaccount);
	}
	
	public boolean enterAdminCardOwner(String AddCardOwner){
		objUtilities.waitForPageLoad();
		return objWrapperFunctions.setText(impAdminCardOwner, AddCardOwner);
	}
	
	public boolean switchAdminToFrame(){
		objUtilities.waitForPageLoad();
		return objWrapperFunctions.switchToFrameUsingIframeElement(frameAdminIdCardNumber);
	}

	public boolean enterAdminCardNumber(String AddCardNumber){
		objUtilities.waitForPageLoad();
		return objWrapperFunctions.setText(impAdminCardNumber, AddCardNumber);
	}

	public boolean switchAdminToFrameExpiryMonth(){
		objUtilities.waitForPageLoad();
		return objWrapperFunctions.switchToFrameUsingIframeElement(frameAdminIdCardExpiryMonth);
	}

	public boolean enterAdminCardExpiryMonth(String Adddropdownmonth){
		objUtilities.waitForPageLoad();
		return objWrapperFunctions.selectDropDownOption(impAdminCardExpiryMonth, Adddropdownmonth, "Value");
	}

	public boolean switchAdminToFrameExpiryYear(){
		objUtilities.waitForPageLoad();
		return objWrapperFunctions.switchToFrameUsingIframeElement(frameAdminIdCardExpiryYear);
	}

	public boolean enterAdminCardExpiryYear(String Adddropdownyear){
		objUtilities.waitForPageLoad();
		return objWrapperFunctions.selectDropDownOption(impAdminCardExpiryYear, Adddropdownyear, "Value");
	}

	public boolean switchAdminToFrameCVV(){
		objUtilities.waitForPageLoad();
		return objWrapperFunctions.switchToFrameUsingIframeElement(frameAdminIdCardCvv);
	}

	public boolean enterAdminCardCVV(String AddCVV){
		objUtilities.waitForPageLoad();
	    objWrapperFunctions.setText(impAdminCardCVV, AddCVV);
	    StepBase.driver.switchTo().defaultContent();
	    return true;
	}
	
//	public boolean switchToiframeAmount(){
//		objUtilities.waitForPageLoad();
//		return objWrapperFunctions.switchToFrameUsingIframeElement(switchamount);
//	}
//	
	public boolean setamount(String amount){
		return objWrapperFunctions.setText(amountdone, amount);
	}
	
	public boolean clickOnPurchaseCredit() {
//		Thread.sleep(5000);
		 objWrapperFunctions.click(purchaseCredit);
		 return objWrapperFunctions.acceptDefult();
	}
	
	public boolean clickOnBillingAccounts(){
		return objWrapperFunctions.click(viewbillingaccounts);
	}
	
	public boolean clickOnCardExpiryDate(){
		return objWrapperFunctions.click(cardexpirydate);
	}
	
	public boolean selectExpiryMonth(String dropdownmonth){
		objUtilities.waitForPageLoad();
		return objWrapperFunctions.selectDropDownOption(selectexpirymonthsa, dropdownmonth, "Value");
	}

	public boolean selectExpiryYears(String dropdownyears){
		objUtilities.waitForPageLoad();
		return objWrapperFunctions.selectDropDownOption(selectexpiryyears, dropdownyears, "Value");
	}

	public boolean clickOnSubmitButtonss(){
		return objWrapperFunctions.click(clickonsubmitbuttonss);
	}
	
	public boolean clickOnWorkflowTextbox(String GreenCode){
		return objWrapperFunctions.setText(clickworkflowtextbox, GreenCode);
	}
	
	public boolean clickOnGetButton(){
		return objWrapperFunctions.click(getTabbutton);
	}
	
	public boolean clickOnWorkflowSearch(){
		return objWrapperFunctions.click(workflowSearchbutton);
	}
	
	public boolean clickOnWorkflowId(){
		return objWrapperFunctions.click(clickOnWorkflowId);
	}
	
	public boolean clickOnWorkflowlink(){
		return objWrapperFunctions.click(clickOnworkflowLink);
	}
	
	public boolean clickOnEditBillingDetails(){
		return objWrapperFunctions.click(clickoneditBillingDetails);
	}
	
	public boolean clickOnViewInvoice(){
		return objWrapperFunctions.click(clickonviewinvoice);
	}
	
	public boolean ClickOnCreatePrepaidCreditAccount(){
		return objWrapperFunctions.click(clickoncreateprepaidcreditaccount);
	}
	
	public boolean ClickOnRadioButton(){
		return objWrapperFunctions.click(clickonradiobutton);
	}
	
	public boolean ClickOnEmailReceiptCheckbox(){
		return objWrapperFunctions.click(clickonemailreceiptcheckbox);
	}
	
	public boolean ClickOnLoginAsClient(){
		 objWrapperFunctions.click(loginasclient);
		 objWrapperFunctions.switchToWindowUsingTitle("Domain Names | NZ Domain Registration | Domainz");
		 return true;
	}
	
	public boolean ClickOnAccountsButton(){
		return objWrapperFunctions.click(clickonaccountsbutton);
	}
	
	public boolean ClickOnCreditCardDetails(){
		return objWrapperFunctions.click(Creditcarddetails);
	}
	
	public boolean enterCreditCardOwner(String CardOwner){
		objUtilities.waitForPageLoad();
		return objWrapperFunctions.setText(impCreditCardOwner, CardOwner);
	}

//	public boolean switchToFrame(){
//		objUtilities.waitForPageLoad();
//		return objWrapperFunctions.switchToFrameUsingIframeElement(frameIdCardNumber);
//	}

	public boolean enterCreditCardNumber(String CardNumber){
		objUtilities.waitForPageLoad();
		return objWrapperFunctions.setText(impCreditCardNumber, CardNumber);
	}

//	public boolean switchToFrameExpiryMonth(){
//		objUtilities.waitForPageLoad();
//		return objWrapperFunctions.switchToFrameUsingIframeElement(frameIdCardExpiryMonth);
//	}

	public boolean enterCreditCardExpiryMonth(String dropdownmonth){
		objUtilities.waitForPageLoad();
		return objWrapperFunctions.selectDropDownOption(impCreditCardExpiryMonth, dropdownmonth, "Value");
	}

//	public boolean switchToFrameExpiryYear(){
//		objUtilities.waitForPageLoad();
//		return objWrapperFunctions.switchToFrameUsingIframeElement(frameIdCardExpiryYear);
//	}

	public boolean enterCreditCardExpiryYear(String dropdownyear){
		objUtilities.waitForPageLoad();
		return objWrapperFunctions.selectDropDownOption(impCreditCardExpiryYear, dropdownyear, "Value");
	}

//	public boolean switchToFrameCVV(){
//		objUtilities.waitForPageLoad();
//		return objWrapperFunctions.switchToFrameUsingIframeElement(frameIdCardCvv);
//	}

	public boolean enterCreditCardCVV(String CVV){
		objUtilities.waitForPageLoad();
		return objWrapperFunctions.setText(impCreditCardCVV, CVV);
	}

	public boolean ClickOnAdminViewButton(){
		return objWrapperFunctions.click(clickonadminview);
	}
	
	public boolean setNrCRMUserName(String username){
		StepBase.driver.get("https://theconsole-2.uat.a2development.net/sales/");
		return objWrapperFunctions.setText(setNrCRMUserName, username);
	}
	
	public boolean setNrCRMPassword(String password){
		return objWrapperFunctions.setText(NrCRMPassword, password);
	}

	public boolean clickNrCRMLoginButton(){
		return objWrapperFunctions.click(btnNrCRMLogin);
	}

	public boolean clickGreenCodeSearchBox(String GreenCode) throws InterruptedException{

		objWrapperFunctions.setText(greencodesearchbox, GreenCode);
		Actions action = new Actions(StepBase.driver);
		action.sendKeys(Keys.ENTER);
		action.perform();
		Thread.sleep(5000); 
		return true;
	}


	public boolean clickDomainPriceSystem(){
		objWrapperFunctions.click(newdomainpricesystem);
		objWrapperFunctions.switchToWindowUsingTitle("Create Domain Window");
		return true;
	}

	public boolean settextDomainName(String domainname) throws InterruptedException{
		objWrapperFunctions.setText(settextdomainname, domainname);
		Thread.sleep(10000); 
		return true;

	}

	public boolean selectDropDownDomain(int dropdowndomain) throws InterruptedException{
		objUtilities.waitForPageLoad();
		objWrapperFunctions.selectEsctDrpdown(selectdropdowndomain, dropdowndomain);
		Thread.sleep(10000); 
		return true;
	}

	//	public boolean selectDropDownDomain(String dropdowndomain){
	//		objUtilities.waitForPageLoad();
	//		return objWrapperFunctions.selectDropDownOption(selectdropdowndomain, dropdowndomain, "Text");
	//	}

	public boolean selectRegistrationPeriod(String dropdownPeriod){
		objUtilities.waitForPageLoad();
		return objWrapperFunctions.selectDropDownOption(selectregistrationperiod, dropdownPeriod, "Text");
	}
	
	public boolean getrefrenceID() throws InterruptedException{
	    getreference = objWrapperFunctions.getText(selectReferenceID, "Text");
		System.out.println(getreference);
		Thread.sleep(5000);
		return true;
		
	}
	
	public boolean clickSearchWorkflowId(){
		return objWrapperFunctions.setText(searchWorkflowid, getreference);
	}
	
	public boolean setWorkflowId(String workflow){
		return objWrapperFunctions.setText(setworkflowid, workflow);
	}
	
	public boolean clickOnGetWorkflowButton(){
		return objWrapperFunctions.click(clickongetbutton);
	}

	public boolean clickOnGetWorkflowidNumber(){
		return objWrapperFunctions.click(clickonworkflowidnumber);
	}
	
	public boolean clickOnThisWorkflow(){
		return objWrapperFunctions.click(clickonthisworkflow);
	}
	
	public boolean clickOnWorkflowDetails(){
		return objWrapperFunctions.click(clickonworkflowdetails);
	}
	
	public boolean clickOnExecuteButton(){
		return objWrapperFunctions.click(clickonexecutebutton);
	}
	
	public boolean clicknExecuteAction(){
		return objWrapperFunctions.click(clickonexecuteaction);
	}

	public boolean clickLoginAsClient(){
		 objWrapperFunctions.click(clickloginasclient);
		 objWrapperFunctions.switchToWindowUsingTitle("Domain Names | NZ Domain Registration | Domainz");
		 return true;
	}

	public boolean clickOnAccountButton() throws InterruptedException{
//		StepBase.driver.navigate().refresh();
		Thread.sleep(5000);
		objWrapperFunctions.click(clickonaccountbutton);
		return true;

	}
	
	public boolean clickOnEditButton(){
		return objWrapperFunctions.click(clickoneditbutton);
	}

	public boolean clickOnCheckBoxButton(){
		return objWrapperFunctions.click(clickoncheckboxbutton);
	}
	
	public boolean clickOnSaveButton(){
		 objWrapperFunctions.click(clickonsavebutton);
		 objWrapperFunctions.switchToWindowUsingTitle("Admin - Company");
		 return true;
	}

	public boolean setAdminDomainName(String domain){
		return objWrapperFunctions.setText(setadmindomainname, domain);
	}
	
	public boolean clickOnAdminSearchButton(){
		return objWrapperFunctions.click(clickonadminsearchbutton);
	}
	
	public boolean setWorkflowIdd(String workfloww){
		return objWrapperFunctions.setText(setworkflowidd, workfloww);
	}
	
	public boolean clickOnSearchupperButton(String cutomerID){
		return objWrapperFunctions.setText(searchupperbutton, cutomerID);
	}
	

	public boolean clickOnSearchSymboll(){
		return objWrapperFunctions.click(clickonsearchsymbol);
	}
	
	public boolean clickOnTokenNumber(){
		return objWrapperFunctions.click(clickontokennumber);
	}
	
}

