package attacks;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class HeartStamp extends PhysicalMove {
    public HeartStamp(){
        super(Type.PSYCHIC, 60, 1);
    }
    @Override
    protected String describe(){
        return "ударяет Heart Stamp";
    }

    @Override
    protected void applyOppEffects(Pokemon oppPokemon){
        if (Math.random() <= 0.3){
            Effect.flinch(oppPokemon);
        }
    }
}
