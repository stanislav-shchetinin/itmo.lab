package person;

public enum Jobs {
    OPEN_AIR("открытый воздух"),
    OFFICE("офис"),
    FREELANCE("фриланс");
    public final String name;

    Jobs(String name){
        this.name = name;
    }
}
