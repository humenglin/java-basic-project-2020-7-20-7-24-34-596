package com.thoughtworks.basic;

import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
    public static final int BOWLING_GAME_TIMES = 10;
    public static final int FRAME_ALL_BALLS = 10;
    public static final String SEG = "|";
    private List<Frame> frames = new ArrayList<>();
    private Frame currentFrame;
    private AdjacentFrame adjacentFrame;
    private boolean isEnd;

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

        if (frames.size() == BOWLING_GAME_TIMES + 1 && frames.get(BOWLING_GAME_TIMES - 2).getScores() > FRAME_ALL_BALLS) {
            isEnd =  true;
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
        if (isEnd == true) {
            return true;
        }

        if (frames.size() == BOWLING_GAME_TIMES && frames.get(BOWLING_GAME_TIMES - 1).isEnd() && !frames.get(BOWLING_GAME_TIMES - 1).isSpare()) {
            isEnd =  true;
        } else {
            isEnd =  false;
        }
        return isEnd;
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
