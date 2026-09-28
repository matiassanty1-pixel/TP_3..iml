package facade;

/** Subsistema 1: verifica identidad y vigencia del documento. */
public class ValidadorPasaporte {
    public boolean validar(String numeroPasaporte) {
        System.out.println("Validando pasaporte " + numeroPasaporte + "...");
        return numeroPasaporte != null && numeroPasaporte.length() >= 6;
    }
}
