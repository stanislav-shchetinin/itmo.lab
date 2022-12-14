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
        String result = "???????? ";
        switch (shape){
            case THIN -> result += "?????????? ?? ";
            case ROUND -> result += "?????????????? ?? ";
            case SQUARE -> result += "???????????????????? ?? ";
        }
        switch (colourFace){
            case WHITE -> result += "??????????.";
            case DARK -> result += "????????????.";
            case SWARTY -> result += "??????????????.";
        }

        result += " ???????????? ";
        switch (colourHair){
            case RED -> result += "??????????.";
            case GREY -> result += "??????????.";
            case BLOND -> result += "??????????????.";
            case BRUNETTE -> result += "????????????.";
        }
        result += " ?????????? ";
        switch (eyesPsychoMode){
            case JOY -> result += "??????????????????.";
            case FEAR -> result += "????????????????????.";
            case STRICT -> result += "??????????????.";
            case ANXIETY -> result += "??????????????????.";
            case SADNESS -> result += "??????????????????.";
        }
        return result;
    }

    @Override
    public int hashCode() {
        int prime = 59;
        return prime * Objects.hash(colourHair, colourFace, shape);
    }
}
