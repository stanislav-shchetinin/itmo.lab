package pokemons;

import attacks.Confide;
import attacks.HealPulse;
import attacks.HeartStamp;
import attacks.WaterGun;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Luvdisc extends Pokemon {
    public Luvdisc(String name, int level){
        super(name, level);
        this.addMove(new Confide());
        this.addMove(new HeartStamp());
        this.addMove(new HealPulse()); //не написан
        this.addMove(new WaterGun());
        this.setStats(43, 30, 55, 40, 65, 97);
        this.setType(Type.WATER);
    }

}
