package abstractfactory;

public class FabricaGuerrero implements FabricaEquipamiento {
    @Override
    public Arma crearArma() {
        return new EspadaLarga();
    }

    @Override
    public Armadura crearArmadura() {
        return new ArmaduraPlaca();
    }

    @Override
    public Accesorio crearAccesorio() {
        return new AmuletoValor();
    }
}
