package JugadorClase;

public class Main {
    public static void main(String[] args) {
        Jugador j1 = new Jugador("Lucas");
        Jugador j2 = new Jugador("Sofía");

        System.out.println("--- Datos iniciales ---");
        System.out.println(j1.getNombre() + " | Nivel: " + j1.getNivel() + " | Puntos: " + j1.getPuntos());
        System.out.println(j2.getNombre() + " | Nivel: " + j2.getNivel() + " | Puntos: " + j2.getPuntos());

        j1.ganarPuntos(100);
        j2.ganarPuntos(50);

        System.out.println("\n--- Después de ganar puntos ---");
        System.out.println(j1.getNombre() + " | Puntos: " + j1.getPuntos());
        System.out.println(j2.getNombre() + " | Puntos: " + j2.getPuntos());

        System.out.println("\n--- Intento sumar una cantidad negativa ---");
        j1.ganarPuntos(-20);
        System.out.println(j1.getNombre() + " | Puntos: " + j1.getPuntos());

        j1.subirNivel();

        System.out.println("\n--- Después de subir de nivel a " + j1.getNombre() + " ---");
        System.out.println(j1.getNombre() + " | Nivel: " + j1.getNivel() + " | Puntos: " + j1.getPuntos());
        System.out.println(j2.getNombre() + " | Nivel: " + j2.getNivel() + " | Puntos: " + j2.getPuntos());
    }
}