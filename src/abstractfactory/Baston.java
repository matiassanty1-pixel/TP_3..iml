package abstractfactory;

public class Baston implements Arma {
    @Override
    public String atacar() {
        return "Ataque a distancia con baston (danio magico de area).";
    }
}
