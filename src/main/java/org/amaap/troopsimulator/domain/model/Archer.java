package org.amaap.troopsimulator.domain.model;

import java.util.Objects;

public class Archer {
   private  final int trainingTime;
   private  final int trainingCost;

    public Archer() {
        this.trainingTime = 6;
        this.trainingCost = 20;
    }

    public int getTrainingTime()
    {
        return trainingTime;
    }

    public int getTrainingCost()
    {
        return trainingCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Archer archer)) return false;
        return trainingTime == archer.trainingTime && trainingCost == archer.trainingCost;
    }

    @Override
    public int hashCode() {
        return Objects.hash(trainingTime, trainingCost);
    }
}
