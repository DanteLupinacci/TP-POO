package AutoClase;

public class Main {
    public static void main(String[] args) {
        Auto a1 = new Auto();
        a1.marca = "Toyota";
        a1.modelo = "Corolla";
        a1.color = "gris";

        Auto a2 = new Auto();
        a2.marca = "Ford";
        a2.modelo = "Fiesta";
        a2.color = "rojo";

        Auto a3 = new Auto();
        a3.marca = "Volkswagen";
        a3.modelo = "Gol";
        a3.color = "blanco";

        a1.mostrarDatos();
        a2.mostrarDatos();
        a3.mostrarDatos();
    }
}