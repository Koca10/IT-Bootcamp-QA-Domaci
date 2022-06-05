package Nedelja7_OOP;

public class RekreativniPlaninar extends Planinar{

    private int tezina;
    private String nazivOkruga;
    private int maksUspon;

    public RekreativniPlaninar(String ime, String prezime, int tezina, String nazivOkruga, int maksUspon) {
        super(ime, prezime);
        this.tezina = tezina;
        this.nazivOkruga = nazivOkruga;
        this.maksUspon = maksUspon;
    }

    public int getTezina() {
        return tezina;
    }

    public String getNazivOkruga() {
        return nazivOkruga;
    }

    public int getMaksUspon() {
        return maksUspon;
    }

    @Override
    public void stampaj() {
        System.out.println("Rekrativac, ID: " + getID() + "\n" + "ime: " + getIme() + " " + getPrezime() + "\n" + "Okrug: " + nazivOkruga);
    }

    @Override
    public double clanarina() {
        return 1000;
    }

    @Override
    public String uspesanUspon(Planina pl) {
        String rec="";
            if (maksUspon - tezina*50 > pl.getVisinaPlanine()) {
                return rec = "Popeo se";
            }
            return rec = "Nije se popeo";
    }
}
