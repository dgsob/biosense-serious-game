package com.dgsob.biosense;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.scenes.scene2d.actions.MoveToAction;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

import java.util.Random;

public class GlucoseActor extends Actor {
    Sprite glu = new Sprite(new Texture(Gdx.files.internal("glucose.png")));
    Random rand = new Random();
    int min_X = 100;
    int max_X = 800;
    int min_Y = 300;
    int max_Y = 500;
    float randX;
    float randY;
    public Rectangle recGlu;

    /**
     *
     */
    public GlucoseActor(){
        randX = rand.nextInt((max_X - min_X) + 1) + min_X;
        randY = rand.nextInt((max_Y - min_Y) + 1) + min_Y;


        setBounds(randX, randY, glu.getWidth(), glu.getHeight());
        setTouchable(Touchable.enabled);

        recGlu = new Rectangle(randX, randY, glu.getWidth(), glu.getHeight());

//        addListener(new ClickListener() {
//            @Override
//            public void clicked(InputEvent event, float x, float y) {
//                MoveToAction action = new MoveToAction();
//                action.setY(0); // y-position to move to
//                action.setDuration(2); // time (in seconds) to move there
//                addAction(action);
//                super.clicked(event, x, y);
//            }
//        });
    }

    /**
     *
     * @param batch
     * @param parentAlpha
     */
    @Override
    public void draw(Batch batch, float parentAlpha) {

          // x 200, 700;  y 300,500
        glu.setPosition(randX, randY);
        glu.draw(batch);
    }

}