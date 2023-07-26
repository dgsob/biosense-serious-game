package com.dgsob.biosense;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Touchable;

public class MembraneActor extends Actor {
    Sprite memb = new Sprite(new Texture(Gdx.files.internal("memb.png")));
    int Xcor = 0;
    int Ycor = -60;

    /**
     *
     */
    public MembraneActor(){
        setBounds(Xcor, Ycor, memb.getWidth(), memb.getHeight());
        setTouchable(Touchable.enabled);



    }

    /**
     *
     * @param batch
     * @param parentAlpha
     */
    @Override
    public void draw(Batch batch, float parentAlpha) {
        memb.setPosition(Xcor,Ycor);
        memb.draw(batch);
    }

}
