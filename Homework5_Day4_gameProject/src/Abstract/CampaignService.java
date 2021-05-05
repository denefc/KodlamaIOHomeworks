package Abstract;

import Entities.Game;

public interface CampaignService {
    void addCampaign(Game game);
    void deleteCampaign(Game game);
    void updateCampaign(Game game);

}
