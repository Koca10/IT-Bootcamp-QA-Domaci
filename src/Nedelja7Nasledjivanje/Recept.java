package Nedelja7Nasledjivanje;

import java.util.List;

public class Recept {

    private String naziv;
    private int tezina;
    private List<SastojakRecepta> listaSastojaka;

    public Recept(String naziv, int tezina, List<SastojakRecepta> listaSastojaka) {
        this.naziv = naziv;
        this.tezina = tezina;
        this.listaSastojaka=listaSastojaka;
    }

    public Recept() {
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getTezina() {
        return tezina;
    }

    public void setTezina(int tezina) {
        this.tezina = tezina;
    }

    public List<SastojakRecepta> getListaSastojaka() {
        return listaSastojaka;
    }


    public void setListaSastojaka(List<SastojakRecepta> listaSastojaka) {
        this.listaSastojaka = listaSastojaka;
    }

    public void dodajSastojak(SastojakRecepta sr){
        listaSastojaka.add(sr);
    }

    public void ukloniSastojak(SastojakRecepta sr){
        listaSastojaka.remove(sr);
    }

    public double ukupnaCenaRecepta(){
        double sum = 0;
        for (SastojakRecepta sr: listaSastojaka) {
            sum += sr.ukupnaCena();
        }
        return sum;
    }



    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(naziv).append(" , ").append("\n");
        sb.append("Tezina: ");
        if (tezina == 1){
            sb.append("Pocetni");
        } else if (tezina == 2) {
            sb.append("Lak");
        }else if (tezina == 3) {
            sb.append("Srednji");
        }else if (tezina == 4) {
            sb.append("Tezak");
        }else  {
            sb.append("Majstorski");
        }
        sb.append("\n");
        sb.append("Sastojci: ");
        for (SastojakRecepta sr:listaSastojaka) {
            sb.append(sr.getNaziv()).append(" , ");

        }

        return sb.toString();
    }
}
