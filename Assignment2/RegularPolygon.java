
public class RegularPolygon extends Shape{
	private int numOfSides;
	private double radius;
	
	
	public RegularPolygon(int n, double r){
		numOfSides = n;
		radius = r;
		setVertices();
	}
	public RegularPolygon(int n) {
		numOfSides = n;
		radius = 1.0;
		setVertices();
	}
	public RegularPolygon() {
		numOfSides = 3;
		radius = 1.0;
		setVertices();
	}
	
	/**
	 * Retrieves the number of sides of the regular n-sided polygon.
	 * @return The number of sides of the regular polygon.
	 */
	
	public int getNumOfSides() {
		return numOfSides;
	}
	
	/**
	 * Retrieves the radius of the regular n-sided polygon.
	 * @return The radius of the regular polygon.
	 */
	
	public double getRadius() {
		return radius;
	}
	
	
	public void setNumOfSides(int n) {
		numOfSides = n;
		setVertices();
	}
	public void setRadius(double r) {
		radius = r;
		setVertices();
	}
	
	private void setVertices() {
		boolean isOddSides = (numOfSides % 2 != 0);
		System.out.println(isOddSides);
		double[] xVertices = new double[numOfSides];
		double[] yVertices = new double[numOfSides];
		double interiorAngle = (Math.PI * (numOfSides - 2)) / numOfSides;
		
		if (isOddSides) {
			for (int i = 0; i < numOfSides; i++) {
				xVertices[i] = -(radius * Math.cos(interiorAngle * i));
				yVertices[i] = -(radius * Math.sin(interiorAngle * i));
			}
		}
		else {
			for (int i = 0; i < numOfSides; i++) {
				xVertices[i] = -(2*Math.PI / 2*numOfSides + radius * Math.cos(interiorAngle * i));
				yVertices[i] = -(2*Math.PI / 2*numOfSides + radius * Math.sin(interiorAngle * i));
			}
		}
		System.out.println(xVertices);
		setXLocal(xVertices);
		setYLocal(yVertices);
	}
	
	boolean contains(double x, double y) {
		boolean isContained = false;
		return isContained;
	}
}
