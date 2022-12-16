package person;

import clothes.Blouse;
import clothes.Clothes;
import clothes.Hat;
import clothes.Trousers;
import office.Door;
import office.Office;
import pair.Pair;
import person.face.Face;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static clothes.Clothes.arrayIsClothes;
import static clothes.Clothes.arrayIsMasquerade;

public class Person implements PersonBehavior {
    private String name;
    private Height statHeight;
    private ArrayList<Clothes> arrClothes = new ArrayList<Clothes>();
    private Object fieldOfView = new Object();

    public Person (String name){
        this.name = name;
        this.statHeight = Height.ORDINARY;
    }
    public Person (String name, Height statHeight){
        this.name = name + " " + statHeight.name;
        this.statHeight = statHeight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setStatHeight(Height statHeight) {
        this.statHeight = statHeight;
    }

    public Height getStatHeight() {
        return statHeight;
    }

    public void addArrClothes(Clothes clothes){
        arrClothes.add(clothes);
    }
    public ArrayList<Clothes> getArrClothes(){
        return arrClothes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return (name.equals(person.name) && statHeight == ((Person) o).statHeight);
    }

    @Override
    public String toString(){
        return this.name;
    }

    @Override
    public int hashCode() {
        int prime = 67;
        return prime * Objects.hash(name, statHeight);
    }

    public void setFieldOfView(Object fieldOfView){
        System.out.print(this.getName() + " ");
        this.fieldOfView = fieldOfView;
        if (fieldOfView instanceof Face){
            System.out.println("увидел своё лицо");
        } else if (fieldOfView instanceof Hat){
            System.out.println("увидел свою шляпу");
        } else if (fieldOfView instanceof Trousers) {
            System.out.println("увидел свои брюки");
        } else if (fieldOfView instanceof Blouse){
            System.out.println("увидел свою блузу");
        } else if (fieldOfView instanceof Door) {
            System.out.println("увидел дверь");
        } else if (fieldOfView instanceof Office){
            System.out.println("осмотрелся в конторе");
        } else if (fieldOfView instanceof ArrayList<?>){ //Если причина имеет типа какого-то списка
            if (((ArrayList<?>) fieldOfView).isEmpty()){ //Если список пуст
                System.out.println("ничего не увидел");
            } else if (arrayIsClothes((ArrayList<?>) fieldOfView)){ //Есди это список одежды
                System.out.println("увидел свой " +
                        (arrayIsMasquerade((ArrayList<Clothes>) fieldOfView) ? "маскарадный" : "") +  " костюм");
            }
        }
        else {
            System.out.println("захотел");
        }
    }

    public void setFieldOfView(Object fieldOfView, Person person){
        System.out.print(this.getName() + " ");
        this.fieldOfView = new Pair(fieldOfView, person);
        if (((Pair)this.fieldOfView).first instanceof Face){
            System.out.print("увидел лицо ");
        } else if (((Pair)this.fieldOfView).first instanceof Hat){
            System.out.print("увидел шляпу ");
        } else if (((Pair)this.fieldOfView).first instanceof Trousers) {
            System.out.print("увидел брюки ");
        } else if (((Pair)this.fieldOfView).first instanceof Blouse){
            System.out.print("увидел блузу ");
        } else if (((Pair)this.fieldOfView).first instanceof ArrayList<?>){ //Если причина имеет типа какого-то списка
            if (((ArrayList<?>) fieldOfView).isEmpty()){ //Если список пуст
                System.out.print("ничего не увидел на ");
            } else if (arrayIsClothes((ArrayList<?>) fieldOfView)){ //Есди это список одежды
                System.out.print("увидел " +
                        (arrayIsMasquerade((ArrayList<Clothes>) fieldOfView) ? "маскарадный" : "") +  " костюм ");
            }
        } else {
            System.out.print("увидел ");
        }
        System.out.println(person.getName());
    }

    public Object getFieldOfView() {
        return fieldOfView;
    }

    @Override
    public void talk(ArrayList<Person> arrayList, ModeTalk modeTalk) {
        if (arrayList.isEmpty()){
            System.out.print(this.getName() + " разоваривает сам с собой");
        } else {
            System.out.print(this.getName() + " разоваривает с ");
            String arrString = arrayList.toString();
            System.out.print(arrString.substring(1, arrString.length() - 1));
        }
        System.out.println(" " + modeTalk.name);
    }

    @Override
    public void think(ArrayList<Person> whoThink, Person whoEntered) {
        if (whoThink.isEmpty()){
            System.out.println("Никто не думал, что войдет " + whoEntered.getName());
        } else {
            System.out.print(this.getName() + " с ");
            String arrString = whoThink.toString();
            System.out.println(arrString.substring(1, arrString.length() - 1) + " думали, что войдёт " + whoEntered.getName());
        }
    }

    @Override
    public void smile() {
        System.out.println(this.getName() + " улыбнулся");
    }

    @Override
    public void stopSmile() {
        System.out.println("Улбыка " + this.name + " моментально исчезла");
    }

    @Override
    public void laugh(){
        System.out.println(this.getName() + " засмеялся");
    }

    @Override
    public void notLaugh(){
        System.out.println(this.getName() + " не мог смеяться");
    }

}
