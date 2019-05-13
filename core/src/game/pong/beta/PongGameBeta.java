package game.pong.beta;

import game.pong.beta.components.MenuScreen;

public class PongGameBeta extends BaseGame
{
	public static String gameLanguage = "EN";
	
	public void create()
	{
		super.create();

		setActiveScreen( new MenuScreen() );
	}

}
