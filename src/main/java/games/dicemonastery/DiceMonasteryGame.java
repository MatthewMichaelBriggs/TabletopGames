package games.dicemonastery;

import core.*;
import games.GameType;

import java.util.*;

public class DiceMonasteryGame extends Game {

    public DiceMonasteryGame(List<AbstractPlayer> agents, DiceMonasteryParams params) {
        super(GameType.DiceMonastery, agents, new DiceMonasteryForwardModel(), new DiceMonasteryGameState(params, agents.size()));
    }

    public DiceMonasteryGame(DiceMonasteryForwardModel realModel, AbstractGameState state) {
        super(GameType.DiceMonastery, realModel, state);
    }
}