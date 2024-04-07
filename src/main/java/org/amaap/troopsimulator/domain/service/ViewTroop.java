package org.amaap.troopsimulator.domain.service;

import org.amaap.troopsimulator.domain.ArmyCamp;
import org.amaap.troopsimulator.domain.model.Archer;
import org.amaap.troopsimulator.domain.model.Barbarian;

import java.util.LinkedList;


// like an dto only to connect with repo..
public class ViewTroop {


    private  ArmyCamp armyCamp;

    public ViewTroop(ArmyCamp armyCamp) {   //check here dont make any sense...
        this.armyCamp = armyCamp;
    }


    public LinkedList<Barbarian> viewTrainedBarbarians() {
        return armyCamp.getTrainedBarbarians();
    }

    public LinkedList<Archer> viewTrainedArchers() {
        return armyCamp.getTrainedArchers();
    }

    public LinkedList<Object> viewCombinedTrainedTroops() {
        LinkedList<Object> combinedTroops = new LinkedList<>();
        combinedTroops.addAll(armyCamp.getTrainedBarbarians());
        combinedTroops.addAll(armyCamp.getTrainedArchers());
        return combinedTroops;
    }


}
