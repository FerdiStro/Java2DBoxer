package Frame;

import Frame.Scene.GameModel;
import Frame.Scene.Scene;
import Frame.Settings.GraphicSettings;

import javax.swing.*;
import java.awt.*;
import java.util.List;


public class MainFrame {
    private boolean seeJFrame  =  true;
    private JFrame jFrame;
    private Scene scene;
    private String configPath = "";
    private GraphicSettings graphicSettings;


    private double fps = 0.0;


    private JPanel jPanel  = new JPanel(){
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if(scene != null){
                List<GameModel> allObjects = scene.getAllObjects();
                for(GameModel ojb: allObjects){
                    g.drawImage(ojb.getImage(), ojb.getX(), ojb.getY(), ojb.getWidth() , ojb.getHeight(), null);
                    g.drawString(""+fps, 0, 0);
                }
            }
        }
    };






   public MainFrame() {
       this.graphicSettings  = new GraphicSettings(configPath);
       this.jFrame  = buildJFrame();
       this.jFrame.add(this.jPanel);

   }

   public void TICK(double fps){
       jPanel.repaint();
   }



   private  JFrame buildJFrame(){
       JFrame  jFrame   = new JFrame();
       jFrame.setSize(graphicSettings.getScreenWith(), graphicSettings.getScreenHeight());
       jFrame.setVisible(seeJFrame);
       jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       return jFrame;
   }


    public void setScene(Scene scene) {
        this.scene = scene;
    }
}
