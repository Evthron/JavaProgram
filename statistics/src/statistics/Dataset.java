package statistics;

public class Dataset{
	int[] data;
	
	Dataset(int[] data){
		this.data = data;
	}
	
	public int Sum() {
		int sum = 0;
		for (int number: data) {
			sum += number;
		}
		return sum;
	}
	
	public int SampleMean() {
		int sampleMean = Sum() / data.length;
		
		return sampleMean;
	}
	
}
