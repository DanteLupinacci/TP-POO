package PersonaDocentePreceptor;

public class Docente extends Persona {
    private String materia;

    public Docente(String nombre, int edad, String materia) {
        super(nombre, edad);
        this.materia = materia;
    }

    public void mostrarInformacion() {
        System.out.println("Docente -> Nombre: " + getNombre() + ", Edad: " + getEdad() + ", Materia: " + materia);
    }
}