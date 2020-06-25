import java.util.Date;

class Ierburi extends Planta
{
    private String folosinta, LoculCultivarii;
    private boolean aromatice;

    Ierburi()
    {

    }
    Ierburi(String denumire, String culoare, Date dataPlantarii , double longetivitate, String folosinta, String LoculCultivarii, boolean aromatice)
    {
        this.denumire = denumire;
        this.culoare = culoare;
        this.dataPlantarii = dataPlantarii;
        this.longetivitate = longetivitate;
        this.folosinta = folosinta;
        this.LoculCultivarii = LoculCultivarii;
        this.aromatice = aromatice;
    }

    @Override
    public void afisare()
    {
        System.out.println("==========================");
        super.afisare();
        System.out.println("Folosinta: " + folosinta);
        System.out.println("Locul Cultivarii: " + LoculCultivarii);
        System.out.println("Aromatice: " + aromatice);
        System.out.println("==========================");
    }

}
