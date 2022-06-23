Feature: Test de pruebas sobre los menus de la pagina (MY ACCOUNT)

  Background:
    Given El usuario se encuentra en la pagina de Automation Practice
    And El usuario clickea el boton My Account del menu
    And El usuario se encuentra logueado
    And El usuario verifica que ingreso correctamente a la web

  @ProyectoFinal
  @Account
  Scenario: El usuario verifica que puede cambiar su password
    When El usuario clickea el boton My Account del menu
    And El usuario clickea el boton Account Details para ver detalle de su cuenta
    Then El usuario visualiza que puede cambiar su password


  @ProyectoFinal
  @Account
  Scenario: El usuario se desloguea de la cuenta
    When El usuario clickea el boton My Account del menu
    And El usuario clickea el boton Logout
    Then El usuario verifica que se deslogueo















