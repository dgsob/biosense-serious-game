package com.dgsob.biosense;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Touchable;

public class CloseupMembraneActor extends Actor {
    Sprite memb = new Sprite(new Texture(Gdx.files.internal("membrane_closeup.png")));
    public Rectangle recMem;

    /**
     *
     */
    public CloseupMembraneActor(){
        setBounds(memb.getX(), memb.getY(), memb.getWidth(), memb.getHeight());
        setTouchable(Touchable.enabled);

        recMem=new Rectangle(memb.getX(), memb.getY(), memb.getWidth(), memb.getHeight());

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

        batch.draw(memb, -160,120 );
    }

}