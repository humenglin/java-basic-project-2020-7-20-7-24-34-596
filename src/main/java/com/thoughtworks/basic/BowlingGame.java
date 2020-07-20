package com.thoughtworks.basic;

import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
    private List<Frame> frames = new ArrayList<>();
    private Frame currentFrame;

    public void roll(int hits) {
        if (currentFrame == null) {
            currentFrame = new Frame();
            frames.add(currentFrame);
        }
        currentFrame.roll(hits);
    }

    public int getScores() {
        int scores = 0;
        for (Frame frame : frames) {
            scores += frame.getScores();
        }
        return scores;
    }
}
