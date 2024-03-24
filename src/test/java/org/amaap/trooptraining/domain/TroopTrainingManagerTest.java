package org.amaap.trooptraining.domain;

import org.amaap.trooptraining.domain.model.Troop;
import org.amaap.trooptraining.domain.model.TroopType;
import org.amaap.trooptraining.domain.model.exception.InvalidTroopTypeException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TroopTrainingManagerTest {
    @Test
    void shouldAbleToCreateTroopWithTypeBarbarian() throws InvalidTroopTypeException {
        //Arrange
        TroopType troopType = TroopType.Barbarian;
        int trainingTime = 3;
        int trainingCost = 10;
        Troop expected = Troop.create(troopType,trainingTime,trainingCost);

        //Act
        TroopTrainingManager troopTrainingManager = new TroopTrainingManager();
        Troop actual =troopTrainingManager.createTroop(troopType,trainingTime,trainingCost);

        //Assert
        assertEquals(expected,actual);


    }
}
