package facade;

/** Subsistema 2: pesa y etiqueta el equipaje despachado. */
public class ControlEquipaje {
    public boolean despacharEquipaje(double pesoKg, int kilosPermitidos) {
        System.out.println("Pesando equipaje: " + pesoKg + " kg...");
        if (pesoKg > kilosPermitidos) {
            System.out.println("Exceso de equipaje, se debe abonar diferencia.");
        }
        return true;
    }
}
