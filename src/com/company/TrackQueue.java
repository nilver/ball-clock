package com.company;

import java.util.Collections;
import java.util.LinkedList;

public class TrackQueue {

    private LinkedList<Integer> queue;
    private int size;
    private String name;

    public TrackQueue(int size, String name) {
        this.size = size;
        this.name = name;
        this.queue = new LinkedList<>();
    }

    public boolean addBall(int ball){
        if(queue.size() >= this.size){
            return false;
        }
        return this.queue.add(ball);
    }

    public int getFirstBall(){
        return queue.removeFirst();
    }

    public int getLastBall(){
        return queue.removeLast();
    }

    public void copyAndRemove(TrackQueue queue){

        for (var i=0; i<queue.size; i++) {
            this.queue.add(queue.getLastBall());
        }
    }

    public int getSize() {
        return size;
    }

    public LinkedList<Integer> getQueue() {
        return queue;
    }

    @Override
    public String toString() {
        return this.name+": "+ queue;
    }
}
