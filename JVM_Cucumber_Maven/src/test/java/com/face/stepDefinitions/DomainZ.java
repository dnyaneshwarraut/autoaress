package com.face.stepDefinitions;

import org.junit.Assert;

import com.face.pageFactory.DomainZpage;
import core.generic.Utilities;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class DomainZ {

	// Local variables
	
			private Utilities objUtilities = new Utilities();
			//private RoodlaneLoginPage objRoodlaneLoginPage = new RoodlaneLoginPage();
			private DomainZpage objDomainZpage = new DomainZpage();
	
	@Given("^Enter domain name (.*)$")
	public void enterDomainName(String domainname){
			objUtilities.waitForPageLoad();
			Assert.assertTrue(objDomainZpage.setDomainName(domainname));
	}

	@Then("^Select domain service$")
	public void Select_domain_service() throws Throwable {
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objDomainZpage.clickCheckBox());
	}

	@Then("^Uncheck au domain service$")
	public void Uncheck_au_domain_service() throws Throwable {
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objDomainZpage.unCheckBox());
	}

	@Then("^Click on search button$")
	public void Click_on_search_button() throws Throwable {
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objDomainZpage.clickOnSearch());
	}

	@Then("^Click on cotinue to checkout button$")
	public void Click_on_cotinue_to_checkout_button() throws Throwable {
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objDomainZpage.clickOnContinueToCheckout());
	}

	@Then("^Click on No thanks pop up$")
	public void Click_on_No_thanks_pop_up() throws Throwable {
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objDomainZpage.clickOnNoThanksPopup());
	}

	@Then("^Click on continue to account$")
	public void Click_on_continue_to_account() throws Throwable {
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objDomainZpage.clickOnContinueHosting());
	}

	@Then("^Enter organisation name (.*)$")
	public void Enter_organisation_name_Payment_Gateway_Test(String Organisationname){
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objDomainZpage.enterOrganisationName(Organisationname));
	}

	@Then("^Enter first name (.*)$")
	public void Enter_first_name_Payment_Gateway_Test(String FirstName) throws Throwable {
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objDomainZpage.enterFirstName(FirstName));
	}

	@Then("^Enter last name (.*)$")
	public void Enter_last_name_Payment_Gateway_Test(String LastName) throws Throwable {
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objDomainZpage.enterLastName(LastName));
	}

	@Then("^Enter address (.*)$")
	public void Enter_address(String Address) throws Throwable {
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objDomainZpage.enterAddress(Address));
	}

	@Then("^Enter city name (.*)$")
	public void Enter_city_name(String CityName) throws Throwable {
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objDomainZpage.enterCity(CityName));
	}

	@Then("^Select state (.*)$")
	public void Select_state(String State) throws Throwable {
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objDomainZpage.enterState(State));
	}

	@Then("^Enter post code (.*)$")
	public void Enter_post_code(String PostCode) throws Throwable {
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objDomainZpage.enterPostCode(PostCode));
	}

	@Then("^Enter phone number (.*)$")
	public void Enter_phone_number(String PhoneNumber) throws Throwable {
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objDomainZpage.enterPhoneNumber(PhoneNumber));
	}

	@Then("^Enter email (.*)$")
	public void Enter_email(String Email) throws Throwable {
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objDomainZpage.enterEmail(Email));
	}

	@Then("^Enter confirmation mail (.*)$")
	public void Enter_confirmation_mail(String ConfirmationEmail) throws Throwable {
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objDomainZpage.enterConfirmationEmail(ConfirmationEmail));
	}

	@Then("^Click on continue to payment page$")
	public void Click_on_continue_to_payment_page() throws Throwable {
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objDomainZpage.clickOnContinueSaveContact());
	}

	@Then("^Click on continue to registrant page$")
	public void Click_on_continue_to_registrant_page() throws Throwable {
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objDomainZpage.clickSaveRegisterConstrant());
	}

	@Then("^Enter card owner name (.*)$")
	public void Enter_card_owner_name_AlphaNumeric(String CardOwner) throws Throwable {
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objDomainZpage.enterCardOwner(CardOwner));
	}
	
	@Then("^Switch to iframe card number$")
	public void switch_to_iframe() throws Throwable {
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objDomainZpage.switchToFrame());
	}

	@Then("^Enter card number (.*)$")
	public void Enter_card_number(String CardNumber) throws Throwable {
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objDomainZpage.enterCardNumber(CardNumber));
	}

	@Then("^Switch to iframe card expiry month$")
	public void switch_to_iframe_expity_month() throws Throwable {
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objDomainZpage.switchToFrameExpiryMonth());
	}

	@Then("^Select card expiry month (.*)$")
	public void Select_card_expiry_month(String dropdownmonth) throws Throwable {
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objDomainZpage.enterCardExpiryMonth(dropdownmonth));
	}

	@Then("^Switch to iframe card expiry year$")
	public void switch_to_iframe_expity_year() throws Throwable {
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objDomainZpage.switchToFrameExpiryYear());
	}

	@Then("^Select card expiry year (.*)$")
	public void Select_card_expiry_year(String dropdownyear) throws Throwable {
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objDomainZpage.enterCardExpiryYear(dropdownyear));
	}

	@Then("^Switch to iframe card cvv$")
	public void switch_to_iframe_CVV() throws Throwable {
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objDomainZpage.switchToFrameCVV());
	}

	@Then("^Enter card CVV number (.*)$")
	public void Enter_card_CVV_number(String CVV) throws Throwable {
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objDomainZpage.enterCardCVV(CVV));
	}

