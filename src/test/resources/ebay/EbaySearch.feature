@ebay
Feature:
  @tc4
  Scenario: Search for iMac 2020
    Given user is on ebay home page
    When the user searches for iMac 2020
    Then user sees results about iMac only
    And there are more than 3 pages of results




