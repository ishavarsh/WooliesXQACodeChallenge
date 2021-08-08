#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Application Smoke Test 
      
    Scenario: Verify AddToCart functionality
    Given Initialise the browser with chrome
    And Navigate to "http://automationpractice.com/index.php" site 
    When  I add to cart first item  
    Then Item is added to cart successfully
    
    Scenario: Verify shopping cart summary
    Given Second item is also added successfully
     When I click on cart link
    Then Shopping cart summary tab is displayed
    And It shows shopping cart contains "2 products" 
    
    Scenario: Verify authentication step
    Given Shopping cart summary tab is displayed
    And Proceed to checkout is clicked
    When I input registered email "isha3.varshney@gmail.com" and "Welcome1"
    And I click on sign In
    Then Address tab is displayed
    
    Scenario: Proceed from address step to shipping step
    Given Address tab is displayed
    When I click on proceed to checkout button
    Then Shipping tab is displayed
    
    Scenario: Proceed from shipping step to payment step
    Given I accept terms of service
    When I click on proceed to checkout on shipping
    Then Payment tab is displayed
    
    Scenario: Verify order payment by Pay by bank wire method
    Given Payment tab is displayed
    When I click on Pay by bank wire
    Then Order summary is displayed
    
    Scenario: Verify order cofirmation
    Given Order summary is displayed
    When I click on confirm my order
    Then Order confirmation "Your order on My Store is complete." is displayed

    
        
    
    
    