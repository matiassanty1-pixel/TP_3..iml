package adapter;

/**
 * Interfaz objetivo (Target): es la que espera usar el sistema de
 * e-commerce internamente para cobrar, sin importar el proveedor real.
 */
public interface ProcesadorPago {
    boolean procesarPago(double montoEnPesos);
}
