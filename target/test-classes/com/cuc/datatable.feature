Feature: Login Using Data Table
  
  @asList
  Scenario: validate username and password
    Given Login into URL
     When enter the credential asList
   	 |daisyrubycatharine|
   	 |RP65IQ|
   	 
  @asLists
  Scenario: validate username and password
    Given Login into URL
     When enter the credential asLists
   	 |daisyrubycatharine|RP65IQ|
   	  	 
   @asMap
  Scenario: validate username and password
    Given Login into URL
     When enter the credential asMap
   	 |un|daisyrubycatharine|
   	 |pwd|RP65IQ|
   	 
   	 @asMaps
  Scenario: validate username and password
    Given Login into URL
     When enter the credential asMaps
   	 |cred|
   	 |daisyrubycatharine|
   	 |RP65IQ|