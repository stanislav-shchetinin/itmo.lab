import pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();

        Pokemon p1 = new Luvdisc("Семён", 1);
        Pokemon p2 = new Eevee("Константин", 1);
        Pokemon p3 = new Jolteon("Амелия", 1);
        Pokemon p4 = new Seedot("Матвей", 1);
        Pokemon p5 = new Nuzleaf("Ярослав", 1);
        Pokemon p6 = new Shiftry("Павел", 1);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);

        b.go();


    }
}