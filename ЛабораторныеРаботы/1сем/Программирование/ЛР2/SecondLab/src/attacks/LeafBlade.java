package attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class LeafBlade extends PhysicalMove {
    public LeafBlade(){
        super(Type.GRASS, 90, 1);
    }
    @Override
    protected String describe() {
        return "использует Leaf Blade";
    }

}
