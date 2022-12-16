package person;

import clothes.Clothes;
import person.ModeTalk;

import java.util.ArrayList;

public interface PersonBehavior {

    void talk(ArrayList<Person> arrayList, ModeTalk modeTalk);
    void think(ArrayList<Person> whoThink, Person whoEntered);
    void smile();
    void stopSmile();
    void laugh();
    void notLaugh();
}
