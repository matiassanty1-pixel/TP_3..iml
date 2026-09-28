package decorator;

/** Componente: contrato comun para cualquier reporte, decorado o no. */
public interface Reporte {
    String generarContenido();
    double calcularCostoGeneracion();
}
