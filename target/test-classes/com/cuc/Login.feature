
Feature: Login Functionality

Background:
	    Given User enters the URL
	@login1
    Scenario: Login Page With Valid Credential 

    
    When User Enters the Username
    And User Enters Password
    And User Clicks the login button
    
    Then Validate the homepage title
    And validate the user icon
    But Validate the sign in button is not visible

	@login2
  Scenario: Login Page With inValid Credential 
    
    
    When User Enters the invalid Username
    And User Enters invalid Password
    And User Clicks the login button
    
    Then Validate the homepage title
    And validate the user icon
    But Validate the sign in button is not visible

    @login3
    Scenario Outline: Login Page With direct Credential 
    
    
    When User Enters the Username "<username>"  
    And User Clicks the login button "<password>"
    And User Enters invalid Password
    Then Validate the homepage title
    And validate the user icon
    But Validate the sign in button is not visible
    
    Examples:
    |username||password|
    |daisyrubycatharine||RP65IQ|
    |daisyrubycatharin||RP65I|
    |RP65I||daisyrubycatharin|
    | || |
    
    
   