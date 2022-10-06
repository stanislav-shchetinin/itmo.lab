package attacks;

import ru.ifmo.se.pokemon.*;

public class EnergyBall extends SpecialMove {
    public EnergyBall(){
        super(Type.GRASS, 90, 1);
    }
    @Override
    protected String describe(){
        return "использует Energy Ball";
    }
    @Override
    protected void applyOppEffects(Pokemon oppPokemon){
        Effect effect = new Effect().chance(0.1).stat(Stat.SPECIAL_DEFENSE, -1);
        oppPokemon.addEffect(effect);
    }
}