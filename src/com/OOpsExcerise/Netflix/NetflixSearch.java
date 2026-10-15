package com.OOpsExcerise.Netflix;

public class NetflixSearch {
		
	private String movieTitle,genre;
	private int year;
	public NetflixSearch(String movieTitle, String genre, int year) {
		super();
		this.movieTitle = movieTitle;
		this.genre = genre;
		this.year = year;
	}
	void  search(String title)
	{
		
	
			if(this.movieTitle.equals(title))
			{
				System.out.println("Searching based on Title of movie");
				System.out.println("Title: "+this.movieTitle);
				System.out.println("Genre: "+this.genre);
				System.out.println("Year: "+this.year);
			
			}
			else {
				System.out.println("Not found");
			}
		
		
	}
	void search(String title,String genre)
	{
		
		
			if(this.movieTitle.equals(title) && this.genre.equals(genre))
			{
				System.out.println("Searching based on Title and genre of movie");
				System.out.println("Title: "+this.movieTitle);
				System.out.println("Genre: "+this.genre);
				System.out.println("Year: "+this.year);
			
			}
			else {
				System.out.println("Not found");
			}
		
		
	}
	void search(String title,String genre,int year)
	{
		
		
			if(this.movieTitle.equals(title) && this.genre.equals(genre)&&this.year == year)
			{
				System.out.println("Searching based on Title , genre and year of movie");
				System.out.println("Title: "+this.movieTitle);
				System.out.println("Genre: "+this.genre);
				System.out.println("Year: "+this.year);
				
			}
			else {
				System.out.println("Not found");
			}
		
		
	}
	
}
