package entityclasses;

import entityinterfaces.IFlag;

import java.awt.*;

public class Flag implements IFlag {

    private int id;
    private Image flagImage;

    Flag(){

    }

    Flag(int id, Image flagImage){
        this.id=id;
        this.flagImage= flagImage;
    }

    @Override
    public int getID() {
        return id;
    }

    @Override
    public void setID(int id) {
        this.id=id;
    }

    @Override
    public Image getFlagImage() {
        return flagImage;
    }

    @Override
    public void setFlagImage(Image img) {
        this.flagImage=flagImage;
    }
}
