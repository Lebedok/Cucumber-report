Feature: Print personal information

#In cucumber we have only three annotations for the steps which is GIVEN, WHEN, THEN
  Scenario: Print info
    Given the user prints firstname
    When the user prints lastname
    Then the user should see the fullname
    And the user prints city
    And the user prints state
    * the user prints age
    But the user should see the school name
