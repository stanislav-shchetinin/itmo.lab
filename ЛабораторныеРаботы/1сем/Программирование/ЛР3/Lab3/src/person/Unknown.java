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
        System.out.println(this.getName() + " работает на " + this.job.name);
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
        System.out.println("Лицо " + this.getName() + " было " + this.face.getShape().name + " и " +
                this.face.getColourFace().name + "\n" +
                "Выражение лица " + this.face.getExpression().name + "\n" +
                "Из под " + this.face.getColourHair().name + " бровей смотрят " +
                this.face.getEyesPsychoMode().name + " глаза");
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
