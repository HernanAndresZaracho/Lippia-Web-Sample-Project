Feature: Test de pruebas sobre el logueo de la pagina (MY ACCOUNT - LOGIN)

  Background:
    Given El usuario se encuentra en la pagina de Automation Practice
    And El usuario clickea el boton My Account del menu

  @ProyectoFinal
  @Login
  Scenario Outline: El usuario intenta loguearse con el username y password invertido en mayusculas y minisculas
    When El usuario ingresa su username <username>
    And El usuario ingresa su password <password>
    And El usuario clickea en el boton Login
    Then La web muestra un mensaje de contrasena incorrecta

    Examples:
      | username                 | password           |
      | hERNANcROWDaR22@TEST.COM | 1705962013hERNANAT |


  @ProyectoFinal
  @Login
  Scenario Outline: El usuario se loguea, se desloguea, vuelve a la instancia anterior y verifica si esta logueado
    When El usuario ingresa su username <username>
    And El usuario ingresa su password <password>
    And El usuario clickea en el boton Login
    And El usuario clickea en el boton Logout
    And El usuario clickea el boton My Account del menu
    Then El usuario no deberia estar logueado en la pagina

    Examples:
      | username                 | password           |
      | HernanCrowdAr22@test.com | 1705962013Hernanat |
