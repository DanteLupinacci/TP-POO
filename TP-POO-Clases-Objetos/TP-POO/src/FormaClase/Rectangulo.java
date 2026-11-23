package FormaClase;

public class Rectangulo extends Forma {

    public Rectangulo() {
        super();
    }

    @Override
    public double calcularArea() {
        return getBase() * getAltura();
    }
}