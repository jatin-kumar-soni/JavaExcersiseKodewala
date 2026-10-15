
public class NetflixMovie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Movies m1 = new Movies("M001", "Krrish", "Bollywood", "Hindi", 3.00);
			m1.displayMovieDetails();
			System.out.printf("Watch time : %.2f" ,m1.calculateWatchTime(2.15));
	}

}
