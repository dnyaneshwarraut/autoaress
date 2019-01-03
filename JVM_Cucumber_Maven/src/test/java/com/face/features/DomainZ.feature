Feature: DomainZ 
@AlphaNumeric
Scenario Outline: A customer inputs data - "AlphaNumeric Characters" in card owner field
	
	Given Enter domain name <domainname>
	Then Select domain service 
	Then Uncheck au domain service
	Then Click on search button
	Then Click on cotinue to checkout button
#	Then Click on No thanks pop up
	Then Click on continue to account
	Then Enter organisation name <Organisationname>
	Then Enter first name <FirstName>
	Then Enter last name <LastName>
	Then Enter address <Address>
	Then Enter city name <CityName>
	Then Select state <State>
	Then Enter post code <PostCode> 
	Then Enter phone number <PhoneNumber>
	Then Enter email <Email>
	Then Enter confirmation mail <ConfirmationEmail>
	Then Click on continue to payment page
	Then Click on continue to registrant page
	Then Enter card owner name <CardOwner>
	Then Switch to iframe card number
	Then Enter card number <CardNumber>
	Then Switch to iframe card expiry month
	Then Select card expiry month <dropdownmonth>
	Then Switch to iframe card expiry year
	Then Select card expiry year <dropdownyear>
	Then Switch to iframe card cvv
	Then Enter card CVV number <CVV>
#	Then Select auto renewal checkbox
	Then Select I agree checkbox
	Then Click on continue button
	
Examples:
	| domainname                 | Organisationname     | FirstName | LastName | Address               | CityName | State        | PostCode | PhoneNumber  | Email                      | ConfirmationEmail          | CardOwner              | CardNumber       | dropdownmonth | dropdownyear | CVV | 
	| testdomainautomation3131   | Payment Gateway Test | QA        | Team     | 2/469 La Trobe Street | Auckland | North Island | 0626     | 064411111111 | testing@melbourneit.com.au | testing@melbourneit.com.au | AlphaNumeric0123456789 | 4111111111111111 | 12            | 2019         | 456 |
  
@SpecialCharacters
Scenario Outline: A customer inputs data - "Special Characters" in card owner field
	
	Given Enter domain name <domainname>
	Then Select domain service 
	Then Uncheck au domain service
	Then Click on search button
	Then Click on cotinue to checkout button
	Then Click on No thanks pop up
	Then Click on continue to account
	Then Enter organisation name <Organisationname>
	Then Enter first name <FirstName>
	Then Enter last name <LastName>
	Then Enter address <Address>
	Then Enter city name <CityName>
	Then Select state <State>
	Then Enter post code <PostCode> 
	Then Enter phone number <PhoneNumber>
	Then Enter email <Email>
	Then Enter confirmation mail <ConfirmationEmail>
	Then Click on continue to payment page
	Then Click on continue to registrant page
	Then Enter card owner name <CardOwner>
	Then Switch to iframe card number
	Then Enter card number <CardNumber>
	Then Switch to iframe card expiry month
	Then Select card expiry month <dropdownmonth>
	Then Switch to iframe card expiry year
	Then Select card expiry year <dropdownyear>
	Then Switch to iframe card cvv
	Then Enter card CVV number <CVV>
#	Then Select auto renewal checkbox
	Then Select I agree checkbox
	Then Click on continue button
	
Examples:
	| domainname             | Organisationname     | FirstName | LastName | Address               | CityName | State        | PostCode | PhoneNumber  | Email                      | ConfirmationEmail          | CardOwner               | CardNumber       | dropdownmonth | dropdownyear | CVV | 
	| testpgcardowner00278   | Payment Gateway Test | QA        | Team     | 2/469 La Trobe Street | Auckland | North Island | 0626     | 064411111111 | testing@melbourneit.com.au | testing@melbourneit.com.au | Test!"*#%&()^:;<>=?[/]_ | 4111111111111111 | 12            | 2019         | 456 |

@FullStopandSpaces
Scenario Outline:  A customer inputs data - "Full Stop and Spaces" in card owner field
	
	Given Enter domain name <domainname>
	Then Select domain service 
	Then Uncheck au domain service
	Then Click on search button
	Then Click on cotinue to checkout button
	Then Click on No thanks pop up
	Then Click on continue to account
	Then Enter organisation name <Organisationname>
	Then Enter first name <FirstName>
	Then Enter last name <LastName>
	Then Enter address <Address>
	Then Enter city name <CityName>
	Then Select state <State>
	Then Enter post code <PostCode> 
	Then Enter phone number <PhoneNumber>
	Then Enter email <Email>
	Then Enter confirmation mail <ConfirmationEmail>
	Then Click on continue to payment page
	Then Click on continue to registrant page
	Then Enter card owner name <CardOwner>
	Then Switch to iframe card number
	Then Enter card number <CardNumber>
	Then Switch to iframe card expiry month
	Then Select card expiry month <dropdownmonth>
	Then Switch to iframe card expiry year
	Then Select card expiry year <dropdownyear>
	Then Switch to iframe card cvv
	Then Enter card CVV number <CVV>
#	Then Select auto renewal checkbox
	Then Select I agree checkbox
	Then Click on continue button
	
Examples:
	| domainname             | Organisationname     | FirstName | LastName | Address               | CityName | State        | PostCode | PhoneNumber  | Email                      | ConfirmationEmail          | CardOwner    | CardNumber       | dropdownmonth | dropdownyear | CVV | 
	| testpgcardowner00278   | Payment Gateway Test | QA        | Team     | 2/469 La Trobe Street | Auckland | North Island | 0626     | 064411111111 | testing@melbourneit.com.au | testing@melbourneit.com.au | Mr. John Doe | 4111111111111111 | 12            | 2019         | 456 |
		
@MaximumLength
Scenario Outline: A customer inputs data - "26 Characters(Maximum Length)" in card owner field
	
	Given Enter domain name <domainname>
	Then Select domain service 
	Then Uncheck au domain service
	Then Click on search button
	Then Click on cotinue to checkout button
	Then Click on No thanks pop up
	Then Click on continue to account
	Then Enter organisation name <Organisationname>
	Then Enter first name <FirstName>
	Then Enter last name <LastName>
	Then Enter address <Address>
	Then Enter city name <CityName>
	Then Select state <State>
	Then Enter post code <PostCode> 
	Then Enter phone number <PhoneNumber>
	Then Enter email <Email>
	Then Enter confirmation mail <ConfirmationEmail>
	Then Click on continue to payment page
	Then Click on continue to registrant page
	Then Enter card owner name <CardOwner>
	Then Switch to iframe card number
	Then Enter card number <CardNumber>
	Then Switch to iframe card expiry month
	Then Select card expiry month <dropdownmonth>
	Then Switch to iframe card expiry year
	Then Select card expiry year <dropdownyear>
	Then Switch to iframe card cvv
	Then Enter card CVV number <CVV>
#	Then Select auto renewal checkbox
	Then Select I agree checkbox
	Then Click on continue button
	
