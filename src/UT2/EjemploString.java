package UT2;
public class EjemploString {
    public static void main(String[] args) {
        
        String texto = "Andres es el mejor profesor";

         System.out.println("Longitud de la cadena: " + texto.length());

        System.out.println("Texto en mayúsculas: " + texto.toUpperCase());

       System.out.println("¿Contiene la palabra 'Java'? " + texto.contains("Java"));
    }
}
