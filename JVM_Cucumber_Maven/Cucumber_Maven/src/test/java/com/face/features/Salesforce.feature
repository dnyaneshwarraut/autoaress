Feature: Salesforce 
@Salesforce
Scenario Outline: TC_01
	
	Given Enter Salesforce User Name <username2>
	Then Enter Salesforce Password <password2>
	Then Click on Salesforce Login button
	#Then Enter Search Content <search>
	#Then Click on Search Button
	#Then Click on Report
	#Then Click on Checkbox Button
	#Then Read Table Contents
	#Then verify Table Content
	
	
	
Examples:
	| username2	                  | password2   | search                 |                                     
	| digvijay.dusane@aress.com   | Aressqa123  | Opportunities In Month | 
