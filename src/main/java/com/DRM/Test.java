package com.DRM;

import com.birdbrain.Finch;

public class Test {
    public static void main(String[] args) {
        Finch birf = new Finch();

        // DO STUFF
        birf.playNote(60,1.0);
        birf.pause(1);
        birf.playNote(100,1.0);
        birf.pause(1);
        birf.playNote(70,1.0);


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
