package pokemons;

import attacks.SandAttack;
import attacks.Tackle;
import attacks.TailWhip;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Eevee extends Pokemon {
    public Eevee(String name, int level){
        super(name, level);
        this.addMove(new SandAttack());
        this.addMove(new Tackle());
        this.addMove(new TailWhip());
        this.setStats(55, 55, 50, 45, 65, 55);
        this.setType(Type.NORMAL);
    }

}
