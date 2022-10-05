package Frame.Settings;

import com.google.gson.Gson;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;


public class GraphicSettings {
    private  int screenWith;
    private  int screenHeight;


    public  GraphicSettings(){
        Gson gson  = new Gson();
        try {
            Reader reader   =  Files.newBufferedReader((Paths.get("src/main/resources/GraphicSettingsConfig.json")));
            GraphicSettings graphicSettings   =   gson.fromJson(reader, GraphicSettings.class);
            this.screenHeight = graphicSettings.getScreenHeight();
            this.screenWith   = graphicSettings.getScreenWith();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }



































    public int getScreenWith() {
        return screenWith;
    }

    public void setScreenWith(int screenWith) {
        this.screenWith = screenWith;
    }

    public int getScreenHeight() {
        return screenHeight;
    }

    public void setScreenHeight(int screenHeight) {
        this.screenHeight = screenHeight;
    }
}
