package singleton;


public class Main {
    public static void main(String[] args) {
        ConfiguracionAerolinea configBusqueda = ConfiguracionAerolinea.getInstancia();
        System.out.println("Aerolinea: " + configBusqueda.getNombreAerolinea());
        System.out.println("Precio final vuelo (base 100000): " +
                configBusqueda.calcularPrecioFinal(100000));

        ConfiguracionAerolinea configFacturacion = ConfiguracionAerolinea.getInstancia();
        configFacturacion.actualizarTasaImpuesto(0.25);

        System.out.println("¿Misma instancia? " + (configBusqueda == configFacturacion));
        System.out.println("Nueva tasa vista desde 'busqueda': " +
                configBusqueda.getTasaImpuesto());
        System.out.println("Precio final recalculado: " +
                configBusqueda.calcularPrecioFinal(100000));
    }
}
