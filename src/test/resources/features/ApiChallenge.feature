Feature: Api example
  As an api user I want to execute request in order to get proper responses

  @Example @Success
  Scenario Outline: Example scenario for get hours data
    Given Mi cuenta creada en clockify y mi X-Api-Key generada
    And un id workspace valido
    And un id project valido
    And un id de usuario valido
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then status code <statusCode> is obtained
    And expected response is obtained.

    Examples:
      | jsonName    | statusCode | operation | entity      |
      | getHours    | 200        | GET       | GETHOUR     |


  @Success
  Scenario Outline: Crear time-entry en Workspace resultado exitoso
    Given Mi cuenta creada en clockify y mi X-Api-Key generada
    And un id workspace valido
    And un nombre de proyecto <name>
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then Valido los datos obtenidos sean correctos.
    And guardo id del time entry

    @Project
    Examples:
      | operation | entity      | name      | jsonName    | status |
      | POST      | POSTHOUR    | Probandito| postHours   | 201    |


  @Success
  Scenario Outline: Modificar time-entry en Workspace resultado exitoso
    Given Mi cuenta creada en clockify y mi X-Api-Key generada
    And un id workspace valido
    And un nombre de proyecto <name>
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then Valido que haya cambiado el valor de la propiedad billable
    @Project
    Examples:
      | operation | entity     | name      | jsonName    | status |
      | PUT       | PUTHOUR    | Probandito| putHours    | 200    |

  @Success
  Scenario Outline: Eliminar time-entry en Workspace resultado exitoso
    Given Mi cuenta creada en clockify y mi X-Api-Key generada
    And un id workspace valido
    And un nombre de proyecto <name>
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    @Project
    Examples:
      | operation    | entity     | name      | jsonName    | status |
      | DELETE       | DELHOUR    | Probandito| delHours    | 204    |


