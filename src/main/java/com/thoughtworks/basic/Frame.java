package com.thoughtworks.basic;

import com.thoughtworks.basic.exception.TheFrameIsEndException;

import java.util.ArrayList;
import java.util.List;

public class Frame {
    public static final int FRAME_ROLL_TIMES = 2;
    public static final int FRAME_ALL_BALLS = 10;
    private List<Integer> rolls = new ArrayList<>();
    private int frameScores;

    public void roll(int hits) {
        if (isEnd()) {
            throw new TheFrameIsEndException();
        }
        rolls.add(hits);
    }

    public int getScores() {
        if (frameScores > 0) {
            return frameScores;
        }

        int scores = 0;
        for (int roll : rolls) {
            scores += roll;
        }
        return scores;
    }

    public boolean isEnd() {
        if (rolls.size() == FRAME_ROLL_TIMES) {
            return true;
        }
        return false;
    }

    public void updateFrameScores(int frameScores) {
        this.frameScores = frameScores;
    }

    public boolean isSpare() {
        return getScores() == FRAME_ALL_BALLS;
    }
}
