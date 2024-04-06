# OOMD Analysis : 
## config - future preparedness
 - training time
 - training cost
## Domain
  ##  model
    ##  Troop 
    	- Barbarian - Enum
    	- Archer    - Enum
  ##  Barracks  : queue of troops waiting, isTroopTrained
  ##  ArmyCamp  : list of troop trained TroopType : Count
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
 	-> ArmyCampService.view
    	-> ArmyCampRepository.viewtroop
     		-> read from db 
     		/ it may call to domain service
     	->  ArmyCampRepository.viewtroop
---
# repository :
  - ArmyCampRepository : 
     - totalNoTroopTrained
     - barbarian
     - archer
     - costLeft