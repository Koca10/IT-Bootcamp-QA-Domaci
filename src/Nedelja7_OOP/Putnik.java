package Nedelja7_OOP;

public class Putnik extends Covek{

    private double novac;

    public Putnik(String ime, String prezime, double novac) {
        super(ime, prezime);
        this.novac = novac;
    }

    public double getNovac() {
        return novac;
    }

    public void dodajNovac(double novac) {
        this.novac +=novac;
    }
    public void oduzmiNovac(double novac) {
        this.novac -=novac;
    }

    @Override
    public String toString() {
        return "Putnik{" + super.toString() +
                "novac=" + novac +
                '}';
    }
}
