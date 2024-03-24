package org.amaap.trooptraining.domain;

import org.amaap.trooptraining.domain.model.Troop;
import org.amaap.trooptraining.domain.model.Troopers;
import org.amaap.trooptraining.domain.model.exception.InvalidTroopQuantityException;
import org.amaap.trooptraining.domain.model.exception.InvalidTroopTypeException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TroopManagerTest {
    @Test
    void shouldAbleToCreateTroopWithTypeBarbarian() throws InvalidTroopTypeException, InvalidTroopQuantityException {
        //Arrange
        Troopers troopType = Troopers.Barbarian;
        int quantity = 5;
        Troop expected = Troop.create(troopType,quantity);

        //Act
        TroopManager troopTrainingManager = new TroopManager();
        Troop actual =troopTrainingManager.createTroop(troopType,quantity);

        //Assert
        assertEquals(expected,actual);

    }
    @Test
    void shouldAbleToCreateTroopWithTypeArcher() throws InvalidTroopTypeException, InvalidTroopQuantityException {
        //Arrange
        Troopers troopType = Troopers.Archer;
        int quantity = 5;
        Troop expected = Troop.create(troopType,quantity);

        //Act
        TroopManager troopTrainingManager = new TroopManager();
        Troop actual =troopTrainingManager.createTroop(troopType,quantity);

        //Assert
        assertEquals(expected,actual);

    }
}
