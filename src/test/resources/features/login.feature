# language: es

Característica: Login

# PRACTICO 09 | ICARO

  @practico09 @TPfinal
  Escenario: Login correcto
    Dado que el usuario accede a la pagina de login
    Cuando el usuario ingresa email y contraseña validas
    Entonces el usuario se encuentra en la pantalla de su cuenta

  Escenario: Login incorrecto
    Dado que el usuario accede a la pagina de login
    Cuando el usuario ingresa email y contraseña invalidas
    Entonces el usuario tiene visibilidad de alerta

  Escenario: Login vacio
    Dado que el usuario accede a la pagina de login
    Cuando el usuario no ingresa email y contraseña
    Entonces el usuario tiene visibilidad de alerta