Examples:
	| domainname             | Organisationname     | FirstName | LastName | Address               | CityName | State        | PostCode | PhoneNumber  | Email                      | ConfirmationEmail          | CardOwner                  | CardNumber       | dropdownmonth | dropdownyear | CVV | 
	| testpgcardowner00278   | Payment Gateway Test | QA        | Team     | 2/469 La Trobe Street | Auckland | North Island | 0626     | 064411111111 | testing@melbourneit.com.au | testing@melbourneit.com.au | Mr. Payment Gateway Test01 | 4111111111111111 | 12            | 2019         | 456 |

@Nodata1
Scenario Outline: A customer inputs no data for card owner, card number and card security code
	
	Given Enter domain name <domainname>
	Then Select domain service 
	Then Uncheck au domain service
	Then Click on search button
	Then Click on cotinue to checkout button
	Then Click on No thanks pop up
	Then Click on continue to account
	Then Enter organisation name <Organisationname>
	Then Enter first name <FirstName>
	Then Enter last name <LastName>
	Then Enter address <Address>
	Then Enter city name <CityName>
	Then Select state <State>
	Then Enter post code <PostCode> 
	Then Enter phone number <PhoneNumber>
	Then Enter email <Email>
	Then Enter confirmation mail <ConfirmationEmail>
	Then Click on continue to payment page
	Then Click on continue to registrant page
	Then Enter card owner name <CardOwner>
	Then Clear text from card owner field
	Then Verify alert message for card owner field <msgcardowner>
	Then Switch to iframe card number
	Then Enter card number <CardNumber>
	Then Clear number from card number field
	Then Switch to iframe card expiry month
	Then Select card expiry month <dropdownmonth>
	Then Switch to iframe card expiry year
	Then Select card expiry year <dropdownyear>
	Then Switch to iframe card cvv
	Then Enter card CVV number <CVV>
	Then Clear number from card CVV field
	Then Select I agree checkbox
	Then Verify alert message for card number field <msgcardnumber>
	Then Verify alert message for CVV field <msgcvv>
	
	
Examples:
	| domainname             | Organisationname     | FirstName | LastName | Address               | CityName | State        | PostCode | PhoneNumber  | Email                      | ConfirmationEmail          | CardOwner                  | msgcardowner                   | CardNumber        | dropdownmonth | dropdownyear | CVV | msgcardnumber                   | msgcvv                                 |  
	| testpgcardowner00278   | Payment Gateway Test | QA        | Team     | 2/469 La Trobe Street | Auckland | North Island | 0626     | 064411111111 | testing@melbourneit.com.au | testing@melbourneit.com.au | Mr. Payment Gateway Test01 | Card Owner is a required field | 4111111111111111  | 12            | 2019         | 456 | Card Number is a required field | Card Security Code is a required field |

@Negativetesting
Scenario Outline: A customer inputs card number less than 16 digits
	
	Given Enter domain name <domainname>
	Then Select domain service 
	Then Uncheck au domain service
	Then Click on search button
	Then Click on cotinue to checkout button
	Then Click on No thanks pop up
	Then Click on continue to account
	Then Enter organisation name <Organisationname>
	Then Enter first name <FirstName>
	Then Enter last name <LastName>
	Then Enter address <Address>
	Then Enter city name <CityName>
	Then Select state <State>
	Then Enter post code <PostCode> 
	Then Enter phone number <PhoneNumber>
	Then Enter email <Email>
	Then Enter confirmation mail <ConfirmationEmail>
	Then Click on continue to payment page
	Then Click on continue to registrant page
	Then Enter card owner name <CardOwner>
	Then Switch to iframe card number
	Then Enter card number <CardNumber>
	Then Switch to iframe card expiry month
	Then Select card expiry month <dropdownmonth>
	Then Switch to iframe card expiry year
	Then Select card expiry year <dropdownyear>
	Then Switch to iframe card cvv
	Then Enter card CVV number <CVV>
	Then Select I agree checkbox
	Then Verify alert message invalid card number <invalidCardNum> 
	
Examples:
	| domainname             | Organisationname     | FirstName | LastName | Address               | CityName | State        | PostCode | PhoneNumber  | Email                      | ConfirmationEmail          | CardOwner              | CardNumber       | dropdownmonth | dropdownyear | CVV | invalidCardNum         | 
	| testpgcardowner00278   | Payment Gateway Test | QA        | Team     | 2/469 La Trobe Street | Auckland | North Island | 0626     | 064411111111 | testing@melbourneit.com.au | testing@melbourneit.com.au | Test Card Number Count | 555555555555444  | 12            | 2019         | 888 | Card Number is invalid |

@Negativetesting1
Scenario Outline: A customer inputs security code less than 3 digits
	
	Given Enter domain name <domainname>
	Then Select domain service 
	Then Uncheck au domain service
	Then Click on search button
	Then Click on cotinue to checkout button
	Then Click on No thanks pop up
	Then Click on continue to account
	Then Enter organisation name <Organisationname>
	Then Enter first name <FirstName>
	Then Enter last name <LastName>
	Then Enter address <Address>
	Then Enter city name <CityName>
	Then Select state <State>           
	Then Enter post code <PostCode> 
	Then Enter phone number <PhoneNumber>
	Then Enter email <Email>
	Then Enter confirmation mail <ConfirmationEmail>
	Then Click on continue to payment page
	Then Click on continue to registrant page
	Then Enter card owner name <CardOwner>
	Then Switch to iframe card number
	Then Enter card number <CardNumber>
	Then Switch to iframe card expiry month
	Then Select card expiry month <dropdownmonth>
	Then Switch to iframe card expiry year
	Then Select card expiry year <dropdownyear>
	Then Switch to iframe card cvv
	Then Enter card CVV number <CVV>
	Then Select I agree checkbox
	Then Verify alert message invalid cvv number <invalidCvvNum> 
	
Examples:
	| domainname             | Organisationname     | FirstName | LastName | Address               | CityName | State        | PostCode | PhoneNumber  | Email                      | ConfirmationEmail          | CardOwner              | CardNumber        | dropdownmonth | dropdownyear | CVV | invalidCvvNum                 | 
	| testpgcardowner00999   | Payment Gateway Test | QA        | Team     | 2/469 La Trobe Street | Auckland | North Island | 0626     | 064411111111 | testing@melbourneit.com.au | testing@melbourneit.com.au | Test Card Number Count | 4111111111111111  | 12            | 2019         | 12  | Card Security Code is invalid |
	
	
 
@AlphaTesting
Scenario Outline: View Payment Method on the Customer Portal Checkout.

	Given Enter domain name <domainname>
	Then Select domain service 
	Then Uncheck au domain service
	Then Click on search button
	Then Click on cotinue to checkout button
	Then Click on No thanks pop up
	Then Click on continue to account
	Then Enter organisation name <Organisationname>
	Then Enter first name <FirstName>
	Then Enter last name <LastName>
	Then Enter address <Address>
	Then Enter city name <CityName>
	Then Select state <State>
	Then Enter post code <PostCode> 
	Then Enter phone number <PhoneNumber>
	Then Enter email <Email>
	Then Enter confirmation mail <ConfirmationEmail>
	Then Click on continue to payment page
	Then Click on continue to registrant page
	Then Enter card owner name <CardOwner>
	Then Switch to iframe card number
	Then Enter card number <CardNumber>
	Then Switch to iframe card expiry month
	Then Select card expiry month <dropdownmonth>
	Then Switch to iframe card expiry year
	Then Select card expiry year <dropdownyear>
	Then Switch to iframe card cvv
	Then Enter card CVV number <CVV>
