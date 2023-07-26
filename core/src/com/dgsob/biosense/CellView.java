package com.dgsob.biosense;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.utils.ActorGestureListener;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;



public class CellView extends ViewAdapter {

    private final NucleusActor nuc;
    private final MembraneActor mem;
    private final GoBackActor back;
    private MembraneSelectedActor mem_;
    private NucleusSelectedActor nuc_;
    private final CytozolActor cyt;
    private float timedead = 0f;
    InfoActor info;
    Pixmap pixmap = new Pixmap(Gdx.files.internal("memb.png"));
    private boolean Hold = false;
    //private MitochondriaActor mit;

    /**
     *
     * @param game
     */
    public CellView(final gameClass game) {
        super(game);
        cyt = new CytozolActor();
        mem = new MembraneActor();
        nuc = new NucleusActor();
        back = new GoBackActor();

        stage.addActor(cyt);
        stage.addActor(mem);
        stage.addActor(nuc);
        stage.addActor(back);

        addListeners();

    }

    /**
     *
     * @param delta
     */
    @Override
    public void render(float delta) {
        if (Hold) {
            timedead += Gdx.graphics.getDeltaTime();
            float period = 5f;
            if (timedead > period) {
                if (Gdx.input.isTouched()) {
                    info.addAction(Actions.removeActor());
                    Hold = false;
                    timedead = 0f;
                }
            }
        }
        super.render(delta);
        stage.act();

        spriteBatch.begin();
        stage.draw();
        spriteBatch.end();
    }

    @Override
    public void addListeners() {
        back.addListener(new ClickListener() {
            /**
             *
             * @param event
             * @param x
             * @param y
             */
            public void clicked(InputEvent event, float x, float y) {
                game.setScreen(new Menu(game));
            }
        });

        nuc.addListener(new ActorGestureListener() {
            /**
             *
             * @param actor
             * @param x
             * @param y
             * @return
             */
            @Override
            public boolean longPress(Actor actor, float x, float y) {
                int X_ = (int) (x);
                int Y_ = (int) (y);
                int pixel = pixmap.getPixel(X_, Y_);
                if ((pixel & 0x000000ff) != 0) {
                    info = new InfoActor("NUCLEUS");
                    stage.addActor(info);
                    Hold = true;
                    return true;
                }
                return false;
            }
        });

        nuc.addListener(new InputListener() {
            /**
             *
             * @param event
             * @param x
             * @param y
             * @param pointer
             * @param button
             * @return
             */
            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                int pixel = pixmap.getPixel((int) (x), (int) (y));
                if ((pixel >> 24) == 0) { //if ((pixel & 0x000000ff) != 0) {
                    nuc_ = new NucleusSelectedActor();
                    stage.addActor(nuc_);
                    return true;
                }
                return super.touchDown(event, x, y, pointer, button);
            }

            /**
             *
             * @param event
             * @param x
             * @param y
             * @param pointer
             * @param button
             */
            @Override
            public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
                //select = true;
                nuc_.addAction(Actions.removeActor());
            }
        });

        mem.addListener(new ActorGestureListener() {
            /**
             *
             * @param actor
             * @param x
             * @param y
             * @return
             */
            @Override
            public boolean longPress(Actor actor, float x, float y) {
                int X_ = (int) (x);
                int Y_ = (int) (y);
                int pixel = pixmap.getPixel(X_, Y_);
                if ((pixel & 0x000000ff) != 0) {
                    info = new InfoActor("MEMBRANE");
                    stage.addActor(info);
                    Hold = true;
                    return true;
                }
                return false;
            }
        });

        mem.addListener(new ClickListener() {
            /**
             *
             * @param event
             * @param x
             * @param y
             */
            public void clicked(InputEvent event, float x, float y) {
                if (!Hold) {
                    int X_ = (int) (x);
                    int Y_ = (int) (y);
                    int pixel = pixmap.getPixel(X_, Y_);
                    if ((pixel & 0x000000ff) != 0) {
                        game.setScreen(new MembraneView(game));
                    }
                }
            }
        });


        mem.addListener(new InputListener() {
            /**
             *
             * @param event
             * @param x
             * @param y
             * @param pointer
             * @param button
             * @return
             */
            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                int pixel = pixmap.getPixel((int) (x), (int) (y));
                if ((pixel >> 24) != 0) { //if ((pixel & 0x000000ff) != 0) {
                    mem_ = new MembraneSelectedActor();
                    stage.addActor(mem_);
                    return true;
                }
                return super.touchDown(event, x, y, pointer, button);
            }

            /**
             *
             * @param event
             * @param x
             * @param y
             * @param pointer
             * @param button
             */
            @Override
            public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
                //select = true;
                mem_.addAction(Actions.removeActor());
                super.touchUp(event, x, y, pointer, button);
            }
        });
    }
}



