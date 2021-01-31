Feature: OrangeHRM Application

Background:I am logged into Orange Application.
 Given I am in OrangeHRP Application
 Then  Login to Application

@SmokeTest
 Scenario: Click on Admin menu
	When Dashboard page is available
  And Click on Admin menu
  
   @RegressionTest
   Scenario: Validate text job title
   Given I click on Admin Link 
   Then  Click on Job 
   And   validate text Job Title
   
    @RegressionTest
   Scenario: Validate text Employee list
   Given I click on PIM
   Then I click on Employee List
   And  Validate text Employee list
   
   @SmokeTest, @RegressionTest
   Scenario: Validate Employee name Linda
   Given I click on PIM
   Then  I Enter Employee Name Lindain Search box
   And   I click on search button
   Then  Validate Employee Name
   

  