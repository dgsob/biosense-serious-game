////package com.dgsob.biosense;
////import java.util.Iterator;
////
////import com.badlogic.gdx.Gdx;
////import com.badlogic.gdx.Input.Keys;
////import com.badlogic.gdx.Screen;
////import com.badlogic.gdx.audio.Music;
////import com.badlogic.gdx.audio.Sound;
////import com.badlogic.gdx.graphics.OrthographicCamera;
////import com.badlogic.gdx.graphics.Texture;
////import com.badlogic.gdx.math.MathUtils;
////import com.badlogic.gdx.math.Rectangle;
////import com.badlogic.gdx.math.Vector3;
////import com.badlogic.gdx.utils.Array;
////import com.badlogic.gdx.utils.ScreenUtils;
////import com.badlogic.gdx.utils.TimeUtils;
////import com.dgsob.biosense.gameClass;
////
////public class MembraneView implements Screen{
////
////    final gameClass game;
////
////    public MembraneView(final gameClass gam) {
////        this.game = gam;
////
////        // load the images for the droplet and the bucket, 64x64 pixels each
////        CloseupMembraneActor membc = new CloseupMembraneActor();
////        game.stage.addActor(membc);
////
////
////    }
////
////
////    @Override
////    public void render(float delta) {
////        ScreenUtils.clear(0, 0, 0, 1);
////        game.stage.act(Gdx.graphics.getDeltaTime());
////        game.stage.draw();
////
////    }
////
////
////    @Override
////    public void resize ( int width, int height){
////    }
////
////    @Override
////    public void show () {
////    }
////
////    @Override
////    public void hide () {
////    }
////
////    @Override
////    public void pause () {
////    }
////
////    @Override
////    public void resume () {
////    }
////
////    @Override
////    public void dispose () {
////    }
////}
////package com.dgsob.biosense;
////
////import com.badlogic.gdx.ApplicationAdapter;
////import com.badlogic.gdx.Gdx;
////import com.badlogic.gdx.graphics.OrthographicCamera;
////import com.badlogic.gdx.graphics.Texture;
////import com.badlogic.gdx.graphics.g2d.SpriteBatch;
////import com.badlogic.gdx.math.Vector3;
////import com.badlogic.gdx.utils.ScreenUtils;
////import com.badlogic.gdx.math.Rectangle;
////
////
////public class CellView extends ApplicationAdapter {
////	private Texture nucleus;
////	private Texture nucleuss;
////	private Texture memb;
////	private Texture membs;
////	private Texture cytozol;
////	private OrthographicCamera camera;
////	private SpriteBatch batch;
////	private Rectangle nuc;
////
////	@Override
////	public void create () {
////		camera = new OrthographicCamera();
////		camera.setToOrtho(false, 1280, 750);
////		batch = new SpriteBatch();
////		memb = new Texture(Gdx.files.internal("memb.png"));
////		membs = new Texture(Gdx.files.internal("memb_selected.png"));
////		nucleus = new Texture(Gdx.files.internal("nucleus.png"));
////		cytozol = new Texture(Gdx.files.internal("cytozol.png"));
////		nucleuss = new Texture(Gdx.files.internal("nucleus_selected.png"));
////		nuc = new Rectangle();
////		nuc.x = -100;
////		nuc.y = 0;
////		nuc.width = 64;
////		nuc.height = 64;
////	}
////
////	@Override
////	public void render () {
////		ScreenUtils.clear(0, 0, 0, 1);
////		camera.update();
////		batch.setProjectionMatrix(camera.combined);
////		batch.begin();
////		batch.draw(memb, -30, 0);
////		batch.draw(cytozol, -30, 0);
////		batch.draw(nucleus, nuc.x, nuc.y);
////		batch.end();
////		if(Gdx.input.isTouched()) {
////			Vector3 tP = new Vector3();
////			tP.set(Gdx.input.getX(), Gdx.input.getY(), 0);
////			camera.unproject(tP);
////
////		}
////	}
////
////	@Override
////	public void dispose () {
////		batch.dispose();
////		memb.dispose();
////	}
////}
//package com.dgsob.biosense;
//
//import java.util.Iterator;
//
//import com.badlogic.gdx.Gdx;
//import com.badlogic.gdx.Input.Keys;
//import com.badlogic.gdx.Screen;
//import com.badlogic.gdx.audio.Music;
//import com.badlogic.gdx.audio.Sound;
//import com.badlogic.gdx.graphics.OrthographicCamera;
//import com.badlogic.gdx.graphics.Texture;
//import com.badlogic.gdx.math.MathUtils;
//import com.badlogic.gdx.math.Rectangle;
//import com.badlogic.gdx.math.Vector3;
//import com.badlogic.gdx.utils.Array;
//import com.badlogic.gdx.utils.ScreenUtils;
//import com.badlogic.gdx.utils.TimeUtils;
//import com.dgsob.biosense.gameClass;
//
//public class MembraneView implements Screen {
//
//    final gameClass game;
//
//    public MembraneView(final gameClass gam) {
//        this.game = gam;
//
//        MembraneActor memb = new MembraneActor();
//        NucleusActor nucleus = new NucleusActor();
//        CytozolActor cytozol = new CytozolActor();
//
//        game.stage.addActor(memb);
//        game.stage.addActor(cytozol);
//        game.stage.addActor(nucleus);
//
//
//    }
//
//
//    @Override
//    public void render(float delta) {
//        ScreenUtils.clear(0, 1, 0, 1);
//        game.stage.act(Gdx.graphics.getDeltaTime());
//        game.stage.draw();
//
//    }
//
//    @Override
//    public void resize ( int width, int height){
//    }
//
//    @Override
//    public void show () {
//    }
//
//    @Override
//    public void hide () {
//    }
//
//    @Override
//    public void pause () {
//    }
//
//    @Override
//    public void resume () {
//    }
//
//    @Override
//    public void dispose () {
//    }
//
//}


