Feature: Search and place order for a product

  @SeleniumTest @RegressionTest
  Scenario: search for product and validate the results
    Given User is on greenKart Landing page
    Then User search for a product Cucumber
    Then "Cucumber" results are displayed

  @SeleniumTest @SmokeTest
  Scenario:  search for product and then move to checkout page
    Given User is on greenKart Landing page
    Then User search for a product Brocolli
    And add items to cart
    And user proceeded to checkout page for purchase
    Then verify selected Brocolli product are displayed in checkout page

  @SeleniumTest @RegressionTest
  Scenario Outline:
    Given User is on greenKart Landing page
    Then User search for a product <Name>
    And add items to cart
    And user proceeded to checkout page for purchase
    Then verify selected <Name> product are displayed in checkout page
    Examples:
      | Name      |
      | Brinjal     |
      | Beetroot |
      | Cucumber |