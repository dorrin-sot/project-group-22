package controllers;

import models.*;
import views.GameMenuView;

import java.util.ArrayList;
import java.util.regex.*;

public class GameMenuController {
    private static GameMenuController instance = null;
    private static Database database = Database.getInstance();

    public static GameMenuController getInstance() {
        instance = instance != null ? instance : new GameMenuController();
        return instance;
    }

    public Boolean playGame(Matcher matcher) {
        User player1 = Database.getInstance().getUserByUsername(matcher.group("username1").trim()),
                player2 = Database.getInstance().getUserByUsername(matcher.group("username2").trim());
        if (player1 == null) {
            GameMenuView.getInstance().noUserExists(1);
            return false;
        } else if (player2 == null) {
            GameMenuView.getInstance().noUserExists(2);
            return false;
        } else {
            ArrayList<User> players = new ArrayList<User>();
            players.add(player1);
            players.add(player2);
            database.createGame(players, 20, 42);
            GameMenuView.getInstance().gameStarted();
            return true;
        }
    }

    public String run() {
        return GameMenuView.getInstance().run();
    }
}
