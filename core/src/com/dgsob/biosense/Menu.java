package com.dgsob.biosense;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.utils.ScreenUtils;

public class Menu extends ViewAdapter {
    private Texture logo;
    BitmapFont font;

    /**
     *
     * @param game
     */
    public Menu(final gameClass game) {
        super(game);
        font = new BitmapFont();
        font.setColor(0.5f, 0.4f, 0, 1);
        font.getData().setScale(2f);

    }

    /**
     *
     */
    public void show() {
        logo = new Texture("logo_resized.png");
    }

    /**
     *
     * @param delta
     */
    public void render(float delta) {
        super.render(delta);

        spriteBatch.begin();
        spriteBatch.draw(logo, 250, 200);
        font.draw(spriteBatch, "Tap anywhere to begin...", 500, 100);
        spriteBatch.end();

        if (Gdx.input.isTouched()) {
            game.setScreen(new CellView(game));
        }
    }
























}
