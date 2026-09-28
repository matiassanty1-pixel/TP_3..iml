package facade;

/**
 * Facade: expone una unica operacion simple ("realizarCheckIn") que
 * coordina internamente los 4 subsistemas independientes, ocultando
 * su complejidad y orden de invocacion al cliente (el pasajero /
 * la app movil de la aerolinea).
 */
public class AeropuertoFacade {

    private final ValidadorPasaporte validadorPasaporte;
    private final ControlEquipaje controlEquipaje;
    private final AsignadorAsiento asignadorAsiento;
    private final ImpresoraBoardingPass impresora;

    public AeropuertoFacade() {
        this.validadorPasaporte = new ValidadorPasaporte();
        this.controlEquipaje = new ControlEquipaje();
        this.asignadorAsiento = new AsignadorAsiento();
        this.impresora = new ImpresoraBoardingPass();
    }

    public String realizarCheckIn(String pasajero, String numeroPasaporte,
                                   double pesoEquipajeKg, String preferenciaAsiento,
                                   String puertaEmbarque) {

        if (!validadorPasaporte.validar(numeroPasaporte)) {
            return "Check-in rechazado: pasaporte invalido.";
        }

        controlEquipaje.despacharEquipaje(pesoEquipajeKg, 23);
        String asiento = asignadorAsiento.asignar(preferenciaAsiento);
        return impresora.imprimir(pasajero, asiento, puertaEmbarque);
    }
}
