public class MyRectangle {
	private int length;
	private int width;
	
	public MyRectangle() {
		this.length = 1;
		this.width = 1;
	}
	
	public MyRectangle(int lengthArg, int widthArg) {
		length = lengthArg;
		width = widthArg;
	}
	
	public int area() {
		return this.length * this.width;
	}
	
	public boolean isLargerThan(MyRectangle otherRectangle) {
		return this.area() > otherRectangle.area();
	}
	
	public boolean isLargerThan(int length, int width) {
		return this.area() > length * width;
	}
}