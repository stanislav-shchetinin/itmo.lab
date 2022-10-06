package pokemons;

import attacks.ThunderFang;
import ru.ifmo.se.pokemon.Type;

public class Jolteon extends Eevee {

    public Jolteon(String name, int level) {
        super(name, level);
        this.addMove(new ThunderFang());
        this.setStats(65, 65, 60, 110, 95, 130);
        this.setType(Type.ELECTRIC);
    }
}
