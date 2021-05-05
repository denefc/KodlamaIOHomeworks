package Entities;

import Abstract.Entity;

import java.time.LocalDate;

public class Game implements Entity {
    private String gameName;
    private int gameId;
    private LocalDate publishDate;
    private double price;


    public Game(String gameName, int gameId, LocalDate publishDate, double price) {
        this.gameName = gameName;
        this.gameId = gameId;
        this.publishDate = publishDate;
        this.price = price;
    }


    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
