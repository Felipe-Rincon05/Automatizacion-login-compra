# Autor Felipe Rincon
Feature: saucedemo.com
  Como usuario de la pagina Swag Labs
  quiero iniciar sesion, seleccionar un producto
  y añadirlo al carrito

  @Filtrar
  Scenario: Agregar un producto al carrito
    Given El usuario ingresa a la pagina Swag Labs
    When Selecciona el producto
      | strUser       | strPassword  |
      | standard_user | secret_sauce |
    Then Se realiza la question de validacion