#	Then Select auto renewal checkbox
	Then Select I agree checkbox
	Then Click on continue button
	Then Get Green code text
	
		
Examples:
	| domainname                 | Organisationname     | FirstName | LastName | Address               | CityName | State        | PostCode | PhoneNumber  | Email                      | ConfirmationEmail          | CardOwner              | CardNumber       | dropdownmonth | dropdownyear | CVV | 
	| testpgcardowner002562636   | Payment Gateway Test | QA        | Team     | 2/469 La Trobe Street | Auckland | North Island | 0626     | 064411111111 | testing@melbourneit.com.au | testing@melbourneit.com.au | AlphaNumeric0123456789 | 4111111111111111 | 12            | 2019         | 456 |
	
# PG - 72 
@AlphaClientA
Scenario Outline: A customer inputs data - "AlphaNumeric Characters" in card owner field

	Given Enter domain name <domainname>
	Then Select domain service 
	Then Uncheck au domain service
	Then Click on search button
	Then Click on cotinue to checkout button
	Then Click on No thanks pop up
	Then Click on continue to account
	Then Enter organisation name <Organisationname>
	Then Enter first name <FirstName>
	Then Enter last name <LastName>
	Then Enter address <Address>
	Then Enter city name <CityName>
	Then Select state <State>
	Then Enter post code <PostCode> 
	Then Enter phone number <PhoneNumber>
	Then Enter email <Email>
	Then Enter confirmation mail <ConfirmationEmail>
	Then Click on continue to payment page
	Then Click on continue to registrant page
	Then Enter card owner name <CardOwner>
	Then Switch to iframe card number
	Then Enter card number <CardNumber>
	Then Switch to iframe card expiry month
	Then Select card expiry month <dropdownmonth>
	Then Switch to iframe card expiry year
	Then Select card expiry year <dropdownyear>
	Then Switch to iframe card cvv
	Then Enter card CVV number <CVV>
#	Then Select auto renewal checkbox
	Then Select I agree checkbox
	Then Click on continue button
	Then Get Green code text
	
		
Examples:
	| domainname                 | Organisationname     | FirstName | LastName | Address               | CityName | State        | PostCode | PhoneNumber  | Email                      | ConfirmationEmail          | CardOwner              | CardNumber       | dropdownmonth | dropdownyear | CVV | 
	| testpgcardowner002         | Payment Gateway Test | QA        | Team     | 2/469 La Trobe Street | Auckland | North Island | 0626     | 064411111111 | testing@melbourneit.com.au | testing@melbourneit.com.au | AlphaNumeric0123456789 | 4111111111111111 | 12            | 2019         | 456 |
  
		
@AlphaClientB
Scenario Outline: A customer inputs data - "Special Characters" in card owner field

	Given Enter domain name <domainname>
	Then Select domain service 
	Then Uncheck au domain service
	Then Click on search button
	Then Click on cotinue to checkout button
	Then Click on No thanks pop up
	Then Click on continue to account
	Then Enter organisation name <Organisationname>
	Then Enter first name <FirstName>
	Then Enter last name <LastName>
	Then Enter address <Address>
	Then Enter city name <CityName>
	Then Select state <State>
	Then Enter post code <PostCode> 
	Then Enter phone number <PhoneNumber>
	Then Enter email <Email>
	Then Enter confirmation mail <ConfirmationEmail>
	Then Click on continue to payment page
	Then Click on continue to registrant page
	Then Enter card owner name <CardOwner>
	Then Switch to iframe card number
	Then Enter card number <CardNumber>
	Then Switch to iframe card expiry month
	Then Select card expiry month <dropdownmonth>
	Then Switch to iframe card expiry year
	Then Select card expiry year <dropdownyear>
	Then Switch to iframe card cvv
	Then Enter card CVV number <CVV>
#	Then Select auto renewal checkbox
	Then Select I agree checkbox
	Then Click on continue button
	Then Get Green code text
	
		
Examples:
	| domainname                 | Organisationname     | FirstName | LastName | Address               | CityName | State        | PostCode | PhoneNumber  | Email                      | ConfirmationEmail          | CardOwner               | CardNumber       | dropdownmonth | dropdownyear | CVV | 
	| testpankajtesting0070      | Payment Gateway Test | QA        | Team     | 2/469 La Trobe Street | Auckland | North Island | 0626     | 064411111111 | testing@melbourneit.com.au | testing@melbourneit.com.au | Test!"*#%&()^:;<>=?[/]_ | 4111111111111111 | 12            | 2019         | 456 |
  
		
  
@AlphaClientC
Scenario Outline:  A customer inputs data - "Full Stop and Spaces" in card owner field

	Given Enter domain name <domainname>
	Then Select domain service 
	Then Uncheck au domain service
	Then Click on search button
	Then Click on cotinue to checkout button
	Then Click on No thanks pop up
	Then Click on continue to account
	Then Enter organisation name <Organisationname>
	Then Enter first name <FirstName>
	Then Enter last name <LastName>
	Then Enter address <Address>
	Then Enter city name <CityName>
	Then Select state <State>
	Then Enter post code <PostCode> 
	Then Enter phone number <PhoneNumber>
	Then Enter email <Email>
	Then Enter confirmation mail <ConfirmationEmail>
	Then Click on continue to payment page
	Then Click on continue to registrant page
	Then Enter card owner name <CardOwner>
	Then Switch to iframe card number
	Then Enter card number <CardNumber>
	Then Switch to iframe card expiry month
	Then Select card expiry month <dropdownmonth>
	Then Switch to iframe card expiry year
	Then Select card expiry year <dropdownyear>
	Then Switch to iframe card cvv
	Then Enter card CVV number <CVV>
#	Then Select auto renewal checkbox
	Then Select I agree checkbox
	Then Click on continue button
	Then Get Green code text
	
		
Examples:
	| domainname                 | Organisationname     | FirstName | LastName | Address               | CityName | State        | PostCode | PhoneNumber  | Email                      | ConfirmationEmail          | CardOwner              | CardNumber       | dropdownmonth | dropdownyear | CVV | 
	| testpankajtesting007       | Payment Gateway Test | QA        | Team     | 2/469 La Trobe Street | Auckland | North Island | 0626     | 064411111111 | testing@melbourneit.com.au | testing@melbourneit.com.au | Mr. John Doe           | 4111111111111111 | 12            | 2019         | 456 |
  
		
  
