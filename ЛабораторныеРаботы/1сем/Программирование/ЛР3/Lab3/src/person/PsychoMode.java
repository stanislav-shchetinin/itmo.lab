package person;

public enum PsychoMode {
    JOY("радостный"),
    SADNESS("печальный"),
    ANXIETY("тревожный"),
    FEAR("боязненый"),
    STRICT("строгий");
    public final String name;

    PsychoMode(String name){
        this.name = name;
    }
}
