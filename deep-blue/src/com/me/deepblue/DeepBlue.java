package com.me.deepblue;

import com.badlogic.gdx.Game;

public class DeepBlue extends Game{

	public GameScreen main_menu_screen;
	
	@Override
	public void create() {
		main_menu_screen = new GameScreen(this);
		
		setScreen(main_menu_screen);
	}

}
