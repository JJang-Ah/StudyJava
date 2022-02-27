package JavaObject;

public class Rectangle {
	//사각형 넓이 구하기
	private int width, height;
	
	public Rectangle (int width, int height) throws Exception {
		if(width <= 0 || height <= 0 ) {
			throw new Exception ("너비와 높이는 플러스 값이어야만 합니다.");
		}
		this.width=width;
		this.height=height;
	}
	
	int getArea() {
		return width*height;
		
	}
//	
//	int getWidth() {
//		return width;
//	}
//	int gitHeight() {
//		return height;
//	}
	
	//source 메뉴의 general getter setter 누르면 저절로 아래같은 소스를 만들어준다.

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		if(width > 0 ) {
			this.width = width;
		}
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		if(height >0 ) {
			this.height = height;
		}
	}
	
	
}
