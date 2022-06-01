package Nasledjivanje;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        Sastojak sastojak1 = new Sastojak ("Jaje", 12.5);
        Sastojak sastojak2= new Sastojak("Mleko", 75.5);
        Sastojak sastojak3 = new Sastojak("Brasno", 0.075);
        Sastojak sastojak4 = new Sastojak("Secer", 25);
        Sastojak sastojak5 = new Sastojak("Ulje", 2.5);

        sastojak3.setCena(0.085);
        sastojak2.setNaziv("Mlijeko");

        List<SastojakRecepta> list1 = new ArrayList<>();

        SastojakRecepta sr1 = new SastojakRecepta ("Jaje", 12.5, 2);
        SastojakRecepta sr2 = new SastojakRecepta("Mleko", 75.5, 1);
        SastojakRecepta sr3 = new SastojakRecepta("Brasno", 0.075,0.5);
        SastojakRecepta sr4 = new SastojakRecepta("Secer", 25, 2);
        SastojakRecepta sr5 = new SastojakRecepta("Ulje", 255, 0.5);

        sr4.setKolicina(2.5);
        System.out.println(sr2.ukupnaCena());

        Recept recept1 = new Recept("palacinke", 1, list1);
        Recept recept2= new Recept("kolac", 2, list1);
        System.out.println(recept2);
        recept1.dodajSastojak(sr1);
        recept1.dodajSastojak(sr2);
        recept1.dodajSastojak(sr3);
        recept1.dodajSastojak(sr4);

        System.out.println("---------------");

        recept2.setTezina(4);
        recept2.setNaziv("torta");
        System.out.println(recept2.getNaziv());

        System.out.println(recept2.getTezina());

        System.out.println("---------------");


        System.out.println(recept1);
        recept1.ukloniSastojak(sr3);
        System.out.println(recept1);
        System.out.println(list1.get(2).getNaziv());
        recept1.dodajSastojak(sr5);
        System.out.println(recept1);
       System.out.println(recept1.ukupnaCenaRecepta());

        //System.out.println(sastojak1);

    }

}
