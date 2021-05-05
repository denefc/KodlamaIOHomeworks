package Concrete;

import Abstract.GameService;
import Entities.Game;
import Entities.Player;

public class GameManager implements GameService {
    @Override
    public void sell(Player player, Game game) {
        System.out.println(player.getPlayerName()+"adlı player "+game.getGameName()+" adlı oyunu satın aldı");
    }
}
