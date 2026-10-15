/**
 * movieId, title, genre, language, and duration.
 */
public class Movies {
	private String movieId,title,genre,language;
	private double duration;
	public Movies(String movieId, String title, String genre, String language, double duration) {

		this.movieId = movieId;
		this.title = title;
		this.genre = genre;
		this.language = language;
		this.duration = duration;
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	double calculateWatchTime(double watchedMovieTime)
	{
		double duration=this.getDuration();
		return  duration-watchedMovieTime;
	}
	void displayMovieDetails()
	{
		System.out.println("Movie Id: "+this.getMovieId());
		System.out.println("Title   : "+this.getTitle());
		System.out.println("Genere  : "+this.getGenre());
		System.out.println("Language: "+this.getLanguage());
		System.out.println("Duration: "+this.getDuration());
	}
	
	
}
