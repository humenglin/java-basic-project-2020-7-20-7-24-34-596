package com.thoughtworks.basic;

import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
    public static final int BOWLING_GAME_TIMES = 10;
    public static final String SEG = "|";
    private List<Frame> frames = new ArrayList<>();
    private Frame currentFrame;
    private AdjacentFrame adjacentFrame;

    public void roll(int hits) {
        if (currentFrame == null) {
            int existedFrameNum = frames.size();
            if (existedFrameNum > 0 && frames.get(existedFrameNum - 1).isSpare()) {
                adjacentFrame = new AdjacentFrame(frames.get(existedFrameNum - 1), hits);
                adjacentFrame.updateLastFrameScores();
            }

            currentFrame = new Frame();
            frames.add(currentFrame);
        }

        currentFrame.roll(hits);

        if (currentFrame.isEnd()) {
            currentFrame = null;
        }
    }

    public int getScores() {
        int scores = 0;
        for (Frame frame : frames) {
            scores += frame.getScores();
        }
        return scores;
    }

    public boolean isEnd() {
        if (frames.size() == BOWLING_GAME_TIMES && frames.get(BOWLING_GAME_TIMES - 1).isEnd()) {
            return true;
        }
        return false;
    }

    public String showFramesScores() {
        StringBuilder stringBuilder = new StringBuilder();
        if (frames.size() > 0) {
            stringBuilder.append(frames.get(0).getScores());
        }
        if (frames.size() > 1) {
            for (int i = 1; i < frames.size(); i++) {
                stringBuilder.append(SEG).append(frames.get(i).getScores());
            }
        }
        return stringBuilder.toString();
    }
}
