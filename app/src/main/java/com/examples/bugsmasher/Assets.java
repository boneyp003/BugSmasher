package com.examples.bugsmasher;

import android.graphics.Bitmap;
import android.media.SoundPool;

public class Assets {
    static Bitmap background;
    static Bitmap foodbar;
    static Bitmap ant1;
    static Bitmap ant2;
    static Bitmap ant3;
    static Bitmap life;

    // States of the Game Screen
    enum GameState {
        GettingReady,	// play "get ready" sound and start timer, goto next state
        Starting,		// when 3 seconds have elapsed, goto next state
        Running, 		// play the game, when livesLeft == 0 goto next state
        GameEnding,	    // show game over message
        GameOver,		// game is over, wait for any Touch and go back to title activity screen
    };
    static GameState state;		// current state of the game
    static float gameTimer;	    // in seconds
    static int livesLeft;		// 0-3

    static SoundPool soundPool;
    static int sound_getready;
    static int sound_looselife;
    static int sound_gameover;
    static int sound_squish1;
    static int sound_squish2;
    static int sound_squish3;
    static int sound_thump;

    static Bug bug; // try using an array of bugs instead of only 1 bug (so you can have more than 1 on screen at a time)
}
