import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;

import BoardFiles.*;
import WireworldGUI.Window;

public class Main {
    
    public static void main( String args[] ){

        String dataPath = "Tests/testLoadMap.txt";
        
        MapLoader loader = new MapLoader();
        Map map;

        try{
            map = loader.LoadMap( new File( dataPath ) );
        } catch( FileNotFoundException | NoSuchElementException e ){
            e.printStackTrace();
            return;
        }
        
        new Window( map );
    }
}