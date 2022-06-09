Feature: Test de pruebas sobre los menus de la pagina (MY ACCOUNT)

  Background:
    Given El usuario se encuentra en la pagina de Automation Practice
    And El usuario clickea el boton My Account del menu
    And El usuario se encuentra logueado
    And El usuario verifica que ingreso correctamente a la web


  @Test1
  Scenario: El usuario visualiza el Dashboard
    And El usuario clickea el boton My Account del menu
    Then El usuario verifica que ve el Dashboard

  @Test1
  Scenario: El usuario visualiza sus ordenes de compra
    When El usuario clickea el boton Orders para ir a las ordenes de compra
    Then El usuario ve la pagina con las ordenes de compra

  @Test1
  Scenario: El usuario visualiza los detalles de su orden de compra
    When El usuario clickea el boton Orders para ir a las ordenes de compra
    And El usuario clickea en el boton View para ver su orden de compra
    Then El usuario visualiza los detalles de su orden

  @Test1
  Scenario: El usuario visualiza la fecha y numero de orden
    When El usuario clickea el boton Orders para ir a las ordenes de compra
    And El usuario clickea en el boton View para ver su orden de compra
    Then El usuario visualiza el numero de orden y su status


  @Test1
  Scenario: El usuario visualiza el billing y shipping address
    When El usuario clickea el boton My Account del menu
    And El usuario clickea el boton Address para ver su direccion
    Then El usuario visualiza el billing and shipping address

  @Test1
  Scenario: El usuario verifica que puede editar el shipping address
    When El usuario clickea el boton My Account del menu
    And El usuario clickea el boton Address para ver su direccion
    And El usuario clickea el boton Edit en Shipping Address
    Then El usuario puede editar su Shipping Address

  @Test1
  Scenario: El usuario verifica que puede cambiar su password
    When El usuario clickea el boton My Account del menu
    And El usuario clickea el boton Account Details para ver detalle de su cuenta
    Then El usuario visualiza que puede cambiar su password

  @Test1
  Scenario: El usuario se desloguea de la cuenta
    When El usuario clickea el boton My Account del menu
    And El usuario clickea el boton Logout
    Then El usuario verifica que se deslogueo