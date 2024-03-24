package org.amaap.trooptraining.domain.model;

import org.amaap.trooptraining.domain.model.exception.InvalidTroopTypeException;

import java.util.EnumSet;
import java.util.Objects;

public class Troop {
    TroopType troopType;
    int trainingTime;
    int trainingCost;

    public Troop(TroopType troopType, int trainingTime, int trainingCost) {
        this.troopType = troopType;
        this.trainingTime = trainingTime;
        this.trainingCost = trainingCost;
    }
    public static Troop create(TroopType troopType, int trainingTime, int trainingCost) throws InvalidTroopTypeException {
        if(isInvalidTroopType(troopType)) throw new InvalidTroopTypeException("Troop Should Be Only\n1. Barbarian \n2. Archer");

        return new Troop(troopType,trainingTime,trainingCost);
    }

    public static boolean isInvalidTroopType(TroopType troopType){
        return  !isValidTroopType(troopType);
    }
    public static boolean isValidTroopType(TroopType troopType){
        EnumSet<TroopType> troopTypes = EnumSet.allOf(TroopType.class);
        if(troopTypes.contains(troopType))
            return true;
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Troop troop = (Troop) o;
        return trainingTime == troop.trainingTime && trainingCost == troop.trainingCost && troopType == troop.troopType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(troopType, trainingTime, trainingCost);
    }
}
