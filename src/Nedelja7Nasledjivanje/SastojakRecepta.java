package Nedelja7Nasledjivanje;

public class SastojakRecepta extends Sastojak{

    private double kolicina;

    public SastojakRecepta(double kolicina) {
        this.kolicina = kolicina;
    }

    public SastojakRecepta(String naziv, double cena, double kolicina) {
        super(naziv, cena);
        this.kolicina = kolicina;
    }

    public double getKolicina() {
        return kolicina;
    }

    public void setKolicina(double kolicina) {
        this.kolicina = kolicina;
    }


    public double ukupnaCena(){
        return super.getCena()*this.getKolicina();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Kolicina je: ").append(kolicina);

        return sb.toString();
    }
}
