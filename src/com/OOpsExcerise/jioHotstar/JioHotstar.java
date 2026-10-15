package com.OOpsExcerise.jioHotstar;

import java.util.Scanner;

public class JioHotstar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Movie m1 = new Movie("Avengers", "English", 150);
//		m1.content();
//		m1.getDuration();
//		Series s1= new Series("Avengers", "English", 10);
//		s1.getNumberOfEpisodes();
		JioHotstarContent[] contents = {

			    new Movie("Avengers", "English", 3),
			    new Movie("Special Ops", "Hindi", 2),
			    new Movie("The Family Man", "Hindi", 2),

			    new LiveTV("Indian Idol", "Hindi"),
			    new LiveTV("Bigg Boss", "Hindi"),
			    new LiveTV("MasterChef India", "Hindi")
			};
//		for(JioHotstarContent m : contents)
//		{
//			m.play("MasterChef India");
//		}
		StreamingDevice[] dataset = {
			    new JioHotstarTV("Samsung Smart TV", 32.5),
			    new JioHotstarTV("LG Smart TV", 30.8),
			    new JioHotstarTV("Sony Bravia", 28.6),
			    new JioHotstarTV("OnePlus TV", 31.2),
			    new JioHotstarTV("TCL Smart TV", 29.7),
			    new JioHotstarTV("Mi TV", 33.1),
			    new JioHotstarTV("Hisense Smart TV", 27.9),
			    new JioHotstarTV("Panasonic Smart TV", 30.4),
			    new JioHotstarTV("Philips Smart TV", 29.3),
			    new JioHotstarTV("Vu Smart TV", 31.8)
			};
		for(StreamingDevice s: dataset)
		{
			Boolean b=s.device("Vu Smart TV");
			if(b && s.temp>30)
			{
				System.out.println("please turn off,temp is too high");
				s.turnOff();
			}
			
		}
		
	}

}
