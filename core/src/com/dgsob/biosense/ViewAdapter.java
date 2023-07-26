package com.dgsob.biosense;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.StretchViewport;

public abstract class ViewAdapter implements Screen {
    protected gameClass game;
    protected Stage stage;
    private OrthographicCamera camera;
    protected SpriteBatch spriteBatch;

    /**
     *
     * @param game
     */
    public ViewAdapter(gameClass game){
        this.game = game;
        createCamera();
        stage = new Stage(new StretchViewport(gameClass.WIDTH, gameClass.HEIGHT, camera));
        spriteBatch = new SpriteBatch();
        Gdx.input.setInputProcessor(stage);
    }

    /**
     *
     */
    private void createCamera() {
        camera = new OrthographicCamera();
        camera.setToOrtho(false, gameClass.WIDTH, gameClass.HEIGHT);
        camera.update();
    }

    /**
     *
     * @param delta
     */
    @Override
    public void render(float delta) {
        clearScreen();
        camera.update();
        spriteBatch.setProjectionMatrix(camera.combined);
    }

    public void addListeners(){

    }

    /**
     *
     */
    @Override
    public void show() {

    }

    /**
     *
     */
    private void clearScreen() {
        Gdx.gl.glClearColor(0, 0, 0, 0);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    }

    /**
     *
     */
    @Override
    public void resume() {
        //game.setPaused(false);
    }

    /**
     *
     */
    @Override
    public void pause() {
        //game.setPaused(true);
    }

    /**
     *
     */
    @Override
    public void hide() {}

    /**
     *
     */
    @Override
    public void dispose() {
        game.dispose();
    }

    /**
     *
     * @param width
     * @param height
     */
    @Override
    public void resize(int width, int height) {
//        camera.setToOrtho(false, width, height);
//        camera.update();
//        stage.getViewport().update(width, height, true);
    }
}
