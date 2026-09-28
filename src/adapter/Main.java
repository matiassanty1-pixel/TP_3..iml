package adapter;

/**
 * Clase cliente: el carrito de compras solo conoce ProcesadorPago,
 * por lo que puede cobrar indistintamente con MercadoPago (nativo) o
 * con PayPal (a traves del adapter) sin cambiar su codigo.
 */
public class Main {
    public static void main(String[] args) {
        ProcesadorPago[] procesadores = {
            new MercadoPagoProcesador(),
            new PayPalAdapter(new PayPalLegacyAPI())
        };

        double montoCompra = 21000.0; // pesos argentinos
        for (ProcesadorPago procesador : procesadores) {
            boolean exito = procesador.procesarPago(montoCompra);
            System.out.println("Resultado del cobro: " + (exito ? "APROBADO" : "RECHAZADO"));
            System.out.println("-----");
        }
    }
}
