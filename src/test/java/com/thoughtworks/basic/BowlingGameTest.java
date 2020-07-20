package com.thoughtworks.basic;

import org.junit.Assert;
import org.junit.Test;

public class BowlingGameTest {

    @Test
    public void should_return_1_when_roll_given_hit_1_ball() {
        BowlingGame bowlingGame = new BowlingGame();
        bowlingGame.roll(1);

        int actual = bowlingGame.getScores();

        Assert.assertEquals(1, actual);
    }

    @Test
    public void should_return_3_when_roll_given_hit_3_balls() {
        BowlingGame bowlingGame = new BowlingGame();
        bowlingGame.roll(3);

        int actual = bowlingGame.getScores();

        Assert.assertEquals(3, actual);
    }
}
