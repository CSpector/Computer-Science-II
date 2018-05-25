package lightsoutgame;

import java.io.*;
import java.util.Scanner;
import java.util.NoSuchElementException;
/**
 * Loads the LightsOut file
 * @author Colton Spector
 */
class LightsOutFileLoader {
    /**
     * Lights out file loader constructor
     */
    public LightsOutFileLoader() {
    }
    /**
     * 
     * @param lightsOut passed lights out 
     * @param file file is passed in 
     * @throws UnsupportedLightsOutFileException
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public void load(LightsOut lightsOut, File file) throws UnsupportedLightsOutFileException,FileNotFoundException, IOException {
        try{
            Scanner inputFile = new Scanner(file);
            for(int i = 0; i<lightsOut.getSize(); i++){
                String Line = inputFile.nextLine();
                for(int j= 0; j<Line.length(); j++){
                    if(Character.toString(Line.charAt(j)).equals("X")){
                        lightsOut.forceLit(i, j, true);
                    }
                    else if(Character.toString(Line.charAt(j)).equals("_")){
                        lightsOut.forceLit(i, j, false);
                    }
                    else {
                        throw new  UnsupportedLightsOutFileException();
                    }
                }
            }
            inputFile.close();
        
        }
        catch(FileNotFoundException e){
        throw new FileNotFoundException();
        }
        
    }
}
