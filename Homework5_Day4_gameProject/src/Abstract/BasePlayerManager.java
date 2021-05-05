package Abstract;

import Entities.Player;

public abstract class BasePlayerManager implements PlayerService{

    @Override
    public void register(Player player) {
        System.out.println("Registered "+player.getPlayerName());
    }

    @Override
    public void update(Player player) {
        System.out.println("Updated "+player.getPlayerName());
    }

    @Override
    public void delete(Player player) {
        System.out.println("Deleted "+player.getPlayerName());
    }
}
