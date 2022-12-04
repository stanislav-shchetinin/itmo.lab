package person;

import clothes.Blouse;
import clothes.Clothes;
import clothes.Hat;
import clothes.Trousers;
import person.face.ColourFace;
import person.face.Face;
import person.face.Shape;

public class Unknown extends Person {

    private Jobs job;
    private PsychoMode psychoMode;
    private Face face;
    public Unknown(String name, Height statHeight) {
        super(name, statHeight);
    }

    public void setJob(Jobs job) {
        this.job = job;
        System.out.print(this.getName() + " работает ");
        switch (this.job){
            case OFFICE -> System.out.println("в каморке");
            case OPEN_AIR -> System.out.println("на открытом воздухе");
            case FREELANCE -> System.out.println("на фрилансе");
        }
    }

    public Jobs getJob() {
        return job;
    }

    public void setPsychoMode(PsychoMode psychoMode) {
        this.psychoMode = psychoMode;
    }

    public PsychoMode getPsychoMode() {
        return psychoMode;
    }

    public void setFace(Face face) {
        this.face = face;
        System.out.print("Лицо " + this.getName() + " было ");
        switch (this.face.getShape()){
            case THIN -> System.out.print("худое и ");
            case ROUND -> System.out.print("круглое и ");
            case SQUARE -> System.out.print("квадратное и ");
        }
        switch (this.face.getColourFace()){
            case WHITE -> System.out.println("белое");
            case DARK -> System.out.println("темное");
            case SWARTY -> System.out.println("смуглое");
        }
        System.out.print("Выражение лица ");
        switch (this.face.getExpression()){
            case JOY -> System.out.println("радостное");
            case FEAR -> System.out.println("боязненное");
            case STRICT -> System.out.println("строгое");
            case ANXIETY -> System.out.println("тревожное");
            case SADNESS -> System.out.println("грустное");
        }
        System.out.print("Из под ");
        switch (this.face.getColourHair()){
            case RED -> System.out.print("рыжих ");
            case GREY -> System.out.print("седых ");
            case BLOND -> System.out.print("светлых ");
            case BRUNETTE -> System.out.print("темных ");
        }
        System.out.print("бровей смотрят ");
        switch (this.face.getEyesPsychoMode()){
            case JOY -> System.out.print("радостные ");
            case FEAR -> System.out.print("боязненные ");
            case STRICT -> System.out.print("строгие ");
            case ANXIETY -> System.out.print("тревожные ");
            case SADNESS -> System.out.print("печальные ");
        }
        System.out.println("глаза");

    }

    public Face getFace() {
        return face;
    }

    public void addArrClothes(Blouse blouse){
        addArrClothes((Clothes) blouse);
        System.out.println(this.getName() + " был одет в " + (blouse.getIsBroke() ? "ветхую " : "новую ") + blouse.getColour() + " блузу");
    }

    public void addArrClothes(Trousers trousers){
        addArrClothes((Clothes) trousers);
        System.out.println("На " + this.getName() + " были " + trousers.getColour() + " брюки " +
                (trousers.getIsBroke() ? "c махрами внизу " : ", выглядищее аккуратно") );
    }

    public void addArrClothes(Hat hat){
        addArrClothes((Clothes) hat);
        System.out.println("Голову " + this.getName() + " украшала " + hat.getColour() + " шляпа " +
                (hat.getIsBroke() ? " с дыркой на самом видном месте " : ", выглядищее аккуратно") );
    }

}
