package abstractfactory;

public class FabricaMago implements FabricaEquipamiento {
    @Override
    public Arma crearArma() {
        return new Baston();
    }

    @Override
    public Armadura crearArmadura() {
        return new TunicaArcana();
    }

    @Override
    public Accesorio crearAccesorio() {
        return new OrbeMana();
    }
}
