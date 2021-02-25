package com.jitterted.ebp.blackjack;

public class Player {
    private int playerBalance = 0;
    private int playerBet = 0;
    private int totalAmountBet = 0;

    public Player() {
    }

    public int balance() {
        return playerBalance;
    }

    public int bet() {
        return playerBet;
    }

    public void deposits(int amount) {
        playerBalance += amount;
    }

    public void bets(int betAmount) {
        playerBet = betAmount;
        playerBalance -= betAmount;
        totalAmountBet += betAmount;
    }

    public void wins() {
        playerBalance += playerBet * 2;
    }

    public void loses() {
        playerBalance += playerBet * 0;
    }

    public void ties() {
        playerBalance += playerBet * 1;
    }

    public int totalAmountBet() {
        return totalAmountBet;
    }
}
