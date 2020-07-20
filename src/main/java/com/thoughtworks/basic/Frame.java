package com.thoughtworks.basic;

import com.thoughtworks.basic.exception.TheFrameIsEndException;

import java.util.ArrayList;
import java.util.List;

public class Frame {
    public static final int FRAME_ROLL_TIMES = 2;
    private List<Integer> rolls = new ArrayList<>();

    public void roll(int hits) {
        if (isEnd()) {
            throw new TheFrameIsEndException();
        }
        rolls.add(hits);
    }

    public int getScores() {
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
}
