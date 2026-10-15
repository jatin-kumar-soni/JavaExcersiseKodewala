package com.OOpsExcerise.Netflix;

public class VideoContent extends Content {
	protected int duration;
	public  VideoContent(String title,String language,int duration)
	{
		super(title,language);
		this.duration=duration;
	}
	void play()
	{
		System.out.println("Duration of video: "+this.duration);
	}
}

