import clothes.Blouse;
import clothes.Clothes;
import clothes.Hat;
import clothes.Trousers;
import office.Door;
import office.Office;
import pair.Pair;
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

        neznayka.setFieldOfView(unknown.getArrClothes(), unknown);
        Object fieldOfView = ((Pair)neznayka.getFieldOfView()).first;

        if (fieldOfView instanceof ArrayList<?> && Clothes.arrayIsClothes((ArrayList<?>) fieldOfView)
        && Clothes.arrayIsMasquerade((ArrayList<Clothes>) fieldOfView)){
            neznayka.smile();
        }

        unknown.setFace(new Face(Shape.THIN, ColourFace.SWARTY, ColourHair.GREY, PsychoMode.SADNESS, PsychoMode.STRICT));
        unknown.setJob(Jobs.OPEN_AIR);

        neznayka.setFieldOfView(unknown.getFace(), unknown);
        fieldOfView = ((Pair)neznayka.getFieldOfView()).first;
        if (fieldOfView instanceof Face && ((Face) fieldOfView).getEyesPsychoMode() == PsychoMode.SADNESS){
            neznayka.stopSmile();
            neznayka.notLaugh();
        }

    }
}