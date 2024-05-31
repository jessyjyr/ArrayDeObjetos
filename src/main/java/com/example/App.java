package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
	private static int SIZE;
	
	private static double calcularSalarioPromedio;
	
    public static void main( String[] args )
    {
    	if(args.length != 0)
    		SIZE = Integer.parseInt(args[0]);
    	
        //Para crear un array de Persona.
    	//Esta primera variante, crea un Array Inmutable, es decir,
    	// que no se puede modificar, una vez que se ha creado.
    	Persona[] personas = {
    		Persona.builder()
    		.nombre("Alan")
    		.primerApellido("Santiago")
    		.genero(Genero.HOMBRE)
    		.salario(3000.60)
    		.build(),
    	Persona.builder()
    		.nombre("Marta")
    		.primerApellido("Rodriguez")
    		.salario(2500.50)
    		.genero(Genero.MUJER)
    		.build(),
    	Persona.builder()
    		.nombre("Maria")
    		.primerApellido("Diaz")
    		.genero(Genero.MUJER)
    		.salario(2800.90)
    		.build(),
    		Persona.builder()
    		.nombre("Manuel")
    		.primerApellido("Santos")
    		.segundoApellido("Torres")
    		.genero(Genero.HOMBRE)
    		.salario(3000.00)
    		.build(),
    	
    	};
    	
    //Otra variante NO RECOMENDADA: para crear objetos, permite agregar nuevos elementos al array.
    
    Persona[] arrayPersonasNoRecomendado = new Persona[10];
    arrayPersonasNoRecomendado[0] = new Persona();
    arrayPersonasNoRecomendado[0].setNombre("Jessy");
    
    
   /* ¿Que podemos hacer con los array de objetos?
    * 1. Recorrerlos y mostrar los elementos por consola
    * RTA.con un for mejorado */
    
    System.out.println("Recorriendo el array de personas...........");
    for(Persona persona : personas)
    	System.out.println(persona);
    
    /*Agregar una nueva persona al array de personas
     * Por ejemplo: si fuese de enteros	*/
      int[] arrayDeNumeros = {
    		  1, 2, 3, 4
      };
     // arrayDeNumeros.push(5);
      // arrayDeNumeros[4] = 5;
      
      /* Recorrer el array de personas y almacenar las personas del genero mujer en un nuevo array
       * que podemos llamar arrayDeMujeres  */
      
      /*	Persona[]arrayDeMujeres = new Persona[SIZE];
      
      int indice = 0;
      
      for(Persona p : personas) {
    	  if(p.getGenero().equals(Genero.MUJER))
    		  arrayDeMujeres[indice++] = p;
      }
    
      System.out.println("Personas del genero mujer...........");
      	for(Persona mujer : arrayDeMujeres) {
      		if (mujer != null)
      			System.out.println(mujer); 
      		else
      			break;	*/
      	
      	
      	/*
    	 * Ejercicio # 1. Crear una rama nueva
    	 * 
    	 * Recorrer el array de personas y recuperar el salario promedio
    	 * de todas las personas ( variable double sumar el salario total)	*/
      	
      
        }
      
      
    }

