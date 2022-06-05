package Nedelja7_OOP;

public class Alpinista extends Planinar{

    private int brojPoena;

    public Alpinista(String ime, String prezime, int brojPoena) {
        super(ime, prezime);
        this.brojPoena = brojPoena;
    }

    public int getBrojPoena() {
        return brojPoena;
    }

    public void setBrojPoena(int brojPoena) {
        this.brojPoena = brojPoena;
    }

    @Override
    public void stampaj() {
        System.out.println("Alpinista, ID: " + getID() + "\n" + "Ime " + getIme() + " " + getPrezime() + "\n" + "Broj poena: " + brojPoena);

    }

    @Override
    public double clanarina() {
        return 1500 - (brojPoena*50);
    }

    @Override
    public String uspesanUspon(Planina pl) {
        String rec=" ";
            if (pl.getVisinaPlanine()< 4000){
                return rec="Popeo se";
            }else {
                return rec="Nije se popeo";
            }
    }

}
