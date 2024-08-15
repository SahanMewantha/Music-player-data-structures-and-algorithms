
package musicplayerdsa;

import java.io.File;


public class Song {
    File songfile;
    String fileName;
    String singerName;
    String currentPath;
    
       public Song(String s,String h){
        this.songfile = new File(s); 
        this.fileName = songfile.getName();
        this.currentPath = s;
        this.singerName = h; 
    }
    
    public String getSongName(){
        return fileName;
        
    }
    
}
