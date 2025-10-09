package UT2;
		
		public class Perro {
		  
		    private String nombre;
		    private String raza;

		 
		    public Perro(String nombre, String raza) {
		        this.nombre = nombre;
		        this.raza = raza;
		    }

		 
		    public void ladrar() {
		    	System.out.println(nombre + " esta ladrando: ");
		        System.out.println("Guau, guau");
		    }

		
		    public static void main(String[] args) {
		        Perro perro1 = new Perro("Vinicius", "Labrador");
		        Perro perro2 = new Perro("Lamine", "Bulldog");

		        perro1.ladrar();
		        perro2.ladrar();
		    }
		}


	



