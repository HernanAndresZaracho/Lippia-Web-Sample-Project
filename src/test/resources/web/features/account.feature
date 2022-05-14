Feature: Test de pruebas sobre los menus de la pagina (MY ACCOUNT)

  @TestAcc
  Scenario: El usuario visualiza el Dashboard
    Given El usuario se encuentra en la pagina de Automation Practice
    When El usuario clickea el boton "My Account" del menu
    And El usuario ingresa su username "HernanCrowdAr22@test.com"
    And El usuario ingresa su password "1705962013Hernanat"
    And El usuario clickea en el boton "Login"
    And El usuario verifica que ingreso correctamente a la web
    And El usuario clickea el boton "My Account" del menu
    Then El usuario verifica que ve el Dashboard

  @TestAcc
  Scenario: El usuario visualiza sus ordenes de compra
    Given El usuario se encuentra en la pagina de Automation Practice
    When El usuario clickea el boton "My Account" del menu
    And El usuario ingresa su username "HernanCrowdAr22@test.com"
    And El usuario ingresa su password "1705962013Hernanat"
    And El usuario clickea en el boton "Login"
    And El usuario verifica que ingreso correctamente a la web
    And El usuario clickea el boton "Orders" para ir a las ordenes de compra
    Then El usuario ve la pagina con las ordenes de compra

  @TestAcc
  Scenario: El usuario visualiza los detalles de su orden de compra
    Given El usuario se encuentra en la pagina de Automation Practice
    When El usuario clickea el boton "My Account" del menu
    And El usuario ingresa su username "HernanCrowdAr22@test.com"
    And El usuario ingresa su password "1705962013Hernanat"
    And El usuario clickea en el boton "Login"
    And El usuario verifica que ingreso correctamente a la web
    And El usuario clickea el boton "Orders" para ir a las ordenes de compra
    And El usuario clickea en el boton "View" para ver su orden de compra
    Then El usuario visualiza los detalles de su orden

  @TestAcc
  Scenario: El usuario visualiza la fecha y numero de orden
    Given El usuario se encuentra en la pagina de Automation Practice
    When El usuario clickea el boton "My Account" del menu
    And El usuario ingresa su username "HernanCrowdAr22@test.com"
    And El usuario ingresa su password "1705962013Hernanat"
    And El usuario clickea en el boton "Login"
    And El usuario verifica que ingreso correctamente a la web
    And El usuario clickea el boton "Orders" para ir a las ordenes de compra
    And El usuario clickea en el boton "View" para ver su orden de compra
    Then El usuario visualiza el numero de orden y su status


  @TestAcc
  Scenario: El usuario visualiza el billing y shipping address
    Given El usuario se encuentra en la pagina de Automation Practice
    When El usuario clickea el boton "My Account" del menu
    And El usuario ingresa su username "HernanCrowdAr22@test.com"
    And El usuario ingresa su password "1705962013Hernanat"
    And El usuario clickea en el boton "Login"
    And El usuario verifica que ingreso correctamente a la web
    And El usuario clickea el boton "My Account" del menu
    And El usuario clickea el boton "Address" para ver su direccion
    Then El usuario visualiza el billing and shipping address

  @TestAcc
  Scenario: El usuario verifica que puede editar el shipping address
    Given El usuario se encuentra en la pagina de Automation Practice
    When El usuario clickea el boton "My Account" del menu
    And El usuario ingresa su username "HernanCrowdAr22@test.com"
    And El usuario ingresa su password "1705962013Hernanat"
    And El usuario clickea en el boton "Login"
    And El usuario verifica que ingreso correctamente a la web
    And El usuario clickea el boton "My Account" del menu
    And El usuario clickea el boton "Address" para ver su direccion
    And El usuario clickea el boton "Edit" en Shipping Address
    Then El usuario puede editar su Shipping Address

  @Test
  Scenario: El usuario verifica que puede cambiar su password
    Given El usuario se encuentra en la pagina de Automation Practice
    When El usuario clickea el boton "My Account" del menu
    And El usuario ingresa su username "HernanCrowdAr22@test.com"
    And El usuario ingresa su password "1705962013Hernanat"
    And El usuario clickea en el boton "Login"
    Then El usuario verifica que ingreso correctamente a la web
    And El usuario clickea el boton "My Account" del menu
    And El usuario clickea el boton "Account Details" para ver detalle de su cuenta
    Then El usuario visualiza que puede cambiar su password

  @Test
  Scenario: El usuario se desloguea de la cuenta
    Given El usuario se encuentra en la pagina de Automation Practice
    When El usuario clickea el boton "My Account" del menu
    And El usuario ingresa su username "HernanCrowdAr22@test.com"
    And El usuario ingresa su password "1705962013Hernanat"
    And El usuario clickea en el boton "Login"
    Then El usuario verifica que ingreso correctamente a la web
    And El usuario clickea el boton "My Account" del menu
    And El usuario clickea el boton "Logout" para desloguarse
    Then El usuario verifica que se deslogueo