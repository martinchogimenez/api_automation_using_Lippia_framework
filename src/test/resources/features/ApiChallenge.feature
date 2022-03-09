Feature: Api example
  As an api user I want to execute request in order to get proper responses

  @Example @Success
  Scenario Outline: Example scenario for get hours data
    Given My clockify created account and my generated X-Api-Key
    And a valid workspace id
    And a valid project id
    And a valid user id
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then status code <statusCode> is obtained
    And expected response is obtained.
    @Project
    Examples:
      | jsonName    | statusCode | operation | entity      |
      | getHours    | 200        | GET       | GETHOUR     |


  @Success
  Scenario Outline: Create a successfully time-entry in workspace 
    Given My clockify created account and my generated X-Api-Key
    And a valid workspace id
    And a project name '<name>'
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And I obtain the status code '<status>'
    Then I validate that the obtained data is correct
    And I store the time entry id
    @Project
    Examples:
      | operation | entity      | name      | jsonName    | status |
      | POST      | POSTHOUR    | Probandito| postHours   | 201    |


  @Success
  Scenario Outline: Modify time-entry in Workspace with a successful result
    Given My clockify created account and my generated X-Api-Key
    And a valid workspace id
    And a project name '<name>'
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And I obtain the status code '<status>'
    Then I validate billable property status has changed
    @Project
    Examples:
      | operation | entity     | name      | jsonName    | status |
      | PUT       | PUTHOUR    | Probandito| putHours    | 200    |

  @Success
  Scenario Outline: Delete a time-entry in Workspace with a successful result
    Given My clockify created account and my generated X-Api-Key
    And a valid workspace id
    And a project name '<name>'
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And I obtain the status code '<status>'
    @Project
    Examples:
      | operation    | entity     | name      | jsonName    | status |
      | DELETE       | DELHOUR    | Probandito| delHours    | 204    |


