package Frame;

import Frame.Scene.GameModel;
import Frame.Scene.Scene;
import Frame.Settings.GraphicSettings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;


public class MainFrame {
    private boolean seeJFrame  =  true;
    private JFrame jFrame;
    private Scene scene;
    private String configPath = "";
    private GraphicSettings graphicSettings;


    private double fps = 0.0;


    private JPanel jPanel  = new JPanel() {


        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if(scene != null){
                pressedKey = movementInstructions.get(movementInstructions.size()-1);
                List<GameModel> allObjects = scene.getAllObjects();
                for(GameModel ojb: allObjects){
                    g.drawImage(ojb.getImage(), ojb.getX(), ojb.getY(), ojb.getWidth() , ojb.getHeight(), null);
                    g.drawString(""+fps, 0, 0);


                    ojb.move(pressedKey);


                }
            }
        }
    };

    private Character pressedKey;

    List<Character> movementInstructions  =  new ArrayList<>();


   public MainFrame() {
       this.graphicSettings  = new GraphicSettings(configPath);
       this.jFrame  = buildJFrame();
       this.jFrame.add(this.jPanel);

       //Key Listeners
       KeyListener keyListener  =  new KeyListener() {
           @Override
           public void keyTyped(KeyEvent e) {
           }
           @Override
           public void keyPressed(KeyEvent e) {
               if(!movementInstructions.contains(e.getKeyChar())){
                   movementInstructions.add(e.getKeyChar());
               }
           }

           @Override
           public void keyReleased(KeyEvent e) {
                   List<Character> cloneList =  new ArrayList<>();
                   for(char key: movementInstructions){
                       if(e.getKeyChar() !=  key){
                           cloneList.add(key);
                       }
                   }
                   movementInstructions = cloneList;
           }
       };
       this.jFrame.addKeyListener(keyListener);
   }

   public void TICK(double fps){
       jPanel.repaint();
   }



   private  JFrame buildJFrame(){
       JFrame  jFrame   = new JFrame();
       jFrame.setSize(graphicSettings.getScreenWith(), graphicSettings.getScreenHeight());
       jFrame.setVisible(seeJFrame);
       jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       movementInstructions.add(';');
       return jFrame;
   }


    public void setScene(Scene scene) {
        this.scene = scene;
    }
}
