Feature: Test de pruebas sobre el logueo de la pagina (MY ACCOUNT - LOGIN)

  @Testx
  Scenario: El usuario se loguea correctamente con credenciales validas
    Given El usuario se encuentra en la pagina de Automation Practice
    When El usuario clickea el boton "My Account" del menu
    And El usuario ingresa su username "HernanCrowdAr22@test.com"
    And El usuario ingresa su password "1705962013Hernanat"
    And El usuario clickea en el boton "Login"
    Then El usuario verifica que ingreso correctamente a la web

  @Test
  Scenario: El usuario intenta loguearse con las credenciales invalidas
    Given El usuario se encuentra en la pagina de Automation Practice
    When El usuario clickea el boton "My Account" del menu
    And El usuario ingresa su username "CorreoInvalido@test.com"
    And El usuario ingresa su password "ContrasenaInvalidaHernanat"
    And El usuario clickea en el boton "Login"
    Then El usuario verifica que no ingreso a la web

  @Testx
  Scenario: El usuario intenta loguearse con el username correcto y la password vacia
    Given El usuario se encuentra en la pagina de Automation Practice
    When El usuario clickea el boton "My Account" del menu
    And El usuario ingresa su username "HernanCrowdAr22@test.com"
    And El usuario ingresa su password ""
    And El usuario clickea en el boton "Login"
    Then El usuario verifica que no ingreso a la web

  @Testx
  Scenario: El usuario intenta loguearse con el username vacio y la contraseña correcta
    Given El usuario se encuentra en la pagina de Automation Practice
    When El usuario clickea el boton "My Account" del menu
    And El usuario ingresa su username ""
    And El usuario ingresa su password "1705962013Hernanat"
    And El usuario clickea en el boton "Login"
    Then El usuario verifica que no ingreso a la web

  @Testx
  Scenario: El usuario intenta loguearse las credenciales vacias
    Given El usuario se encuentra en la pagina de Automation Practice
    When El usuario clickea el boton "My Account" del menu
    And El usuario ingresa su username ""
    And El usuario ingresa su password ""
    And El usuario clickea en el boton "Login"
    Then El usuario verifica que no ingreso a la web

