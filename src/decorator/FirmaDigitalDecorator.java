package decorator;

/** Decorador concreto: agrega firma digital para validez legal. */
public class FirmaDigitalDecorator extends ReporteDecorator {

    public FirmaDigitalDecorator(Reporte reporteEnvuelto) {
        super(reporteEnvuelto);
    }

    @Override
    public String generarContenido() {
        return super.generarContenido() + " + [firma digital verificada]";
    }

    @Override
    public double calcularCostoGeneracion() {
        return super.calcularCostoGeneracion() + 80.0;
    }
}
