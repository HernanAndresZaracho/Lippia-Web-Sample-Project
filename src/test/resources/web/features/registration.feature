Feature: Test de pruebas sobre registrarse en la pagina (MY ACCOUNT - REGISTRATION)

  @Test
  Scenario: El usuario se registra correctamente con credenciales validas
    Given El usuario se encuentra en la pagina de Automation Practice
    When El usuario clickea el boton "My Account" del menu
    And El usuario ingresa un password "1705962013Pepe"
    And El usuario ingresa un username "Pepe001@test.com"
    And El usuario ingresa un password "at"
    And El usuario clickea en el boton "Register" para registrarse
    Then El usuario verifica que se registro correctamente en la web

  @Testr
  Scenario: El usuario no se registra por proporcionar un username ya registrado
    Given El usuario se encuentra en la pagina de Automation Practice
    When El usuario clickea el boton "My Account" del menu
    And El usuario ingresa un password "1705962013Pepe"
    And El usuario ingresa un username "Pepe001@test.com"
    And El usuario ingresa un password "at"
    And El usuario clickea en el boton "Register" para registrarse
    Then La web muestra un mensaje de error por username ya registrado

  @TestRegis
  Scenario: El usuario no se registra por proporcionar un username vacio
    Given El usuario se encuentra en la pagina de Automation Practice
    When El usuario clickea el boton "My Account" del menu
    And El usuario ingresa un password "1705962013Pepe"
    And El usuario ingresa un username " "
    And El usuario ingresa un password "at"
    And El usuario clickea en el boton "Register" para registrarse
    Then La web muestra un mensaje de error por username vacio

  @TestRegis
  Scenario: El usuario no se registra por proporcionar un password vacio
    Given El usuario se encuentra en la pagina de Automation Practice
    When El usuario clickea el boton "My Account" del menu
    And El usuario ingresa un password " "
    And El usuario ingresa un username "Pepe001@test.com"
    And El usuario ingresa un password " "
    And El usuario clickea en el boton "Register" para registrarse
    Then La web muestra un mensaje de error por password vacia

  @TestRegis
  Scenario: El usuario no se registra por proporcionar credenciales vacias
    Given El usuario se encuentra en la pagina de Automation Practice
    When El usuario clickea el boton "My Account" del menu
    And El usuario ingresa un password " "
    And El usuario ingresa un username " "
    And El usuario ingresa un password " "
    And El usuario clickea en el boton "Register" para registrarse
    Then La web muestra un mensaje de error por credenciales vacias