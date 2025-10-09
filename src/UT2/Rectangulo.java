package UT2;

	public class Rectangulo {
		   
		    private double base;
		    private double altura;

		   
		    public Rectangulo(double base, double altura) {
		        this.base = base;
		        this.altura = altura;
		    }

		 
		    public double calcularArea() {
		        return base * altura;
		    }

		  
		    public static void main(String[] args) {
		        Rectangulo rectangulo1 = new Rectangulo(5, 3);
		        System.out.println("El área del rectángulo es: " + rectangulo1.calcularArea());
		    }
		}


	



