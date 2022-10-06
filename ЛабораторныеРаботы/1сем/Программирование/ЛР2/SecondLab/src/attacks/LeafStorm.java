package attacks;

import ru.ifmo.se.pokemon.*;

public class LeafStorm extends SpecialMove {
    public LeafStorm (){
        super(Type.GRASS, 130, 0.9);
    }
    @Override
    protected String describe(){
        return "атакует Leaf Storm";
    }
    @Override
    protected void applySelfEffects(Pokemon thisPokemon){
        Effect effect = new Effect().stat(Stat.SPECIAL_ATTACK, -2);
        thisPokemon.addEffect(effect);
    }
}
