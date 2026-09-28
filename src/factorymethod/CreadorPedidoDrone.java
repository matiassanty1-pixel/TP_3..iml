package factorymethod;

public class CreadorPedidoDrone extends CreadorPedido {
    @Override
    protected Pedido crearPedido() {
        return new PedidoDroneDelivery();
    }
}
