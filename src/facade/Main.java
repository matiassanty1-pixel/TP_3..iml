package facade;

/**
 * Clase cliente: gracias al Facade, el codigo cliente hace una sola
 * llamada en vez de orquestar manualmente 4 subsistemas distintos.
 */
public class Main {
    public static void main(String[] args) {
        AeropuertoFacade checkIn = new AeropuertoFacade();

        String resultado = checkIn.realizarCheckIn(
                "Santiago Gomez",
                "AAB123456",
                25.5,
                "ventana",
                "B7");

        System.out.println(resultado);
    }
}
