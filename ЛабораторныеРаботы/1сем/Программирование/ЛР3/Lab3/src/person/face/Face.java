package person.face;

import clothes.Clothes;
import person.PsychoMode;

import java.util.Objects;

public class Face {
    private Shape shape = Shape.THIN;
    private ColourFace colourFace = ColourFace.WHITE;
    private ColourHair colourHair = ColourHair.BRUNETTE;
    private PsychoMode eyesPsychoMode = PsychoMode.JOY;
    private PsychoMode expression = PsychoMode.JOY;

    public Face(){}

    public Face(Shape shape, ColourFace colourFace, ColourHair colourHair, PsychoMode eyesPsychoMode, PsychoMode expression){
        this.shape = shape;
        this.colourFace = colourFace;
        this. colourHair = colourHair;
        this.eyesPsychoMode = eyesPsychoMode;
        this.expression = expression;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
        System.out.println();
    }

    public Shape getShape() {
        return shape;
    }

    public void setColourFace(ColourFace colourFace) {
        this.colourFace = colourFace;
    }

    public ColourFace getColourFace() {
        return colourFace;
    }

    public void setColourHair(ColourHair colourHair) {
        this.colourHair = colourHair;
    }

    public ColourHair getColourHair() {
        return colourHair;
    }

    public void setEyesPsychoMode(PsychoMode eyesPsychoMode) {
        this.eyesPsychoMode = eyesPsychoMode;
    }

    public PsychoMode getEyesPsychoMode() {
        return eyesPsychoMode;
    }

    public void setExpression(PsychoMode expression) {
        this.expression = expression;
    }

    public PsychoMode getExpression() {
        return expression;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Face face = (Face) o;
        return (colourHair.equals(face.colourHair) &&
                (colourFace.equals(face.colourFace)) &&
                        (shape.equals(face.shape)));
    }

    @Override
    public String toString(){
        String result = "Лицо ";
        switch (shape){
            case THIN -> result += "худое и ";
            case ROUND -> result += "круглое и ";
            case SQUARE -> result += "квадратное и ";
        }
        switch (colourFace){
            case WHITE -> result += "белое.";
            case DARK -> result += "темное.";
            case SWARTY -> result += "смуглое.";
        }

        result += " Волосы ";
        switch (colourHair){
            case RED -> result += "рыжие.";
            case GREY -> result += "седые.";
            case BLOND -> result += "светлые.";
            case BRUNETTE -> result += "темные.";
        }
        result += " Глаза ";
        switch (eyesPsychoMode){
            case JOY -> result += "радостные.";
            case FEAR -> result += "боязненные.";
            case STRICT -> result += "строгие.";
            case ANXIETY -> result += "тревожные.";
            case SADNESS -> result += "печальные.";
        }
        return result;
    }

    @Override
    public int hashCode() {
        int prime = 59;
        return prime * Objects.hash(colourHair, colourFace, shape);
    }
}
