Feature: CRUD de usuarios
  Como administrador quiero poder crear, leer y buscar
  usuarios para mantener la base de datos de usuarios actualizada

  Scenario: Visualizar registros
    Given que estoy en la pagina de listado de usuarios
    Then se pueden visualizar todos los datos del listado correctamente


  Scenario: crear un usuario
    Given que estoy en la pagina de listado de usuarios
    When ingreso los datos del usuario
    And presiono el botón de guardar
    Then el usuario es creado correctamente

  Scenario: Actualizar un usuario
    Given que estoy en la pagina de listado de usuarios
    When modifico los datos del usuario
    And presiono el botón de actualizar
    Then el usuario es actualizado correctamente

  Scenario: Buscar un usuario
    Given que estoy en la pagina de listado de usuarios
    When digito un codigo en la caja de busqueda
    And presiono el boton de buscar
    Then el usuario es mostrado correctamente