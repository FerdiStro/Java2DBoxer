package Frame.Scene;


import Frame.Scene.PlayerModel.MovementTypes;

import java.awt.*;
import java.util.Map;

public interface GameModel {

    //Position

    void setX(int x);
    void setY(int y);
    int  getX();
    int  getY();

    //Picture
    void setWidth(int width);
    void setHeight(int height);
    int getWidth();
    int getHeight();
    void setImage(Image image);
    Image getImage();


    //Set instructions for key
    void setMovement(char keyName, MovementTypes movementType);
    Map<Character, MovementTypes> getMovement();
    default void move(Character pressedKey){
        if (getMovement() != null) {
            MovementTypes movementTypes = getMovement().get(pressedKey);
            if (movementTypes !=  null) {
                if(movementTypes.getCordTypes() ==  MovementTypes.CordTypes.X){
                    setX(getX() +movementTypes.getMove());
                }
                if(movementTypes.getCordTypes() ==  MovementTypes.CordTypes.Y){
                    setY(getY() +movementTypes.getMove());
                }
            }
        }





    }



}
