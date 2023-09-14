package statistics;

public class StatisticsCalculator {
	
	public static int Covariance(Dataset dataset1, Dataset dataset2) {
		int covariance = 0;
		int length = dataset1.data.length;
		int sum = 0;
		for (int i = 0; i < length; i++) {
			sum += (dataset1.data[i] - dataset1.SampleMean()) * (dataset2.data[i] - dataset2.SampleMean());
		}
		covariance = sum / length;
		return covariance;
	}
	

}
