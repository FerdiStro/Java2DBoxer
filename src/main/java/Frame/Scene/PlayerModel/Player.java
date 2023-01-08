package Frame.Scene.PlayerModel;

import Frame.Scene.GameModel;

import java.awt.*;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

public class Player implements GameModel {
    private int x;
    private int y;
    private int width;
    private int height;
    private Image image;
    private Map<Character, MovementTypes> movementTypesMap;





    //Position

    @Override
    public void setX(int x) {
        this.x = x;
    }
    @Override
    public void setY(int y) {
        this.y = y ;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }



    //Picture

    @Override
    public void setWidth(int width) {
        this.width  =  width;

    }


    @Override
    public void setHeight(int height) {
        this.height  =  height;

    }

    @Override
    public int getWidth() {
        return this.width;
    }


    @Override
    public int getHeight() {
        return this.height;
    }

    @Override
    public void setImage(Image image) {
        this.image  = image;


    }

    @Override
    public Image getImage() {
        return this.image;
    }

    @Override
    public void setMovement(char keyName, MovementTypes movementType) {
        if(this.movementTypesMap ==  null) {
            this.movementTypesMap = new HashMap<>();
        }
        movementTypesMap.put(keyName, movementType);
    }

    @Override
    public Map<Character, MovementTypes> getMovement() {
        return this.movementTypesMap;
    }
}
