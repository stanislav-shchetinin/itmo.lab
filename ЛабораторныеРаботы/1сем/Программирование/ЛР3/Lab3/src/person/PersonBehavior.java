package person;

import clothes.Clothes;
import person.ModeTalk;

import java.util.ArrayList;

public interface PersonBehavior {

    void talk(ArrayList<Person> arrayList, ModeTalk modeTalk);
    void think(ArrayList<Person> whoThink, Person whoEntered);
    void smile(Object reason);
    void smile(Object reason, Person person);
    void stopSmile(Object reason);
    void stopSmile(Object reason, Person person);
    void laugh();
    void notLaugh();
}
