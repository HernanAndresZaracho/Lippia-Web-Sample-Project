Feature: Test de Compra y verificacion de diferencia de impuestos por pais

  Background:
    Given El usuario se encuentra en la pagina de Automation Practice
    And El usuario clickea el boton My Account del menu
    And El usuario se encuentra logueado
    And El usuario verifica que ingreso correctamente a la web
    And El usuario clickea el boton Shop del menu

  @ProyectoFinal @Shop1
  Scenario: El usuario realiza una compra desde el shop
    When El usuario agrega un libro al carrito
    And El usuario visualiza el precio en el carrito del menu
    When El usuario clickea en el mensaje de View Basket
    Then El usuario visualiza valores totales y subtotales
    And El valor total es mayor al subtotal
    When El usuario clickea el boton de Continuar Pago
    Then El usuario visualiza los detalles de su orden de compra
    #And El usuario completa sus datos
    And El usuario clickea en el boton de Pago
    And El usuario clickea en el boton Realizar Pedido
    And El pedido se completa

  @ProyectoFinal @Shop
  Scenario Outline: El usuario verifica que el impuesto de la India es menor al resto
    When El usuario agrega un libro al carrito
    And El usuario visualiza el precio en el carrito del menu
    When El usuario clickea en el mensaje de View Basket
    Then El usuario visualiza valores totales y subtotales
    And El valor total es mayor al subtotal
    When El usuario clickea el boton de Continuar Pago
    Then El usuario comprueba que varia los impuestos para la <Pais>
    And Los impuestos para la <Pais> son 2% para los demas 5%

    Examples:
      | Pais  |
      | India |

