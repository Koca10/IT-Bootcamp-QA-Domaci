package Nedelja7Nasledjivanje;

public class Sastojak {

    private String naziv;
    private double cena;

    public Sastojak(){
        this.naziv="";
        this.cena=0;
    }

    public Sastojak(String naziv, double cena) {
        this.naziv = naziv;
        this.cena = cena;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("naziv je: ").append(naziv).append("\n");
        sb.append("cena je: ").append(cena);
        return sb.toString();
    }
}
