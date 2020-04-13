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
public class Mp4Player implements Advancemediaplayer {
    @Override
    public void playVlc(String fileName){
        
    }
    @Override
    public void playMp4(String fileName){
        System.out.println("Playing vlc file.name: "+fileName);
    }
}
