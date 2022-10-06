package pokemons;

import attacks.LeafStorm;

public class Shiftry extends Nuzleaf{
    public Shiftry(String name, int level) {
        super(name, level);
        this.setStats(90, 100, 60, 90, 60, 80);
        this.addMove(new LeafStorm());
    }
}
