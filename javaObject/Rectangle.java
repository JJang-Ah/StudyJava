package javaObject;

public class Rectangle {
	//사각형 넓이 구하기
	private int width, height;
	
	public Rectangle (int width, int height) {
		this.width=width;
		this.height=height;
	}
	
	int getArea() {
		return width*height;
		
	}
	
	int getWidth() {
		return width;
	}
	int gitHeight() {
		return height;
	}
	
	
}
