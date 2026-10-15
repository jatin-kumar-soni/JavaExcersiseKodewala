package com.OOpsExcerise.jioHotstar;

public class JioHotstarContent {
	protected String title ,language;
	public JioHotstarContent(String title ,String language) {
		this.title=title;
		this.language=language;
	}
	void content()
	{
		System.out.println("Title: "+this.title);
		System.out.println("Language: "+this.language);
	}
	void play(String movieTitle)
	{
		if(this.title.equalsIgnoreCase(movieTitle))
		{
			System.out.println("playing "+movieTitle);
			
		}
	}
	
}
