package com.thoughtworks.basic;

import java.util.ArrayList;
import java.util.List;

public class Frame {
    private List<Integer> rolls = new ArrayList<>();

    public void roll(int hits) {
        rolls.add(hits);
    }

    public int getScores() {
        int scores = 0;
        for (int roll : rolls) {
            scores += roll;
        }
        return scores;
    }
}
