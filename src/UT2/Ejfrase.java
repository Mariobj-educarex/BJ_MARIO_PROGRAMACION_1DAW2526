package UT2;

import java.util.Scanner;

public class Ejfrase {
    public static void main(String[] args) {
    	
    	// 1
    	
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe una frase: ");
        String frase = scanner.nextLine();
        scanner.close();

        // 2
        
        System.out.println("Longitud: " + frase.length());
        System.out.println("Primera letra: " + frase.charAt(0));
        System.out.println("Última letra: " + frase.charAt(frase.length() - 1));
        System.out.println("Frase en mayúsculas: " + frase.toUpperCase());
    }
}
