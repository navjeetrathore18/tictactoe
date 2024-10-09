package service;

import exceptions.DuplicateSymbolException;
import models.Player;
import models.PlayerType;

import java.util.HashSet;

public class PlayerService {
    private static int counter =1;

    private HashSet<Character> symbolSet;



    public PlayerService() {
        this.symbolSet = new HashSet<>();
    }

    public Player createPlayer(String name , char symbol) {
        if(symbolSet.contains(symbol)) {
            throw new DuplicateSymbolException("Duplicate symbol are not allowed");

        }
        symbolSet.add(symbol);

       return new Player(
                counter++,
                name,
                symbol,
                PlayerType.HUMAN);



    }


}
