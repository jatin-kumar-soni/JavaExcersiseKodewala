package com.OOpsExcerise.Netflix;

import java.util.Scanner;

public class Netflix {

	public static void main(String[] args) {
//		NetflixWatchTime watchTime1= new NetflixWatchTime(2, 40);
//		NetflixWatchTime watchTime2= new NetflixWatchTime(1, 30);
//		NetflixWatchTime totalTime= watchTime1.addWatchTime(watchTime2);
//		totalTime.displayWatchTime();
		
		// Inheritance concept 
		
//		NetflixMovie m1= new NetflixMovie("Stranger Things", "English", 60, "Sci-Fi");
//		m1.displayMovieDetails();
//		m1.displayContent();
//		m1.play();
		NetflixSearch[] movies = {
			    new NetflixSearch("Stranger Things", "Sci-Fi", 2016),
			    new NetflixSearch("The Witcher", "Fantasy", 2019),
			    new NetflixSearch("Money Heist", "Crime", 2017),
			    new NetflixSearch("Squid Game", "Thriller", 2021),
			    new NetflixSearch("Wednesday", "Comedy", 2022),
			    new NetflixSearch("Dark", "Sci-Fi", 2017),
			    new NetflixSearch("Bridgerton", "Romance", 2020),
			    new NetflixSearch("The Crown", "Drama", 2016),
			    new NetflixSearch("Black Mirror", "Sci-Fi", 2011),
			    new NetflixSearch("Narcos", "Crime", 2015),
			    new NetflixSearch("Lucifer", "Fantasy", 2016),
			    new NetflixSearch("You", "Thriller", 2018),
			    new NetflixSearch("Ozark", "Crime", 2017),
			    new NetflixSearch("Arcane", "Animation", 2021),
			    new NetflixSearch("The Umbrella Academy", "Fantasy", 2019),
			    new NetflixSearch("Sex Education", "Comedy", 2019),
			    new NetflixSearch("The Queen's Gambit", "Drama", 2020),
			    new NetflixSearch("All of Us Are Dead", "Horror", 2022),
			    new NetflixSearch("Manifest", "Mystery", 2018),
			    new NetflixSearch("Cobra Kai", "Action", 2018)
			};
//		for(NetflixSearch m : movies)
//		{
//			m.search("Cobra Kai");
//		}
//		StreamingService stream= new NetflixStreaming();
//		stream.stream();
//		StreamingService stream1= new PrimeStreaming();
//		stream1.stream();
		
		NetflixContent1[] dataset = {
			    new NetflixMovie1("Extraction", 116),
			    new NetflixSeries("Stranger Things", 250, 34),

			    new NetflixMovie1("The Gray Man", 122),
			    new NetflixSeries("Money Heist", 645, 41),

			    new NetflixMovie1("Red Notice", 118),
			    new NetflixSeries("The Witcher", 455, 24),

			    new NetflixMovie1("Bird Box", 124),
			    new NetflixSeries("Wednesday", 348, 8),

			    new NetflixMovie1("Enola Holmes", 123),
			    new NetflixSeries("Bridgerton", 358, 24),

			    new NetflixMovie1("Don't Look Up", 138),
			    new NetflixSeries("Dark", 152, 26),

			    new NetflixMovie1("The Adam Project", 106),
			    new NetflixSeries("Narcos", 250, 30),

			    new NetflixMovie1("Glass Onion", 139),
			    new NetflixSeries("Black Mirror", 155, 27),

			    new NetflixMovie1("Army of the Dead", 148),
			    new NetflixSeries("Squid Game", 550, 9),

			    new NetflixMovie1("The Old Guard", 125),
			    new NetflixSeries("Lupin", 480, 17)
			};
		for(NetflixContent1 m:  dataset)
		{
			m.calculateDuration("lupin");
		
			
		}
		

	}

}
