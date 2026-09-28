package factorymethod;

/** Producto concreto: entrega mediante drone autonomo (zonas habilitadas). */
public class PedidoDroneDelivery implements Pedido {
    @Override
    public void prepararEmpaque() {
        System.out.println("Empaque liviano y balanceado, apto para transporte aereo.");
    }

    @Override
    public String despachar() {
        return "Drone asignado, ruta aerea calculada automaticamente.";
    }

    @Override
    public double calcularCostoEnvio(double distanciaKm) {
        return 500 + (distanciaKm * 100); // tarifa premium por tecnologia
    }
}
