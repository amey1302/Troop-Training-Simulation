package org.amaap.troopsimulator.domain.model;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Barbarian barbarian)) return false;
        return trainingTime == barbarian.trainingTime && trainingCost == barbarian.trainingCost;
    }

    @Override
    public int hashCode() {
        return Objects.hash(trainingTime, trainingCost);
    }
}
