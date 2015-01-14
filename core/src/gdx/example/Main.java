package gdx.example;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;


public class Main extends ApplicationAdapter {

	Circle circleBlue,circleRed, circleGreen;
	@Override
	public void create () {
		circleRed = new Circle(200,240,200,new Color(231.0f/255.0f,76.0f/255.0f,60.0f/255.0f,1));
		circleGreen = new Circle(400,240,200,new Color(46.0f/255.0f,204.0f/255.0f,113.0f/225.0f,1));
		circleBlue = new Circle(600,240,200,new Color(52.0f/255.0f,152.0f/255.0f,219.0f/255.0f,1));
		
	}

	@Override
	public void render () {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		Gdx.gl.glClearColor(1, 1, 1, 1);
		circleRed.draw();
		circleBlue.draw();
		circleGreen.draw();
	}
	
}