//	@Then("^Select auto renewal checkbox$")
//	public void Select_auto_renewal_checkbox() throws Throwable {
//		objUtilities.waitForPageLoad();
//		Assert.assertTrue(objDomainZpage.selectAutoRenewalCheckbox());
//	}

	@Then("^Select I agree checkbox$")
	public void Select_I_agree_checkbox() throws Throwable {
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objDomainZpage.selectTermsAndConditions());
	}

	@Then("^Click on continue button$")
	public void Click_on_continue_button() throws Throwable {
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objDomainZpage.clickOnContinueButton());
	}
	
	@Then("^Clear text from card owner field$")
	public void Clear_text_card_owner() throws Throwable {
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objDomainZpage.clearCardOwnerName());
	}
	
	@Then("^Verify alert message for card owner field (.*)$")
	public void Verify_message_card_owner(String msgcardowner) throws Throwable {
		objUtilities.waitForPageLoad();
		Assert.assertEquals(msgcardowner, objDomainZpage.verifyAlertMsgCardOwner(msgcardowner));
	}
	
	@Then("^Clear number from card number field$")
	public void Clear_text_card_number() throws Throwable {
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objDomainZpage.clearCardNumber());
	}
	
	@Then("^Verify alert message for card number field (.*)$")
	public void Verify_message_card_number(String msgcardnumber) throws Throwable {
		objUtilities.waitForPageLoad();
		Assert.assertEquals(msgcardnumber, objDomainZpage.verifyAlertMsgCardNumber(msgcardnumber));
	}
	
	@Then("^Clear number from card CVV field$")
	public void Clear_number_card_cvv() throws Throwable {
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objDomainZpage.clearCardCvv());
	}
	
	@Then("^Verify alert message for CVV field (.*)$")
	public void Verify_message_card_cvv(String msgcvv) throws Throwable {
		objUtilities.waitForPageLoad();
		Assert.assertEquals(msgcvv, objDomainZpage.verifyAlertMsgCardCvv(msgcvv));
	}
	
	@Then("^Verify alert message invalid card number (.*)$")
	public void Verify_message_invalid_card_num(String invalidCardNum) throws Throwable {
		objUtilities.waitForPageLoad();
		Assert.assertEquals(invalidCardNum, objDomainZpage.verifyAlertMsgInvalidCardNumber(invalidCardNum));
		objUtilities.waitForPageLoad();
	}

	@Then("^Verify alert message invalid cvv number (.*)$")
	public void Verify_message_invalid_cvv_num(String invalidCvvNum) throws Throwable {
		objUtilities.waitForPageLoad();
		Assert.assertEquals(invalidCvvNum, objDomainZpage.verifyAlertMsgInvalidCvvNumber(invalidCvvNum));
		objUtilities.waitForPageLoad();
	}
	
	@Then("^Get Green code text$")
	public void Get_green_code_text() throws Throwable {
		objUtilities.waitForPageLoad();
//		Assert.assertTrue(objDomainZpage.orderInformationGreenText());
		Assert.assertTrue(objDomainZpage.orderInformationGreenText());
		objUtilities.waitForPageLoad();
	}
	
