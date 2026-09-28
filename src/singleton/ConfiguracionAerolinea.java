package singleton;

/**
 * Patron Singleton.
 * Mantiene la configuracion global de la aerolinea (moneda, politica de
 * equipaje, tasa de impuestos) que debe ser identica y consistente para
 * todos los modulos del sistema de reservas (buscador de vuelos, carrito
 * de compra, facturacion, etc.).
 */
public final class ConfiguracionAerolinea {

    private static ConfiguracionAerolinea instancia;

    private String nombreAerolinea;
    private String monedaBase;
    private double tasaImpuesto;
    private int kilosEquipajeGratis;

    // Constructor privado: nadie fuera de la clase puede instanciarla.
    private ConfiguracionAerolinea() {
        this.nombreAerolinea = "AndesFly";
        this.monedaBase = "ARS";
        this.tasaImpuesto = 0.21;
        this.kilosEquipajeGratis = 23;
    }

    // Punto de acceso global controlado (lazy initialization).
    public static synchronized ConfiguracionAerolinea getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracionAerolinea();
        }
        return instancia;
    }

    public String getNombreAerolinea() {
        return nombreAerolinea;
    }

    public String getMonedaBase() {
        return monedaBase;
    }

    public double getTasaImpuesto() {
        return tasaImpuesto;
    }

    public int getKilosEquipajeGratis() {
        return kilosEquipajeGratis;
    }

    public void actualizarTasaImpuesto(double nuevaTasa) {
        if (nuevaTasa < 0 || nuevaTasa > 1) {
            throw new IllegalArgumentException("La tasa debe estar entre 0 y 1");
        }
        this.tasaImpuesto = nuevaTasa;
    }

    public double calcularPrecioFinal(double precioBase) {
        return precioBase + (precioBase * tasaImpuesto);
    }
}
