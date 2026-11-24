package BibliotecaDigital;

public class Main {
    public static void main(String[] args) {
        LibroDigital libro = new LibroDigital("El Principito");
        Audiolibro audio = new Audiolibro("Rayuela");

        libro.mostrarDescripcion();
        audio.mostrarDescripcion();
    }
}