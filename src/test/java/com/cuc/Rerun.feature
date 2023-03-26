

Feature: Rerun Failed Testcases


@Assert
  Scenario: Login page with correct assertion
  
    When user enters correct assertion
@Assert  
Scenario: Login page with inavlid assertion
  
    When user enters invalid assertion
    @Assert
    Scenario: Login page with no assertion
  
    When user enters no assertion