package UT2;

import java.util.Scanner;

public class SumaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        int suma = 0;
        
        System.out.println("Introduce números para sumar (introduce 0 para terminar):");
        
        numero = scanner.nextInt();  
        
        while (numero != 0) {  
            suma += numero;   
            numero = scanner.nextInt();  
        }
        
        System.out.println("La suma total es: " + suma);
        
        scanner.close();
    }
}

