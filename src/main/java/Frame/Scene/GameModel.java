package Frame.Scene;


import java.awt.*;

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





}
