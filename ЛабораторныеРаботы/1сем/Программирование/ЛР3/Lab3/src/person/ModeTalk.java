package person;

public enum ModeTalk {
    AGGRESSIVE("агрессивно"), ORDINARY("как обычно"), POLITELY("давольно вежливо");
    public final String name;

    ModeTalk(String name){
        this.name = name;
    }
}
