package factorymethod;

public class CreadorPedidoDomicilio extends CreadorPedido {
    @Override
    protected Pedido crearPedido() {
        return new PedidoDomicilio();
    }
}
