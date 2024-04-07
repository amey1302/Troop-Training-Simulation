# OOMD Analysis : 
## Domain
  ##  model
    ##  Troop 
     - TroopType : Enum
    	- Barbarian - class
    	- Archer    - class
  ##  Barracks  :
    - Behaviours 
        -  public void trainTroops()
        - private void trainTrooperAndWait(Barbarian barbarian)
        - private void trainTrooperAndWait(Archer archer)
        -  public void transferTrainedTroopsToArmyCamp(ArmyCamp armyCamp)
  ##  ArmyCamp  
     - Behaviour
       - public void receiveTrainedTroops(LinkedList<Barbarian> barbarians, LinkedList<Archer> archers)
  ##  Service 
  		- TrainTheTroop : training time & cost
  		- ViewArmyCamp  : 
-----
## Assumption : we introduced cost that is initally 500 points

## Controller
  ## train(tropperCount,troopType)
   -> Service
   		- validation -> service of domain(TrainTheTroop)

  ## view 
 	-> ViewService and calls ViewTroop from domain
    	-> stores into faketroopDatabase. getTrainedTroops
     	
---
# repository :
  - FakeTroopDatabase : 
      -public void storeCombinedTrainedTroops(LinkedList<Object> combinedTroops)