@AlphaClientD
Scenario Outline: A customer inputs data - "26 Characters(Maximum Length)" in card owner field

	Given Enter domain name <domainname>
	Then Select domain service 
	Then Uncheck au domain service
	Then Click on search button
	Then Click on cotinue to checkout button
	Then Click on No thanks pop up
	Then Click on continue to account
	Then Enter organisation name <Organisationname>
	Then Enter first name <FirstName>
	Then Enter last name <LastName>
	Then Enter address <Address>
	Then Enter city name <CityName>
	Then Select state <State>
	Then Enter post code <PostCode> 
	Then Enter phone number <PhoneNumber>
	Then Enter email <Email>
	Then Enter confirmation mail <ConfirmationEmail>
	Then Click on continue to payment page
	Then Click on continue to registrant page
	Then Enter card owner name <CardOwner>
	Then Switch to iframe card number
	Then Enter card number <CardNumber>
	Then Switch to iframe card expiry month
	Then Select card expiry month <dropdownmonth>
	Then Switch to iframe card expiry year
	Then Select card expiry year <dropdownyear>
	Then Switch to iframe card cvv
	Then Enter card CVV number <CVV>
#	Then Select auto renewal checkbox
	Then Select I agree checkbox
	Then Click on continue button
#	Then Get Green code text
	
		
Examples:
	| domainname                 | Organisationname     | FirstName | LastName | Address               | CityName | State        | PostCode | PhoneNumber  | Email                      | ConfirmationEmail          | CardOwner                  | CardNumber       | dropdownmonth | dropdownyear | CVV | 
	| testpankajtesting7000      | Payment Gateway Test | QA        | Team     | 2/469 La Trobe Street | Auckland | North Island | 0626     | 064411111111 | testing@melbourneit.com.au | testing@melbourneit.com.au | Mr. Payment Gateway Test01 | 4111111111111111 | 12            | 2019         | 456 |
  
		
  
@AlphaClientE
Scenario Outline: A customer inputs no data for card owner, card number and card security code

	Given Enter domain name <domainname>
	Then Select domain service 
	Then Uncheck au domain service
	Then Click on search button
	Then Click on cotinue to checkout button
	Then Click on No thanks pop up
	Then Click on continue to account
	Then Enter organisation name <Organisationname>
	Then Enter first name <FirstName>
	Then Enter last name <LastName>
	Then Enter address <Address>
	Then Enter city name <CityName>
	Then Select state <State>
	Then Enter post code <PostCode> 
	Then Enter phone number <PhoneNumber>
	Then Enter email <Email>
	Then Enter confirmation mail <ConfirmationEmail>
	Then Click on continue to payment page
	Then Click on continue to registrant page
	Then Enter card owner name <CardOwner>
	Then Switch to iframe card number
	Then Enter card number <CardNumber>
	Then Switch to iframe card expiry month
	Then Select card expiry month <dropdownmonth>
	Then Switch to iframe card expiry year
	Then Select card expiry year <dropdownyear>
	Then Switch to iframe card cvv
	Then Enter card CVV number <CVV>
#	Then Select auto renewal checkbox
	Then Select I agree checkbox
	Then Click on continue button
#	Then Get Green code text
	
		
Examples:
	| domainname                 | Organisationname     | FirstName | LastName | Address               | CityName | State        | PostCode | PhoneNumber  | Email                      | ConfirmationEmail          | CardOwner              | CardNumber       | dropdownmonth | dropdownyear | CVV | 
	| testpankajtesting4512      | Payment Gateway Test | QA        | Team     | 2/469 La Trobe Street | Auckland | North Island | 0626     | 064411111111 | testing@melbourneit.com.au | testing@melbourneit.com.au |                        |                  | 12            | 2019         |     |
  
		
  
@AlphaClientF
Scenario Outline: A customer inputs card number less than 16 digits

	Given Enter domain name <domainname>
	Then Select domain service 
	Then Uncheck au domain service
	Then Click on search button
	Then Click on cotinue to checkout button
	Then Click on No thanks pop up
	Then Click on continue to account
	Then Enter organisation name <Organisationname>
	Then Enter first name <FirstName>
	Then Enter last name <LastName>
	Then Enter address <Address>
	Then Enter city name <CityName>
	Then Select state <State>
	Then Enter post code <PostCode> 
	Then Enter phone number <PhoneNumber>
	Then Enter email <Email>
	Then Enter confirmation mail <ConfirmationEmail>
	Then Click on continue to payment page
	Then Click on continue to registrant page
	Then Enter card owner name <CardOwner>
	Then Switch to iframe card number
	Then Enter card number <CardNumber>
	Then Switch to iframe card expiry month
	Then Select card expiry month <dropdownmonth>
	Then Switch to iframe card expiry year
	Then Select card expiry year <dropdownyear>
	Then Switch to iframe card cvv
	Then Enter card CVV number <CVV>
#	Then Select auto renewal checkbox
	Then Select I agree checkbox
	Then Click on continue button
	Then Get Green code text
	
		
Examples:
	| domainname                 | Organisationname     | FirstName | LastName | Address               | CityName | State        | PostCode | PhoneNumber  | Email                      | ConfirmationEmail          | CardOwner              | CardNumber       | dropdownmonth | dropdownyear | CVV | 
	| ttestpankajtesting4526     | Payment Gateway Test | QA        | Team     | 2/469 La Trobe Street | Auckland | North Island | 0626     | 064411111111 | testing@melbourneit.com.au | testing@melbourneit.com.au | AlphaNumeric0123456789 | 411111111111111  | 12            | 2019         | 888 |
  
		
  
@AlphaClientG
Scenario Outline: A customer inputs card number more than 16 digits

	Given Enter domain name <domainname>
	Then Select domain service 
	Then Uncheck au domain service
	Then Click on search button
	Then Click on cotinue to checkout button
	Then Click on No thanks pop up
	Then Click on continue to account
	Then Enter organisation name <Organisationname>
	Then Enter first name <FirstName>
	Then Enter last name <LastName>
	Then Enter address <Address>
	Then Enter city name <CityName>
	Then Select state <State>
	Then Enter post code <PostCode> 
	Then Enter phone number <PhoneNumber>
	Then Enter email <Email>
	Then Enter confirmation mail <ConfirmationEmail>
	Then Click on continue to payment page
	Then Click on continue to registrant page
	Then Enter card owner name <CardOwner>
	Then Switch to iframe card number
	Then Enter card number <CardNumber>
	Then Switch to iframe card expiry month
	Then Select card expiry month <dropdownmonth>
	Then Switch to iframe card expiry year
	Then Select card expiry year <dropdownyear>
	Then Switch to iframe card cvv
	Then Enter card CVV number <CVV>
#	Then Select auto renewal checkbox
	Then Select I agree checkbox
	Then Click on continue button
	Then Get Green code text
	
		
Examples:
	| domainname                 | Organisationname     | FirstName | LastName | Address               | CityName | State        | PostCode | PhoneNumber  | Email                      | ConfirmationEmail          | CardOwner              | CardNumber         | dropdownmonth | dropdownyear | CVV | 
	| ttestpankajjetesting4526   | Payment Gateway Test | QA        | Team     | 2/469 La Trobe Street | Auckland | North Island | 0626     | 064411111111 | testing@melbourneit.com.au | testing@melbourneit.com.au | AlphaNumeric0123456789 | 411111111111111111 | 12            | 2019         | 456 |
  
		
  
