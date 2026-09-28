package decorator;

/** Decorador concreto: agrega una marca de agua de confidencialidad. */
public class MarcaAguaDecorator extends ReporteDecorator {

    public MarcaAguaDecorator(Reporte reporteEnvuelto) {
        super(reporteEnvuelto);
    }

    @Override
    public String generarContenido() {
        return super.generarContenido() + " + [marca de agua: CONFIDENCIAL]";
    }

    @Override
    public double calcularCostoGeneracion() {
        return super.calcularCostoGeneracion() + 20.0;
    }
}
