package person;

public enum Height {
    SHORTY("коротышка"),
    ORDINARY(""),
    GIANT("гигант");

    public final String name;

    Height(String name){
        this.name = name;
    }

}