@AlphaClientH
Scenario Outline: A customer inputs security code less than 3 digits

	Given Enter domain name <domainname>
	Then Select domain service 
	Then Uncheck au domain service
	Then Click on search button
	Then Click on cotinue to checkout button
	Then Click on No thanks pop up
	Then Click on continue to account
	Then Enter organisation name <Organisationname>
	Then Enter first name <FirstName>
	Then Enter last name <LastName>
	Then Enter address <Address>
	Then Enter city name <CityName>
	Then Select state <State>
	Then Enter post code <PostCode> 
	Then Enter phone number <PhoneNumber>
	Then Enter email <Email>
	Then Enter confirmation mail <ConfirmationEmail>
	Then Click on continue to payment page
	Then Click on continue to registrant page
	Then Enter card owner name <CardOwner>
	Then Switch to iframe card number
	Then Enter card number <CardNumber>
	Then Switch to iframe card expiry month
	Then Select card expiry month <dropdownmonth>
	Then Switch to iframe card expiry year
	Then Select card expiry year <dropdownyear>
	Then Switch to iframe card cvv
	Then Enter card CVV number <CVV>
#	Then Select auto renewal checkbox
	Then Select I agree checkbox
	Then Click on continue button
	Then Get Green code text
	
		
Examples:
	| domainname                 | Organisationname     | FirstName | LastName | Address               | CityName | State        | PostCode | PhoneNumber  | Email                      | ConfirmationEmail          | CardOwner              | CardNumber       | dropdownmonth | dropdownyear | CVV | 
	| ttestpankhgfetesting4656   | Payment Gateway Test | QA        | Team     | 2/469 La Trobe Street | Auckland | North Island | 0626     | 064411111111 | testing@melbourneit.com.au | testing@melbourneit.com.au | AlphaNumeric0123456789 | 4111111111111111 | 12            | 2019         | 45  |
  
		
  
@AlphaClientI
Scenario Outline: A customer purchases a domain with accepted credit cards

	Given Enter domain name <domainname>
	Then Select domain service 
	Then Uncheck au domain service
	Then Click on search button
	Then Click on cotinue to checkout button
	Then Click on No thanks pop up
	Then Click on continue to account
	Then Enter organisation name <Organisationname>
	Then Enter first name <FirstName>
	Then Enter last name <LastName>
	Then Enter address <Address>
	Then Enter city name <CityName>
	Then Select state <State>
	Then Enter post code <PostCode> 
	Then Enter phone number <PhoneNumber>
	Then Enter email <Email>
	Then Enter confirmation mail <ConfirmationEmail>
	Then Click on continue to payment page
	Then Click on continue to registrant page
	Then Enter card owner name <CardOwner>
	Then Switch to iframe card number
	Then Enter card number <CardNumber>
	Then Switch to iframe card expiry month
	Then Select card expiry month <dropdownmonth>
	Then Switch to iframe card expiry year
	Then Select card expiry year <dropdownyear>
	Then Switch to iframe card cvv
	Then Enter card CVV number <CVV>
#	Then Select auto renewal checkbox
	Then Select I agree checkbox
	Then Click on continue button
	Then Get Green code text
    Then Enter BrainTree UserName <userName>
	Then Enter BrainTree password <password>
	Then Click on login button
	
		
Examples:
	| domainname                 | Organisationname     | FirstName | LastName | Address               | CityName | State        | PostCode | PhoneNumber  | Email                      | ConfirmationEmail          | CardOwner              | CardNumber       | dropdownmonth | dropdownyear | CVV | userName    | password    | 
	| bestpankhgfetesting9956    | Payment Gateway Test | QA        | Team     | 2/469 La Trobe Street | Auckland | North Island | 0626     | 064411111111 | testing@melbourneit.com.au | testing@melbourneit.com.au | AlphaNumeric0123456789 | 4111111111111111 | 12            | 2019         | 456 | makeyanvesh | Me!bourne1t |
  
		
  @AlphaClientJ
Scenario Outline: A customer purchases a domain with accepted credit cards

	Given Enter domain name <domainname>
	Then Select domain service 
	Then Uncheck au domain service
	Then Click on search button
	Then Click on cotinue to checkout button
	Then Click on No thanks pop up
	Then Click on continue to account
	Then Enter organisation name <Organisationname>
	Then Enter first name <FirstName>
	Then Enter last name <LastName>
	Then Enter address <Address>
	Then Enter city name <CityName>
	Then Select state <State>
	Then Enter post code <PostCode> 
	Then Enter phone number <PhoneNumber>
	Then Enter email <Email>
	Then Enter confirmation mail <ConfirmationEmail>
	Then Click on continue to payment page
	Then Click on continue to registrant page
	Then Enter card owner name <CardOwner>
	Then Switch to iframe card number
	Then Enter card number <CardNumber>
	Then Switch to iframe card expiry month
	Then Select card expiry month <dropdownmonth>
	Then Switch to iframe card expiry year
	Then Select card expiry year <dropdownyear>
	Then Switch to iframe card cvv
	Then Enter card CVV number <CVV>
#	Then Select auto renewal checkbox
	Then Select I agree checkbox
	Then Click on continue button
	Then Get Green code text
	Then Enter BrainTree UserName <BrainuserName>
	Then Enter BrainTree password <Brainpassword>
	Then Click on login button
	Then Click on dashbord transition button 
	Then Click on tabsearch button 
			
		
Examples:
	| domainname                 | Organisationname     | FirstName | LastName | Address               | CityName | State        | PostCode | PhoneNumber  | Email                      | ConfirmationEmail          | CardOwner              | CardNumber       | dropdownmonth | dropdownyear | CVV | BrainuserName    | Brainpassword    | 
	| bestpankhkhatesting9944    | Payment Gateway Test | QA        | Team     | 2/469 La Trobe Street | Auckland | North Island | 0626     | 064411111111 | testing@melbourneit.com.au | testing@melbourneit.com.au | AlphaNumeric0123456789 | 5555555555554444 | 12            | 2019         | 456 | makeyanvesh      | Me!bourne1t      |
  
#	PG-22	
	@BetaClientA
Scenario Outline: Domainz- View Payment Method on the Customer Portal Checkout.

	Given Enter domain name <domainname>
	Then Select domain service 
	Then Uncheck au domain service
	Then Click on search button
	Then Click on cotinue to checkout button
	Then Click on No thanks pop up
	Then Click on continue to account
	Then Enter organisation name <Organisationname>
	Then Enter first name <FirstName>
	Then Enter last name <LastName>
	Then Enter address <Address>
	Then Enter city name <CityName>
	Then Select state <State>
	Then Enter post code <PostCode> 
	Then Enter phone number <PhoneNumber>
	Then Enter email <Email>
	Then Enter confirmation mail <ConfirmationEmail>
	Then Click on continue to payment page
	Then Click on continue to registrant page
	Then Enter card owner name <CardOwner>
	Then Switch to iframe card number
	Then Enter card number <CardNumber>
	Then Switch to iframe card expiry month
	Then Select card expiry month <dropdownmonth>
	Then Switch to iframe card expiry year
	Then Select card expiry year <dropdownyear>
	Then Switch to iframe card cvv
	Then Enter card CVV number <CVV>
