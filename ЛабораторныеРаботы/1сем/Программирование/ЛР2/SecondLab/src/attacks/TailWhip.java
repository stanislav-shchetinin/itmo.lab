package attacks;

import ru.ifmo.se.pokemon.*;

public class TailWhip extends StatusMove {
    public TailWhip(){
        super(Type.NORMAL, 0, 1);
    }
    @Override
    protected String describe(){
        return "использует Tail Whip";
    }
    @Override
    protected void applyOppEffects(Pokemon oppPokemon){
        Effect effect = new Effect().stat(Stat.DEFENSE, -1);
        oppPokemon.addEffect(effect);
    }
}
