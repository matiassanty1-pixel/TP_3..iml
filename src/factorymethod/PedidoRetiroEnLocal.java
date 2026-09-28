package factorymethod;

/** Producto concreto: el cliente retira el pedido en el local. */
public class PedidoRetiroEnLocal implements Pedido {
    @Override
    public void prepararEmpaque() {
        System.out.println("Empaque simple para llevar, sin necesidad de aislamiento.");
    }

    @Override
    public String despachar() {
        return "Pedido dejado en el mostrador con el numero de orden.";
    }

    @Override
    public double calcularCostoEnvio(double distanciaKm) {
        return 0; // no hay envio
    }
}
