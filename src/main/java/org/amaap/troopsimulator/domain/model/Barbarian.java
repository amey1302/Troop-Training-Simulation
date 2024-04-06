package org.amaap.troopsimulator.domain.model;

public class Barbarian {
   private  final int trainingTime;
   private  final int trainingCost;


    public Barbarian() {
        this.trainingTime = 3;
        this.trainingCost = 10;
    }

    public int getTrainingTime() {
        return trainingTime;
    }

    public int getTrainingCost() {
        return trainingCost;
    }

}
