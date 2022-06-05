package Nedelja7_OOP;

import java.util.ArrayList;

public class glavnaKlasaPlaninar {

    public static void main(String[] args) {
        Planina planina1 = new Planina("Avala", "Srbija", 850);

        RekreativniPlaninar rekreativniPlaninar1 = new RekreativniPlaninar("Pera", "Peric", 10, "NBG", 1250);
        RekreativniPlaninar rekreativniPlaninar2 = new RekreativniPlaninar("Zika", "Peric", 15, "Sopot", 650);
        RekreativniPlaninar rekreativniPlaninar3 = new RekreativniPlaninar("Per", "Zikic", 20, "Vozdovac", 2000);
        Alpinista alpinista1 = new Alpinista("Igor","Jocic", 1);
        Alpinista alpinista2 = new Alpinista("Miki","Jocic", 1);
        Alpinista alpinista3 = new Alpinista("Loki","Jocic", 1);



        ArrayList<Planinar> listaPlaninara=new ArrayList<>();
        listaPlaninara.add(rekreativniPlaninar1);
        listaPlaninara.add(rekreativniPlaninar2);
        listaPlaninara.add(rekreativniPlaninar3);
        listaPlaninara.add(alpinista1);
        listaPlaninara.add(alpinista2);
        listaPlaninara.add(alpinista3);

       /* for (int i = 0; i < listaPlaninara.size(); i++) {
            listaPlaninara.get(i).stampaj();
        }*/
        int sum=0;
        for (Planinar p: listaPlaninara) {
            p.stampaj();
            System.out.println("Planinar:" + p.getIme() + " " + p.getPrezime() + " " +  p.uspesanUspon(planina1));
            sum += p.clanarina();
            System.out.println("------");
        }
        System.out.println("Ukupna clanarina svih clanova je: " + sum + "rsd");


    }
}
