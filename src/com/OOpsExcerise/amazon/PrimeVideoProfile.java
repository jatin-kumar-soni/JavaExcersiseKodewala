package com.OOpsExcerise.amazon;

public class PrimeVideoProfile {
	private String profileName, quality, downloadLimit;
	
	public PrimeVideoProfile() {
		
	}
	PrimeVideoProfile setProfileName(String name, PrimeVideoProfile p1)
	{

		p1.profileName=name;
		
		return this;
	}
	PrimeVideoProfile setQuality(String quality, PrimeVideoProfile p1)
	{
		
		p1.quality=quality;
	
		return this;
	}
	PrimeVideoProfile setDownloadLimit(String downloadLimit, PrimeVideoProfile p1)
	{

		p1.downloadLimit=downloadLimit;
		
		return this;
	}
	void displayProfile()
	{
		System.out.println("Name: "+this.profileName);
		System.out.println("Quality: "+this.quality);
		System.out.println("Download Limit: "+this.downloadLimit);
	}
	
}
