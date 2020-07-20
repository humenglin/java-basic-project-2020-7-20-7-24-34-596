package com.thoughtworks.basic;

import org.junit.Assert;
import org.junit.Test;

public class AdjacentFrameTest {
    @Test
    public void should_return_15_when_get_scores_of_frame_given_roll_third_and_hit_5_bals_per() {
        Frame frame = new Frame();
        frame.roll(5);
        frame.roll(5);
        AdjacentFrame adjacentFrame = new AdjacentFrame(frame, 5);
        adjacentFrame.updateLastFrameScores();

        int actual = frame.getScores();

        Assert.assertEquals(15, actual);
    }
}
