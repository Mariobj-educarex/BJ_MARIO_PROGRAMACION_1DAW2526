package UT2;

public class Coche {
    
    private String marca;
    private int año;

    
    public Coche() {
        this.marca = "Sin marca";
        this.año = 2000;
    }

   
    public Coche(String marca, int año) {
        this.marca = marca;
        this.año = año;
    }

   
    public void mostrarDatos() {
        System.out.println("Marca: " + marca + ", Año: " + año);
    }

  
    public static void main(String[] args) {
      
        Coche coche1 = new Coche();

       
        Coche coche2 = new Coche("Toyota", 2022);

      
        System.out.println("Datos del primer coche:");
        coche1.mostrarDatos();

        System.out.println("\nDatos del segundo coche:");
        coche2.mostrarDatos();
    }
}
