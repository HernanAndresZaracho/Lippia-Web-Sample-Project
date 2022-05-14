Feature: Test de pruebas sobre el logueo de la pagina (MY ACCOUNT - LOGIN)

  @Test
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
    Then La web muestra un mensaje de error por no encontrar el username

  @Test
  Scenario: El usuario intenta loguearse con el username correcto y la password vacia
    Given El usuario se encuentra en la pagina de Automation Practice
    When El usuario clickea el boton "My Account" del menu
    And El usuario ingresa su username "HernanCrowdAr22@test.com"
    And El usuario ingresa su password ""
    And El usuario clickea en el boton "Login"
    Then La web muestra un mensaje pidiendo el password

  @Test
  Scenario: El usuario intenta loguearse con el username vacio y la contraseña correcta
    Given El usuario se encuentra en la pagina de Automation Practice
    When El usuario clickea el boton "My Account" del menu
    And El usuario ingresa su username ""
    And El usuario ingresa su password "1705962013Hernanat"
    And El usuario clickea en el boton "Login"
    Then La web muestra un mensaje pidiendo el username

  @Test
  Scenario: El usuario intenta loguearse las credenciales vacias
    Given El usuario se encuentra en la pagina de Automation Practice
    When El usuario clickea el boton "My Account" del menu
    And El usuario ingresa su username ""
    And El usuario ingresa su password ""
    And El usuario clickea en el boton "Login"
    Then La web muestra un mensaje pidiendo el username

  @Test
  Scenario: La web no muestra la contraseña que se ingresa
    Given El usuario se encuentra en la pagina de Automation Practice
    When El usuario clickea el boton "My Account" del menu
    And El usuario ingresa un password random "1234Hernanat"
    Then La web muestra asteriscos en el textbox password

  @Test
  Scenario: El usuario intenta loguearse con el username y password invertido en mayusculas y minisculas
    Given El usuario se encuentra en la pagina de Automation Practice
    When El usuario clickea el boton "My Account" del menu
    And El usuario ingresa su username "HernanCrowdAr22@test.com"
    And El usuario ingresa su password "1705962013Hernanat"
    And El usuario clickea en el boton "Login"
    Then La web muestra un mensaje de contrasena incorrecta

  @El_enunciado_esta_mal_escrito
  @Test
  Scenario: El usuario se loguea correctamente con credenciales validas
    Given El usuario se encuentra en la pagina de Automation Practice
    When El usuario clickea el boton "My Account" del menu
    And El usuario ingresa su username "HernanCrowdAr22@test.com"
    And El usuario ingresa su password "1705962013Hernanat"
    And El usuario clickea en el boton "Login"
    And El usuario clickea en el boton de "logout"
    And El usuario apreta el boton de "retorno"
    Then El usuario no deberia estar logueado en la pagina