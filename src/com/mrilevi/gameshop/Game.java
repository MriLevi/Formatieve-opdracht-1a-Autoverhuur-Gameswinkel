package com.mrilevi.gameshop;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;

public class Game {
    private int releaseJaar;
    private int huidigJaar = LocalDate.now().getYear();
    private String naam;
    private double nieuwprijs;

    public Game(String naam, int releaseJaar, double prijs) {
        this.naam = naam;
        this.nieuwprijs = prijs;
        this.releaseJaar = releaseJaar;
    }
    public double getHuidigePrijs(){
        //this function gets the current price and does some calculations to get there.
        int verschilJaar = huidigJaar - this.releaseJaar;
        double HuidigePrijs = nieuwprijs;
        //for loop to calculate the price, each year price drops 30%
        for(int i = 0; i < verschilJaar; i++){
            HuidigePrijs = HuidigePrijs*0.7;
        }
        //stupid rounding code
        HuidigePrijs = HuidigePrijs*100;
        HuidigePrijs = (int) HuidigePrijs);
        HuidigePrijs = HuidigePrijs/100;
        return HuidigePrijs;
    }

    public String getNaam() {
        return naam;
    }

    public boolean GameAlGekocht(ArrayList<Game> games, Game inputgame) {
        //this function checks if there's any games in a given array with the same name as a given Game (inputgame) object
        for (Game game : games) {
            if (game.getNaam() == inputgame.getNaam()) {
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return naam + ", uitgegeven in " + releaseJaar +"; nieuwprijs: €" + nieuwprijs + " nu voor: €" + getHuidigePrijs() + "\n";
    }
}
