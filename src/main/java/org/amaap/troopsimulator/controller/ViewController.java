package org.amaap.troopsimulator.controller;

import org.amaap.troopsimulator.service.ViewService;

import java.util.LinkedList;

public class ViewController {
    public LinkedList<Object> getTrainedData() {
        ViewService viewService = new ViewService();
        return viewService.ViewTroopData();
    }
}