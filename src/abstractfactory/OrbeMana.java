package abstractfactory;

public class OrbeMana implements Accesorio {
    @Override
    public String efectoEspecial() {
        return "Orbe de Mana: regenera 10% de mana por turno.";
    }
}
