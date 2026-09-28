package abstractfactory;

/**
 * Clase cliente: recibe una fabrica concreta (segun la clase de
 * personaje elegida) y equipa al personaje sin conocer las clases
 * concretas de arma/armadura/accesorio que esta usando.
 */
public class Main {

    private static void equiparPersonaje(String nombreClase, FabricaEquipamiento fabrica) {
        Arma arma = fabrica.crearArma();
        Armadura armadura = fabrica.crearArmadura();
        Accesorio accesorio = fabrica.crearAccesorio();

        System.out.println("Equipando personaje de clase: " + nombreClase);
        System.out.println(" - " + arma.atacar());
        System.out.println(" - Defensa total: " + armadura.puntosDefensa());
        System.out.println(" - " + accesorio.efectoEspecial());
        System.out.println("-----");
    }

    public static void main(String[] args) {
        equiparPersonaje("Guerrero", new FabricaGuerrero());
        equiparPersonaje("Mago", new FabricaMago());
    }
}
