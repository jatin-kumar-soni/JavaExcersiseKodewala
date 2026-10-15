package com.OOpsExcerise.Netflix;

public class Content {
	protected String title,language;
	Content(String title,String language)
	{
		this.title=title;
		this.language=language;
		
	}
	void displayContent()
	{
		System.out.println("Title: "+this.title);
		System.out.println("Language: "+this.language);
	}
}
