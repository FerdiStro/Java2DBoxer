import Frame.Scene.PlayerModel.MovementTypes;
import Frame.Scene.PlayerModel.Player;




import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class AddObjects {


   public Player addPlayer() throws IOException {
        Player player =  new Player();
        player.setMovement('s', MovementTypes.MOVE_Y_NEG);
        player.setMovement('w', MovementTypes.MOVE_Y_POS);
       player.setMovement('d', MovementTypes.MOVE_X_POS);
       player.setMovement('a', MovementTypes.MOVE_X_NEG);


        player.setX(0);
        player.setY(0);
        player.setHeight(200);
        player.setWidth(100);
        player.setImage( ImageIO.read(new File("img.png")));
        return  player;
    }


}
