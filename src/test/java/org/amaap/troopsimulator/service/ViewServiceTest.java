package org.amaap.troopsimulator.service;

import org.amaap.troopsimulator.domain.model.Archer;
import org.amaap.troopsimulator.domain.model.Barbarian;
import org.amaap.troopsimulator.repository.FakeTroopDatabase;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ViewServiceTest {

    @Test
    void shouldRetrieveCombinedTrainedTroopsFromDatabase() {
        // arrange
        FakeTroopDatabase fakeTroopDatabase = new FakeTroopDatabase();
        ViewService viewService = new ViewService();

        // act
        LinkedList<Object> actualCombinedTroops = viewService.ViewTroopData();

        // assert
        assertEquals(fakeTroopDatabase.getTrainedTroops(), actualCombinedTroops);
    }
}
