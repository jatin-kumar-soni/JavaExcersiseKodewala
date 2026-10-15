package com.OOpsExcerise.jioHotstar;

public class LiveTV extends JioHotstarContent {
	
	
	public LiveTV(String title, String language) {
		super(title, language);
	}

	@Override
	void play(String movieTitle)
	{
		if(this.title.equalsIgnoreCase(movieTitle))
		{
			System.out.println("Playing Live TV...");
			System.out.println("playing "+movieTitle+" on languge "+this.language);
			
			
		}
	}
}
