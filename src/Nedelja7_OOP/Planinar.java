package Nedelja7_OOP;

public abstract class Planinar {
    private int ID;
    private static int brojPlaninara = 0;
    private String ime;
    private String prezime;

    public void postaviID(){
        brojPlaninara++;
        this.ID=brojPlaninara;
    }

    public Planinar(String ime, String prezime) {
        postaviID();
        this.ime = ime;
        this.prezime = prezime;
    }

    public int getID() {
        return ID;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public abstract void stampaj();
    public abstract double clanarina();
    public abstract String uspesanUspon (Planina pl);
}
