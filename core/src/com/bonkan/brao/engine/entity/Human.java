package com.bonkan.brao.engine.entity;

import java.util.ArrayList;
import java.util.UUID;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.bonkan.brao.engine.entity.animation.BodyAnimator;
import com.bonkan.brao.engine.entity.animation.HeadAnimator;
import com.bonkan.brao.engine.map.factory.BodyFactory;
import com.bonkan.brao.engine.map.factory.Sensor;
import com.bonkan.brao.engine.utils.AtlasManager;
import com.bonkan.brao.engine.utils.Constants;

public abstract class Human extends Entity {
	
	public enum playerState {
		NONE,
		MOVE_LEFT, MOVE_RIGHT, MOVE_UP, MOVE_DOWN,
		MOVE_LEFT_DOWN, MOVE_LEFT_UP, MOVE_RIGHT_DOWN, MOVE_RIGHT_UP
	}
	
	protected UUID id;
	protected playerState state;
	protected String userName;
	protected BitmapFont defaultFont;
		
	// Texturas del player
	protected BodyAnimator bodyAnimator;
	protected HeadAnimator headAnimator;
	
	protected int bodyIndex;
	protected int headIndex;
	
	protected Body body;
	protected ArrayList<Sensor> sensors;

	public Human(float x, float y, int bodyIndex, int headIndex, UUID id, String userName, World world) {
		super(AtlasManager.getBody(bodyIndex), x, y);
		this.bodyIndex = bodyIndex;
		this.headIndex = headIndex;
		this.userName = userName;
		this.id = id;
		this.state = playerState.NONE;
		this.headAnimator = new HeadAnimator(AtlasManager.getHeads(headIndex));
		this.bodyAnimator = new BodyAnimator(texture);
		this.sensors = new ArrayList<Sensor>();
		this.sensors.add(new Sensor(0));
		this.sensors.add(new Sensor(1));
		this.sensors.add(new Sensor(2));
		this.sensors.add(new Sensor(3));
		this.body = BodyFactory.createPlayerBox(world, x, y, Constants.BODY_WIDTH, Constants.BODY_HEIGHT);
		
		FreeTypeFontGenerator freeTypeFontGenerator = new FreeTypeFontGenerator(Gdx.files.internal("segoeui.ttf"));
 		FreeTypeFontGenerator.FreeTypeFontParameter parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
 		parameter.size = 14;
 		this.defaultFont = freeTypeFontGenerator.generateFont(parameter);
	}

	@Override
	public void render(SpriteBatch batch) {
		bodyAnimator.render(batch, pos.x - Constants.BODY_WIDTH / 2, pos.y - Constants.BODY_HEIGHT / 2, state);
		headAnimator.render(batch, pos.x - 8, pos.y + Constants.BODY_HEIGHT / 2 - 3, state);
		defaultFont.draw(batch, userName, pos.x - (userName.length() / 2 * 14) / 2, pos.y - Constants.BODY_HEIGHT / 2);
	}
	
	@Override
	public void update(float delta) {
		body.setTransform(super.pos, 0.0f);
	}
	
	@Override
	public void dispose() {
		
	}

	public UUID getID() 
	{
		return id; 
	}
	
	public void setState(playerState state) 
	{
		this.state = state;
	}
	
	public playerState getState() 
	{
		return state;
	}

	public int getBodyIndex()
	{
		return bodyIndex;
	}
	
	public int getHeadIndex()
	{
		return headIndex;
	}
	
	public String getUserName()
	{
		return userName;
	}
	
	public Sensor getSensor(int index)
	{
		return sensors.get(index);
	}
}
