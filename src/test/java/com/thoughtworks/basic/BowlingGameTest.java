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

    @Test
    public void should_return_false_when_roll_once() {
        BowlingGame bowlingGame = new BowlingGame();
        bowlingGame.roll(1);

        boolean actual = bowlingGame.isEnd();

        Assert.assertFalse(actual);
    }

    @Test
    public void should_return_1_when_show_frames_scores_given_roll_once() {
        BowlingGame bowlingGame = new BowlingGame();
        bowlingGame.roll(1);

        String actual = bowlingGame.showFramesScores();

        Assert.assertEquals("1", actual);
    }
}
