package JavaGeneric;

public class Box<T>  {
	// <T>�� �ƹ� Ÿ���̳� �ްڴٴ� ��
	// <>�� �ƹ��ų� �־ �ȴ�.` �׳� T�� �غ��Ŵ�
	private T type; 
	//Object�� ��� ��ü�� ���� ���ִ�
	
	public void set(T type) {
		this.type = type;
		
	}
	public T get() {
		return type;
		
	}
	
	
}


