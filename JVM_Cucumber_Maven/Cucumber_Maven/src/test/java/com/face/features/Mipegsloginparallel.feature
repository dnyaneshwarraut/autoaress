Feature: Mipegs 
@Mipegs32
Scenario Outline: TC_01
	
	Given Enter Mipegs User Name <username>
	Then Enter Mipegs Password <password>
	Then Click on Mipegs Login button
	
Examples:
	| username	       | password  |                                                      
	| mipegs.devuser   | password  |
  #  | mipegs.devuser1  | password  |
     
