import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

       
        System.out.print("introduce tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("introduce tu edad: ");
        int edad = scanner.nextInt();

        System.out.println("Hola " + nombre + ", tienes " + edad + " años.");

        scanner.close();
    }

	}
