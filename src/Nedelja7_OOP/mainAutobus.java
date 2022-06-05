package Nedelja7_OOP;

public class mainAutobus {
    public static void main(String[] args) {
        Putnik putnik=new Putnik("pera", "p", 250);
        putnik.dodajNovac(-100);
        System.out.println(putnik.getNovac());
        Autobus autobus = new Autobus("Lasta", 250);
        Vozac vozac = new Vozac("Pera", "Peric");
        Putnik putnik1 = new Putnik("Iv", "Ivovi", 1000);
        Putnik putnik2 = new Putnik("Iv", "Ivovi", 100);
        Putnik putnik3 = new Putnik("Iv", "Ivovi", 2500);
        Putnik putnik4 = new Putnik("Ivhjh", "Ivovi", 100);

        autobus.dodajPutnika(putnik1);
        autobus.dodajPutnika(putnik2);
        autobus.dodajPutnika(putnik4);
        autobus.dodajPutnika(putnik3);

        autobus.dodajVozaca(vozac);

        System.out.println(autobus);
    }
}
