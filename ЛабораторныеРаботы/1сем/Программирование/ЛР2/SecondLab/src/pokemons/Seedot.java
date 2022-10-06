package pokemons;

import attacks.EnergyBall;
import attacks.ShadowBall;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Seedot extends Pokemon {
    public Seedot(String name, int level) {
        super(name, level);
        this.setStats(40, 40, 50, 30, 30, 20);
        this.setType(Type.GRASS);
        this.addMove(new ShadowBall());
        this.addMove(new EnergyBall());
    }
}
