package org.amaap.trooptraining.domain.model;

import org.amaap.trooptraining.domain.TroopManager;
import org.amaap.trooptraining.domain.model.exception.InvalidTroopQuantityException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class TroopTest {
    @Test
    void shouldAbleToThrowAnExceptionWhenTroopQuantityIsNegative() {
        //Arrange
        Troopers archer = Troopers.Archer;
        int quantity = -99;

        //Act
        TroopManager troopManager = new TroopManager();

        //Assert
        assertThrows(InvalidTroopQuantityException.class, () -> {
            troopManager.createTroop(archer, quantity);
        });
    }
    @Test
    void shouldAbleToThrowAnExceptionWhenTroopQuantityIsGreaterThan10() {
        //Arrange
        Troopers archer = Troopers.Archer;
        int quantity = 15;

        //Act
        TroopManager troopManager = new TroopManager();

        //Assert
        assertThrows(InvalidTroopQuantityException.class, () -> {
            troopManager.createTroop(archer, quantity);
        });
    }
}