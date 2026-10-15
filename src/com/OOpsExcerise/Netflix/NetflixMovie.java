package com.OOpsExcerise.Netflix;

public class NetflixMovie extends VideoContent {
	private String genre;
	NetflixMovie(String title,String language,int duration,String genre)
	{
		super(title,language,duration);
		this.genre=genre;
	}
	void displayMovieDetails()
	{
		super.displayContent();
		super.play();
		System.out.println("Genre: "+this.genre);
	}
	
}	
