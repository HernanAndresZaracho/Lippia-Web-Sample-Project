Feature: Test de pruebas sobre registrarse en la pagina (MY ACCOUNT - REGISTRATION)

  Background:
    Given El usuario se encuentra en la pagina de Automation Practice
    And El usuario clickea el boton My Account del menu

  @ProyectoFinal
  @Registracion
  Scenario Outline: El usuario no se registra por proporcionar un password vacio
    When El usuario ingresa un username <username>
    And El usuario ingresa un password <password>
    And El usuario clickea en el boton Register para registrarse
    Then La web muestra un mensaje de error por password vacia

    Examples:
      | username                 | password |
      | HernanCrowdAr22@test.com |          |


  @ProyectoFinal
  @Registracion
  Scenario Outline: El usuario no se registra por proporcionar credenciales vacias
    When El usuario ingresa un username <username>
    And El usuario ingresa un password <password>
    And El usuario clickea en el boton Register para registrarse
    Then La web muestra un mensaje de error por mail vacio

    Examples:
      | username | password |
      |          |          |
