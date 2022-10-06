package attacks;

import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove {
    public Confide(){
        super(Type.NORMAL, 0, 1);
    }
    @Override
    protected String describe() {
        return "использует Confide";
    }

    @Override
    protected void applyOppEffects(Pokemon oppPokemon) {
        Effect effect = new Effect().stat(Stat.SPECIAL_DEFENSE, -1);
        oppPokemon.addEffect(effect);
    }
}