package com.dgsob.biosense;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import java.util.Random;


public class MembraneView extends ViewAdapter {
    private final CloseupMembraneActor mem;
    private final GlucoseScoreActor glu_score;
    private final GoBackActor back;
    private final TransporterActor tra;
    private GlucoseActor glu;
    private final Random rand = new Random();
    int max = 10;
    int min = 1;
    private float timeel = 0f;
    boolean isBeingDRAGGED = false;
    int Score = 0;
    boolean full = false;

    /**
     *
     * @param game
     */
    public MembraneView(final gameClass game) {
        super(game);

        mem = new CloseupMembraneActor();
        tra = new TransporterActor();
        back = new GoBackActor();
        glu_score = new GlucoseScoreActor();
        glu = new GlucoseActor();

        stage.addActor(mem);
        stage.addActor(tra);
        stage.addActor(glu_score);
        stage.addActor(back);

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
    }

    /**
     *
     * @param delta
     */
    @Override
    public void render(float delta) {
        if(Gdx.input.isTouched() & !(glu.getStage() == null)) {
            Vector3 touchPos = new Vector3();
            touchPos.set(Gdx.input.getX(), Gdx.input.getY(), 0);
            OrthographicCamera camera = new OrthographicCamera();
            camera.setToOrtho(false, gameClass.WIDTH, gameClass.HEIGHT);
            camera.update();
            camera.unproject(touchPos);
            float x_ = touchPos.x - glu.getHeight() / 2;
            float y_ = touchPos.y - glu.getHeight() / 2;
            glu.randX = x_;
            if((glu.randX>650 || glu.randX<450) && glu.randY<100){
                glu.randY += 10;
            }
            else if(x_ > back.getX() && y_ > back.getY()){
                game.setScreen(new CellView(game));
            }
            else{
                glu.randY = y_;
            }
        }
        if(glu.randY < 200 & glu.randX<650 & glu.randX>450){
            tra.tr = new Sprite(new Texture(Gdx.files.internal("transporter_m0.png")));
            if(glu.randY < 150){
                tra.tr = new Sprite(new Texture(Gdx.files.internal("transporter_m1.png")));
                if(glu.randY < 80) {
                    tra.tr = new Sprite(new Texture(Gdx.files.internal("transporter_main.png")));
                }
            }
        }

        if(timeel > 1 & glu.getStage() == null){
            stage.addActor(glu);
            timeel+=Gdx.graphics.getDeltaTime();
        }
        else if(timeel> 3.5 & !isBeingDRAGGED){
            if (glu.randY < 80){
                Score +=1;
            }
            glu.addAction(Actions.removeActor());
            glu = null;
            glu = new GlucoseActor();
            timeel = 0;
        }
        else if(timeel>800){
            timeel = 0;
        }
        else{
            timeel+=Gdx.graphics.getDeltaTime();
        }

        if(Score>3){
            glu_score.glu = new Sprite(new Texture(Gdx.files.internal("mid_glu.png")));
            if(Score>6){
                glu_score.glu = new Sprite(new Texture(Gdx.files.internal("ok_glu.png")));
                if(Score>9){
                    glu_score.glu = new Sprite(new Texture(Gdx.files.internal("max_glu.png")));
                    full = true;
                }
            }
        }

        super.render(delta);
        stage.act();

        spriteBatch.begin();
        stage.draw();
        spriteBatch.end();
    }
}