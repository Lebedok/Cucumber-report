Feature: Validate HomePage function

  Scenario: Validate functions

    Given the user navigates to login page
    Then the user opens home page
    Then the user should see the function names
      | Home |
      | Accounts |
      | Contacts |
      | Leads |
      | Opportunities |
      | Reports |
      | Quotes |
      | Sales Orders |
      | Invoices |
      | Products |
      | Emails |
      | Cases |
      | Calender |
      | Tasks |