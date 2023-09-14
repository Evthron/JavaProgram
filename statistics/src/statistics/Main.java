package statistics;

public class Main {
	
	public static void main(String[] args) {
		int[] a = {2, 4, 6, 8, 10};
		int[] b = {12, 11, 8, 3, 1};
		Dataset dataset1 = new Dataset(a);
		Dataset dataset2 = new Dataset(b);
		System.out.println(StatisticsCalculator.Covariance(dataset1, dataset2));
		
	}
}
