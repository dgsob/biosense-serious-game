package com.dgsob.biosense;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class NucleusSelectedActor extends Actor {
    Texture nuc = new Texture(Gdx.files.internal("nucleus_selected.png"));

    /**
     *
     * @param batch
     * @param parentAlpha
     */
    public void draw(Batch batch, float parentAlpha) {

        batch.draw(nuc, 210, 150);
    }


}