#	Then Select auto renewal checkbox
	Then Select I agree checkbox
	Then Click on continue button
	Then Get Green code text
	Then Enter Admin UserName <username>
	Then Enter Admin Password <password>
	Then Click Submit Button
	Then Click on search textbox 
    Then Click on submit tab button		
    Then Click on view login details
#    Then Switch to child window 
#    Then Get login password text 
    Then Click on Payout Standings 
    Then Click on create prepaid credit account 
  	Then Enter admin card owner name <AddCardOwner>
	Then Switch admin to iframe card number
	Then Enter admin card number <AddCardNumber>
	Then Switch admin iframe to emp months  
	Then Select admin card expiry month <Adddropdownmonth>
	Then Switch admin to iframe card expiry year
	Then Select admin card expiry year <Adddropdownyear>
	Then Switch admin to iframe card cvv
	Then Enter admin card CVV number <AddCVV>
#	Then Switch to iframe amount
	Then Enter card amount <amount>
    Then Click on purchase credit
             
     
Examples:
	| domainname                 | Organisationname     | FirstName | LastName | Address               | CityName | State        | PostCode | PhoneNumber  | Email                      | ConfirmationEmail          | CardOwner              | CardNumber       | dropdownmonth | dropdownyear | CVV | username | password  |AddCardOwner       | AddCardNumber    |Adddropdownmonth|Adddropdownyear | AddCVV |amount|
	| dpublicschoolcollege       | Payment Gateway Test | QA        | Team     | 2/469 La Trobe Street | Auckland | North Island | 0626     | 064411111111 | testing@melbourneit.com.au | testing@melbourneit.com.au | AlphaNumeric0123456789 | 4111111111111111 | 12            | 2019         | 456 | fnurani  | comein22  |AlphaNumericru     | 4111111111111111 | 12             | 2019           | 456    | 50   |
	
	
#	PG-23	
	@BetaClientB
Scenario Outline: Domainz- View Payment Method on the Customer Portal Checkout.

	Given Enter domain name <domainname>
	Then Select domain service 
	Then Uncheck au domain service
	Then Click on search button
	Then Click on cotinue to checkout button
	Then Click on No thanks pop up
	Then Click on continue to account
	Then Enter organisation name <Organisationname>
	Then Enter first name <FirstName>
	Then Enter last name <LastName>
	Then Enter address <Address>
	Then Enter city name <CityName>
	Then Select state <State>
	Then Enter post code <PostCode> 
	Then Enter phone number <PhoneNumber>
	Then Enter email <Email>
	Then Enter confirmation mail <ConfirmationEmail>
	Then Click on continue to payment page
	Then Click on continue to registrant page
	Then Enter card owner name <CardOwner>
	Then Switch to iframe card number
	Then Enter card number <CardNumber>
	Then Switch to iframe card expiry month
	Then Select card expiry month <dropdownmonth>
	Then Switch to iframe card expiry year
	Then Select card expiry year <dropdownyear>
	Then Switch to iframe card cvv
	Then Enter card CVV number <CVV>
#	Then Select auto renewal checkbox
	Then Select I agree checkbox
	Then Click on continue button
	Then Get Green code text
	Then Enter Admin UserName <username>
	Then Enter Admin Password <password>
	Then Click Submit Button
	Then Click on search textbox 
    Then Click on submit tab button		
    Then Click on view login details
#    Then Switch to child window 
#    Then Get login password text 
    Then Click on Payout Standings 
    Then Click on create prepaid credit account 
  	Then Enter admin card owner name <AddCardOwner>
	Then Switch admin to iframe card number
	Then Enter admin card number <AddCardNumber>
	Then Switch admin iframe to emp months  
	Then Select admin card expiry month <Adddropdownmonth>
	Then Switch admin to iframe card expiry year
	Then Select admin card expiry year <Adddropdownyear>
	Then Switch admin to iframe card cvv
	Then Enter admin card CVV number <AddCVV>
#	Then Switch to iframe amount
	Then Enter card amount <amount>
    Then Click on purchase credit
             
     
Examples:
	| domainname                 | Organisationname     | FirstName | LastName | Address               | CityName | State        | PostCode | PhoneNumber  | Email                      | ConfirmationEmail          | CardOwner              | CardNumber       | dropdownmonth | dropdownyear | CVV | username | password  |AddCardOwner       | AddCardNumber    |Adddropdownmonth|Adddropdownyear | AddCVV |amount|
	| dankajghanycadnsfe18ld65   | Payment Gateway Test | QA        | Team     | 2/469 La Trobe Street | Auckland | North Island | 0626     | 064411111111 | testing@melbourneit.com.au | testing@melbourneit.com.au | AlphaNumeric0123456789 | 4111111111111111 | 12            | 2019         | 456 | fnurani  | comein22  |AlphaNumericru     | 4111111111111111 | 12             | 2019           | 456    | 50   |
  		
	
	#	PG-109	
	@BetaClientCC
Scenario Outline: Domainz- View Payment Method on the Customer Portal Checkout.

	Given Enter Admin UserName <username>
	Then Enter Admin Password <password>
	Then Click Submit Button
	Then Click on search green textbox <GreenCode> 
  Then Click on submit tab button		
  Then Click on view billing accounts
  Then Click on card expiry date 
  Then Select expiry month <dropdownmonth>
  Then Select expiry years <dropdownyears> 
  Then Click on submit buttonss 
  Then Enter BrainTree UserName <BrainuserName>
	Then Enter BrainTree password <Brainpassword>
	Then Click on login button
	Then Click on dashbord transition button      
	Then Click on search customer ID <cutomerID>  
  Then Click On Search Symbol    
  Then Click On Token Number 
    
       
     
Examples:
	 | username | password  |GreenCode   |dropdownmonth  |dropdownyears| BrainuserName      | Brainpassword        | cutomerID   | 
	 | fnurani  | comein22  | PAY-259    |05             |2020         | makeyanvesh        | ArqPayments505^      | 877789434   |
  
  		
#	PG-43	
	@BetaClientDD
Scenario Outline: Admin- View Payment Method on the Customer Portal Checkout.	
	Given Enter Admin UserName <username>
	Then Enter Admin Password <password>
	Then Click Submit Button
	Then Click on Workflow textbox <workflowid> 
    Then Click on get tab button		
    Then Click on workflow search
    Then Click on workflow id
    Then Click on workflow link
    Then Click on edit billing details 
    
    Examples:
	 | username | password  |workflowid   |
	 | fnurani  | comein22  |12537222     |
	 
	 
#   PG-108	 
	@BetaClientEE
Scenario Outline:Account Level :ReCharge Pre-Paid Acount with an Existing Credit Card
	Given Enter Admin UserName <username>
	Then Enter Admin Password <password>
	Then Click Submit Button
    Then Click on search green textbox <GreenCode> 
    Then Click on submit tab button	
    Then Click on view invoice
    Then Click on create prepaid creditt accountt 
    Then Click on radio button
    Then Click on email receipt checkbox
    Then Enter card amount <amount>
    Then Click on purchase credit
    
    Examples:
	 | username | password  |GreenCode   |amount|
	 | fnurani  | comein22  |PAY-356     |50    |
	 
	 
