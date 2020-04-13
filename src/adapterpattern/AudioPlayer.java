/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterpattern;
/**
 *
 * @author DCL
 */
public class AudioPlayer implements Mediaplayer {
    Mediaadapter ma;
    
    @Override
    public void play(String audioType, String fileName){
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name:"+fileName);
        }else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            ma = new Mediaadapter(audioType);
            ma.play(audioType, fileName);
        }else{
            System.out.println("Invalid media. "+ audioType +" format not supported");
}
    
}
}
