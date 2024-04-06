package org.amaap.troopsimulator.domain;

import org.amaap.troopsimulator.domain.model.Archer;
import org.amaap.troopsimulator.domain.model.Barbarian;
import org.amaap.troopsimulator.domain.service.TrainTroop;

import java.util.Queue;

public class Barrack {
    private Queue<Barbarian> waitQueOfBarbarian;
    private Queue<Archer> waitQueOfArcher;

    public void setBarbarianQueue(Queue<Barbarian> barbarianQueue) {
        this.waitQueOfBarbarian = barbarianQueue;
    }

    public void setArcherQueue(Queue<Archer> archerQueue) {
        this.waitQueOfArcher = archerQueue;
    }

    public Queue<Archer> getWaitQueOfArcher() {
        return TrainTroop.getArcherWaitListQueue();
    }

    public Queue<Barbarian> getWaitQueOfBarbarian() {
        return TrainTroop.getBarbarianWaitListQueue();
    }


    //TODO:now we have total waiting list of both barabarian and archer suppose both 30,30
    // TODO: now we need one method that make use of this waiting list and train the first 10 troopers and add in the trainin methods list that has max capacity of 10 simulataneosly this 10 should br removed from wait list


}
