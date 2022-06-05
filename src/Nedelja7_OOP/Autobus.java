package Nedelja7_OOP;

import java.util.ArrayList;

public class Autobus {
    private String naziv;
    private Vozac vozac;
    private double cenaKarte;
    private ArrayList<Putnik> listaPutnika;

    public Autobus(String naziv, double cenaKarte) {
        this.naziv = naziv;
        this.cenaKarte = cenaKarte;
        this.listaPutnika=new ArrayList<>();
        this.vozac=null;
    }
    public void dodajPutnika(Putnik p){
        listaPutnika.add(p);
    }
    public void dodajPutnika(Putnik p, int i){
        listaPutnika.add(i, p);
    }
    public void izbrisiPutnika(Putnik p){
        listaPutnika.remove(p);
    }
    public void izbrisiPutnika(int i){
        listaPutnika.remove(i);
    }
    public void dodajVozaca(Vozac v){
        if(this.vozac==null){
            this.vozac=v;
        }   else System.out.println("vozac postoji");
    }

    public void izbaciVozaca(Vozac v){
        if (this.vozac != null){
            this.vozac=null;
        }else System.out.println("Nema vozaca za izbacivanje");
    }

    @Override
    public String toString() {
        return "Autobus{" +
                "naziv='" + naziv + '\'' +
                ", vozac=" + vozac +
                ", cenaKarte=" + cenaKarte +
                ", listaPutnika=" + listaPutnika +
                '}';
    }
}