//BrainTree Login
	@Then("^Enter BrainTree UserName (.*)$")
	public void Enter_userName(String BrainuserName) throws Throwable {
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objDomainZpage.enterBraintreeUser(BrainuserName));
	}

	@Then("^Enter BrainTree password (.*)$")
	public void Enter_password(String Brainpassword) throws Throwable {
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objDomainZpage.enterBraintreePass(Brainpassword));
	}
	
	@Then("^Click on login button$")
	public void Click_on_login_button() throws Throwable {
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objDomainZpage.clickOnLoginButton());
	}
	
	@Then("^Click on dashbord transition button$")
	public void Click_on_dashbord_transition_button() throws Throwable {
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objDomainZpage.clickOnTransitionButton());
	}
	
	@Then("^Click on tabsearch button$")
	public void Click_on_tabsearch_button() throws Throwable {
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objDomainZpage.clickOnSearchButton());
	}
	
	@Then("^Enter Admin UserName (.*)$")
	 public void Enter_Admin_UserName(String username) throws Throwable {
	  objUtilities.waitForPageLoad();
	  Assert.assertTrue(objDomainZpage.setAdminUserName(username));
	 }
	
	 @Then("^Enter Admin Password (.*)$")
	 public void Enter_Admin_Password(String password) throws Throwable {
	  objUtilities.waitForPageLoad();
	  Assert.assertTrue(objDomainZpage.setAdminPassword(password));
	 }
	 
	 @Then("^Click Submit Button$")
	 public void Clear_Submit_Button() throws Throwable {
	  objUtilities.waitForPageLoad();
	  Assert.assertTrue(objDomainZpage.clickAdminSubmitButton());
	 }
	
	 @Then("^Click on search textbox$")
	 public void Click_on_search_textbox() throws Throwable {
		 objUtilities.waitForPageLoad();
		 Assert.assertTrue(objDomainZpage.clickOnSearchTextbox());
	 }

	 @Then("^Click on search green textbox(.*)$")
	 public void Click_on_search_Green_textbox(String GreenCode) throws Throwable {
		 objUtilities.waitForPageLoad();
		 Assert.assertTrue(objDomainZpage.clickOnSearchGreenTextbox(GreenCode));
	 }

	 
	 @Then("^Click on submit tab button$")
	 public void Click_On_Submit_Tab_Button() throws Throwable {
		 objUtilities.waitForPageLoad();
		 Assert.assertTrue(objDomainZpage.clickOnSubmitButton());
	 }

	 @Then("^Click on view login details$")
	 public void Click_On_View_Login_Details() throws Throwable {
		 objUtilities.waitForPageLoad();
		 Assert.assertTrue(objDomainZpage.clickOnViewLoginDetails());
	 }
	 
	 @Then("^Switch to child window$")
		public void switch_to_Child_Window() throws Throwable {
			objUtilities.waitForPageLoad();
			Assert.assertTrue(objDomainZpage.switchTochildWindow());
		}
	 
	 @Then("^Get login password text$")
		public void Get_Login_Password() throws Throwable {
			objUtilities.waitForPageLoad();
			Assert.assertTrue(objDomainZpage.getLoginPasswordtext());
			objUtilities.waitForPageLoad();
		}
	 
	 @Then("^Click on Payout Standings$")
	 public void Click_On_View_Pay_Standing() throws Throwable {
		 objUtilities.waitForPageLoad();
		 Assert.assertTrue(objDomainZpage.clickOnPayoutStandingInvoices());
	 }
	 
	 @Then("^Click on create prepaid credit account$")
	 public void Click_On_Create_Prepaid_Account() throws Throwable {
		 objUtilities.waitForPageLoad();
		 Assert.assertTrue(objDomainZpage.clickOnCreateprepaidAccount());
	 }
	 
	 @Then("^Enter admin card owner name (.*)$")
		public void Enter_card_owner_name_admin(String AddCardOwner) throws Throwable {
			objUtilities.waitForPageLoad();
			Assert.assertTrue(objDomainZpage.enterAdminCardOwner(AddCardOwner));
		}
	 
	 @Then("^Switch admin to iframe card number$")
		public void switch_ato_iframe() throws Throwable {
			objUtilities.waitForPageLoad();
			Assert.assertTrue(objDomainZpage.switchAdminToFrame());
		}

		@Then("^Enter admin card number (.*)$")
		public void Enter_acard_number(String AddCardNumber) throws Throwable {
			objUtilities.waitForPageLoad();
			Assert.assertTrue(objDomainZpage.enterAdminCardNumber(AddCardNumber));
		}

		@Then("^Switch admin iframe to emp months$")
		public void Switch_admin_iframe_to_emp_months() throws Throwable {
			objUtilities.waitForPageLoad();
			Assert.assertTrue(objDomainZpage.switchAdminToFrameExpiryMonth());
		}

		@Then("^Select admin card expiry month (.*)$")
		public void Select_acard_expiry_month(String Adddropdownmonth) throws Throwable {
			objUtilities.waitForPageLoad();
			Assert.assertTrue(objDomainZpage.enterAdminCardExpiryMonth(Adddropdownmonth));
		}

		@Then("^Switch admin to iframe card expiry year$")
		public void switch_ato_iframe_expity_year() throws Throwable {
			objUtilities.waitForPageLoad();
			Assert.assertTrue(objDomainZpage.switchAdminToFrameExpiryYear());
		}

		@Then("^Select admin card expiry year (.*)$")
		public void Select_acard_expiry_year(String Adddropdownyear) throws Throwable {
			objUtilities.waitForPageLoad();
			Assert.assertTrue(objDomainZpage.enterAdminCardExpiryYear(Adddropdownyear));
		}

		@Then("^Switch admin to iframe card cvv$")
		public void switch_ato_iframe_CVV() throws Throwable {
			objUtilities.waitForPageLoad();
			Assert.assertTrue(objDomainZpage.switchAdminToFrameCVV());
		}

		@Then("^Enter admin card CVV number (.*)$")
		public void Enter_acard_CVV_number(String AddCVV) throws Throwable {
			objUtilities.waitForPageLoad();
			Assert.assertTrue(objDomainZpage.enterAdminCardCVV(AddCVV));
		}
	  
