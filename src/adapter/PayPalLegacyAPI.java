package adapter;

/**
 * Adaptee incompatible: una libreria externa de PayPal con una firma de
 * metodo totalmente distinta (recibe centavos de dolar, no pesos, y
 * devuelve un codigo de estado en vez de un booleano).
 */
public class PayPalLegacyAPI {
    public int chargeInCents(long amountCentsUSD) {
        System.out.println("PayPal (API legacy): cobrando " + amountCentsUSD + " centavos USD...");
        return 200; // codigo HTTP-like de exito
    }
}