#   PG-63	 
	@BetaClientFF
Scenario Outline:Domainz - View Customer's expiring/expired Credit Cards in A2 console
	Given Enter Admin UserName <username>
	Then Enter Admin Password <password>
	Then Click Submit Button
    Then Click on search green textbox <GreenCode> 
    Then Click on submit tab button	
    Then Click on Login as client
    Then Click on accounts buttons
    Then Click on credit card details
    Then Enter credit  card owner name <CardOwner> 
#	Then Switch to iframe card number
	Then Enter credit card number <CardNumber>
#	Then Switch to iframe card expiry month
	Then Select credit card expiry month <dropdownmonth>
#	Then Switch to iframe card expiry year
	Then Select credit card expiry year <dropdownyear>
#	Then Switch to iframe card cvv
	Then Enter card credit CVV number <CVV>
#    Then Click on create prepaid creditt accountt 
#    Then Click on radio button
#    Then Click on email receipt checkbox
#    Then Enter card amount <amount>
#    Then Click on purchase credit

    Examples:
	 | username | password  |GreenCode   |AddCardOwner       | AddCardNumber    |Adddropdownmonth|Adddropdownyear | AddCVV |
	 | fnurani  | comein22  |PAY-256     |automationmaster   |5555555555554444  |07			     |2018			  |546     |
	 
	 
	 #	PG-63	
	@BetaClientGG
Scenario Outline: Domainz - View Customer's expiring/expired Credit Cards in A2 console

	Given Enter domain name <domainname>
	Then Select domain service 
	Then Uncheck au domain service
	Then Click on search button
	Then Click on cotinue to checkout button
	Then Click on No thanks pop up
	Then Click on continue to account
	Then Enter organisation name <Organisationname>
	Then Enter first name <FirstName>
	Then Enter last name <LastName>
	Then Enter address <Address>
	Then Enter city name <CityName>
	Then Select state <State>
	Then Enter post code <PostCode> 
	Then Enter phone number <PhoneNumber>
	Then Enter email <Email>
	Then Enter confirmation mail <ConfirmationEmail>
	Then Click on continue to payment page
	Then Click on continue to registrant page
	Then Enter card owner name <CardOwner>
	Then Switch to iframe card number
	Then Enter card number <CardNumber>
	Then Switch to iframe card expiry month
	Then Select card expiry month <dropdownmonth>
	Then Switch to iframe card expiry year
	Then Select card expiry year <dropdownyear>
	Then Switch to iframe card cvv
	Then Enter card CVV number <CVV>
	Then Select I agree checkbox
	Then Click on continue button
	Then Get Green code text
	Then Enter Admin UserName <username>
	Then Enter Admin Password <password>
	Then Click Submit Button
	Then Click on search textbox 
    Then Click on submit tab button		
	Then Click on admin view button 
 	 
      
Examples:
	| domainname                 | Organisationname     | FirstName | LastName | Address               | CityName | State        | PostCode | PhoneNumber  | Email                      | ConfirmationEmail          | CardOwner              | CardNumber       | dropdownmonth | dropdownyear | CVV | username | password  |
	| dankajghanycadasyde18ld85  | Payment Gateway Test | QA        | Team     | 2/469 La Trobe Street | Auckland | North Island | 0626     | 064411111111 | testing@melbourneit.com.au | testing@melbourneit.com.au | AlphaNumeric0123456789 | 4111111111111111 | 07            | 2018         | 456 | fnurani  | comein22  |
	
	
     # PG-214	
	@BetaClientHH
Scenario Outline:Domainz: Account Level : Pay Outstanding Invoices using existing Credit Cards (Pay Outstanding Invoices link)
   
    When Enter NrCRM UserName <username>
	Then Enter NrCRM Password <password>
	Then Click NrCRM Login Button
	Then Enter Green code search box <GreenCode>
	Then Click on Domain Price System
	Then Enter set Domain Name <domainname>
#	Then Select Drop Down Option <dropdowndomain> 
	Then Select Registration Period <dropdownPeriod>
	
Examples:
	| username | password  |GreenCode |domainname      |dropdowndomain |dropdownPeriod              | 
	| fnurani  | comein22  |PAY-302   |aressnashik321  |105            |1 x Y NZ$52.89[ NZ$0 setup] |
	 	 
	 	 
	 #	PG-39	
	@BetaClienttKK
Scenario Outline: Domainz - Verify workflow partial payment details for Visa is displayed

	Given Enter domain name <domainname> 
	Then Select domain service 
	Then Uncheck au domain service
	Then Click on search button
	Then Click on cotinue to checkout button
	Then Click on No thanks pop up
	Then Click on continue to account
	Then Enter organisation name <Organisationname>
	Then Enter first name <FirstName>
	Then Enter last name <LastName>
	Then Enter address <Address>
	Then Enter city name <CityName>
	Then Select state <State>
	Then Enter post code <PostCode> 
	Then Enter phone number <PhoneNumber>
	Then Enter email <Email>
	Then Enter confirmation mail <ConfirmationEmail>
	Then Click on continue to payment page
	Then Click on continue to registrant page
	Then Enter card owner name <CardOwner>
	Then Switch to iframe card number
	Then Enter card number <CardNumber>
	Then Switch to iframe card expiry month
	Then Select card expiry month <dropdownmonth>
	Then Switch to iframe card expiry year
	Then Select card expiry year <dropdownyear>
	Then Switch to iframe card cvv
	Then Enter card CVV number <CVV>
	Then Select I agree checkbox
	Then Click on continue button
#	Then Get Green code text
#	Then Get Workflow code
    Then Get Reference ID
	Then Enter Admin UserName <username>
	Then Enter Admin Password <password>
	Then Click Submit Button 	
	Then Click Search Workflow Id
	 
Examples:
	| domainname                 | Organisationname     | FirstName | LastName | Address               | CityName | State        | PostCode | PhoneNumber  | Email                      | ConfirmationEmail          | CardOwner              | CardNumber       | dropdownmonth | dropdownyear | CVV | username | password  |
	| dankajahanyccuysghfeer     | Payment Gateway Test | QA        | Team     | 2/469 La Trobe Street | Auckland | North Island | 0626     | 064411111111 | testing@melbourneit.com.au | testing@melbourneit.com.au | Test Visa Credit Card  | 4111111111111111 | 09            | 2019         | 456 | fnurani  | comein22  |
		 	 
		 	 
 #	PG-39	
	@BetaClienttLL
Scenario Outline: Domainz - Verify workflow partial payment details for Visa is displayed
	Then Enter Admin UserName <username>
	Then Enter Admin Password <password>
	Then Click Submit Button 	
#	Then Click Search Workflow Id	
	Then Set Search Workflow Id <workflow> 
	Then Click on Get Workflow Button 
	Then Click On Get Workflow id Number
	Then Click On This Workflow 
	Then Click On This Workflow Details  
	Then Click On Execute Button
	Then click On Execute Action
	
	
	
