import models.Game;
import models.Player;
import service.BoardService;
import service.GameService;
import service.PlayerService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("WELCOME TO TIC TAC TOE");

        PlayerService playerService = new PlayerService();

        GameService gameService = new GameService();

        BoardService boardService = new BoardService();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter dimension of the game");
        int size = scanner.nextInt();

        List<Player> players = new ArrayList<>();

        for (int i = 0; i < size-1; i++) {
            System.out.println("Please enter name for player " + (i+1));
            String name = scanner.nextLine();
            scanner.nextLine();
            System.out.println("Please enter symbol for player " + (i+1));
            char symbol = scanner.nextLine().charAt(0);

            players.add(playerService.createPlayer(name, symbol));

        }

        Game game = gameService.createGame(size,players);

        game = gameService.startGame(game);
        boardService.printBoard(game.getBoard());

    }
}
