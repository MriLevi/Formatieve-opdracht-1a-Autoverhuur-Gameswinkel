package com.mrilevi.autoverhuur;

public class Klant {
    private String naam;
    private double kortingsPercentage;

    public Klant(String naam) {
        this.naam = naam;
    }
    public void setKortingsPercentage(double Value){
        kortingsPercentage = Value;
    }
    public double getKorting() {
        return kortingsPercentage;
    }

    @Override
    public String toString() {
        return "Op naam van: " + naam + " (korting: " +kortingsPercentage+ "%)";
    }
}
