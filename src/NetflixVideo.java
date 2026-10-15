import java.util.Scanner;

public class NetflixVideo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VideoQuality qual= new VideoQuality();
		qual.currentQuality();
		Scanner sc= new Scanner(System.in);
		System.out.println("do you want to enhance quality of video? yes/no");
		String str=sc.nextLine();
		if(str.equals("yes"))
		{
			String q=sc.nextLine();
			VideoQuality quality= new VideoQuality(q);
			quality.currentQuality();
		}
		else if(str.equals("no"))
		{
			VideoQuality quality= new VideoQuality();
			quality.currentQuality();
		}

	}

}
class VideoQuality{
	private String videoQuality;
	VideoQuality()
	{
		this.videoQuality="HD";
	}
	VideoQuality(String videoQuality)
	{
		this.videoQuality=videoQuality;
	}
	void currentQuality()
	{
		System.out.println("Current quality: "+this.videoQuality);
	}
}

