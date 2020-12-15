package com.company;

public class Clock {

    private static final int  MIN_BALL = 27;
    private static final int  MAX_BALL = 217;

    private TrackQueue allBalls;
    private TrackQueue minuteTrack;
    private TrackQueue fiveMinuteTrack;
    private TrackQueue oneHourTrack;

    private int size;

    public Clock(int size) {
        this.size = size;
    }

    public void init(){
        allBalls = new TrackQueue(this.size, "allBalls");

        for(int i=0; i<this.size; i++){
            allBalls.addBall(i);
        }

        oneHourTrack = new TrackQueue(11, "hourTrack");
        fiveMinuteTrack = new TrackQueue(11, "fiveMinuteTrack");
        minuteTrack = new TrackQueue(4, "minutesTrack");

    }

    public TrackQueue getAllBalls() {
        return allBalls;
    }

    public TrackQueue getMinuteTrack() {
        return minuteTrack;
    }

    public TrackQueue getFiveMinuteTrack() {
        return fiveMinuteTrack;
    }

    public TrackQueue getOneHourTrack() {
        return oneHourTrack;
    }
}
