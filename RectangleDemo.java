public class RectangleDemo {
	public static void main(String[] args) {
		/*
		// This code no longer compiles because length and width were modified to be private
			
		Rectangle r = new Rectangle();
		r.length = 10;
		r.width = 5;
		System.out.println("r.length is "+r.length+" and r.width is "+r.width);
		
		Rectangle[] recArray = new Rectangle[3];
		recArray[0] = new Rectangle();
		recArray[0].length = 1;
		recArray[0].width = 2;
		recArray[1] = new Rectangle();
		recArray[1].length = 3;
		recArray[1].width = 4;
		recArray[2] = new Rectangle();
		recArray[2].length = 5;
		recArray[2].width = 6;
		
		for(int i = 0; i < recArray.length; i++) {
			int area = recArray[i].length * recArray[i].width;
			System.out.println("recArray["+i+"] has area "+area);
		}
		
		Rectangle defaultValueRectangle = new Rectangle();
		System.out.println("length is "+defaultValueRectangle.length+" and width is "+defaultValueRectangle.width);
		
		Rectangle myRectangle = new Rectangle(5, 10);
		System.out.println("length is "+myRectangle.length+" and width is "+myRectangle.width);
		
		System.out.println("*********************");
		for(int i = 0; i < recArray.length; i++) {
			int area = recArray[i].getArea();
			System.out.println("recArray["+i+"] has area "+area);
		}
		*/
		MyRectangle smallRectangle = new MyRectangle(3, 4);
		MyRectangle bigRectangle = new MyRectangle(8, 12);
		if(smallRectangle.area() > bigRectangle.area()) {
			System.out.println("smallRectangle is bigger");
		} else {	
			System.out.println("bigRectangle is bigger");
		}
		
		if(smallRectangle.isLargerThan(bigRectangle)) {
			System.out.println("smallRectangle is bigger");
		} else {	
			System.out.println("bigRectangle is bigger");
		}
		
		if(bigRectangle.isLargerThan(9, 9)) {
			System.out.println("bigRectangle is larger than 9x9");
		} else {	
			System.out.println("bigRectangle is smaller than or equal to 9x9");
		}
	}
}