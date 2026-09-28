package factorymethod;

/**
 * Creador abstracto: define el flujo comun (metodo plantilla) y delega
 * en el metodo fabrica "crearPedido()" la decision de que subclase de
 * Pedido instanciar. Las subclases de CreadorPedido son quienes deciden
 * el tipo concreto.
 */
public abstract class CreadorPedido {

    // Factory Method: cada subclase concreta lo implementa.
    protected abstract Pedido crearPedido();

    // Metodo plantilla que usa el producto sin conocer su clase concreta.
    public String procesarPedido(double distanciaKm) {
        Pedido pedido = crearPedido();
        pedido.prepararEmpaque();
        double costo = pedido.calcularCostoEnvio(distanciaKm);
        String estado = pedido.despachar();
        return estado + " | Costo de envio: $" + costo;
    }
}
