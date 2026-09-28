package decorator;

/**
 * Decorador abstracto: implementa Reporte y envuelve otro Reporte,
 * delegando en el por defecto. Las subclases concretas agregan
 * responsabilidades antes o despues de delegar.
 */
public abstract class ReporteDecorator implements Reporte {

    protected final Reporte reporteEnvuelto;

    protected ReporteDecorator(Reporte reporteEnvuelto) {
        this.reporteEnvuelto = reporteEnvuelto;
    }

    @Override
    public String generarContenido() {
        return reporteEnvuelto.generarContenido();
    }

    @Override
    public double calcularCostoGeneracion() {
        return reporteEnvuelto.calcularCostoGeneracion();
    }
}
