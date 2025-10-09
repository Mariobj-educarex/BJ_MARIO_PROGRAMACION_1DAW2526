package UT2;

public class Libro {
    
    private String titulo;
    private String autor;

 
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

   
    public void mostrarInfo() {
        System.out.println("Título: " + titulo + " | Autor: " + autor);
    }

    public static void main(String[] args) {
        Libro libro1 = new Libro("La casa de Papel", "Florentino Perez");
        Libro libro2 = new Libro("La Leyenda", "Diego Pablo Simeone0.");

        libro1.mostrarInfo();
        libro2.mostrarInfo();
    }
}
