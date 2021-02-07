package games.dicemonastery.actions;

import games.dicemonastery.DiceMonasteryGameState;

import static games.dicemonastery.DiceMonasteryConstants.*;
import static games.dicemonastery.DiceMonasteryConstants.ActionArea.*;

public class BrewBeer extends UseMonk {

    public BrewBeer() {
        super(2);
    }

    @Override
    public boolean _execute(DiceMonasteryGameState state) {
        state.moveCube(state.getCurrentPlayer(), Resource.GRAIN, STOREROOM, SUPPLY);
        state.moveCube(state.getCurrentPlayer(), Resource.BEER, SUPPLY, STOREROOM);
        return true;
    }


    @Override
    public boolean equals(Object obj) {
        return obj instanceof BrewBeer;
    }

    @Override
    public int hashCode() {
        return 128213;
    }

    @Override
    public String toString() {
        return "Brew Beer";
    }
}