import java.util.Date;

abstract class Planta
{
    protected String culoare, denumire;
    protected Date dataPlantarii;
    protected double longetivitate;

    Planta()
    {

    }
    Planta(String denumire, String culoare, Date dataPlantarii ,double longetivitate)
    {
        this.denumire = denumire;
        this.culoare = culoare;
        this.dataPlantarii = dataPlantarii;
        this.longetivitate = longetivitate;
    }

    @Override
    public String toString() {
        return "Planta{" +
                "culoare='" + culoare + '\'' +
                ", denumire='" + denumire + '\'' +
                ", dataPlantarii=" + dataPlantarii +
                ", longetivitate=" + longetivitate +
                '}';
    }

    public void afisare()
    {
        System.out.println("Denumirea Plantei: " + denumire);
        System.out.println("Culoare: " + culoare);
        System.out.println("Data Plantarii: " + dataPlantarii);
        System.out.println("Longetivitatea: " + longetivitate);
    }

}
