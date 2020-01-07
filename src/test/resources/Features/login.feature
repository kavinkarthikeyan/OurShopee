Feature: To validate login
  Scenario: Login Successlly with user credentials
    Given The OurShopee page should be launched
    When enters username and password
      | karthikeyan.kavin@gmail.com | 12345678 |
    And user clicks the signUp button
    Then The page should be navigate to homepage
