# Troop Training Simulation

- ## class TroopManager
    - ## Behaviour 
        - public Troop createTroop(Trooper troopType, int quantity) 
        - public Troop TrainTroop(Trooper troopType, int quantity) 
        - public Troop viewTroopCamp(Trooper troopType, int quantity)
      
- ## class Trooper : Enum
    - ## Behaviour 
        - Trooper(int trainingTime, int trainingCost) 
        - getters and setters
## Class Troop 
- ## state
    - private Trooper tropper 
    - private int quantity
- ## Behaviour
    - Smart Constructor
    - validation of troop parameters
 
# class Barracks
- ## state
    - private int capacity;
    - private List<Troop> troopsBeingTrained;
- ## Behaviour 
    - Constrcutor 
        - public Barracks(int capacity)
        - validations 
    - trainTheTroop(Troop troop) : 

# class ArmyCamp
- ## state 
    - private List<Troop> trainedTroops;
- ## Behaviour
    - public void addTroop(Troop troop)
    - public void viewTroopCamp()
    - private int countTroops()
# class Main
- functionality for the console based application


 




