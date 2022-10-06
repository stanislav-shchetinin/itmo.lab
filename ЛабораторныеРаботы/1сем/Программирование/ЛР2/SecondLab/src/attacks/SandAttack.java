package attacks;

import ru.ifmo.se.pokemon.*;

public class SandAttack extends StatusMove {
    public SandAttack(){
        super(Type.GROUND, 0, 1);
    }
    @Override
    protected String describe(){
        return "атакует Sand Atack";
    }
    @Override
    protected void applyOppEffects(Pokemon oppPokemon){
        Effect effect = new Effect().stat(Stat.ACCURACY, -1);
        oppPokemon.addEffect(effect);
    }
}
