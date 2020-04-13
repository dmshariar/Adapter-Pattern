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
public class Mediaadapter implements Mediaplayer {
    
    Advancemediaplayer amp;
    
    public Mediaadapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc")){
            amp = new Vlcplayer();
        }else if(audioType.equalsIgnoreCase("mp4")){
            amp = new Mp4Player();
        }
    }
    
    @Override
    public void play(String audioType, String fileName){
        if(audioType.equalsIgnoreCase("vlc")){
            amp.playVlc(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            amp.playMp4(fileName);
        }
    }
}
