package com.mrilevi.autoverhuur;

public class Main {
    public static void main(String[] args) {
        AutoHuur ah1 = new AutoHuur();
        System.out.println("Eerste autohuur: \n" + ah1);

        Klant k = new Klant("Mijnheer de vries");
        k.setKortingsPercentage(10.0);
        ah1.setHuurder(k);
        System.out.println("Eerste autohuur: \n" + ah1);

        Auto a1 = new Auto("Peugeot 207", 50);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(4);
        ah1.totaalPrijs();
        System.out.println("Eerste autohuur: \n" + ah1);

        AutoHuur ah2 = new AutoHuur();
        Auto a2 = new Auto("Ferrari", 3500);
        ah2.setGehuurdeAuto(a2);
        ah2.setHuurder(k);
        ah2.setAantalDagen(1);
        System.out.println("Tweede autohuur: \n" + ah2);

        System.out.println("Gehuurd: " + ah1.getGehuurdeAuto());
        System.out.println("Gehuurd: " + ah2.getGehuurdeAuto());
    }
}
