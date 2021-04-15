package com.mrilevi.autoverhuur;

public class Auto {
    private String type;
    private double prijsPerDag;

    public Auto(String type, double Value) {
        this.type = type;
        this.prijsPerDag = Value;
    }
    public void setPrijsPerDag(double Value){
        prijsPerDag = Value;
    }

    public double getPrijsPerDag() {
        return prijsPerDag;
    }

    @Override
    public String toString() {
        return "autotype: " + type + " met prijs per dag: " +prijsPerDag;
    }
}

