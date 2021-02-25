package com.jitterted.ebp.blackjack;

public class Player {
    private int playerBalance = 0;
    private int playerBet = 0;

    public Player() {
    }

    public int balance() {
        return playerBalance;
    }

    public int bet() {
        return playerBet;
    }
}
