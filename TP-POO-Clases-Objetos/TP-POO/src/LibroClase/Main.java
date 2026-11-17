package LibroClase;

public class Main {
    public static void main(String[] args) {
        Libro l1 = new Libro("Rayuela", "Julio Cortázar", 1963);
        Libro l2 = new Libro("El Aleph", "Jorge Luis Borges", 1949);

        System.out.println("Título: " + l1.titulo + ", Autor: " + l1.autor + ", Año: " + l1.anio);
        System.out.println("Título: " + l2.titulo + ", Autor: " + l2.autor + ", Año: " + l2.anio);
    }
}
