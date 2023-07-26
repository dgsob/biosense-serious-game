package com.dgsob.biosense;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Touchable;

public class CytozolActor extends Actor {
    Sprite cytozol = new Sprite(new Texture(Gdx.files.internal("cytozol.png")));
    int X = 0;
    int Y = -60;

    public CytozolActor(){
        setBounds(X, Y, cytozol.getWidth(), cytozol.getHeight());
        setTouchable(Touchable.enabled);

//        addListener(new InputListener(){
//            public
//
//        });
    }

    /**
     *
     * @param batch
     * @param parentAlpha
     */
    @Override
    public void draw(Batch batch, float parentAlpha) {
        cytozol.setPosition(X,Y);
        cytozol.draw(batch);
    }

}