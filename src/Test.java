import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class Test
{
    public static void main(String[] args) throws IOException {
        menu();
    }

    static Date ToDate(String Data) throws ParseException //data a fost initial de tip de date String si acum va fi convertita in tipul de date LocalDate ce ne va permite sa efectuam oepratii cu Data calendaristica
    {
        return new SimpleDateFormat("dd/MM/yyyy").parse(Data);
    }

    static void menu() throws IOException
    {
        ArrayList<Planta> plante = new ArrayList<>(); //Array-uL dinamic global care va fi folosit pentru prelucrarea datelor si condiitlor
        Scanner sc = new Scanner(System.in); //Scanner global care va fi acceptat ca argument in fiecare metoda pentru a evita redeclararea

        boolean conditie = true; //conditia de rulare a menu-lui

        try {
            while (conditie) {
                System.out.println("\t \t \t \t \t \t Menu");
                System.out.println("---------------------------------------------------------");
                System.out.println("1) Introducerea a Arbustilor: ");
                System.out.println("2) Introducerea a Ierburilor: ");
                System.out.println("3) Introducerea a Copacilor: ");
                System.out.println("4) Afisarea datelor introdiuse: ");
                System.out.println("5) Numărul de plante arbuști fructiferi:  ");
                System.out.println("6) Sortați plantele în baza anului de plantație: ");
                System.out.println("7) Găsiți plantele ce au longevitatea cuprinsă întrun diapazon citit de la tastatură: ");
                System.out.println("8) Adaugarea Obiectelor scrise intr-un fisier txt: ");
                System.out.println("0) Pentru a iesi din menu");
                System.out.println("---------------------------------------------------------");

                int userInput = sc.nextInt();

                switch (userInput) {
                    case 1: {
                        System.out.println("Cati arbusti doriti sa introduceti ?"); //introducerea datelor de la tastarura
                        try {
                            int arbusti = sc.nextInt();
                            for (int i = 0; i < arbusti; i++) {
                                System.out.println("=================Arbusti===============");
                                System.out.print("Denumire: ");
                                String Denumire = sc.next();
                                System.out.print("\n");
                                System.out.print("Culoare: ");
                                String culoare = sc.next();
                                System.out.print("\n");
                                System.out.print("Data plantarii: ");
                                String strDataPlantarii = sc.next();
                                Date DataPlantariiToDate = ToDate(strDataPlantarii);
                                System.out.print("\n");
                                sc.nextLine();
                                System.out.print("Longetivitatea (cm): ");
                                double longetivitatea = sc.nextDouble();
                                System.out.print("\n");
                                System.out.print("Perioada de coacere (numar de luni): ");
                                int PerioadaDeCoacere = sc.nextInt();
                                System.out.print("\n");
                                System.out.print("Conditi de lumina: ");
                                String ConditiiDeLumina = sc.next();
                                System.out.print("\n");
                                System.out.print("Loc de plantare: ");
                                String LocDePlantare = sc.next();
                                System.out.print("\n");
                                sc.nextLine();
                                System.out.print("Necesitate de lucrari: ");
                                String NecesitateDeLucrari = sc.next();
                                System.out.print("\n");
                                System.out.print("Rezist la inghet: ");
                                boolean RezistLaInghet = sc.nextBoolean();
                                System.out.print("\n");
                                plante.add(new Arbusti(Denumire, culoare, DataPlantariiToDate, longetivitatea, PerioadaDeCoacere, ConditiiDeLumina, LocDePlantare, NecesitateDeLucrari, RezistLaInghet));
                            }
                        }catch (IllegalArgumentException | ParseException e)
                        {
                            System.out.println("ati introdus tipul de date gresit");
                            e.printStackTrace();
                        }

                        break;
                    }
                    case 2: {

                        System.out.println("Cate ierburi doriti sa introduceti ?"); //introducerea datelor de la tastarura

                        try {
                            int Truck = sc.nextInt();
                            for (int i = 0; i < Truck; i++) {
                                System.out.println("=================Ierburi===============");
                                System.out.print("Denumire: ");
                                String Denumire = sc.next();
                                System.out.print("\n");
                                System.out.print("Culoare: ");
                                String culoare = sc.next();
                                System.out.print("\n");
                                System.out.print("Data plantarii: ");
                                String strDataPlantarii = sc.next();
                                Date DataPlantariiToDate = ToDate(strDataPlantarii);
                                System.out.print("\n");
                                sc.nextLine();
                                System.out.print("Longetivitatea (cm): ");
                                double longetivitatea = sc.nextDouble();
                                System.out.print("\n");
                                System.out.print("Folosinta: ");
                                String folosinta = sc.next();
                                System.out.print("\n");
                                System.out.print("Locul Cultivarii: ");
                                String LoculCultivarii = sc.next();
                                System.out.print("\n");
                                System.out.print("Aromatice: ");
                                boolean Aromatice = sc.nextBoolean();
                                plante.add(new Ierburi(Denumire, culoare, DataPlantariiToDate, longetivitatea, folosinta, LoculCultivarii, Aromatice));
                            }
                            break;
                        }catch (IllegalArgumentException | ParseException e)
                        {
                            System.out.println("ati introdus tipul de date gresit");
                            e.printStackTrace();
                        }
                    }
                    case 3: {

                        System.out.println("Cate masini de tip Coupe doriti sa introduceti ?"); //introducerea datelor de la tastarura
                        try {
                            int Coupe = sc.nextInt();
                            for (int i = 0; i < Coupe; i++) {
                                System.out.println("=================Copaci===============");
                                System.out.print("Denumire: ");
                                String Denumire = sc.next();
                                System.out.print("\n");
                                System.out.print("Culoare: ");
                                String culoare = sc.next();
                                System.out.print("\n");
                                System.out.print("Data plantarii: ");
                                String strDataPlantarii = sc.next();
                                Date DataPlantariiToDate = ToDate(strDataPlantarii);
                                System.out.print("\n");
                                sc.nextLine();
                                System.out.print("Longetivitatea (cm): ");
                                double longetivitatea = sc.nextDouble();
                                System.out.print("\n");
                                System.out.print("Tip frunza");
                                String TipFrunza = sc.next();
                                System.out.print("Folosinta: ");
                                String Folosinta = sc.next();
                                System.out.print("Fructifer: ");
                                boolean Fructifer = sc.nextBoolean();
                                plante.add(new Copaci(Denumire, culoare, DataPlantariiToDate, longetivitatea, TipFrunza, Folosinta, Fructifer));
                            }

                            break;
                        }catch (IllegalArgumentException | ParseException e)
                        {
                            System.out.println("ati introdus tipul de date gresit");
                            e.printStackTrace();
                        }
                    }
                    case 4: { //afisarea datelor introduse
                        for (Planta planta : plante) {
                            planta.afisare();
                        }
                        break;
                    }
                    case 5: { // Calculați numărul de plante arbuști fructiferi

                        int counter = 0;

                        for (Planta planta : plante) {
                            if (planta.denumire.toLowerCase().equals("fructiferi")) {
                                counter++;
                            }
                        }

                        System.out.println("Arbusti fructiferi: " + counter);

                        break;
                    }

                    case 6: //Sortați plantele în baza anului de plantație
                    {
                        plante.sort(Comparator.comparing(t -> t.dataPlantarii));
                        break;
                    }

                   // Găsiți plantele ce au longevitatea cuprinsă întrun diapazon citit de la tastatură:
                    case 7:
                    {
                        System.out.println("Diapazon initial: ");
                        double range1 = sc.nextDouble();

                        System.out.println("Diapazon final: ");
                        double range2 = sc.nextDouble();

                        for (Planta planta : plante) {
                            if ((planta.longetivitate <= range2) && (planta.longetivitate >= range1)) {
                                planta.afisare();
                            }
                        }
                        break;
                    }
                    case 8:
                    {
                        FileWriter fw = new FileWriter("file");
                        Writer output = new BufferedWriter(fw);
                        int sz = plante.size();

                        for (Planta planta : plante) {
                            output.write(plante.toString() + "\n");
                        }
                        output.close();
                        break;
                    }

                    case 0: {
                        conditie = false;
                    }
                }

            }
            }catch (IllegalArgumentException e)
            {
                System.out.println("ati introdus tipul de date gresit");
                e.printStackTrace();
            }

            System.in.read(); //la apasarea butonului enter menu-ul va aparea din nou
        }
    }


