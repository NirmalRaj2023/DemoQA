Feature: Rerun Failed Testcases
  
    @Assert
    Scenario: Login Page with correct assertion
    When User enters the correct assertion
    @Assert
  	Scenario: Login Page with wrong assertion
    When User enters the wrong assertion
    @Assert
    Scenario: Login Page with no assertion
    When User enters no assertion
