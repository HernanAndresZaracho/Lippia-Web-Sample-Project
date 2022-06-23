Feature: Test de pruebas sobre los menus de la pagina (MY ACCOUNT)

  Background:
    Given El usuario se encuentra en la pagina de Automation Practice
    And El usuario clickea el boton My Account del menu
    And El usuario se encuentra logueado
    And El usuario verifica que ingreso correctamente a la web


  @ProyectoFinal
  @Home
  Scenario: El usuario puede agregar un cupon de descuento a la compra
    When El usuario clickea el boton Shop del menu
    And El usuario clickea el boton home
    And Prueba que la pagina contenga 3 libros
    Then Verifica que exiten 3 libros
    When El usuario clickea en cualquier arrival
    Then Verifica que navego a la pagina del arrival seleccionado
    When El usuario clickea en un libro a su eleccion
    And El usuario agrega el libro al carrito
    Then Verifica que su libro se agrego al carrito
    And El usuario visualiza el precio en el carrito del menu
    When El usuario clickea en el mensaje de View Basket
    Then El usuario visualiza valores totales y subtotales
    And El valor total es mayor al subtotal
    When El usuario clickea el boton de Continuar Pago
    Then El usuario visualiza los detalles de su orden de compra
    #And El usuario completa sus datos
    And El usuario puede agregar un cupon de descuento


  @ProyectoFinal
  @Home
  Scenario: El usuario realiza una compra exitosa
    When El usuario clickea el boton Shop del menu
    And El usuario clickea el boton home
    And Prueba que la pagina contenga 3 libros
    Then Verifica que exiten 3 libros
    When El usuario clickea en cualquier arrival
    Then Verifica que navego a la pagina del arrival seleccionado
    When El usuario clickea en un libro a su eleccion
    And El usuario agrega el libro al carrito
    Then Verifica que su libro se agrego al carrito
    And El usuario visualiza el precio en el carrito del menu
    When El usuario clickea en el mensaje de View Basket
    Then El usuario visualiza valores totales y subtotales
    And El valor total es mayor al subtotal
    When El usuario clickea el boton de Continuar Pago
    Then El usuario visualiza los detalles de su orden de compra
    #And El usuario completa sus datos
    And El usuario puede agregar un cupon de descuento
    And El usuario clickea en el boton de Pago
    And El usuario clickea en el boton Realizar Pedido
    And El pedido se completa

