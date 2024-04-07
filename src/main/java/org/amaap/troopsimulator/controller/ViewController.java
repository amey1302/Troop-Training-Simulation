package org.amaap.troopsimulator.controller;

import org.amaap.troopsimulator.service.TroopService;

public class ViewController {
    public boolean getTrainedData() {
        return TroopService.ViewTroopData();
    }
}
