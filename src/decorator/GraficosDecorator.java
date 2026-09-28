package decorator;

/** Decorador concreto: agrega graficos de barras y torta al reporte. */
public class GraficosDecorator extends ReporteDecorator {

    public GraficosDecorator(Reporte reporteEnvuelto) {
        super(reporteEnvuelto);
    }

    @Override
    public String generarContenido() {
        return super.generarContenido() + " + [graficos de barras y torta]";
    }

    @Override
    public double calcularCostoGeneracion() {
        return super.calcularCostoGeneracion() + 150.0;
    }
}
