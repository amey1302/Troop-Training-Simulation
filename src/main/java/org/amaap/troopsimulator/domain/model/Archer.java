package org.amaap.troopsimulator.domain.model;

public class Archer {
   private  final int trainingTime;
   private  final int trainingCost;


    public Archer() {
        this.trainingTime = 6;
        this.trainingCost = 20;
    }

    public int getTrainingTime() {
        return trainingTime;
    }

    public int getTrainingCost() {
        return trainingCost;
    }
    
}
