#language: es
Característica: Iniciar sesión en la aplicación del exito

  Esquema del escenario: : Ingresar a la aplicación del exito
    Dado que el usuario abra la aplicacion del exito
    Cuando ingrese las credenciales <correo> <clave>
    Y valida que el nombre de usuario sea visible
    Entonces cierra sesion

    Ejemplos:
      | correo                 | clave           |
      | jessi.joha14@gmail.com | Jessicaparra14* |