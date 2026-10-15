import java.util.*;
public class PrimeVideoUser {
	private int ratings[];
	int rows;
	public PrimeVideoUser(int ratings[],int rows) {
		this.rows=rows;
		this.ratings= new int[this.rows];
	}
	void acceptRatings()
	{
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<this.rows;i++)
		{
			System.out.print("Enter Rating "+(i+1)+": ");
			this.ratings[i]=sc.nextInt();
		}
		
	}
	double avg()
	{
		int s=0;
		for(int i=0;i<this.ratings.length;i++)
		{
			s+=ratings[i];
		}
		return (s/this.ratings.length);
	}
	void getViewerCategory()
	{
		
			if(this.avg()>=4.0)
			{
				System.out.println("Regular Viewer");
				return;
			}
			else {
				System.out.println("Occasional Viewer");
				return;
			}
			
		
	}
	void displayRatings()
	{
		for(int i=0;i<this.ratings.length;i++)
		{
			System.out.println("Rating of "+(i+1)+" user's: "+this.ratings[i]);
		}
	}

}
