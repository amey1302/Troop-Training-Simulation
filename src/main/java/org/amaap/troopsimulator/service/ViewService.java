package org.amaap.troopsimulator.service;

import org.amaap.troopsimulator.domain.ArmyCamp;
import org.amaap.troopsimulator.domain.service.ViewTroop;
import org.amaap.troopsimulator.repository.FakeTroopDatabase;

import java.util.LinkedList;

public class ViewService {
    public LinkedList<Object> ViewTroopData() {
        FakeTroopDatabase fakeTroopDatabase = new FakeTroopDatabase();

        ArmyCamp armyCamp = new ArmyCamp();
        ViewTroop viewTroop = new ViewTroop(armyCamp);

        LinkedList<Object> combinedTroops = viewTroop.viewCombinedTrainedTroops();
        fakeTroopDatabase.storeCombinedTrainedTroops(combinedTroops);
        return fakeTroopDatabase.getTrainedTroops();
    }
}
