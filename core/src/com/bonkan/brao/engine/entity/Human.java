package com.bonkan.brao.engine.entity;

import java.util.UUID;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.bonkan.brao.engine.entity.animation.BodyAnimator;
import com.bonkan.brao.engine.entity.animation.HeadAnimator;
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

	public Human(int bodyIndex, int headIndex, UUID id, String userName, float x, float y) {
		super(AtlasManager.getBody(bodyIndex), x, y);
		this.bodyIndex = bodyIndex;
		this.headIndex = headIndex;
		this.userName = userName;
		this.id = id;
		this.state = playerState.NONE;
		this.headAnimator = new HeadAnimator(AtlasManager.getHeads(headIndex));
		this.bodyAnimator = new BodyAnimator(texture);
		
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
}
