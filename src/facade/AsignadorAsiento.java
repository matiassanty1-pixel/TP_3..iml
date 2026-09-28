package facade;

/** Subsistema 3: asigna butaca disponible segun preferencia del pasajero. */
public class AsignadorAsiento {
    public String asignar(String preferencia) {
        System.out.println("Buscando asiento con preferencia: " + preferencia + "...");
        return "23" + ("ventana".equalsIgnoreCase(preferencia) ? "A" : "C");
    }
}
