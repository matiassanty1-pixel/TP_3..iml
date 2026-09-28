package factorymethod;

/** Producto abstracto: todo tipo de pedido debe poder prepararse y despacharse. */
public interface Pedido {
    void prepararEmpaque();
    String despachar();
    double calcularCostoEnvio(double distanciaKm);
}
