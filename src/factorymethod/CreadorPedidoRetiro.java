package factorymethod;

public class CreadorPedidoRetiro extends CreadorPedido {
    @Override
    protected Pedido crearPedido() {
        return new PedidoRetiroEnLocal();
    }
}
