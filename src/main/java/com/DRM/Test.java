package com.DRM;

import com.birdbrain.Finch;

public class Test {
    public static void main(String[] args) {
        Finch birf = new Finch();

        // DO STUFF
        birf.playNote(60,1.0);
        birf.pause(0.2);
        birf.playNote(70,1.0);
        birf.pause(0.5);
        birf.playNote(80,1.0);
        birf.pause(0.4);
        birf.playNote(70,1.0);
        birf.pause(0.2);
        birf.playNote(60,1.0);
        birf.pause(0.4);
        birf.playNote(70,1.0);
        
        
        
        
        
        
        birf.pause(6);
        birf.playNote(70,1.0);
        birf.pause(1);
        birf.playNote(90,1.0);
        birf.pause(1);
        birf.playNote(70,1.0);
        birf.pause(1);
        birf.playNote(50,1.0);
        birf.pause(2);
        birf.playNote(50,1.0);
        birf.pause(1);
        birf.playNote(70,1.0);
        birf.pause(1);
        birf.playNote(60,1.0);
        birf.pause(1);
        birf.playNote(80,1.0);



        for (int i = 0; i < 10; i++) {
            birf.setBeak(100, 100, 100);
            birf.pause(1);
            birf.setBeak(0, 0, 0);
            birf.pause(1);
        }

        birf.stop();
        birf.disconnect();
    }
}
