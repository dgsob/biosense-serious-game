package com.dgsob.biosense;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Touchable;

public class TransporterActor extends Actor {
    Sprite tr = new Sprite(new Texture(Gdx.files.internal("transporter_main.png")));
//    SpriteBatch anim_open = new SpriteBatch();
//    TextureAtlas atlas_open = new TextureAtlas(Gdx.files.internal("transporter_open.atlas"));
//    TextureRegion region_open = atlas_open.findRegion("t_0");
//    Sprite sprite = new Sprite(region_open);
    int Xcor = 495;
    int Ycor = 50;
    public Rectangle recTra;

    /**
     *
     */
    public TransporterActor(){
        recTra=tr.getBoundingRectangle();

        setBounds(Xcor, Ycor, tr.getWidth(), tr.getHeight());
        setTouchable(Touchable.enabled);

//        sprite.setPosition(Xcor, Ycor);

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

        batch.draw(tr, Xcor,  Ycor);
//        sprite.draw(anim_open);
    }

}