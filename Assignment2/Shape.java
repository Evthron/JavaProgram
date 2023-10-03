import java.awt.Color;

/**
 * The class Shape is used to model general shapes. It is the superclass of RegularPolygon. 
 * 
 * It has instance variables for storing color,fill-type, orientation,
 * canvas coordinates of the center, and local coordinates of the vertices of a shape.
 * It has methods for setting the coordinates of the vertices of a shape, rotating the shape about its center,
 * translating the shape in the coordinate system and getting its canvas coordinates of the vertices.
 * @author Jacky UID:3036067573
 */

public class Shape {

	private Color color;
	private boolean filled;
	private double theta;
	private double xc;
	private double yc;
	private double[] xLocal;
	private double[] yLocal;
	
	/**
	 * Retrieves the color of the shape.
	 * @return Color of the shape.
	 */
	
	public Color getColor() {
		return color;
	}
	
	/**
	 * Retrieves the fill-type of the shape.
	 * @return Fill-type of the shape.
	 */
	
	
	public boolean getFilled() {
		return filled;
	}
	
	/**
	 * Retrieves the orientation of the shape in radians.
	 * @return Orientation angle theta in radian.
	 */
	
	public double getTheta() {
		return theta;
	}
	
	/**
	 * Retrieves the x-coordinate of the center of the shape in 
the canvas coordinate system.
	 * @return x-coordinate of the center of the shape.
	 */
	
	public double getXc() {
		return xc;
	}
	
	
	/**
	 * Retrieves the y-coordinate of the center of the shape in 
the canvas coordinate system.
	 * @return y-coordinate of the center of the shape.
	 */
	
	public double getYc() {
		return yc;
	}
	
	/**
	 * Retrieves the x-coordinates of the vertices (in 
counter-clockwise order) of the shape in its local coordinate system.
	 * @return An integer array of the x-coordinates of the vertices of the shape.
	 */
	
	public double[] getXLocal() {
		return xLocal;
	}
	
	/**
	 * Retrieves the y-coordinates of the vertices (in 
counter-clockwise order) of the shape in its local coordinate system.
	 * @return An integer array of the y-coordinates of the vertices of the shape.
	 */
	
	public double[] getYLocal() {
		return yLocal;
	}
	
	/**
	 * setting the x-coordinate of the center of the 
shape in the canvas coordinate system. 	
	 * @param xc The new x-coordinate of the center of the shape.
	 */
	
	void setColor(Color color) {
		this.color = color;
	}
	
	void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	
	void setTheta(double theta) {
		this.theta = theta;
	}
	
	public void setXc(double xc) {
		this.xc = xc;
	}
	
	
	/**
	 * setting the y-coordinate of the center of the 
shape in the canvas coordinate system. 	
	 * @param yc The new y-coordinate of the center of the shape.
	 */
	
	public void setYc(double yc) {
		this.yc = yc;
	}
	
	/**
	 * setting the x-coordinate of the 
vertices (in counter-clockwise order) of the shape in its local coordinate system. 
	 * @param xLocal The new x-coordinates of the vertices of the shape.
	 */
	
	
	public void setXLocal(double[] xLocal) {
		this.xLocal = xLocal;
	}
	
	/**
	 * setting the y-coordinate of the 
vertices (in counter-clockwise order) of the shape in its local coordinate system. 
	 * @param yc The new y-coordinates of the vertices of the shape.
	 */
	
	public void setYLocal(double[] yLocal) {
		this.yLocal = yLocal;
	}
	
	
	/**
	 * Translates the center of the shape.
	 * The argument dx and dy specify the change in x and y directions respectively. 
	 * @param dx The change in x directions
	 * @param dy The change in y directions
	 */
	public void translate(double dx, double dy) {
		this.xc += dx;
		this.yc += dy;
	}
	

	
	/***
	 * Rotates the shape about its center by an angle in radians.
	 * @param dt The change in angle in radians
	 */
	public void rotate (double dt){
		this.theta += dt;
	}
	
	/***
	 * Retrieves the x-coordinates of the vertices of the shape.
	 * This method retrieves the coordinates in counter-clockwise order. The coordinates are rounded to nearest integers.
	 * @return An integer array of x-coordinates of the vertices of the shape.
	 */
	
	public int[] getX() {
		int[] xCanvas = new int[xLocal.length];
		for (int i = 0; i < xLocal.length; i++) {
			xCanvas[i] = (int) Math.round(xLocal[i] * Math.cos(theta) - yLocal[i] * Math.sin(theta) + xc);
		}
		return xCanvas;
	}
	
	/***
	 * Retrieves the y-coordinates of the vertices of the shape.
	 * This method retrieves the coordinates in counter-clockwise order. The coordinates are rounded to nearest integers.
	 * @return An integer array of y-coordinates of the vertices of the shape.
	 */
	
	public int[] getY() {
		int[] yCanvas = new int[yLocal.length];
		for (int i = 0; i < yLocal.length; i++) {
			yCanvas[i] = (int) Math.round(xLocal[i] * Math.sin(theta) + yLocal[i] * Math.cos(theta) + yc);
		}
		return yCanvas;
	}
}