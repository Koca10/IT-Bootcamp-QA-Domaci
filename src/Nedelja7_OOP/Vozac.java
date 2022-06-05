package Nedelja7_OOP;

public class Vozac extends Covek{

    private String zvanje;

    public Vozac(String ime, String prezime) {
        super(ime, prezime);
        this.zvanje = "Sofer";
    }

    @Override
    public String toString() {
        return "Vozac{" +
                "zvanje='" + zvanje + '\'' +
                '}';
    }
}
