Feature: Test de pruebas sobre registrarse en la pagina (MY ACCOUNT - REGISTRATION)

  Background:
    Given El usuario se encuentra en la pagina de Automation Practice
    And El usuario clickea el boton My Account del menu

  @Test1
  Scenario Outline: El usuario se registra correctamente con credenciales validas
    When El usuario ingresa un username <username>
    And El usuario ingresa un password <password>
    And El usuario clickea en el boton Register para registrarse
    Then El usuario verifica que se registro correctamente en la web

    Examples:
      | username                 | password           |
      | HernanCrowdAr26@test.com | 1705962013Hernanat |

  @Test1
  Scenario Outline: El usuario no se registra por proporcionar un mail ya registrado
    When El usuario ingresa un username <username>
    And El usuario ingresa un password <password>
    And El usuario clickea en el boton Register para registrarse
    Then La web muestra un mensaje de error por username ya registrado

    Examples:
      | username                 | password           |
      | HernanCrowdAr22@test.com | 1705962013Hernanat |

  @Test1
  Scenario Outline: El usuario no se registra por proporcionar un mail vacio
    When El usuario ingresa un username <username>
    And El usuario ingresa un password <password>
    And El usuario clickea en el boton Register para registrarse
    Then La web muestra un mensaje de error por mail vacio

    Examples:
      | username | password           |
      |          | 1705962013Hernanat |

  @Test2
  Scenario Outline: El usuario no se registra por proporcionar un password vacio
    When El usuario ingresa un username <username>
    And El usuario ingresa un password <password>
    And El usuario clickea en el boton Register para registrarse
    Then La web no permite clickear en el boton Register al no ingresarse ningun password

    Examples:
      | username                 | password |
      | HernanCrowdAr22@test.com |          |

  @Test2
  Scenario Outline: El usuario no se registra por proporcionar credenciales vacias
    When El usuario ingresa un username <username>
    And El usuario ingresa un password <password>
    And El usuario clickea en el boton Register para registrarse
    Then La web no permite clickear en el boton Register al no ingresarse ningun password

    Examples:
      | username | password |
      |          |          |
