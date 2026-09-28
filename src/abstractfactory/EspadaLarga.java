package abstractfactory;

public class EspadaLarga implements Arma {
    @Override
    public String atacar() {
        return "Ataque cuerpo a cuerpo con espada larga (danio fisico alto).";
    }
}
