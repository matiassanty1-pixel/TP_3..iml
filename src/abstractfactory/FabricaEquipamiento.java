package abstractfactory;

/**
 * Fabrica abstracta: garantiza que las armas, armaduras y accesorios
 * generados para un mismo personaje pertenezcan a la misma "familia"
 * (misma clase de personaje) y sean compatibles entre si.
 */
public interface FabricaEquipamiento {
    Arma crearArma();
    Armadura crearArmadura();
    Accesorio crearAccesorio();
}
