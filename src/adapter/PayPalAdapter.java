package adapter;

/**
 * Adapter: traduce la interfaz interna ProcesadorPago hacia la API
 * legacy de PayPal, incluyendo la conversion de moneda (pesos -> centavos
 * de dolar) y de tipo de retorno (codigo HTTP -> booleano).
 */
public class PayPalAdapter implements ProcesadorPago {

    private static final double COTIZACION_DOLAR = 1050.0; // pesos por USD

    private final PayPalLegacyAPI apiLegacy;

    public PayPalAdapter(PayPalLegacyAPI apiLegacy) {
        this.apiLegacy = apiLegacy;
    }

    @Override
    public boolean procesarPago(double montoEnPesos) {
        double montoEnDolares = montoEnPesos / COTIZACION_DOLAR;
        long montoEnCentavos = Math.round(montoEnDolares * 100);
        int codigoRespuesta = apiLegacy.chargeInCents(montoEnCentavos);
        return codigoRespuesta == 200;
    }
}
