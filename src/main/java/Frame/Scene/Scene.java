package Frame.Scene;

import java.util.ArrayList;
import java.util.List;

public class Scene{

   List<GameModel> allObjects  = new ArrayList<>();



    public <T extends GameModel> void addObject(T object){
        allObjects.add(object);

    }

    public List<GameModel> getAllObjects() {
        return this.allObjects;
    }



}
