Feature:

  @happy
  Scenario: Verifying the search function
    Given I want to go on home page
    When I input key word and do search action
    Then I view an search result correctly