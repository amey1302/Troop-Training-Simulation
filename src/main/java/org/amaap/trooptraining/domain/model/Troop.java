package org.amaap.trooptraining.domain.model;

import org.amaap.trooptraining.domain.model.exception.InvalidTroopQuantityException;
import org.amaap.trooptraining.domain.model.exception.InvalidTroopTypeException;

import java.util.EnumSet;
import java.util.Objects;

public class Troop {
    Troopers troopType;
    int quantity;

    public Troop(Troopers troopType, int quantity) {
        this.troopType = troopType;
        this.quantity = quantity;
    }

    public static Troop create(Troopers troopType, int quantity) throws InvalidTroopTypeException, InvalidTroopQuantityException {
        if (isInvalidTroopType(troopType))
            throw new InvalidTroopTypeException("Troop Should Be Only\n1. Barbarian \n2. Archer");
        if (isInvalidTroopQuantity(quantity))
            throw new InvalidTroopQuantityException("Troop Quantity Should be At Most 10 and at least 0");
        return new Troop(troopType, quantity);
    }

    public static boolean isInvalidTroopType(Troopers troopType) {
        return !isValidTroopType(troopType);
    }

    public static boolean isValidTroopType(Troopers troopType) {
        EnumSet<Troopers> troopTypes = EnumSet.allOf(Troopers.class);
        if (troopTypes.contains(troopType))
            return true;
        return false;
    }

    public static boolean isInvalidTroopQuantity(int quantity) {
        return !isValidTroopQuantity(quantity);
    }

    private static boolean isValidTroopQuantity(int quantity) {

        if(quantity >=0 && quantity <= 10)
            return true;
        return false;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Troop troop = (Troop) o;
        return quantity == troop.quantity && troopType == troop.troopType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(troopType, quantity);
    }
}
