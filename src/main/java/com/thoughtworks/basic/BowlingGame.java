package com.thoughtworks.basic;

import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
    public static final int BOWLING_GAME_TIMES = 10;
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

    public boolean isEnd() {
        if (frames.size() == BOWLING_GAME_TIMES) {
            return true;
        }
        return false;
    }
}
