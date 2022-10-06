package attacks;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class WaterGun extends SpecialMove {
    public WaterGun(){
        super(Type.WATER, 40, 1);
    }
    @Override
    protected String describe(){
        return "наносит удар Water Gun";
    }

}
