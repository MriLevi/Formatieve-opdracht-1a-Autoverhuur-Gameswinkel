package com.mrilevi.autoverhuur;

public class AutoHuur {
    private int aantalDagen;
    private Auto gehuurdeAuto;
    private Klant huurder;
    private double totaalPrijs;

    public AutoHuur() {
    }

    public void setAantalDagen(int aantalDagen){
        this.aantalDagen = aantalDagen;
    }
    public void setGehuurdeAuto(Auto gehuurdeAuto){
        this.gehuurdeAuto = gehuurdeAuto;
    }
    public Auto getGehuurdeAuto() {
        return gehuurdeAuto;
    }
    public void setHuurder(Klant huurder) {
        this.huurder = huurder;
    }
    public Klant getHuurder() {
        return huurder;
    }
    public double totaalPrijs(){
        try{
            this.totaalPrijs = (aantalDagen * gehuurdeAuto.getPrijsPerDag() / 100) * (100-getHuurder().getKorting());
        }
        catch(Exception e){
            this.totaalPrijs = 0.0;
        }
        return this.totaalPrijs;
    }

    @Override
    public String toString() {
        return (gehuurdeAuto == null ? "Er is geen gehuurde auto bekend" : gehuurdeAuto.toString()) + "\n" +
                (huurder == null ? "Er is geen huurder bekend" : huurder.toString()) + "\n" +
                " aantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs() + "\n";
    }
}
