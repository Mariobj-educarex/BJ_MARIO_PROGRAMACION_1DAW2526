package UT1;

		public class ejerciciosclase_30sep {
			 public static void main(String[] args) {
			 // 1
			 int x = 25;
			 double y = x; // int → double
			 System.out.println("Implícita: " + y);
			 
			 
			 // 2
			 double a = 19.99;
			 int b = (int) a; // double → int
			 System.out.println("Explícita: " + b);
			 
			 
			 // 3
			 char letra = 'C';
			 int codigo = letra;
			 System.out.println("Código de 'C': " + codigo);
			 int num = 68;
			 char letra2 = (char) num;
			 System.out.println("Letra del 68: " + letra2);
			 
			 
			 // 4
			 int grande = 1000;
			 byte pequeño = (byte) grande;
			 System.out.println("Conversión con pérdida: " + pequeño);
			 }
			

	}


