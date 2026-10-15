package com.OOpsExcerise.jioHotstar;

public class Series extends JioHotstarContent {
	private int numberOfEpisodes;

	public Series(String title, String language, int numberOfEpisodes) {
		super(title, language);
		this.numberOfEpisodes = numberOfEpisodes;
	}
	
	void getNumberOfEpisodes()
	{
		System.out.println("Episodes: "+this.numberOfEpisodes);
	}
}
