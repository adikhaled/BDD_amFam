
Feature: Auto Quote validation
  @regression
  Scenario: Auto Quote test
    Given user navigate to homePage
    When user click start new quote
    And user input zipcode
    And user click car insurance option
    And user click lets go button
    And user click on get a quote button
   # And user click on continue button
   # And continue overlay handled
   # Then title of the page will be <auto quote page>
   # When user input address
   # Then user able to click start new quote button