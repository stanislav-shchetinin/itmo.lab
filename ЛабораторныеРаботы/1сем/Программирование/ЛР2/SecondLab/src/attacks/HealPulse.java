package attacks;

import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class HealPulse extends StatusMove {
    public HealPulse(){
        super(Type.PSYCHIC, 0, 1);
    }
    @Override
    protected String describe(){
        return "применил Heal Pulse";
    }

}
