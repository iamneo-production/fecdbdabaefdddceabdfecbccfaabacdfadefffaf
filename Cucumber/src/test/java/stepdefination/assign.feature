Feature: Performing a Search

  Scenario: Performing a basic search
    Given I am on the search page
    When I search for "cucumber"
    Then I should see search results