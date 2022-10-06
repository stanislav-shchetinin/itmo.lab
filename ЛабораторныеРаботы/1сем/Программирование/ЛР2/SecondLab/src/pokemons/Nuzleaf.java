package pokemons;

import attacks.LeafBlade;
import ru.ifmo.se.pokemon.Type;

public class Nuzleaf extends Seedot{
    public Nuzleaf(String name, int level) {
        super(name, level);
        this.setStats(70, 70, 40, 60, 40, 60);
        this.setType(Type.GRASS, Type.DARK);
        this.addMove(new LeafBlade()); //увеличение коэф. критического попадания??
    }
}
