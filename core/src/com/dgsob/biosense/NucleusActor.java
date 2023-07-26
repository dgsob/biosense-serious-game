package com.dgsob.biosense;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Touchable;

public class NucleusActor extends Actor {
    Sprite nucleus = new Sprite(new Texture(Gdx.files.internal("nucleus.png")));
    int X = 210;
    int Y = 150;

    /**
     *
     */
    public NucleusActor(){
        setBounds(X, Y, nucleus.getWidth(), nucleus.getHeight());
        setTouchable(Touchable.enabled);



    }

    /**
     *
     * @param batch
     * @param parentAlpha
     */
    @Override
    public void draw(Batch batch, float parentAlpha) {

        nucleus.setPosition(X,Y);
        nucleus.draw(batch);
    }

}