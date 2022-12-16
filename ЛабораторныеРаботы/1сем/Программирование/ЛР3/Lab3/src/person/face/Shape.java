package person.face;

public enum Shape {

    ROUND("круглое"),
    THIN("худое"),
    SQUARE("квадратное");
    public final String name;

    Shape(String name){
        this.name = name;
    }
}
