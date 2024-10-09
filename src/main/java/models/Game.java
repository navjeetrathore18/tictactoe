package models;

import exceptions.InvalidBoardsizeException;
import exceptions.InvalidNoOfPlayerException;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private Board board;
    private List<Player> players;
    private GameState gameState;
    private Player winner;
    private int nextMovePlayerIndex;
    private List<Move> moves;
    private List<Board> playedBoards;

    private Game(Board board, List<Player> players) {
        this.board = board;
        this.players = players;
        this.gameState = GameState.YET_TO_START;
        this.nextMovePlayerIndex = 0;
        this.moves = new ArrayList<>();
        this.playedBoards = new ArrayList<>();

    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public static Builder builder()
        {
            return new Builder();
        }




    public static class Builder{
        private int size;
        private List<Player> players;




        public Builder size(int size) {
            this.size = size;
            return this;
        }



        public Builder players(List<Player> players) {
            this.players = players;
            return this;

        }

        private void validate()
        {
            //size validation
            if(size>10 || size <3)
            {
                throw new InvalidBoardsizeException("Board size must be between 3 and 10");
            }

            //players validation
            if(players==null || players.size()!= (size-1))
            {
                throw new InvalidNoOfPlayerException("Players count is invalid, it should be board size -1");
            }
        }

        public  Game build()
        {
            validate();

            return new Game(new Board(size) , players);

        }


    }


    

}
