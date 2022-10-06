package attacks;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class ThunderFang extends PhysicalMove {
    public ThunderFang(){
        super(Type.ELECTRIC, 65, 0.95);
    }
    @Override
    protected String describe(){
        return "наносит удар Thunder Fang";
    }
    @Override
    protected void applyOppEffects(Pokemon oppPokemon){
        if (Math.random() <= 0.1){
            Effect.paralyze(oppPokemon);
        }
        if (Math.random() <= 0.1){
            Effect.flinch(oppPokemon);
        }
    }
}
