package org.amaap.trooptraining.domain.model;

public enum Trooper {
    Barbarian(3,10),
    Archer(6,20);
    int trainingTime;
    int trainingCost;
    Trooper(int trainingTime, int trainingCost) {
        this.trainingTime = trainingTime;
        this.trainingCost = trainingCost;

    }

    public int getTrainingTime() {
        return trainingTime;
    }

    public int getTrainingCost() {
        return trainingCost;
    }

    @Override
    public String toString() {
        return "Trooper{" +
                "trainingTime=" + trainingTime +
                ", trainingCost=" + trainingCost +
                '}';
    }
}
