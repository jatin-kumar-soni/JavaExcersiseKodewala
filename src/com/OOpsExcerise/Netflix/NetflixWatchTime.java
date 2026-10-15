package com.OOpsExcerise.Netflix;

public class NetflixWatchTime {
	private int hours,minutes;
	public NetflixWatchTime(int hours,int minutes) {
		this.hours=hours;
		this.minutes=minutes;
	}
	
	NetflixWatchTime addWatchTime(NetflixWatchTime time)
	{
		int min=Math.abs(this.minutes-time.minutes);
		time.hours=this.hours+time.hours;
		time.minutes=this.minutes+time.minutes;
		
		if(time.minutes >60)
		{
			time.hours=time.hours+1;
			time.minutes=Math.abs(min);
		}
		return time;
	}
	void displayWatchTime()
	{
		System.out.println("Total Watch Time : "+ this.hours+ " hours "+this.minutes+" minutes");
		
	}
}
