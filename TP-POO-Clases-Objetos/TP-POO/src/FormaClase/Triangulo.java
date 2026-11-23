package FormaClase;

public class Triangulo extends Forma {

    public Triangulo() {
        super();
    }

    @Override
    public double calcularArea() {
        return (getBase() * getAltura()) / 2;
    }
}