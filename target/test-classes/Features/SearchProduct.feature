Feature: To validate the search functionality
  Given The user should search the product in Ourshopee webpage

  Scenario Outline: To check whether entering the product name shows the exact product
    When The user enters the "<productName>" in searchbar and clicks search icon
    And user gets the list of products and prints in console
    Then the page should be navigated to products page

    Examples: 
      | productName |
      | oneplus     |

      Scenario: To check whether entering the product name shows the exact product
    When The user enters the "<productName>" in searchbar and clicks search icon
    |productName|
    |iphone|
    And user gets the list of products and prints in console
    Then the page should be navigated to products page