//		@Then("^Switch to iframe amount$")
//		public void switch_To_iframe_amount() throws Throwable {
//			objUtilities.waitForPageLoad();
//			Assert.assertTrue(objDomainZpage.switchToiframeAmount());
//		}
		
		@Then("^Enter card amount(.*)$")
		public void Enter_Card_Amount(String amount) throws Throwable {
			objUtilities.waitForPageLoad();
			Assert.assertTrue(objDomainZpage.setamount(amount));
		}
		
		@Then("^Click on purchase credit$")
		public void Click_On_Purchase_Credit() throws Throwable {
			 objUtilities.waitForPageLoad();
			 Assert.assertTrue(objDomainZpage.clickOnPurchaseCredit());
		 }
		
		@Then("^Click on view billing accounts$")
		public void Click_On_View_Billing_Accounts() throws Throwable {
			objUtilities.waitForPageLoad();
			Assert.assertTrue(objDomainZpage.clickOnBillingAccounts());
		}

		@Then("^Click on card expiry date$")
		public void click_On_Card_Expiry_Date() throws Throwable {
			objUtilities.waitForPageLoad();
			Assert.assertTrue(objDomainZpage.clickOnCardExpiryDate());
		}

		@Then("^Select expiry month (.*)$")
		public void Select_Expiry_Months(String dropdownmonth) throws Throwable {
			objUtilities.waitForPageLoad();
			Assert.assertTrue(objDomainZpage.selectExpiryMonth(dropdownmonth));
		}
		 
		@Then("^Select expiry years (.*)$")
		public void Select_Expiry_Years(String dropdownyears) throws Throwable {
			objUtilities.waitForPageLoad();
			Assert.assertTrue(objDomainZpage.selectExpiryYears(dropdownyears));
		}
		
		@Then("^Click on submit buttonss$")
		public void Click_On_Submit_Buttonss() throws Throwable {
			objUtilities.waitForPageLoad();
			Assert.assertTrue(objDomainZpage.clickOnSubmitButtonss());
		}
		
		 @Then("^Click on Workflow textbox(.*)$")
		 public void Click_on_workflow_textbox(String workflowid) throws Throwable {
			 objUtilities.waitForPageLoad();
			 Assert.assertTrue(objDomainZpage.clickOnWorkflowTextbox(workflowid));
		 }

		 @Then("^Click on get tab button$")
		 public void Click_On_Get_Tab_Button() throws Throwable {
			 objUtilities.waitForPageLoad();
			 Assert.assertTrue(objDomainZpage.clickOnGetButton());
		 }
		
		 @Then("^Click on workflow search$")
		 public void Click_On_Workflow_Search() throws Throwable {
			 objUtilities.waitForPageLoad();
			 Assert.assertTrue(objDomainZpage.clickOnWorkflowSearch());
		 }
		 
		 @Then("^Click on workflow id$")
		 public void Click_On_Workflow_Id() throws Throwable {
			 objUtilities.waitForPageLoad();
			 Assert.assertTrue(objDomainZpage.clickOnWorkflowId());
		 }
		 
		 @Then("^Click on workflow link$")
		 public void Click_On_Workflow_Link() throws Throwable {
			 objUtilities.waitForPageLoad();
			 Assert.assertTrue(objDomainZpage.clickOnWorkflowlink());
		 }
		 
		 @Then("^Click on edit billing details$")
		 public void Click_On_Edit_Billing_Details() throws Throwable {
			 objUtilities.waitForPageLoad();
			 Assert.assertTrue(objDomainZpage.clickOnEditBillingDetails());
		 }
		 
		 @Then("^Click on view invoice$")
		 public void Click_On_View_Invoice() throws Throwable {
			 objUtilities.waitForPageLoad();
			 Assert.assertTrue(objDomainZpage.clickOnViewInvoice());
		 }
		 
		 @Then("^Click on create prepaid creditt accountt$")
		 public void Create_Prepaid_Credit_Account() throws Throwable {
			 objUtilities.waitForPageLoad();
			 Assert.assertTrue(objDomainZpage.ClickOnCreatePrepaidCreditAccount());
		 }
		 
		 @Then("^Click on radio button$")
		 public void Click_On_Radio_Button() throws Throwable {
			 objUtilities.waitForPageLoad();
			 Assert.assertTrue(objDomainZpage.ClickOnRadioButton());
		 }
		 
		 @Then("^Click on email receipt checkbox$")
		 public void Click_On_Email_Receipt_Checkbox() throws Throwable {
			 objUtilities.waitForPageLoad();
			 Assert.assertTrue(objDomainZpage.ClickOnEmailReceiptCheckbox());
		 }
		 
		 @Then("^Click on Login as client$")
		 public void Click_On_Login_As_Client() throws Throwable {
			 objUtilities.waitForPageLoad();
			 Assert.assertTrue(objDomainZpage.ClickOnLoginAsClient());
		 }
		 
		 @Then("^Click on accounts buttons$")
		 public void Click_On_Accounts_Button() throws Throwable {
			 objUtilities.waitForPageLoad();
			 Assert.assertTrue(objDomainZpage.ClickOnAccountsButton());
		 }
		 
		 @Then("^Click on credit card details$")
		 public void Click_On_Credit_Card_Details() throws Throwable {
			 objUtilities.waitForPageLoad();
			 Assert.assertTrue(objDomainZpage.ClickOnCreditCardDetails());
		 }
		 
		 @Then("^Enter credit card owner name (.*)$")
			public void Enter_credit_card_owner_name(String CardOwner) throws Throwable {
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objDomainZpage.enterCreditCardOwner(CardOwner));
			}
			
