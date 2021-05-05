package Concrete;

import Abstract.BasePlayerManager;
import Abstract.PlayerCheckService;
import Entities.Player;

public class SellCompanyManager extends BasePlayerManager {
    PlayerCheckService playerCheckService;

    public SellCompanyManager(PlayerCheckService playerCheckService) {
        this.playerCheckService = playerCheckService;
    }

    @Override
    public void register(Player player) {
       if (playerCheckService.checkIfRealPerson(player)){
           super.register(player);
       }else
           System.out.println("You can't register ");

    }

    @Override
    public void update(Player player) {
        System.out.println("Updated the "+player.getPlayerName());
        super.update(player);
    }

    @Override
    public void delete(Player player) {
        System.out.println("Deleded the "+player.getPlayerName());
        super.delete(player);
    }
}
