package PersonaDocentePreceptor;

public class Preceptor extends Persona {
    private String cursoAsignado;

    public Preceptor(String nombre, int edad, String cursoAsignado) {
        super(nombre, edad);
        this.cursoAsignado = cursoAsignado;
    }

    public void mostrarInformacion() {
        System.out.println("Preceptor -> Nombre: " + getNombre() + ", Edad: " + getEdad() + ", Curso asignado: " + cursoAsignado);
    }
}