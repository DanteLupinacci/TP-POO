package MedioPagoClase;

public class Main {
    public static void main(String[] args) {
        Tarjeta tarjeta = new Tarjeta("Ana Gómez", "4321");
        BilleteraVirtual billetera = new BilleteraVirtual("Luis Pérez", "Mercado Pago");

        tarjeta.procesarPago(15000);
        System.out.println();
        billetera.procesarPago(8500.50);
    }
}