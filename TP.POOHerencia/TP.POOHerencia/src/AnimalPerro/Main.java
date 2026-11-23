package AnimalPerro;

public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("Rex", 3, "Labrador");
        System.out.println("Nombre: " + perro.getNombre());
        System.out.println("Edad: " + perro.getEdad());
        System.out.println("Raza: " + perro.getRaza());
        perro.ladrar();
    }
}