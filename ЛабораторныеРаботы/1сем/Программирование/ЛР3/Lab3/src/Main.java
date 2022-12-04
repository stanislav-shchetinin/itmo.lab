import clothes.Blouse;
import clothes.Hat;
import clothes.Trousers;
import office.Door;
import office.Office;
import person.*;
import person.face.ColourFace;
import person.face.ColourHair;
import person.face.Face;
import person.face.Shape;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Person neznayka = new Person("Незнайка");
        Person kozlik = new Person("Козлик");
        Person miga = new Person("Мига");
        Unknown unknown = new Unknown("Незнакомый", Height.SHORTY);
        Office office = new Office(new ArrayList<Person>(Arrays.asList(neznayka, kozlik)));
        neznayka.talk(new ArrayList<Person>(Arrays.asList(kozlik)), ModeTalk.ORDINARY);
        office.door = new Door();
        office.door.open();
        neznayka.think(new ArrayList<Person>(Arrays.asList(kozlik)), miga);
        office.addPerson(unknown);
        unknown.addArrClothes(new Blouse("синяя побелевшая", true));
        unknown.addArrClothes(new Trousers("грязновато-серые", true));
        unknown.addArrClothes(new Hat("соломенная", true));
        neznayka.smile(unknown.getArrClothes(), unknown);
        neznayka.stopSmile(unknown.getFace(), unknown);
        unknown.setFace(new Face(Shape.THIN, ColourFace.SWARTY, ColourHair.GREY, PsychoMode.SADNESS, PsychoMode.STRICT));
        unknown.setJob(Jobs.OPEN_AIR);
        neznayka.notLaugh();

    }
}