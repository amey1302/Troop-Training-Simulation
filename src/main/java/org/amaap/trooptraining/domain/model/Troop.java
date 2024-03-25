package org.amaap.trooptraining.domain.model;

import org.amaap.trooptraining.domain.model.exception.InvalidTroopQuantityException;
import org.amaap.trooptraining.domain.model.exception.InvalidTroopTypeException;

import java.util.EnumSet;
import java.util.Objects;

public class Troop {
    Trooper troopType;
    int quantity;

    public Troop(Trooper troopType) {
        this.troopType = troopType;
    }

    public static Troop create(Trooper troopType) throws InvalidTroopTypeException, InvalidTroopQuantityException {
        if (isInvalidTroopType(troopType))
            throw new InvalidTroopTypeException("Troop Should Be Only\n1. Barbarian \n2. Archer");
        return new Troop(troopType);
    }

    public static boolean isInvalidTroopType(Trooper troopType) {
        return !isValidTroopType(troopType);
    }

    public static boolean isValidTroopType(Trooper troopType) {
        EnumSet<Trooper> troopTypes = EnumSet.allOf(Trooper.class);
        if (troopTypes.contains(troopType))
            return true;
        return false;
    }

    public static boolean isInvalidTroopQuantity(int quantity) {
        return !isValidTroopQuantity(quantity);
    }

    private static boolean isValidTroopQuantity(int quantity) {
        return quantity >= 10;
    }

    public int getQuantity() {
        return quantity;
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

    public Trooper getTroopType() {
        return troopType;
    }
}
