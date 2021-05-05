import Abstract.BasePlayerManager;
import Concrete.GameManager;
import Concrete.PlayerCheckManager;
import Concrete.SellCompanyManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Player player=new Player(1,"player1","email","12345678901", LocalDate.of(1997,05,12));
        Game game=new Game("Age of",1,LocalDate.of(2021,02,02),311.99);
        Campaign campaign=new Campaign("SummerDiscount",1,10.0);

        BasePlayerManager sellCompanyManager=new SellCompanyManager(new PlayerCheckManager());
        sellCompanyManager.register(player);
        sellCompanyManager.delete(player);


        GameManager gameManager=new GameManager();
        gameManager.sell(player,game);


    }
}