Examples:
	| username | password  | workflow |
	| fnurani  | comein22  | 12612097 |
	
	 #	PG-39	
	@BetaClienttIJ
Scenario Outline: Domainz - Verify workflow partial payment details for Visa is displayed

	Given Enter domain name <domainname> 
	Then Select domain service 
	Then Uncheck au domain service
	Then Click on search button
	Then Click on cotinue to checkout button
	Then Click on No thanks pop up
	Then Click on continue to account
	Then Enter organisation name <Organisationname>
	Then Enter first name <FirstName>
	Then Enter last name <LastName>
	Then Enter address <Address>
	Then Enter city name <CityName>
	Then Select state <State>
	Then Enter post code <PostCode> 
	Then Enter phone number <PhoneNumber>
	Then Enter email <Email>
	Then Enter confirmation mail <ConfirmationEmail>
	Then Click on continue to payment page
	Then Click on continue to registrant page
	Then Enter card owner name <CardOwner>
	Then Switch to iframe card number
	Then Enter card number <CardNumber>
	Then Switch to iframe card expiry month
	Then Select card expiry month <dropdownmonth>
	Then Switch to iframe card expiry year
	Then Select card expiry year <dropdownyear>
	Then Switch to iframe card cvv
	Then Enter card CVV number <CVV>
	Then Select I agree checkbox
	Then Click on continue button
#	Then Get Green code text
#	Then Get Workflow code
    Then Get Reference ID
	Then Enter Admin UserName <username>
	Then Enter Admin Password <password>
	Then Click Submit Button 	
	Then Click Search Workflow Id
	 
Examples:
	| domainname                 | Organisationname     | FirstName | LastName | Address               | CityName | State        | PostCode | PhoneNumber  | Email                      | ConfirmationEmail          | CardOwner              | CardNumber       | dropdownmonth | dropdownyear | CVV | username | password  |
	| dankajahanyccuysghfiir     | Payment Gateway Test | QA        | Team     | 2/469 La Trobe Street | Auckland | North Island | 0626     | 064411111111 | testing@melbourneit.com.au | testing@melbourneit.com.au | Test Visa Credit Card  | 5454545454545454 | 09            | 2019         | 456 | fnurani  | comein22  |	
	
	
	#	PG-39	
	@BetaClienttLJ
Scenario Outline: Domainz - Verify workflow partial payment details for Visa is displayed
	Then Enter Admin UserName <username>
	Then Enter Admin Password <password>
	Then Click Submit Button 	
#	Then Click Search Workflow Id	
	Then Set Search Workflow Id <workflow> 
	Then Click on Get Workflow Button 
	Then Click On Get Workflow id Number
	Then Click On This Workflow 
	Then Click On This Workflow Details  
	Then Click On Execute Button
	Then click On Execute Action
	
	
	
Examples:
	| username | password  | workflow |
	| fnurani  | comein22  | 12636188 |
	
	
#   PG-62	 
	@BetaClientLM
Scenario Outline:Domainz - View existing saved credit card
	Given Enter Admin UserName <username>
	Then Enter Admin Password <password>
	Then Click Submit Button
    Then Click on search green textbox <GreenCode> 
    Then Click on submit tab button	
    Then Click on view invoice
    Then Click on create prepaid creditt accountt 
    Then Click on radio button
    Then Click on email receipt checkbox
    Then Enter card amount <amount>
    Then Click on purchase credit
    Then Click on search green textbox <GreenCode> 
    Then Click on submit tab button	
    Then Click on view billing accounts    
    
    Examples:
	 | username | password  |GreenCode   |amount|
	 | fnurani  | comein22  |PAY-318     |50    |
    
#   PG-62	 
	@BetaClientMM
Scenario Outline:Domainz - View existing saved credit card
	Given Enter Admin UserName <username>
	Then Enter Admin Password <password>
	Then Click Submit Button
    Then Click on search green textbox <GreenCode> 
    Then Click on submit tab button	
    Then Click Login As Client
    Then Click on Account Button 
    Then Click On Edit Button
    Then Click On CheckBox Button
    Then Click On saves Button
    Then Click on view billing accounts    
    
    Examples:
	 | username | password  |GreenCode   |
	 | fnurani  | comein22  |PAY-315     |
	 
	 
#   PG-62	 
	@BetaClientMM
Scenario Outline:Domainz - View existing saved credit card
	Given Enter Admin UserName <username>
	Then Enter Admin Password <password>
	Then Click Submit Button	
	Then Set Search Workflow Id <workflow> 
	Then Click on Get Workflow Button 
	Then Click On Get Workflow id Number
	Then Click On Execute Button
	Then click On Execute Action
	Then set Admin Domain Name <domain>
	Then click On Admin Search Button
	
  Examples:
	 | username | password  |workflow    |domain                             |
	 | fnurani  | comein45  |12809354    |automationtester123.com		     | 
	 
	 #   PG-62	 
	@BetaClientNN
Scenario Outline:Domainz - View existing saved credit card
	Given Enter Admin UserName <username>
	Then Enter Admin Password <password>
	Then Click Submit Button	
	Then Set Search Workflow Id <workflow> 
	Then Click on Get Workflow Button 
	Then Click On Get Workflow id Number
	Then Click On Execute Button
	Then click On Execute Action
	Then set Admin Domain Name <domain>
	Then click On Admin Search Button
	
  Examples:
	 | username | password  |workflow    |domain                             |
	 | fnurani  | comein22  |12809354    |automationtester123.com		     | 
	 
	 
 #   PG-62	 
	@BetaClientNN
Scenario Outline:Domainz - View existing saved credit card
	Given Enter Admin UserName <username>
	Then Enter Admin Password <password>
	Then Click Submit Button	
	Then Set Search Workflow Id <workflow> 
	Then Click on Get Workflow Button 
	Then Click On Get Workflow id Number
	Then Click On Execute Button
	Then click On Execute Action
	Then set Admin Domain Name <domain>
	Then click On Admin Search Button
	Then Set Search Workflow Idd <workfloww> 
	Then Click on Get Workflow Button 
	
	
  Examples:
	 | username | password  |workflow    |domain                             |workfloww             |
	 | fnurani  | comein22  |12809287    |automationtestero21.com		         |automationtester321 	|
	 
	 
#   PG-55	 
	@BetaClientOO
Scenario Outline: Domainz - Update A2 Internal User View Payment Section

	Given Enter Admin UserName <username>
	Then Enter Admin Password <password>
	Then Click Submit Button	
	Then Click on search green textbox <GreenCode> 
    Then Click on submit tab button		
	Then Enter BrainTree UserName <BrainuserName>
	Then Enter BrainTree password <Brainpassword>
	Then Click on login button
	Then Click on dashbord transition button        
	
	
  Examples:
	 | username | password  |GreenCode   |BrainuserName      | Brainpassword    | 
	 | fnurani  | comein22  |PAY-270     |makeyanvesh        | Me!bourne1t      |
	 