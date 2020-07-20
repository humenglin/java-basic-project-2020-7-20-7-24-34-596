package com.thoughtworks.basic;

import org.junit.Assert;
import org.junit.Test;

public class FrameTest {

    @Test
    public void should_return_1_when_roll_given_hit_1_ball() {
        Frame frame = new Frame();
        frame.roll(1);

        int actual = frame.getScores();

        Assert.assertEquals(1, actual);
    }

    @Test
    public void should_return_6_when_roll_given_hit_6_ball() {
        Frame frame = new Frame();
        frame.roll(6);

        int actual = frame.getScores();

        Assert.assertEquals(6, actual);
    }

    @Test
    public void should_return_false_when_roll_once() {
        Frame frame = new Frame();
        frame.roll(1);

        boolean actual = frame.isEnd();

        Assert.assertFalse(actual);
    }

    @Test
    public void should_return_true_when_roll_twice() {
        Frame frame = new Frame();
        frame.roll(1);
        frame.roll(1);

        boolean actual = frame.isEnd();

        Assert.assertTrue(actual);
    }
}
