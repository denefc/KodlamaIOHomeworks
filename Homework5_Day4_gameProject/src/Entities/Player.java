package Entities;

import Abstract.Entity;

import java.time.LocalDate;

public class Player implements Entity {
    private int playerId;
    private String playerName,email,tcNo;
    private LocalDate dateOfBirth;

    public Player(int playerId, String playerName, String email, String tcNo, LocalDate dateOfBirth) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.email = email;
        this.tcNo = tcNo;
        this.dateOfBirth = dateOfBirth;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
