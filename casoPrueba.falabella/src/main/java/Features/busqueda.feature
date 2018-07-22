Feature: Busqueda en Linkedin

	@tag1
  Scenario: Ingreso a test buscador
    Given Se ingresa a navegador y vamos al buscador de google
    When Se confirma el titulo del buscador
    Then el usuario ingresa la palabra a buscar
    Then el usuario presiona el boton buscar
    Then Se presiona link de inicio de sesion linkedin

	@tag2
  Scenario Outline: Ingreso a Linkedin
  	Given Usuario ingresa su username "<usuario>" y su contraseña "<clave>"
    When usuario presiona boton de login
    When Busca contacto de red
    When Visualiza perfil de contacto
  
    Examples: 
      | usuario                | clave         |
      | amezaepul@gmail.com | 1801falabella |
      
   @tag3
   Scenario: Ingreso a perfil
		Given Se ingresa a la seccion experiencia laboral
		When se selecciona perfil 

