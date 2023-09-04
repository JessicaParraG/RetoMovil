#language: es
Característica: Agregar producto al carrito

  Esquema del escenario: : Agregar un producto al carrito
    Dado que el usuario abra la aplicacion del exito
    Cuando ingrese las credenciales <correo> <clave>
    Y busque un producto y lo agregue al carrito
    Entonces valida que el producto se haya agregado correctamente

    Ejemplos:
      | correo                 | clave           |
      | jessi.joha14@gmail.com | Jessicaparra14* |