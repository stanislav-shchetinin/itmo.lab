package office;

import clothes.Clothes;
import person.Person;
import person.Unknown;

import java.util.ArrayList;
import java.util.Objects;

public class Office {
    private ArrayList<Person> arrPerson;
    public Door door;

    public Office (ArrayList<Person> arrPerson){
        this.arrPerson = arrPerson;
        if (!arrPerson.isEmpty()){
            String arrString = arrPerson.toString();
            System.out.print(arrString.substring(1, arrString.length() - 1));
            if (arrPerson.size() == 1){
                System.out.println(" сидит в коморке");
            } else {
                System.out.println(" сидят в коморке");
            }
        }
    }

    public void addPerson(Person person){
        arrPerson.add(person);
        System.out.println(person.getName() + " зашел в контору");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Office office = (Office) o;
        return (arrPerson.equals(office.arrPerson) && door.equals(office.door));
    }

    @Override
    public String toString(){
        return "Office " + this.arrPerson.toString();
    }

    @Override
    public int hashCode() {
        int prime = 59;
        return prime * Objects.hash(arrPerson, door);
    }

}
