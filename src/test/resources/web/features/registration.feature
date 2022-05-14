Feature: Test de pruebas sobre registrarse en la pagina (MY ACCOUNT - REGISTRATION)

  @Testx
  Scenario: El usuario se registra correctamente con credenciales validas
    Given El usuario se encuentra en la pagina de Automation Practice
    When El usuario clickea el boton "My Account" del menu
    And El usuario ingresa un username "Pepe001@test.com"
    And El usuario ingresa un password "1705962013Pepeat"
    And El usuario clickea en el boton "Register" para registrarse
    Then El usuario verifica que se registro correctamente en la web

