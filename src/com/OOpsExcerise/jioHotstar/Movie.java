package com.OOpsExcerise.jioHotstar;

public class Movie extends JioHotstarContent {
	private int duration;
	Movie(String title ,String language,int duration)
	{
		super(title,language);
		this.duration=duration;
	}
	void getDuration()
	{
		System.out.println("Duration : "+this.duration+" hours");
	}
	void play(String movieTitle)
	{
		if(this.title.equalsIgnoreCase(movieTitle))
		{
			System.out.println("Playing Movie...");
			System.out.println("playing "+movieTitle+" on languge "+this.language);
			
			
		}
	}
	

}
