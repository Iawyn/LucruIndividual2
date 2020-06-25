import java.util.Date;

class Arbusti extends Planta
{
    private int perioadaDeCoacere;
    private String conditiiDeLumina, LocDePlantare, NecesitateDeLucrari;
    private boolean rezistentaLaInghet;

    Arbusti()
    {

    }
    Arbusti(String denumire, String culoare, Date dataPlantarii ,double longetivitate, int perioadaDeCoacere, String conditiiDeLumina, String LocDePlantare, String NecesitateDeLucrari, boolean rezistentaLaInghet)
    {
        this.denumire = denumire;
        this.culoare = culoare;
        this.dataPlantarii = dataPlantarii;
        this.longetivitate = longetivitate;
        this.perioadaDeCoacere = perioadaDeCoacere;
        this.conditiiDeLumina = conditiiDeLumina;
        this.LocDePlantare = LocDePlantare;
        this.NecesitateDeLucrari = NecesitateDeLucrari;
        this.rezistentaLaInghet = rezistentaLaInghet;
    }

    @Override
    public void afisare()
    {
        System.out.println("==========================");
        super.afisare();
        System.out.println("Perioada de coacere: " + perioadaDeCoacere);
        System.out.println("Conditii de lumina: " + conditiiDeLumina);
        System.out.println("Loc de plantare: " + LocDePlantare);
        System.out.println("Necesitate de lucrari: " + NecesitateDeLucrari);
        System.out.println("Rezistenta la inghet: " + rezistentaLaInghet);
        System.out.println("==========================");
    }

}
