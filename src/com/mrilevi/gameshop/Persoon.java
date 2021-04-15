package com.mrilevi.gameshop;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Persoon {
    private String naam;
    private double budget;
    private ArrayList<Game> bezitGames;
    private Game game;

    public Persoon(String naam, double budget) {
        this.naam = naam;
        this.budget = budget;
        this.bezitGames = new ArrayList<>();
    }
    public boolean koop(Game game){
        double HuidigePrijs = game.getHuidigePrijs();
        //if koper has the budget and doesn't own a game yet with the same name, execute koop
        if (budget > HuidigePrijs && !game.GameAlGekocht(bezitGames, game)){
            bezitGames.add(game);
            budget = budget - HuidigePrijs;
            return true;}

        else{return false;}
    }
    public boolean verkoop(Game game, Persoon koper){
        double HuidigePrijs = game.getHuidigePrijs();
        // if koper has the budget, and koper doesn't own the game yet, and the seller owns the game, then execute sale
        if (koper.budget > HuidigePrijs && !game.GameAlGekocht(koper.bezitGames, game) && this.bezitGames.contains(game)){
            koper.budget = koper.budget - HuidigePrijs;
            this.budget = this.budget + HuidigePrijs;
            koper.bezitGames.add(game);
            this.bezitGames.remove(game);
            return true;
        }
        else{return false;}
    }

    @Override
    public String toString() {
        //here I format the bezit games list to look nice :)
        String formattedstring = bezitGames.toString().replace(",","").replace("[","").replace("]", "").trim();
        //stupid rounding method for budget
        budget = budget*100;
        budget = ((int) budget);
        budget = budget/100;
        return "\n" + naam + " heeft een budget van €" + budget + " en bezit de volgende games: \n" + formattedstring;
    }
}
