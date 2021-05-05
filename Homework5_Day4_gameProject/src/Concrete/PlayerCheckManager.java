package Concrete;

import Abstract.PlayerCheckService;
import Entities.Player;

public class PlayerCheckManager implements PlayerCheckService {
    @Override
    public boolean checkIfRealPerson(Player player) {
        if (player.getTcNo().length()==11){
            return true;
        }else
            return false;
    }
}
