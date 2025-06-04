package com.DRM;

import com.birdbrain.Finch;

public class Test {
    public static void main(String[] args) {
        Finch birf = new Finch();

        // DO STUFF
        

        //notes for music
        int C1 = 32;
        int D1 = 34;
        int E1 = 36;
        int F1 = 38;
        int G1 = 40;
        int A1 = 42;
        int B1 = 44;
        int C2 = 46;
        int D2 = 48;
        int E2 = 50;
        int F2 = 52;
        int G2 = 54;
        int A2 = 56;
        int B2 = 58;
        int C3 = 60;
        int D3 = 62;
        int E3 = 64;
        int F3 = 66;
        int G3 = 68;
        int A3 = 70;
        int B3 = 72;
        int C4 = 74;
        int D4 = 76;
        int E4 = 78;
        int F4 = 80;
        int G4 = 82;
        int A4 = 84;
        int B4 = 86;
        //move

        birf.setBeak(100,0,0);
        birf.setTurn("R",360,50);
        birf.setBeak(0,100,0);
        birf.setTurn("L",360,50);
        birf.setBeak(0,0,100);

        //song
        birf.playNote(C4, 0.25);
        birf.pause(0.35);
        birf.playNote(D4, 0.25);
        birf.pause(0.35);
        birf.playNote(C4, 0.5);
        birf.pause(0.6);
        birf.playNote(D4, 0.45);
        birf.pause(0.55);
        birf.playNote(C4, 0.25);
        birf.pause(0.35); 
        birf.playNote(A3, 1.0);
        birf.pause(1.1);
        birf.playNote(A3, 1.0);
        birf.pause(1.1);
        birf.playNote(A3, 1.0);
        birf.pause(1.1);
        birf.playNote(G3, 0.15);
        birf.pause(0.25);
        birf.playNote(A3, 0.5);
        birf.pause(0.6);
        birf.playNote(71, 0.25);
        birf.pause(0.35);
        birf.playNote(A3,1.4);
        birf.pause(1.5);
        birf.playNote(71, 0.5);
        birf.pause(0.6);
        birf.playNote(G3, 0.5);
        birf.pause(0.6);
        birf.playNote(C4, 0.25);
        birf.pause(0.35);
        birf.playNote(A3, 2);
        birf.pause(2.1);
        birf.playNote(F3, 0.5);
        birf.pause(0.6);
        birf.playNote(D3, 0.4);
        birf.pause(0.5);
        birf.playNote(G3, 0.25);
        birf.pause(0.35);
        birf.playNote(C3, 1.0); 

    
        //night end

        //6 AM SEQUENCE

        birf.setBeak(0,0,100);
        birf.setTurn("R",360,50);
        birf.setBeak(0,100,0);
        birf.setTurn("L",360,50);
        birf.setBeak(100,0,0);

        birf.pause(2);
        birf.playNote(A3, 1.0);
        birf.pause(1.1);
        birf.playNote(F3, 1.0);
        birf.pause(1.1);
        birf.playNote(G3, 1.0);
        birf.pause(1.1);
        birf.playNote(C3, 1.0);

        birf.pause(1.0);

        birf.playNote(C3, 1.0);
        birf.pause(1.1);
        birf.playNote(G3, 0.45);
        birf.pause(0.55);
        birf.playNote(A3, 1.0);
        birf.pause(1.1);
        birf.playNote(F3, 1.0);


        // for (int i = 0; i < 10; i++) {
        //     birf.setBeak(100, 100, 100);
        //     birf.pause(1);
        //     birf.setBeak(0, 0, 0);
        //     birf.pause(1);
        // }

        birf.stop();
        birf.disconnect();
    }
}
