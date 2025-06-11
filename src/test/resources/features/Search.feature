Feature: Search

  @HomeTask
  Scenario: Search for QA with search bar
    When I accept cookie banner
    And I enter QA in to search field
    And I click on the first movie in the list
    Then Movie Stranger Things page is opened
    And 7 names from top cast list is printed to console
    When I click on 3rd profile of actor
    Then I verify the correct profile have opened