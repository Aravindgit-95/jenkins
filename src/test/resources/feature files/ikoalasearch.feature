Feature: Searching the products in ikoala.com

  Scenario Outline: To search five products in search box
    Given website should be launched
    And user should give id "aravindswaami@gmail.com" and pass "Aravind@123"
    When search the products "<prdname>"
    Then click the go button

    Examples: 
      | prdname          |
      | laptops          |
      | furniture        |
     
