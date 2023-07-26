package com.dgsob.biosense;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class MembraneSelectedActor extends Actor {
    Texture memb = new Texture(Gdx.files.internal("memb_selected.png"));

    /**
     *
     * @param batch
     * @param parentAlpha
     */
    public void draw(Batch batch, float parentAlpha) {

        batch.draw(memb, 50, -30);
    }


}
