package Nedelja7_OOP;

public class Planina {

    private String imePlanine;
    private String nazivDrzave;
    private double visinaPlanine;

    public Planina(String imePlanine, String nazivDrzave, double visinaPlanine) {
        this.imePlanine = imePlanine;
        this.nazivDrzave = nazivDrzave;
        this.visinaPlanine = visinaPlanine;
    }

    public Planina() {
        this.imePlanine="";
        this.nazivDrzave="";
        this.visinaPlanine=0;
    }

    public String getImePlanine() {
        return imePlanine;
    }

    public void setImePlanine(String imePlanine) {
        this.imePlanine = imePlanine;
    }

    public String getNazivDrzave() {
        return nazivDrzave;
    }

    public void setNazivDrzave(String nazivDrzave) {
        this.nazivDrzave = nazivDrzave;
    }

    public double getVisinaPlanine() {
        return visinaPlanine;
    }

    public void setVisinaPlanine(double visinaPlanine) {
        this.visinaPlanine = visinaPlanine;
    }
}
