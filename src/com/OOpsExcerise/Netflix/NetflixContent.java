package com.OOpsExcerise.Netflix;

abstract class NetflixContent1 {
	protected String title;
	int duration;

	public NetflixContent1(String title, int duration) {
		super();
		this.title = title;
		this.duration = duration;
	}

	abstract void calculateDuration(String title);

}

class NetflixMovie1 extends NetflixContent1 {

	public NetflixMovie1(String title, int duration) {
		super(title, duration);
	}

	void calculateDuration(String title) {
		if(this.title.equalsIgnoreCase(title))
		{
			System.out.println("Movie Title : " + this.title);
			System.out.println("Duration: " + this.duration+" min");
			return;
		}

	}
}

class NetflixSeries extends NetflixContent1 {
	int episodes;

	public NetflixSeries(String title, int duration, int episodes) {
		super(title, duration);
		this.episodes = episodes;

	}

	void calculateDuration(String title) {
		if(this.title.equalsIgnoreCase(title))
		{
			System.out.println("Series Title : " + this.title);
			System.out.println("Episodes: "+this.episodes);
			System.out.println("Duration: " + this.duration+" min");
			return;
		}

	}

}