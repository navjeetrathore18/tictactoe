package models;

public class Bot extends Player{


    private  BotDifficultyLevel botDifficultyLevel;

    public Bot(int id, String name, char symbol, PlayerType type , BotDifficultyLevel botDifficultyLevel) {
        super(id, name, symbol, type);
        this.botDifficultyLevel = botDifficultyLevel;

    }


    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }
}
