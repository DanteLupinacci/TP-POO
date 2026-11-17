package FormaClase;

public class Triangulo extends Forma {

    @Override
    public double calcularArea() {
        return (getBase() * getAltura()) / 2;
    }
}
