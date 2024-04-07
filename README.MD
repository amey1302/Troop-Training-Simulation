# OOMD Analysis
---
## Domain Model

### Troop
- **TroopType** (Enum)
  - Barbarian (class)
  - Archer (class)

### Barracks
- **Behaviours**
  - `public void trainTroops()`
  - `private void trainTrooperAndWait(Barbarian barbarian)`
  - `private void trainTrooperAndWait(Archer archer)`
  - `public void transferTrainedTroopsToArmyCamp(ArmyCamp armyCamp

### ArmyCamp
- **Behaviour**
  - `public void receiveTrainedTroops(LinkedList<Barbarian> barbarians, LinkedList<Archer> archers)`
## domain service
 - **Train Troop**
 - **View Troop**
-----
## Service
- **TrainTheTroop**
  - Provides training time & cost
- **ViewArmyCamp**
  - Views the army camp

## Controller
### `train(trooperCount, troopType)`
- Calls Service for validation
- Service interacts with domain (`TrainTheTroop`)

### `view`
- Calls ViewService and `ViewTroop` from domain
- Stores into `FakeTroopDatabase.getTrainedTroops`

## Repository
### FakeTroopDatabase
- `public void storeCombinedTrainedTroops(LinkedList<Object> combinedTroops)`
