package com.dgsob.biosense;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class GoBackActor extends Actor {
    int Xcor = 1130;
    int Ycor = 550;
    Sprite arr = new Sprite(new Texture(Gdx.files.internal("arr2.png")));

    /**
     *
     * @param batch
     * @param parentAlpha
     */
    @Override
    public void draw(Batch batch, float parentAlpha) {

        batch.draw(arr, Xcor,  Ycor);
    }
}
