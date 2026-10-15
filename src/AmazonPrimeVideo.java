
public class AmazonPrimeVideo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[5];
		PrimeVideoUser viewer= new PrimeVideoUser(arr,5);
		viewer.acceptRatings();
		viewer.displayRatings();
		viewer.getViewerCategory();
		System.out.println(viewer.avg());
		

	}

}