//			@Then("^Switch to iframe card number$")
//			public void switch_to_iframe() throws Throwable {
//				objUtilities.waitForPageLoad();
//				Assert.assertTrue(objDomainZpage.switchToFrame());
//			}

			@Then("^Enter credit card number (.*)$")
			public void Enter_credit_card_number(String CardNumber) throws Throwable {
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objDomainZpage.enterCreditCardNumber(CardNumber));
			}

//			@Then("^Switch to iframe card expiry month$")
//			public void switch_to_iframe_expity_month() throws Throwable {
//				objUtilities.waitForPageLoad();
//				Assert.assertTrue(objDomainZpage.switchToFrameExpiryMonth());
//			}

			@Then("^Select credit card expiry month (.*)$")
			public void Select_credit_card_expiry_month(String dropdownmonth) throws Throwable {
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objDomainZpage.enterCreditCardExpiryMonth(dropdownmonth));
			}

//			@Then("^Switch to iframe card expiry year$")
//			public void switch_to_iframe_expity_year() throws Throwable {
//				objUtilities.waitForPageLoad();
//				Assert.assertTrue(objDomainZpage.switchToFrameExpiryYear());
//			}

			@Then("^Select credit card expiry year (.*)$")
			public void Select_credit_card_expiry_year(String dropdownyear) throws Throwable {
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objDomainZpage.enterCreditCardExpiryYear(dropdownyear));
			}

