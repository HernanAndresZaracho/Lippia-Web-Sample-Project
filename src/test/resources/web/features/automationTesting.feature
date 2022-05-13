Feature: El usuario se loguea correctamente

  @Test
  Scenario: El usuario se loguea correctamente con credenciales validas
    Given El usuario se encuentra en la pagina de Automation Practice
    When El usuario clickea el boton "My Account" del menu
    And El usuario ingresa su username "HernanCrowdAr22@test.com"
    And El usuario ingresa su password "1705962013Hernanat"
    And El usuario clickea en el boton "Login"
    Then El usuario verifica que ingreso correctamente a la web

    @test2
