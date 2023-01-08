import Frame.MainFrame;
import Frame.Scene.Scene;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) throws IOException {
        AddObjects addObjects   = new AddObjects();
        MainFrame mainFrame  = new MainFrame();


        Scene scene   =   new Scene();



        scene.addObject(addObjects.addPlayer());





        mainFrame.setScene(scene);






        //Tick

        Timer timer =  new Timer();
        int tickInMilSek = 50;

        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
               mainFrame.TICK(1000 / (float) tickInMilSek);

            }
        },0, tickInMilSek );



    }





}
