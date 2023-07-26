package com.dgsob.biosense;

import com.badlogic.gdx.Game;

public class gameClass extends Game {

    public final static int WIDTH = 1280;
    public final static int HEIGHT = 640;

    /**
     *
     */
    public void create() {
        this.setScreen(new Menu(this));
    }

}