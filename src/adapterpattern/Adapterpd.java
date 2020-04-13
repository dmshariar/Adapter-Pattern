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
public class Adapterpd {
    public static void main(String[] args){
        AudioPlayer ap = new AudioPlayer();

      ap.play("mp3", "suger.mp3");
      ap.play("mp4", "waiting for love.mp4");
      ap.play("vlc", "true.vlc");
      ap.play("avi", "no money.avi");
       
    } 
    
}
