package com.thoughtworks.basic;

public class AdjacentFrame {
    private Frame frame;
    private int nextRollHits;

    public AdjacentFrame(Frame frame, int nextRollHits) {
        this.frame = frame;
        this.nextRollHits = nextRollHits;
    }

    public void updateLastFrameScores() {
        if (frame.isEnd() && frame.isSpare()) {
            frame.updateFrameScores(frame.getScores() + nextRollHits);
        }
    }
}
