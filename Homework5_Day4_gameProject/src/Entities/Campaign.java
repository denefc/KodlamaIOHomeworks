package Entities;

import Abstract.Entity;

public class Campaign implements Entity {
    private String campaignName;
    private int campaignId;
    private double discount;

    public Campaign(String campaignName, int campaignId, double discount) {
        this.campaignName = campaignName;
        this.campaignId = campaignId;
        this.discount = discount;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public int getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(int campaignId) {
        this.campaignId = campaignId;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
