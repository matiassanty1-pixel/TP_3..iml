package factorymethod;

/** Producto concreto: entrega a domicilio con motorizado. */
public class PedidoDomicilio implements Pedido {
    @Override
    public void prepararEmpaque() {
        System.out.println("Empaque termico para conservar la comida caliente.");
    }

    @Override
    public String despachar() {
        return "Pedido asignado a un repartidor en moto.";
    }

    @Override
    public double calcularCostoEnvio(double distanciaKm) {
        return 300 + (distanciaKm * 150); // costo base + por km
    }
}
