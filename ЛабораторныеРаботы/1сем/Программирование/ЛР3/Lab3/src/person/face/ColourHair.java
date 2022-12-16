package person.face;

public enum ColourHair {
    BLOND("светлые"),
    BRUNETTE("темные"),
    RED("рыжие"),
    GREY("седые");
    public final String name;

    ColourHair(String name){
        this.name = name;
    }

}
