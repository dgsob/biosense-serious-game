package com.dgsob.biosense;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class InfoActor extends Actor {
    BitmapFont font;
    String typ;

    /**
     *
     * @param type
     */
    public InfoActor(String type) { // send x, y, text
        typ = type;
        font = new BitmapFont();
        font.setColor(0.5f, 0.4f, 0, 1);
        font.getData().setScale(1.5f);
    }

    /**
     *
     * @param batch
     * @param parentAlpha
     */
    public void draw(Batch batch, float parentAlpha) {
        if(typ=="MEMBRANE") {
            font.draw(batch, "Phospholipid bilayer. Contains glucose", 800, 200);
            font.draw(batch, "transporters facilitating the transport", 800, 180);
            font.draw(batch, "of glucose across the membrane.", 800, 160);
        }
        else if (typ=="NUCLEUS"){
            font.draw(batch, "The cell nucleus.", 800, 200);
            font.draw(batch, "Membrane-bound organelle found in eukaryotic cells.", 800, 180);
            font.draw(batch, "Contains nearly all of the cell's genome.", 800, 160);
        }
    }
}
