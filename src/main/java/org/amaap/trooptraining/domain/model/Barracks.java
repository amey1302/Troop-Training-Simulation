package org.amaap.trooptraining.domain.model;

import org.amaap.trooptraining.domain.model.exception.InvalidTroopQuantityException;
import org.amaap.trooptraining.domain.model.exception.QuantityExceededCapacityException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Barracks {
    private static List<Troop> troopBeingTrained = Collections.synchronizedList(new ArrayList<>());
    private static final int capacity = 10;

    public static int getCapacity() {
        return capacity;
    }

    public static boolean trainTroop(Troop troop, int quantityBeingTrained) throws InterruptedException, QuantityExceededCapacityException {
        if (quantityBeingTrained <= Barracks.getCapacity()) {

            System.out.println("Training Started...");
            Thread.sleep(troop.getTroopType().getTrainingTime() * 1000* quantityBeingTrained);
            System.out.println("Training Complete for " + quantityBeingTrained + " " + troop.getTroopType());
            troopBeingTrained.add(troop);
            return true;
        } else
            throw new QuantityExceededCapacityException("Barracks Capacity is Full,Can't Train More Troops Right Now");
    }
    public static List<Troop> getTroopBeingTrained() {
        return troopBeingTrained;
    }

}
