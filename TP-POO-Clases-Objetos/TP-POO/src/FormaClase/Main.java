package FormaClase;

public class Main {
    public static void main(String[] args) {
        Rectangulo r = new Rectangulo();
        r.setBase(5);
        r.setAltura(3);

        Triangulo t = new Triangulo();
        t.setBase(5);
        t.setAltura(3);

        System.out.println("Rectángulo -> Base: " + r.getBase() + ", Altura: " + r.getAltura());
        System.out.println("Área del rectángulo: " + r.calcularArea());
        System.out.println("Triángulo -> Base: " + t.getBase() + ", Altura: " + t.getAltura());
        System.out.println("Área del triángulo: " + t.calcularArea());
    }
}