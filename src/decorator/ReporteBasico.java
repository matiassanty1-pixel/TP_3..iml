package decorator;

/** Componente concreto: reporte financiero minimo, solo texto y numeros. */
public class ReporteBasico implements Reporte {

    private final String nombreEmpresa;

    public ReporteBasico(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    @Override
    public String generarContenido() {
        return "Reporte financiero de " + nombreEmpresa + " [tablas de balance]";
    }

    @Override
    public double calcularCostoGeneracion() {
        return 500.0;
    }
}
