package attacks;

import ru.ifmo.se.pokemon.*;

public class ShadowBall extends SpecialMove {
    public ShadowBall(){
        super(Type.GHOST, 80, 1);
    }
    @Override
    protected String describe(){
        return "использует Shadow Ball";
    }
    @Override
    protected void applyOppEffects(Pokemon oppPokemon){
        Effect effect = new Effect().chance(0.2).stat(Stat.SPECIAL_DEFENSE, -1);
        oppPokemon.addEffect(effect);
    }
}
