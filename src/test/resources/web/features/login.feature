Feature: Test de pruebas sobre el logueo de la pagina (MY ACCOUNT - LOGIN)

  Background:
    Given El usuario se encuentra en la pagina de Automation Practice
    And El usuario clickea el boton My Account del menu

  @Test1
  Scenario Outline: El usuario se loguea correctamente con credenciales validas
    And El usuario ingresa su username <username>
    And El usuario ingresa su password <password>
    And El usuario clickea en el boton Login
    Then El usuario verifica que ingreso correctamente a la web

    Examples:
      | username                 | password           |
      | HernanCrowdAr22@test.com | 1705962013Hernanat |

  @Test1
  Scenario Outline: El usuario intenta loguearse con las credenciales invalidas
    When El usuario ingresa su username <username>
    And El usuario ingresa su password <password>
    And El usuario clickea en el boton Login
    Then La web muestra un mensaje de error por no encontrar el username

    Examples:
      | username                | password           |
      | CorreoInvalido@test.com | ContrasenaInvalidaHernanat |


  @Test1
  Scenario Outline: El usuario intenta loguearse con el username correcto y la password vacia
    When El usuario ingresa su username <username>
    And El usuario ingresa su password <password>
    And El usuario clickea en el boton Login
    Then La web muestra un mensaje pidiendo el password

    Examples:
      | username                 | password |
      | HernanCrowdAr22@test.com |          |

  @Test1
  Scenario Outline: El usuario intenta loguearse con el username vacio y la contraseña correcta
    When El usuario ingresa su username <username>
    And El usuario ingresa su password <password>
    And El usuario clickea en el boton Login
    Then La web muestra un mensaje pidiendo el username

    Examples:
      | username | password           |
      |          | 1705962013Hernanat |

  @Test1
  Scenario Outline: El usuario intenta loguearse las credenciales vacias
    When El usuario ingresa su username <username>
    And El usuario ingresa su password <password>
    And El usuario clickea en el boton Login
    Then La web muestra un mensaje pidiendo el username

    Examples:
      | username | password |
      |          |          |

  @Test1
  Scenario Outline: La web no muestra la contrasena que se ingresa
    When El usuario ingresa su username <username>
    And El usuario ingresa su password <password>
    Then La web muestra asteriscos en el textbox password

    Examples:
      | username                 | password     |
      | HernanCrowdAr22@test.com | 1234Hernanat |

  @Test1
  Scenario Outline: El usuario intenta loguearse con el username y password invertido en mayusculas y minisculas
    When El usuario ingresa su username <username>
    And El usuario ingresa su password <password>
    And El usuario clickea en el boton Login
    Then La web muestra un mensaje de contrasena incorrecta

    Examples:
      | username                 | password           |
      | hERNANcROWDaR22@TEST.COM | 1705962013hERNANAT |

  @Test1
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
