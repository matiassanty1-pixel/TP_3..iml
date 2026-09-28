package decorator;

/**
 * Clase cliente: combina decoradores en tiempo de ejecucion segun lo
 * que el cliente contrato, sin necesidad de crear una subclase por
 * cada combinacion posible (evita la explosion de subclases).
 */
public class Main {
    public static void main(String[] args) {
        Reporte reporteSimple = new ReporteBasico("Textiles del Norte SA");
        System.out.println(reporteSimple.generarContenido());
        System.out.println("Costo: $" + reporteSimple.calcularCostoGeneracion());
        System.out.println("-----");

        // Reporte completo: basico + graficos + marca de agua + firma digital
        Reporte reporteCompleto = new FirmaDigitalDecorator(
                new MarcaAguaDecorator(
                        new GraficosDecorator(
                                new ReporteBasico("Textiles del Norte SA"))));

        System.out.println(reporteCompleto.generarContenido());
        System.out.println("Costo: $" + reporteCompleto.calcularCostoGeneracion());
    }
}