//			@Then("^Switch to iframe card cvv$")
//			public void switch_to_iframe_CVV() throws Throwable {
//				objUtilities.waitForPageLoad();
//				Assert.assertTrue(objDomainZpage.switchToFrameCVV());
//			}

			@Then("^Enter card credit CVV number (.*)$")
			public void Enter_credit_card_CVV_number(String CVV) throws Throwable {
				objUtilities.waitForPageLoad();
				Assert.assertTrue(objDomainZpage.enterCreditCardCVV(CVV));
			}
		 
			 @Then("^Click on admin view button$")
			 public void Click_on_admin_view_button() throws Throwable {
				 objUtilities.waitForPageLoad();
				 Assert.assertTrue(objDomainZpage.ClickOnAdminViewButton());
			 }
			
			 @Then("^Enter NrCRM UserName (.*)$")
			 public void Enter_NrCRM_UserName(String username) throws Throwable {
			  objUtilities.waitForPageLoad();
			  Assert.assertTrue(objDomainZpage.setNrCRMUserName(username));
			 }
			 
			 @Then("^Enter NrCRM Password (.*)$")
			 public void Enter_NrCRM_Password(String password) throws Throwable {
				 objUtilities.waitForPageLoad();
				 Assert.assertTrue(objDomainZpage.setNrCRMPassword(password));
			 }

			 @Then("^Click NrCRM Login Button$")
			 public void Clear_NrCRM_Login_Button() throws Throwable {
				 objUtilities.waitForPageLoad();
				 Assert.assertTrue(objDomainZpage.clickNrCRMLoginButton());
			 }

			 @Then("^Enter Green code search box (.*)$")
			 public void Enter_Green_Code_Search_Box(String GreenCode) throws Throwable {
				 objUtilities.waitForPageLoad();
				 Assert.assertTrue(objDomainZpage.clickGreenCodeSearchBox(GreenCode));
			 }

			 @Then("^Click on Domain Price System$")
			 public void Click_Domain_Price_System() throws Throwable {
				 objUtilities.waitForPageLoad();
				 Assert.assertTrue(objDomainZpage.clickDomainPriceSystem());
			 }

			 @Then("^Enter set Domain Name (.*)$")
			 public void Enter_set_Domain_Name(String domainname) throws Throwable {
				 objUtilities.waitForPageLoad();
				 Assert.assertTrue(objDomainZpage.settextDomainName(domainname));
			 }

			 @Then("^Select Drop Down Option (.*)$")
			 public void Select_Drop_Down_Option(int dropdowndomain) throws Throwable {
				 objUtilities.waitForPageLoad();
				 Assert.assertTrue(objDomainZpage.selectDropDownDomain(dropdowndomain));
			 }

			 @Then("^Select Registration Period (.*)$")
			 public void Select_Registration_Period(String dropdownPeriod) throws Throwable {
				 objUtilities.waitForPageLoad();
				 Assert.assertTrue(objDomainZpage.selectRegistrationPeriod(dropdownPeriod));
			 }

			 @Then("^Get Reference ID$")
			 public void Get_Reference_ID() throws Throwable {
				 objUtilities.waitForPageLoad();
				 Assert.assertTrue(objDomainZpage.getrefrenceID());
				 objUtilities.waitForPageLoad();
			 }

			 @Then("^Click Search Workflow Id$")
			 public void Click_Search_Workflow_Id() throws Throwable {
				 objUtilities.waitForPageLoad();
				 Assert.assertTrue(objDomainZpage.clickSearchWorkflowId());
			 }
			 
			 @Then("^Set Search Workflow Id (.*)$")
			 public void Set_Search_Workflow_Id(String workflow) throws Throwable {
			  objUtilities.waitForPageLoad();
			  Assert.assertTrue(objDomainZpage.setWorkflowId(workflow));
			 }

			 @Then("^Click on Get Workflow Button$")
			 public void Click_on_Get_Workflow_Button() throws Throwable {
				 objUtilities.waitForPageLoad();
				 Assert.assertTrue(objDomainZpage.clickOnGetWorkflowButton());
			 }
			 
			 @Then("^Click On Get Workflow id Number$")
			 public void Click_On_Get_Workflow_Id_Number() throws Throwable {
				 objUtilities.waitForPageLoad();
				 Assert.assertTrue(objDomainZpage.clickOnGetWorkflowidNumber());
			 }
			 
			 @Then("^Click On This Workflow$")
			 public void click_On_This_Workflow() throws Throwable {
				 objUtilities.waitForPageLoad();
				 Assert.assertTrue(objDomainZpage.clickOnThisWorkflow());
			 }
			 
			 @Then("^Click On This Workflow Details$")
			 public void click_On_Workflow_Details() throws Throwable {
				 objUtilities.waitForPageLoad();
				 Assert.assertTrue(objDomainZpage.clickOnWorkflowDetails());
			 }
			 
			 @Then("^Click On Execute Button$")
			 public void click_On_Execute_Button() throws Throwable {
				 objUtilities.waitForPageLoad();
				 Assert.assertTrue(objDomainZpage.clickOnExecuteButton());
			 }
			 
			 @Then("^click On Execute Action$")
			 public void click_On_Execute_Action() throws Throwable {
				 objUtilities.waitForPageLoad();
				 Assert.assertTrue(objDomainZpage.clicknExecuteAction());
			 }
			 
			 @Then("^Click Login As Client$")
			 public void click_Login_As_Client() throws Throwable {
				 objUtilities.waitForPageLoad();
				 Assert.assertTrue(objDomainZpage.clickLoginAsClient());
			 }
			 
			 @Then("^Click on Account Button$")
			 public void click_On_Account_Button() throws Throwable {
				 objUtilities.waitForPageLoad();
				 Assert.assertTrue(objDomainZpage.clickOnAccountButton());
			 }
			 
			 @Then("^Click On Edit Button$")
			 public void click_On_Edit_Button() throws Throwable {
				 objUtilities.waitForPageLoad();
				 Assert.assertTrue(objDomainZpage.clickOnEditButton());
			 }
			 
			 @Then("^Click On CheckBox Button$")
			 public void click_On_Check_Box_Button() throws Throwable {
				 objUtilities.waitForPageLoad();
				 Assert.assertTrue(objDomainZpage.clickOnCheckBoxButton());
			 }
			 
			 @Then("^Click On saves Button$")
			 public void click_On_Save_Button() throws Throwable {
				 objUtilities.waitForPageLoad();
				 Assert.assertTrue(objDomainZpage.clickOnSaveButton());
			 }
			 
			 @Then("^set Admin Domain Name (.*)$")
			 public void set_Admin_Domain_Name(String domain) throws Throwable {
			  objUtilities.waitForPageLoad();
			  Assert.assertTrue(objDomainZpage.setAdminDomainName(domain));
			 }
			 
			 @Then("^click On Admin Search Button$")
			 public void click_On_Admin_Search_Button() throws Throwable {
				 objUtilities.waitForPageLoad();
				 Assert.assertTrue(objDomainZpage.clickOnAdminSearchButton());
			 }
			 
			 @Then("^Set Search Workflow Idd(.*)$")
			 public void Set_Search_Workflow_Idd(String workfloww) throws Throwable {
			  objUtilities.waitForPageLoad();
			  Assert.assertTrue(objDomainZpage.setWorkflowIdd(workfloww));
			 }
			 
			 @Then("^Click on search customer ID(.*)$")
			 public void Click_on_search_customer_ID(String cutomerID) throws Throwable {
				 objUtilities.waitForPageLoad();
				 Assert.assertTrue(objDomainZpage.clickOnSearchGreenTextbox(cutomerID));
			 }

			 @Then("^Click On Search Symbol$")
			 public void click_On_Search_Symbol() throws Throwable {
				 objUtilities.waitForPageLoad();
				 Assert.assertTrue(objDomainZpage.clickOnSearchSymboll());
			 }
			 

			 @Then("^Click On Token Number$")
			 public void Click_On_Token_Number() throws Throwable {
				 objUtilities.waitForPageLoad();
				 Assert.assertTrue(objDomainZpage.clickOnTokenNumber());
			 }
}
