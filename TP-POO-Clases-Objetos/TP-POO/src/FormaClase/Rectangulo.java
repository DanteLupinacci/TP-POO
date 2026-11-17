package FormaClase;

public class Rectangulo extends Forma {

    @Override
    public double calcularArea() {
        return getBase() * getAltura();
    }
}
