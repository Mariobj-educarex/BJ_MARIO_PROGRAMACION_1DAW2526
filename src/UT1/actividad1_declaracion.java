package UT1;



public class actividad1_declaracion {

	public static void main(String[] args) {

		

		// Ejercicio 1

		byte miByte = 100;              

        short miShort = 10000;          

        int miInt = 100000;             

        long miLong = 10000000000L;

        float miFloat = 3.14f;         

        double miDouble = 3.1415926535; 

        char miChar = 'A';          

        boolean miBoolean = true;  



      

        System.out.println("byte: " + miByte);

        System.out.println("short: " + miShort);

        System.out.println("int: " + miInt);

        System.out.println("long: " + miLong);

        System.out.println("float: " + miFloat);

        System.out.println("double: " + miDouble);

        System.out.println("char: " + miChar);

        System.out.println("boolean: " + miBoolean);

		

		// Ejercicio 2

	

		int contador = 10;

		

		System.out.println(contador - 3);

		

		// Ejercicio 4

		

		        int precioBase = 100;

		        double iva = 0.21;

		        double precioConIVA = precioBase * (1 + iva);



		     

		        System.out.println("Precio base: " + precioBase);

		        System.out.println("IVA (21%): " + (precioBase * iva));

		        System.out.println("Precio total con IVA: " + precioConIVA);

		    }



}

