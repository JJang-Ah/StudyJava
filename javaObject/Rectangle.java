package JavaObject;

public class Rectangle {
	//�簢�� ���� ���ϱ�
	private int width, height;
	
	public Rectangle (int width, int height) throws Exception {
		if(width <= 0 || height <= 0 ) {
			throw new Exception ("�ʺ�� ���̴� �÷��� ���̾�߸� �մϴ�.");
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
	
	//source �޴��� general getter setter ������ ������ �Ʒ����� �ҽ��� ������ش�.

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
