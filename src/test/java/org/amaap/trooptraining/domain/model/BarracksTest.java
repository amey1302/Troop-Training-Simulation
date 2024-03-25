package org.amaap.trooptraining.domain.model;

import org.amaap.trooptraining.domain.model.exception.InvalidTroopQuantityException;
import org.amaap.trooptraining.domain.model.exception.InvalidTroopTypeException;
import org.amaap.trooptraining.domain.model.exception.QuantityExceededCapacityException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BarracksTest {
    @Test
    void shouldAbleToTrain5TrooperWithTypeArcher() throws InvalidTroopTypeException, InvalidTroopQuantityException, QuantityExceededCapacityException, InterruptedException {
        //Arrange
        Barracks.getCapacity();
        Trooper trooperType = Trooper.Archer;
        Troop troop = Troop.create(trooperType);
        int quantityNeedToTrained = 5;
        //Act
        boolean actual = Barracks.trainTroop(troop,quantityNeedToTrained);

        //Assert
        assertTrue(actual);

    }
    @Test
    void shouldAbleToThrowAnExceptionWhenTroopBeingTrainedQuantityIsGreaterThanBarracksCapacity() throws InvalidTroopTypeException, InvalidTroopQuantityException {
        //Arrange
        Barracks.getCapacity();
        Trooper troopType = Trooper.Barbarian;
        int quantityBeingTrained = 15;

        //Act
        Troop troop = Troop.create(troopType);

        //Assert
        assertThrows(QuantityExceededCapacityException.class,()-> {
            Barracks.trainTroop(troop, quantityBeingTrained);
        });
    }

}