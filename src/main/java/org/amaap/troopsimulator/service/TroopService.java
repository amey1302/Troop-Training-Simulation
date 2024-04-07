package org.amaap.troopsimulator.service;

import org.amaap.troopsimulator.domain.ArmyCamp;
import org.amaap.troopsimulator.domain.model.Archer;
import org.amaap.troopsimulator.domain.model.Barbarian;
import org.amaap.troopsimulator.domain.model.TroopType;
import org.amaap.troopsimulator.domain.service.TrainTroop;
import org.amaap.troopsimulator.domain.service.ViewTroop;
import org.amaap.troopsimulator.repository.TroopDatabase;
import org.amaap.troopsimulator.service.exception.InvalidTroopCountException;
import org.amaap.troopsimulator.service.exception.InvalidTroopTypeException;

import java.util.LinkedList;

import static org.amaap.troopsimulator.service.validator.TroopTypeValidator.isNotInEnum;

public class TroopService {
    public static boolean train(int trooperCount, String troopType) throws InvalidTroopCountException, InvalidTroopTypeException {
        if (trooperCount <= 0)
            throw new InvalidTroopCountException("Invalid TroopType Count Exception " + trooperCount);
        if (isNotInEnum(troopType, TroopType.class))
            throw new InvalidTroopTypeException("Invalid TroopType Type Exception " + troopType);

        return TrainTroop.train(trooperCount, troopType);
    }

    public static boolean ViewTroopData() {

        ArmyCamp armyCamp=new ArmyCamp();//check once here...dont make any sense
        ViewTroop viewTroop = new ViewTroop(armyCamp);
        LinkedList<Barbarian> trainedBarbarians = viewTroop.viewTrainedBarbarians();
        LinkedList<Archer> trainedArchers = viewTroop.viewTrainedArchers();
        LinkedList<Object> combinedTroops = viewTroop.viewCombinedTrainedTroops();

        // Store the trained data in the repository
        TroopDatabase.storeTrainedBarbarians(trainedBarbarians);
        TroopDatabase.storeTrainedArchers(trainedArchers);
        TroopDatabase.storeCombinedTrainedTroops(combinedTroops);

        return  true;
    }
}
