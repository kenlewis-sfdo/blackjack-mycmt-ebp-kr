package com.jitterted.ebp.blackjack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class PlayerTest {

    @Test
    public void newPlayerNoDepositsBalanceIs0() {
        Player player = new Player();

        assertThat(player.balance())
                .isEqualTo(0);
    }

    @Test
    public void playerWithBalanceOf100Bets40BalanceIs60() {
        Player player = new Player();
        player.deposits(100);

        player.bets(40);

        assertThat(player.balance())
                .isEqualTo(60);
    }

    @Test
    public void playerWithBalanceOf100Bets40AndWinsBalanceIs140() {
        Player player = new Player();
        player.deposits(100);

        player.bets(40);
        player.wins();

        assertThat(player.balance())
                .isEqualTo(140);
    }

    @Test
    public void playerWithBalanceOf150Bets40AndLosesBalanceIs110() {
        Player player = new Player();
        player.deposits(150);

        player.bets(40);
        player.loses();

        assertThat(player.balance())
                .isEqualTo(110);
    }

    @Test
    public void playerWithBalanceOf150Bets40AndTiesBalanceIs150() {
        Player player = new Player();
        player.deposits(150);

        player.bets(40);
        player.ties();

        assertThat(player.balance())
                .isEqualTo(150);
    }

    @Test
    public void playerWithBalanceOf150Bets40And80TotalAmountBetIs120() {
        Player player = new Player();
        player.deposits(150);

        player.bets(40);
        player.ties();

        player.bets(80);
        player.ties();

        assertThat(player.totalAmountBet())
                .isEqualTo(120);
    }
}
