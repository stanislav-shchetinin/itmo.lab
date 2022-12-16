package clothes;

import person.Person;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Clothes {
    private String colour;
    private boolean isBroke = false;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clothes clothes = (Clothes) o;
        return (colour.equals(clothes.colour) && isBroke == ((Clothes) o).isBroke);
    }

    @Override
    public String toString(){
        return "Clothes " + this.colour;
    }

    @Override
    public int hashCode() {
        int prime = 59;
        return prime * Objects.hash(colour, isBroke);
    }

    public Clothes(String colour){
        this.colour = colour;
    }
    public Clothes(String colour, boolean isBroke){
        this.colour = colour;
        this.isBroke = isBroke;
    }

    public static boolean arrayIsClothes (ArrayList<?> arrayList){ //Проверка на то что каждый элемент - одежда
        for (Object cur: arrayList) {
            if (!(cur instanceof Clothes)) {
                return false;
            }
        }
        return true;
    }

    public static boolean arrayIsMasquerade (ArrayList<Clothes> arrClothes){
        for (Clothes clothes : arrClothes){
            if (!clothes.getIsBroke()){
                return false;
            }
        }
        return true;
    }

    void setColour(String colour){
        this.colour = colour;
    }
    public String getColour(){
        return colour;
    }
    public void setIsBroke(){
        isBroke = true;
    }

    public boolean getIsBroke(){
        return isBroke;
    }

}
