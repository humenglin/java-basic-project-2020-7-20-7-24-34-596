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

    @Test
    public void should_return_7_when_roll_given_hit_3_balls_once_and_4_balls_twice() {
        BowlingGame bowlingGame = new BowlingGame();
        bowlingGame.roll(3);
        bowlingGame.roll(4);

        int actual = bowlingGame.getScores();

        Assert.assertEquals(7, actual);
    }

    @Test
    public void should_return_7_1_when_show_frames_scores_given_hit_3_balls_once_and_4_balls_twice_and_hit_1_ball_third() {
        BowlingGame bowlingGame = new BowlingGame();
        bowlingGame.roll(3);
        bowlingGame.roll(4);
        bowlingGame.roll(1);

        String actual = bowlingGame.showFramesScores();

        Assert.assertEquals("7|1", actual);
    }

    @Test
    public void should_return_false_when_roll_twice() {
        BowlingGame bowlingGame = new BowlingGame();
        bowlingGame.roll(3);
        bowlingGame.roll(4);

        boolean actual = bowlingGame.isEnd();

        Assert.assertFalse(actual);
    }

    @Test
    public void should_return_70_when_roll_given_hit_3_balls_once_and_4_balls_twice_per_frame() {
        BowlingGame bowlingGame = new BowlingGame();
        for (int i = 0; i < 10; i++) {
            bowlingGame.roll(3);
            bowlingGame.roll(4);
        }

        int actual = bowlingGame.getScores();

        Assert.assertEquals(70, actual);
    }

    @Test
    public void should_return_true_when_roll_given_hit_3_balls_once_and_4_balls_twice_per_frame() {
        BowlingGame bowlingGame = new BowlingGame();
        for (int i = 0; i < 10; i++) {
            bowlingGame.roll(3);
            bowlingGame.roll(4);
        }

        boolean actual = bowlingGame.isEnd();

        Assert.assertTrue(actual);
    }

    @Test
    public void should_return_false_when_roll_19th() {
        BowlingGame bowlingGame = new BowlingGame();
        for (int i = 0; i < 9; i++) {
            bowlingGame.roll(3);
            bowlingGame.roll(4);
        }
        bowlingGame.roll(3);

        boolean actual = bowlingGame.isEnd();

        Assert.assertFalse(actual);
    }

    @Test
    public void should_return_string_when_roll_given_hit_3_balls_once_and_4_balls_twice_per_frame() {
        BowlingGame bowlingGame = new BowlingGame();
        for (int i = 0; i < 10; i++) {
            bowlingGame.roll(3);
            bowlingGame.roll(4);
        }

        String actual = bowlingGame.showFramesScores();

        Assert.assertEquals("7|7|7|7|7|7|7|7|7|7", actual);
    }

    @Test
    public void should_return_15_5_when_show_frames_scores_given_hit_5_balls_once_and_5_balls_twice_and_hit_5_ball_third() {
        BowlingGame bowlingGame = new BowlingGame();
        bowlingGame.roll(5);
        bowlingGame.roll(5);
        bowlingGame.roll(5);

        String actual = bowlingGame.showFramesScores();

        Assert.assertEquals("15|5", actual);
    }

    @Test
    public void should_return_false_when_roll_given_hit_5_balls_20th() {
        BowlingGame bowlingGame = new BowlingGame();
        for (int i = 0; i < 10; i++) {
            bowlingGame.roll(5);
            bowlingGame.roll(5);
        }

        boolean actual = bowlingGame.isEnd();

        Assert.assertFalse(actual);
    }

    @Test
    public void should_return_true_when_roll_given_hit_5_balls_21th() {
        BowlingGame bowlingGame = new BowlingGame();
        for (int i = 0; i < 10; i++) {
            bowlingGame.roll(5);
            bowlingGame.roll(5);
        }
        bowlingGame.roll(5);

        boolean actual = bowlingGame.isEnd();

        Assert.assertTrue(actual);
    }

    @Test
    public void should_return_String_when_show_frames_scores_given_hit_5_balls_once_and_5_balls_twice_per_frame() {
        BowlingGame bowlingGame = new BowlingGame();
        for (int i = 0; i < 10; i++) {
            bowlingGame.roll(5);
            bowlingGame.roll(5);
        }
        bowlingGame.roll(5);

        String actual = bowlingGame.showFramesScores();

        Assert.assertEquals("15|15|15|15|15|15|15|15|15|15", actual);
    }

    @Test
    public void should_return_150_when_get_scores_given_hit_5_balls_once_and_5_balls_twice_per_frame() {
        BowlingGame bowlingGame = new BowlingGame();
        for (int i = 0; i < 10; i++) {
            bowlingGame.roll(5);
            bowlingGame.roll(5);
        }
        bowlingGame.roll(5);

        int actual = bowlingGame.getScores();

        Assert.assertEquals(150, actual);
    }
}
