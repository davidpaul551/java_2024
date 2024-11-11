@tag
Feature: Login to opencart application
  I want to use this template for my feature file

  @tag1
  Scenario: Login  Successful
    Given Launch the browser
    And navigate to the URL
    When Enter valid username and password
    And click on the login button
    Then Verify the login
    And Close the browser

  @tag2
  Scenario: Login  Unsuccessful
    Given Launch the browser
    And navigate to the URL
    When Enter invalid username and password
    And click on the login button
    Then Verify the login
    And Close the browser
    
 
