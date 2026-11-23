package PersonaDocentePreceptor;

public class Main {
    public static void main(String[] args) {
        Docente d = new Docente("Marta López", 45, "Matemática");
        Preceptor p = new Preceptor("Jorge Pérez", 38, "5° año");

        d.mostrarInformacion();
        p.mostrarInformacion();

        d.setEdad(46);

        System.out.println("\n--- Después de modificar la edad del docente ---");
        d.mostrarInformacion();
    }
}