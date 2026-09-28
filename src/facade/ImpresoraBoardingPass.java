package facade;

/** Subsistema 4: genera el comprobante final de embarque. */
public class ImpresoraBoardingPass {
    public String imprimir(String pasajero, String asiento, String puerta) {
        System.out.println("Imprimiendo boarding pass...");
        return "BOARDING PASS -> " + pasajero + " | Asiento " + asiento + " | Puerta " + puerta;
    }
}
