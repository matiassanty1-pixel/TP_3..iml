package factorymethod;

/**
 * Clase cliente. Trabaja siempre contra la clase abstracta CreadorPedido,
 * sin conocer que tipo concreto de Pedido se genera en cada caso.
 */
public class Main {
    public static void main(String[] args) {
        CreadorPedido[] creadores = {
            new CreadorPedidoDomicilio(),
            new CreadorPedidoRetiro(),
            new CreadorPedidoDrone()
        };

        double distancia = 4.5; // km
        for (CreadorPedido creador : creadores) {
            System.out.println(creador.procesarPedido(distancia));
            System.out.println("-----");
        }
    }
}
