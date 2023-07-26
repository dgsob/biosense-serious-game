package com.dgsob.biosense;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class GlucoseScoreActor extends Actor {
    Sprite glu = new Sprite(new Texture(Gdx.files.internal("low_glu.png")));
    int Xcor = 0;
    int Ycor = 550;

    /**
     *
     * @param batch
     * @param parentAlpha
     */
    @Override
    public void draw(Batch batch, float parentAlpha) {

        batch.draw(glu, Xcor,  Ycor);
    }
}
