import java.util.Date;

class Copaci extends Planta
{
    private String tipFrunze, folosinta;
    private boolean fructifer;

    Copaci()
    {

    }
    Copaci(String denumire, String culoare,  Date dataPlantarii , double longetivitate , String tipFrunze, String folosinta, boolean fructifer)
    {
        this.denumire = denumire;
        this.culoare = culoare;
        this.dataPlantarii = dataPlantarii;
        this.longetivitate = longetivitate;
        this.tipFrunze = tipFrunze;
        this.folosinta = folosinta;
        this.fructifer = fructifer;
    }

    @Override
    public void afisare() {
        System.out.println("==========================");
        super.afisare();
        System.out.println("Tip frunze: " + tipFrunze);
        System.out.println("Folosinta: " + folosinta);
        System.out.println("Fructifer: " + fructifer);
        System.out.println("==========================");
    }
}
