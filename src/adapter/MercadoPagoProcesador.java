package adapter;

/** Adaptee "nativo": ya implementa la interfaz esperada por el sistema. */
public class MercadoPagoProcesador implements ProcesadorPago {
    @Override
    public boolean procesarPago(double montoEnPesos) {
        System.out.println("MercadoPago: cobrando $" + montoEnPesos + " ARS...");
        return true;
    }
}
