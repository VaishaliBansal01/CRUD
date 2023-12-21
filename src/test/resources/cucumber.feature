#Feature: REST API Testing
#
#  @automated
#  Scenario:  I want to get user information
#    Given I have a user
#    When I make a GET request
#    Then I should get a successful response as a user
#
#    Examples:


Feature: REST API Testing

  @automated
  Scenario: Verify the API response
    Given I have a valid API endpoint
    When I make a GET request
    Then I should get a successful response
